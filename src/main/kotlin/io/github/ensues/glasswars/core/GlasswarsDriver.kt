package io.github.ensues.glasswars.core

import io.github.ensues.glasswars.Tickable
import io.github.ensues.glasswars.core.exceptions.FailedToCreateRoomException
import io.github.ensues.glasswars.core.exceptions.NoAvailableRoomsException
import io.github.ensues.glasswars.core.maps.GlasswarsMapType
import org.bukkit.Bukkit
import org.bukkit.World
import org.bukkit.WorldCreator
import java.io.File
import java.io.IOException

const val GLASSWARS_MAP_PREFIX = "glasswars/maps/"
const val GLASSWARS_GAME_PREFIX = "glasswars/games/game-"

/**
 * The glasswars driver is responsible for handling all the glasswars games.
 */
class GlasswarsDriver : Tickable{
    private val currentGames = arrayOfNulls<GlasswarsGame>(4)

    fun createGame(mapType: GlasswarsMapType) {
        val index = currentGames.indexOf(null)
        if (index<0) {
            throw NoAvailableRoomsException("There are no available GlassWars rooms.");
        } else {
            val gameWorld = loadMap(GLASSWARS_MAP_PREFIX + mapType.mapName, GLASSWARS_GAME_PREFIX + index)
            if (gameWorld != null) {
                currentGames[index] = GlasswarsGame(mapType.getInstance(gameWorld))
            } else {
                throw FailedToCreateRoomException("Could not create Glasswars room.");
            }
        }

    }

    override fun tick() {
        currentGames.filterNotNull().forEach(Tickable::tick)
    }

    fun loadMap(from: String, to: String): World? {
        // Unload old map
        Bukkit.unloadWorld(to, false)
        // Validate data
        val toLoc = File(to)
        val fromLoc = File(from)
        if (!fromLoc.exists()) {
            throw IOException("Missing world to copy from.");
        }
        // Delete old map
        if (toLoc.exists()) {
            toLoc.deleteRecursively()
        }
        // Copy new map
        fromLoc.copyRecursively(toLoc, true)
        // Delete unnecessary data
        Bukkit.getLogger().info(fromLoc.toPath().resolve("uid.dat").toString());
        val uidLoc = File(fromLoc.toPath().resolve("uid.dat").toUri())
        if (uidLoc.exists()) {
            uidLoc.delete()
        }
        // Load new map
        return Bukkit.createWorld(WorldCreator(to))
    }
}