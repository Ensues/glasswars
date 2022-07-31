package io.github.ensues.ensui.glasswars.generators

import io.github.ensues.ensui.core.Tickable
import org.bukkit.Location
import org.bukkit.inventory.ItemStack
import org.bukkit.util.Vector

data class GlasswarsGenerator(
    private val maxTimeUntilSpawn: Long,
    private val spawnLocation: Location,
    private val spawnItem: ItemStack,
    ) : Tickable {
    var currentTime: Long = 0

    override fun tick() {
        currentTime++
        if (currentTime>=maxTimeUntilSpawn) {
            currentTime = 0
            val world = spawnLocation.world;
            if (world != null) {
                val item = world.dropItem(spawnLocation, spawnItem)
                item.velocity = Vector(0, 0, 0)
                item.pickupDelay = 15;
            }
        }
    }
}