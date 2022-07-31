package io.github.ensues.ensui.core.world

import io.github.ensues.ensui.core.Tickable
import io.github.ensues.ensui.core.events.EventHandler
import org.bukkit.World
import org.bukkit.entity.Player

abstract class EnsuiWorld(val world: World, val eventHandler: EventHandler) : Tickable {
    abstract fun joinWorld(player: Player)
}