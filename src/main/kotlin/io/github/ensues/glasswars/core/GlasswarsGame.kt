package io.github.ensues.glasswars.core

import io.github.ensues.glasswars.Tickable
import io.github.ensues.glasswars.core.constants.*
import io.github.ensues.glasswars.core.generators.GlasswarsGenerator
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class GlasswarsGame : Tickable {
    val teams = listOf<GlasswarsTeam>()
    val generators = mutableListOf<GlasswarsGenerator>()

    init { // TEMP
        generators.add(GlasswarsGenerator(
            40,
            Location(Bukkit.getWorld("bedwars"), 404.5, 3.0, 545.5),
            currencyWhite
        ))
        generators.add(GlasswarsGenerator(
            200,
            Location(Bukkit.getWorld("bedwars"), 404.5, 3.0, 545.5),
            currencyGray
        ))
        generators.add(GlasswarsGenerator(
            600,
            Location(Bukkit.getWorld("bedwars"), 459.5, 7.0, 540.5),
            currencyRed
        ))
        generators.add(GlasswarsGenerator(
            1200,
            Location(Bukkit.getWorld("bedwars"), 481.5, 11.0, 500.5),
            currencyYellow
        ))
    }

    override fun tick() {
        generators.forEach { it.tick() } // Tick all generators
    }


}