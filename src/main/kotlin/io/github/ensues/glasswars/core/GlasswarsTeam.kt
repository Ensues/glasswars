package io.github.ensues.glasswars.core

import io.github.ensues.glasswars.Tickable
import io.github.ensues.glasswars.core.GlasswarsPlayer
import io.github.ensues.glasswars.core.constants.GlasswarsColor
import io.github.ensues.glasswars.core.constants.currencyGray
import io.github.ensues.glasswars.core.constants.currencyWhite
import io.github.ensues.glasswars.core.generators.GlasswarsGenerator
import org.bukkit.Location

class GlasswarsTeam(val teamData : GlasswarsTeamData) {
    val players = listOf<GlasswarsPlayer>()
    val canRespawn = true


    // TODO add team upgrades and such.
}