package io.github.ensues.ensui.glasswars.teams

import io.github.ensues.ensui.glasswars.constants.GlasswarsColor
import io.github.ensues.ensui.glasswars.constants.currencyGray
import io.github.ensues.ensui.glasswars.constants.currencyWhite
import io.github.ensues.ensui.glasswars.generators.GlasswarsGenerator
import org.bukkit.Location

data class GlasswarsTeamData(
    val teamColor: GlasswarsColor,
    val respawnLoc: Location,
    val glassLocation: Location,
    val spawnerLoc: Location,
)
{
    val alphaGenerator = GlasswarsGenerator(40, spawnerLoc, currencyWhite)
    val betaGenerator = GlasswarsGenerator(100, spawnerLoc, currencyGray)
}