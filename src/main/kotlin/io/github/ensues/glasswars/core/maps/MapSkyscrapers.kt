package io.github.ensues.glasswars.core.maps

import io.github.ensues.glasswars.core.GlasswarsMap
import io.github.ensues.glasswars.core.teams.GlasswarsTeamData
import io.github.ensues.glasswars.core.constants.GlasswarsColor
import io.github.ensues.glasswars.core.constants.*
import io.github.ensues.glasswars.core.generators.GlasswarsGenerator
import org.bukkit.Location
import org.bukkit.World

class MapSkyscrapers(val world : World) : GlasswarsMap() {

    override val teams = listOf(
        GlasswarsTeamData(
        GlasswarsColor.TEAL,
        Location(world, 404.5, 2.0, 540.5, -90.0f, 0.0f),
        Location(world, 413.0, 2.0, 540.5),
        Location(world, 404.5, 3.0, 545.5)
    ), GlasswarsTeamData(
        GlasswarsColor.ORANGE,
        Location(world, 404.5, 2.0, 460.5, -90.0f, 0.0f),
        Location(world, 413.0, 2.0, 460.0),
        Location(world, 404.5, 3.0, 465.5)
    ), GlasswarsTeamData(
        GlasswarsColor.MAGENTA,
        Location(world, 459.5, 2.0, 405.5, 0.0f,   0.0f),
        Location(world, 459.0, 2.0, 414.0),
        Location(world, 454.5, 3.0, 405.5)
    ), GlasswarsTeamData(
        GlasswarsColor.BROWN,
        Location(world, 540.5, 2.0, 405.5, 0.0f,   0.0f),
        Location(world, 540.0, 2.0, 414.0),
        Location(world, 535.5, 3.0, 405.5)
    ), GlasswarsTeamData(
        GlasswarsColor.BLUE,
        Location(world, 595.5, 2.0, 460.5, 90.0f,  0.0f),
        Location(world, 586.0, 2.0, 460.0),
        Location(world, 595.5, 3.0, 455.5)
    ), GlasswarsTeamData(
        GlasswarsColor.GREEN,
        Location(world, 595.5, 2.0, 540.5, 90.0f,  0.0f),
        Location(world, 586.0, 2.0, 540.0),
        Location(world, 595.5, 3.0, 535.5)
    ), GlasswarsTeamData(
        GlasswarsColor.YELLOW,
        Location(world, 540.5, 2.0, 595.5, 180.0f, 0.0f),
        Location(world, 540.0, 2.0, 586.0),
        Location(world, 545.5, 3.0, 595.5)
    ), GlasswarsTeamData(
        GlasswarsColor.RED,
        Location(world, 459.5, 2.0, 595.5, 180.0f, 0.0f),
        Location(world, 459.0, 2.0, 586.0),
        Location(world, 464.5, 3.0, 595.5)
    )
    )

    override val generators = listOf(
        GlasswarsGenerator(600, Location(world, 459.5, 7.0,  540.5), currencyRed),
        GlasswarsGenerator(600, Location(world, 459.5, 7.0,  460.5), currencyRed),
        GlasswarsGenerator(600, Location(world, 540.5, 7.0,  460.5), currencyRed),
        GlasswarsGenerator(600, Location(world, 540.5, 7.0,  540.5), currencyRed),
        GlasswarsGenerator(1200, Location(world, 500.5, 11.0, 519.5), currencyYellow),
        GlasswarsGenerator(1200, Location(world, 481.5, 11.5, 500.5), currencyYellow),
        GlasswarsGenerator(1200, Location(world, 500.5, 11.0, 481.5), currencyYellow),
        GlasswarsGenerator(1200, Location(world, 519.5, 11.0, 500.5), currencyYellow),
    )

    override val spectateLocation = Location(world, 500.0, 10.0, 500.0)
    override val minLoc = Location(world, 391.5, -18.5, 392.5)
    override val maxLoc = Location(world, 608.5, 31.5, 608.5)

}