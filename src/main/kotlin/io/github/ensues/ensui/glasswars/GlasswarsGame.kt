package io.github.ensues.ensui.glasswars

import io.github.ensues.ensui.core.Tickable
import io.github.ensues.ensui.glasswars.maps.GlasswarsMap
import io.github.ensues.ensui.glasswars.teams.GlasswarsTeam
import org.bukkit.entity.Player

class GlasswarsGame(private val gameMap: GlasswarsMap) : Tickable {
    private val teams = gameMap.teams.map { GlasswarsTeam(it) }
    private val generators = gameMap.generators
    val phase: GlasswarsPhase = GlasswarsPhase.QUEUE;
    val players = mutableListOf<GlasswarsPlayer>()

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