package io.github.ensues.glasswars

import io.github.ensues.glasswars.core.GlasswarsGame
import io.github.ensues.glasswars.core.constants.GlasswarsColor
import io.github.ensues.glasswars.core.constants.initItems
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.CraftItemEvent
import org.bukkit.event.player.AsyncPlayerChatEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin(), Listener {
    var currentGame: GlasswarsGame? = null // TEMP
    override fun onEnable() {
        Bukkit.getLogger().info("Loaded Glasswars~!")
        Bukkit.getPluginManager().registerEvents(this, this)
        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, { onTick() }, 1, 0) // Schedule ticks

        // Temp game initialization
        val gameWorld = Bukkit.getWorld("bedwars")
        if (gameWorld != null) {
            currentGame = GlasswarsGame(gameWorld)
        }

        initItems()
    }

    fun onTick(): Unit {
        currentGame?.tick()
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
