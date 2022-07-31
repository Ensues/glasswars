package io.github.ensues.ensui.glasswars.maps

import io.github.ensues.ensui.glasswars.generators.GlasswarsGenerator
import io.github.ensues.ensui.glasswars.teams.GlasswarsTeamData
import org.bukkit.Location
import org.bukkit.World

abstract class GlasswarsMap(val mapWorld: World) {
    abstract val teams : List<GlasswarsTeamData>
    abstract val maxPlayers : Int
    abstract val generators : List<GlasswarsGenerator>
    abstract val spectateLocation : Location
    abstract val lobbyLocation : Location
    abstract val minLoc : Location
    abstract val maxLoc : Location
}