package io.github.ensues.ensui.glasswars

import io.github.ensues.ensui.core.Tickable
import io.github.ensues.ensui.glasswars.maps.GlasswarsMap
import io.github.ensues.ensui.glasswars.teams.GlasswarsTeam

class GlasswarsGame(private val gameMap: GlasswarsMap) : Tickable {
    private val teams = gameMap.teams.map { GlasswarsTeam(it) }
    private val generators = gameMap.generators

    override fun tick() {
        teams.forEach { it.tick() } // Tick all teams
        generators.forEach { it.tick() } // Tick all generators
    }


}