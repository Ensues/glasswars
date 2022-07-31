package io.github.ensues.glasswars.core

import io.github.ensues.glasswars.Tickable
import io.github.ensues.glasswars.core.maps.GlasswarsMap
import io.github.ensues.glasswars.core.teams.GlasswarsTeam

class GlasswarsGame(private val gameMap: GlasswarsMap) : Tickable {
    private val teams = gameMap.teams.map { GlasswarsTeam(it) }
    private val generators = gameMap.generators

    override fun tick() {
        teams.forEach { it.tick() } // Tick all teams
        generators.forEach { it.tick() } // Tick all generators
    }


}