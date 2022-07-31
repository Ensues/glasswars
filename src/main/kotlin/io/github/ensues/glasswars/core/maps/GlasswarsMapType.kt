package io.github.ensues.glasswars.core.maps

import org.bukkit.World

enum class GlasswarsMapType(val mapName: String, val getInstance: (World) -> GlasswarsMap) {
    SKYSCRAPERS("skyscrapers", { world -> MapSkyscrapers(world) })
}