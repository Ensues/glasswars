package io.github.ensues.glasswars.core

import io.github.ensues.glasswars.Tickable
import io.github.ensues.glasswars.core.constants.*
import io.github.ensues.glasswars.core.generators.GlasswarsGenerator
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.inventory.ItemStack

class GlasswarsGame(val world: World) : Tickable {
    val teams = mutableListOf<GlasswarsTeam>()
    val generators = mutableListOf<GlasswarsGenerator>()

    init {
        teams.add(GlasswarsTeam(GlasswarsColor.TEAL, Location(world,413.0, 2.0, 540.0), Location(world, 404.5, 3.5, 545.5)))
        generators.add(GlasswarsGenerator(
            600,
            Location(world, 459.5, 7.0, 540.5),
            currencyRed
        ))
        generators.add(GlasswarsGenerator(
            1200,
            Location(world, 481.5, 11.0, 500.5),
            currencyYellow
        ))
    }

    override fun tick() {
        teams.forEach { it.tick() } // Tick all teams
        generators.forEach { it.tick() } // Tick all generators
    }


}