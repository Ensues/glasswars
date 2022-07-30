package io.github.ensues.glasswars.core

import io.github.ensues.glasswars.Tickable
import io.github.ensues.glasswars.core.constants.GlasswarsColor
import io.github.ensues.glasswars.core.constants.currencyGray
import io.github.ensues.glasswars.core.constants.currencyWhite
import io.github.ensues.glasswars.core.generators.GlasswarsGenerator
import org.bukkit.Location

class GlasswarsTeamData(
    val teamColor: GlasswarsColor,
    val respawnLoc: Location,
    val glassLocation: Location,
    val spawnerLoc: Location,
) : Tickable
{
    val alphaGenerator = GlasswarsGenerator(40,spawnerLoc, currencyWhite)
    val betaGenerator = GlasswarsGenerator(100,spawnerLoc, currencyGray)

    override fun tick() {
        alphaGenerator.tick()
        betaGenerator.tick()
    }
}