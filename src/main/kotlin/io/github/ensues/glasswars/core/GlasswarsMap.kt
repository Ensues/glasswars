package io.github.ensues.glasswars.core

import io.github.ensues.glasswars.core.generators.GlasswarsGenerator
import org.bukkit.Location

abstract class GlasswarsMap {
    abstract val teams : List<GlasswarsTeamData>
    abstract val generators : List<GlasswarsGenerator>
    abstract val spectateLocation : Location
    abstract val minLoc : Location
    abstract val maxLoc : Location
}