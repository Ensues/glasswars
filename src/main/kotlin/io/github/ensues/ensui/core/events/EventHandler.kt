package io.github.ensues.ensui.core.events

import org.bukkit.event.block.*
import org.bukkit.event.enchantment.*
import org.bukkit.event.entity.*
import org.bukkit.event.inventory.*
import org.bukkit.event.player.*

interface EventHandler {
    fun onBlockBreak(e: BlockBreakEvent) {}
    fun onBlockBurn(e: BlockBurnEvent) {}
    fun onCanBuild(e: BlockCanBuildEvent) {}
    fun onBlockDropItem(e: BlockDropItemEvent) {}
    fun onBlockExp(e: BlockExpEvent) {}
    fun onBlockExplode(e: BlockExplodeEvent) {}
    fun onBlockPhysics(e: BlockPhysicsEvent) {}
    fun onBlockPlace(e: BlockPlaceEvent) {}
    fun onBlockRecieve(e: BlockReceiveGameEvent) {}

    fun onPrepareItemEnchant(e: PrepareItemEnchantEvent) {}
    fun onItemEnchant(e: EnchantItemEvent) {}

    fun onEntityDamage(e: EntityDamageEvent) {}
    fun onEntityDamageEntity(e: EntityDamageByEntityEvent) {}
    fun onBlockDamageEntity(e: EntityDamageByBlockEvent) {}
    fun onEntityDeath(e: EntityDeathEvent) {}
    fun onEntityDropItem(e: EntityDropItemEvent) {}
    fun onEntityInteract(e: EntityInteractEvent) {}
    fun onEntitySpawn(e: EntitySpawnEvent) {}

    fun onCraft(e: CraftItemEvent) {}
    fun onInventoryClick(e: InventoryClickEvent) {}
    fun onInventoryClose(e: InventoryCloseEvent) {}
    fun onInventoryDrag(e: InventoryDragEvent) {}
    fun onInventoryOpen(e: InventoryOpenEvent) {}

    fun onChat(e: AsyncPlayerChatEvent) {}
    fun onDropItem(e: PlayerDropItemEvent) {}
    fun onPlayerHarvestBlock(e: PlayerHarvestBlockEvent) {}
    fun onPlayerInteract(e: PlayerInteractEvent) {}
    fun onPlayerInteractEntity(e: PlayerInteractEntityEvent) {}
    fun onPlayerConsume(e: PlayerItemConsumeEvent) {}
    fun onPlayerQuit(e: PlayerQuitEvent) {}
    fun onRespawn(e: PlayerRespawnEvent) {}
    fun onSwapHands(e: PlayerSwapHandItemsEvent) {}

}