package io.github.ensues.glasswars

import io.github.ensues.glasswars.core.GlasswarsDriver
import io.github.ensues.glasswars.core.constants.initItems
import io.github.ensues.glasswars.core.maps.GlasswarsMapType
import org.bukkit.Bukkit
import org.bukkit.World
import org.bukkit.WorldCreator
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.CraftItemEvent
import org.bukkit.event.player.AsyncPlayerChatEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin
import java.lang.NullPointerException

class Main : JavaPlugin(), Listener {
    private val gwDriver = GlasswarsDriver()
    override fun onEnable() {
        Bukkit.getLogger().info("Loaded Glasswars~!")
        Bukkit.getPluginManager().registerEvents(this, this)
        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, { onTick() }, 1, 0) // Schedule ticks

        initItems()
        gwDriver.createGame(GlasswarsMapType.SKYSCRAPERS)
    }

    fun onTick(): Unit {
        gwDriver.tick()
    }
    @EventHandler
    fun playerJoin(joinEvent: PlayerJoinEvent) {
        joinEvent.joinMessage = "§7" + joinEvent.player.name + " joined."
    }

    @EventHandler
    fun chatEvent(chatEvent: AsyncPlayerChatEvent) {
        chatEvent.isCancelled = true
        Bukkit.getOnlinePlayers().forEach {
            it.sendMessage("§f${chatEvent.player.name}:§7 ${chatEvent.message}")
        }
    }

    @EventHandler
    fun craftEvent(craftItemEvent: CraftItemEvent) {
        craftItemEvent.isCancelled = true
    }
}

fun getWorld(worldName: String): World {
    val w = Bukkit.getWorld(worldName)
    return if (w != null) {
        w
    } else {
        Bukkit.createWorld(WorldCreator(worldName)) ?: throw NullPointerException("World could not be created")
    }
}