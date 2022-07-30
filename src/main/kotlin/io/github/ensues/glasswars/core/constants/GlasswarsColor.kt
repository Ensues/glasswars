package io.github.ensues.glasswars.core.constants

import org.bukkit.Material

enum class GlasswarsColor(
    val colorCode: String,
    val woolBlock: Material,
) {
    RED(colorFrom("FF4444"), Material.RED_WOOL),
    ORANGE(colorFrom("FF7700"), Material.ORANGE_WOOL),
    BROWN(colorFrom("AA5533"), Material.BROWN_WOOL),
    YELLOW(colorFrom("FFFF77"), Material.YELLOW_WOOL),
    TEAL(colorFrom("77FFFF"), Material.LIGHT_BLUE_WOOL),
    BLUE(colorFrom("3377FF"), Material.BLUE_WOOL),
    MAGENTA(colorFrom("FF66FF"), Material.MAGENTA_WOOL),
    GREEN(colorFrom("77FF77"), Material.LIME_WOOL),


}

// Returns a chat hex from a text hex
private fun colorFrom(hex: String): String {
    return "§x§${hex[0]}§${hex[1]}§${hex[2]}§${hex[3]}§${hex[4]}§${hex[5]}"
}