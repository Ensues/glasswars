package io.github.ensues.ensui.core.world

import io.github.ensues.ensui.core.display.formatInfo
import io.github.ensues.ensui.core.events.SpawnEventHandler
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.entity.Player

class SpawnWorld(world: World) : EnsuiWorld(world, SpawnEventHandler()) {
    override fun joinWorld(player: Player) {
        player.teleport(Location(world, 0.0, 1.0, 0.0))
        player.exp = 0F
        player.flySpeed = 1F
        player.healthScale = 20.0
        player.level = 0
        player.playerListHeader = """
            !
            !          §7- §fEnsui §7-          
            !
        """.trimMargin("!")
        player.playerListFooter = """
            !
            !
        """.trimMargin("!")
        player.walkSpeed = 0.2F
        world.players.forEach { it.sendMessage(formatInfo("${player.displayName} joined.")) }

    }

    override fun tick() {
        world.players.forEach {
            it.foodLevel = 20
            it.saturation = 20F
        }
    }
}

