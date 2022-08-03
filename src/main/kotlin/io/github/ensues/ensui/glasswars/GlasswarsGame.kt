package io.github.ensues.ensui.glasswars

import io.github.ensues.ensui.core.Tickable
import io.github.ensues.ensui.core.events.EventDriver
import io.github.ensues.ensui.core.events.EventHandler
import io.github.ensues.ensui.core.world.EnsuiWorld
import io.github.ensues.ensui.glasswars.maps.GlasswarsMap
import io.github.ensues.ensui.glasswars.maps.GlasswarsMapType
import io.github.ensues.ensui.glasswars.teams.GlasswarsTeam
import org.bukkit.World
import org.bukkit.entity.Player

class GlasswarsGame(world: World, private val gameMapType: GlasswarsMapType) : Tickable, EnsuiWorld(world, GlasswarsEventHandler()) {
    private val gameMap = gameMapType.getInstance(world)
    private val teams = gameMap.teams.map { GlasswarsTeam(it) }
    private val generators = gameMap.generators
    val phase: GlasswarsPhase = GlasswarsPhase.QUEUE;
    val players = mutableListOf<GlasswarsPlayer>()
    override fun joinWorld(player: Player) {
        player.teleport(gameMap.lobbyLocation)
        players.add(GlasswarsPlayer(player))
    }

    override fun tick() {
        teams.forEach { it.tick() } // Tick all teams
        generators.forEach { it.tick() } // Tick all generators
    }

    fun canJoin() = (phase == GlasswarsPhase.QUEUE) && (players.size < gameMap.maxPlayers)
    fun addPlayer(player: Player) {
        players.add(GlasswarsPlayer(player))
        player.teleport(gameMap.lobbyLocation)
    }
}