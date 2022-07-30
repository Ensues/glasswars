package io.github.ensues.glasswars.core

import io.github.ensues.glasswars.core.GlasswarsPlayer
import org.bukkit.Location

class GlasswarsTeam(val glassLocation: Location) {
    val players = listOf<GlasswarsPlayer>()
    val canRespawn = true

    // TODO add team upgrades and such.
}