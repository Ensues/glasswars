package io.github.ensues.ensui.glasswars.maps

import io.github.ensues.ensui.glasswars.teams.GlasswarsTeamData
import io.github.ensues.ensui.glasswars.constants.GlasswarsColor
import io.github.ensues.ensui.glasswars.generators.GlasswarsGenerator
import io.github.ensues.ensui.glasswars.constants.currencyRed
import io.github.ensues.ensui.glasswars.constants.currencyYellow
import org.bukkit.Location
import org.bukkit.World

class MapSkyscrapers(mapWorld: World) : GlasswarsMap(mapWorld) {
    override val teams = listOf(
        GlasswarsTeamData(
        GlasswarsColor.TEAL,
        Location(mapWorld, 404.5, 2.0, 540.5, -90.0f, 0.0f),
        Location(mapWorld, 413.0, 2.0, 540.5),
        Location(mapWorld, 404.5, 3.0, 545.5)
    ), GlasswarsTeamData(
        GlasswarsColor.ORANGE,
        Location(mapWorld, 404.5, 2.0, 460.5, -90.0f, 0.0f),
        Location(mapWorld, 413.0, 2.0, 460.0),
        Location(mapWorld, 404.5, 3.0, 465.5)
    ), GlasswarsTeamData(
        GlasswarsColor.MAGENTA,
        Location(mapWorld, 459.5, 2.0, 405.5, 0.0f,   0.0f),
        Location(mapWorld, 459.0, 2.0, 414.0),
        Location(mapWorld, 454.5, 3.0, 405.5)
    ), GlasswarsTeamData(
        GlasswarsColor.BROWN,
        Location(mapWorld, 540.5, 2.0, 405.5, 0.0f,   0.0f),
        Location(mapWorld, 540.0, 2.0, 414.0),
        Location(mapWorld, 535.5, 3.0, 405.5)
    ), GlasswarsTeamData(
        GlasswarsColor.BLUE,
        Location(mapWorld, 595.5, 2.0, 460.5, 90.0f,  0.0f),
        Location(mapWorld, 586.0, 2.0, 460.0),
        Location(mapWorld, 595.5, 3.0, 455.5)
    ), GlasswarsTeamData(
        GlasswarsColor.GREEN,
        Location(mapWorld, 595.5, 2.0, 540.5, 90.0f,  0.0f),
        Location(mapWorld, 586.0, 2.0, 540.0),
        Location(mapWorld, 595.5, 3.0, 535.5)
    ), GlasswarsTeamData(
        GlasswarsColor.YELLOW,
        Location(mapWorld, 540.5, 2.0, 595.5, 180.0f, 0.0f),
        Location(mapWorld, 540.0, 2.0, 586.0),
        Location(mapWorld, 545.5, 3.0, 595.5)
    ), GlasswarsTeamData(
        GlasswarsColor.RED,
        Location(mapWorld, 459.5, 2.0, 595.5, 180.0f, 0.0f),
        Location(mapWorld, 459.0, 2.0, 586.0),
        Location(mapWorld, 464.5, 3.0, 595.5)
    )
    )

    override val generators = listOf(
        GlasswarsGenerator(600, Location(mapWorld, 459.5, 7.0,  540.5), currencyRed),
        GlasswarsGenerator(600, Location(mapWorld, 459.5, 7.0,  460.5), currencyRed),
        GlasswarsGenerator(600, Location(mapWorld, 540.5, 7.0,  460.5), currencyRed),
        GlasswarsGenerator(600, Location(mapWorld, 540.5, 7.0,  540.5), currencyRed),
        GlasswarsGenerator(1200, Location(mapWorld, 500.5, 11.0, 519.5), currencyYellow),
        GlasswarsGenerator(1200, Location(mapWorld, 481.5, 11.5, 500.5), currencyYellow),
        GlasswarsGenerator(1200, Location(mapWorld, 500.5, 11.0, 481.5), currencyYellow),
        GlasswarsGenerator(1200, Location(mapWorld, 519.5, 11.0, 500.5), currencyYellow),
    )

    override val spectateLocation = Location(mapWorld, 500.0, 10.0, 500.0)
    override val minLoc = Location(mapWorld, 391.5, -18.5, 392.5)
    override val maxLoc = Location(mapWorld, 608.5, 31.5, 608.5)
    override val lobbyLocation = Location(mapWorld, 0.5, 1.0, 0.5)

}