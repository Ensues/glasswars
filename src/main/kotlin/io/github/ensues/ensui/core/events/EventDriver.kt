package io.github.ensues.ensui.core.events

import io.github.ensues.ensui.core.Main
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.*
import org.bukkit.event.enchantment.*
import org.bukkit.event.entity.*
import org.bukkit.event.inventory.*
import org.bukkit.event.player.*

class EventDriver(private val plugin: Main) : Listener, io.github.ensues.ensui.core.events.EventHandler {

    @EventHandler fun onJoinServer(e: PlayerJoinEvent) {
        plugin.worldMap[e.player.world]?.joinWorld(e.player)
    }

    @EventHandler override fun onBlockBreak(e: BlockBreakEvent) {
        plugin.worldMap[e.block.world]?.eventHandler?.onBlockBreak(e)
    }
    @EventHandler override fun onBlockBurn(e: BlockBurnEvent) {
        plugin.worldMap[e.block.world]?.eventHandler?.onBlockBurn(e)
    }
    @EventHandler override fun onCanBuild(e: BlockCanBuildEvent) {
        plugin.worldMap[e.block.world]?.eventHandler?.onCanBuild(e)
    }
    @EventHandler override fun onBlockDropItem(e: BlockDropItemEvent) {
        plugin.worldMap[e.block.world]?.eventHandler?.onBlockDropItem(e)
    }
    @EventHandler override fun onBlockExp(e: BlockExpEvent) {
        plugin.worldMap[e.block.world]?.eventHandler?.onBlockExp(e)
    }
    @EventHandler override fun onBlockExplode(e: BlockExplodeEvent) {
        plugin.worldMap[e.block.world]?.eventHandler?.onBlockExplode(e)
    }
    @EventHandler override fun onBlockPhysics(e: BlockPhysicsEvent) {
        plugin.worldMap[e.block.world]?.eventHandler?.onBlockPhysics(e)
    }
    @EventHandler override fun onBlockPlace(e: BlockPlaceEvent) {
        plugin.worldMap[e.block.world]?.eventHandler?.onBlockPlace(e)
    }
    @EventHandler override fun onBlockRecieve(e: BlockReceiveGameEvent) {
        plugin.worldMap[e.block.world]?.eventHandler?.onBlockRecieve(e)
    }

    @EventHandler override fun onPrepareItemEnchant(e: PrepareItemEnchantEvent) {
        plugin.worldMap[e.enchantBlock.world]?.eventHandler?.onPrepareItemEnchant(e)
    }
    @EventHandler override fun onItemEnchant(e: EnchantItemEvent) {
        plugin.worldMap[e.enchantBlock.world]?.eventHandler?.onItemEnchant(e)
    }

    @EventHandler override fun onEntityDamage(e: EntityDamageEvent) {
        plugin.worldMap[e.entity.world]?.eventHandler?.onEntityDamage(e)
    }
    @EventHandler override fun onEntityDamageEntity(e: EntityDamageByEntityEvent) {
        plugin.worldMap[e.entity.world]?.eventHandler?.onEntityDamageEntity(e)
    }
    @EventHandler override fun onBlockDamageEntity(e: EntityDamageByBlockEvent) {
        plugin.worldMap[e.entity.world]?.eventHandler?.onBlockDamageEntity(e)
    }
    @EventHandler override fun onEntityDeath(e: EntityDeathEvent) {
        plugin.worldMap[e.entity.world]?.eventHandler?.onEntityDeath(e)
    }
    @EventHandler override fun onEntityDropItem(e: EntityDropItemEvent) {
        plugin.worldMap[e.entity.world]?.eventHandler?.onEntityDropItem(e)
    }
    @EventHandler override fun onEntityInteract(e: EntityInteractEvent) {
        plugin.worldMap[e.entity.world]?.eventHandler?.onEntityInteract(e)
    }
    @EventHandler override fun onEntitySpawn(e: EntitySpawnEvent) {
        plugin.worldMap[e.entity.world]?.eventHandler?.onEntitySpawn(e)
    }

    @EventHandler override fun onCraft(e: CraftItemEvent) {
        plugin.worldMap[e.whoClicked.world]?.eventHandler?.onCraft(e)
    }
    @EventHandler override fun onInventoryClick(e: InventoryClickEvent) {
        plugin.worldMap[e.whoClicked.world]?.eventHandler?.onInventoryClick(e)
    }
    @EventHandler override fun onInventoryClose(e: InventoryCloseEvent) {
        plugin.worldMap[e.player.world]?.eventHandler?.onInventoryClose(e)
    }
    @EventHandler override fun onInventoryDrag(e: InventoryDragEvent) {
        plugin.worldMap[e.whoClicked.world]?.eventHandler?.onInventoryDrag(e)
    }
    @EventHandler override fun onInventoryOpen(e: InventoryOpenEvent) {
        plugin.worldMap[e.player.world]?.eventHandler?.onInventoryOpen(e)
    }

    @EventHandler override fun onChat(e: AsyncPlayerChatEvent) {
        plugin.worldMap[e.player.world]?.eventHandler?.onChat(e)
    }
    @EventHandler override fun onDropItem(e: PlayerDropItemEvent) {
        plugin.worldMap[e.player.world]?.eventHandler?.onDropItem(e)
    }
    @EventHandler override fun onPlayerHarvestBlock(e: PlayerHarvestBlockEvent) {
        plugin.worldMap[e.player.world]?.eventHandler?.onPlayerHarvestBlock(e)
    }
    @EventHandler override fun onPlayerInteract(e: PlayerInteractEvent) {
        plugin.worldMap[e.player.world]?.eventHandler?.onPlayerInteract(e)
    }
    @EventHandler override fun onPlayerInteractEntity(e: PlayerInteractEntityEvent) {
        plugin.worldMap[e.player.world]?.eventHandler?.onPlayerInteractEntity(e)
    }
    @EventHandler override fun onPlayerConsume(e: PlayerItemConsumeEvent) {
        plugin.worldMap[e.player.world]?.eventHandler?.onPlayerConsume(e)
    }
    @EventHandler override fun onPlayerQuit(e: PlayerQuitEvent) {
        plugin.worldMap[e.player.world]?.eventHandler?.onPlayerQuit(e)
    }
    @EventHandler override fun onRespawn(e: PlayerRespawnEvent) {
        plugin.worldMap[e.player.world]?.eventHandler?.onRespawn(e)
    }
    @EventHandler override fun onSwapHands(e: PlayerSwapHandItemsEvent) {
        plugin.worldMap[e.player.world]?.eventHandler?.onSwapHands(e)
    }
}