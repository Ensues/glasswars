package io.github.ensues.glasswars

import org.bukkit.Bukkit
import org.bukkit.command.PluginCommand
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin(), Listener {
    override fun onEnable() {
        Bukkit.getLogger().info("Loaded Glasswars~!")
        Bukkit.getPluginManager().registerEvents(this, this)
    }

    @EventHandler
    fun playerJoin(joinEvent: PlayerJoinEvent) {
        joinEvent.joinMessage = "§6" + joinEvent.player.name + " joined!"
    }

    @EventHandler
    fun chatEvent(chatEvent: AsyncPlayerChatEvent) {
        chatEvent.isCancelled = true;
        Bukkit.getOnlinePlayers().forEach {
            it.sendMessage("§8${chatEvent.player.name}:§7 ${chatEvent.message}")
        }
    }
}
