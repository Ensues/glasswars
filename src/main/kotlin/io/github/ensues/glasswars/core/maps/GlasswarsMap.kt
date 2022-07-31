package io.github.ensues.glasswars.core.maps

import io.github.ensues.glasswars.core.generators.GlasswarsGenerator
import io.github.ensues.glasswars.core.teams.GlasswarsTeamData
import org.bukkit.Location
import org.bukkit.World

abstract class GlasswarsMap(val mapWorld: World) {
    abstract val teams : List<GlasswarsTeamData>
    abstract val generators : List<GlasswarsGenerator>
    abstract val spectateLocation : Location
    abstract val lobbyLocation : Location
    abstract val minLoc : Location
    abstract val maxLoc : Location
}