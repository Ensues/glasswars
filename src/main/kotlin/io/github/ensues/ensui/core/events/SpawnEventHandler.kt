package io.github.ensues.ensui.core.events

import org.bukkit.GameMode
import org.bukkit.event.block.*
import org.bukkit.event.entity.*
import org.bukkit.event.inventory.*
import org.bukkit.event.player.*

class SpawnEventHandler : EventHandler {
    override fun onBlockBreak(e: BlockBreakEvent) {
        if (e.player.gameMode != GameMode.CREATIVE) e.isCancelled = true
    }
    override fun onBlockBurn(e: BlockBurnEvent) {
        e.isCancelled=true
    }
    override fun onBlockExplode(e: BlockExplodeEvent) {
        e.isCancelled = true
    }
    override fun onBlockPhysics(e: BlockPhysicsEvent) {
        e.isCancelled = true
    }
    override fun onBlockPlace(e: BlockPlaceEvent) {
        if (e.player.gameMode != GameMode.CREATIVE) e.isCancelled = true
    }

    override fun onEntityDamage(e: EntityDamageEvent) {
        e.isCancelled = true
    }

    override fun onCraft(e: CraftItemEvent) {
        e.isCancelled = true
    }
    override fun onInventoryClick(e: InventoryClickEvent) {}
    override fun onInventoryDrag(e: InventoryDragEvent) {}

    override fun onChat(e: AsyncPlayerChatEvent) {}
    override fun onDropItem(e: PlayerDropItemEvent) {
        if (e.player.gameMode != GameMode.CREATIVE) e.isCancelled = true
    }
    override fun onPlayerHarvestBlock(e: PlayerHarvestBlockEvent) {
        if (e.player.gameMode != GameMode.CREATIVE) e.isCancelled = true
    }
    override fun onPlayerInteract(e: PlayerInteractEvent) {
        if (e.player.gameMode != GameMode.CREATIVE) e.isCancelled = true
    }
    override fun onPlayerConsume(e: PlayerItemConsumeEvent) {
        if (e.player.gameMode != GameMode.CREATIVE) e.isCancelled = true
    }
    override fun onPlayerQuit(e: PlayerQuitEvent) {}
    override fun onSwapHands(e: PlayerSwapHandItemsEvent) {
        if (e.player.gameMode != GameMode.CREATIVE) e.isCancelled = true
    }
}