package io.github.ensues.ensui.core

import io.github.ensues.ensui.core.events.EventDriver
import io.github.ensues.ensui.core.world.EnsuiWorld
import io.github.ensues.ensui.core.world.SpawnWorld
import io.github.ensues.ensui.glasswars.GlasswarsDriver
import io.github.ensues.ensui.glasswars.constants.initItems
import io.github.ensues.ensui.glasswars.maps.GlasswarsMapType
import org.bukkit.Bukkit
import org.bukkit.World
import org.bukkit.WorldCreator
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.CraftItemEvent
import org.bukkit.event.player.AsyncPlayerChatEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin
import java.lang.NullPointerException

class Main : JavaPlugin() {
    private val eventDriver = EventDriver(this)
    private val gwDriver = GlasswarsDriver()
    val worldMap = mutableMapOf<World, EnsuiWorld>()
    override fun onEnable() {
        Bukkit.getLogger().info("Loaded Glasswars~!")
        Bukkit.getPluginManager().registerEvents(eventDriver, this)
        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, { onTick() }, 1, 0) // Schedule ticks
        val world = Bukkit.getWorld("lobby")
        if (world != null) {
            worldMap[world] = SpawnWorld(world);
        } else {
            logger.warning("Could not load lobby world.")
        }



        initItems()
        gwDriver.createGame(GlasswarsMapType.SKYSCRAPERS)
    }

    private fun onTick(): Unit {
        gwDriver.tick()
    }
}