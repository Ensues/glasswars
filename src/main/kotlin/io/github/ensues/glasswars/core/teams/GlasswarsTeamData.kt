package io.github.ensues.glasswars.core.teams

import io.github.ensues.glasswars.core.constants.GlasswarsColor
import io.github.ensues.glasswars.core.constants.currencyGray
import io.github.ensues.glasswars.core.constants.currencyWhite
import io.github.ensues.glasswars.core.generators.GlasswarsGenerator
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