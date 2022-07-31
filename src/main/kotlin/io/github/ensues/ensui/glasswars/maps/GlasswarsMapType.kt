package io.github.ensues.ensui.glasswars.maps

import org.bukkit.World

enum class GlasswarsMapType(val mapName: String, val getInstance: (World) -> GlasswarsMap) {
    SKYSCRAPERS("skyscrapers", { world -> MapSkyscrapers(world) })
}