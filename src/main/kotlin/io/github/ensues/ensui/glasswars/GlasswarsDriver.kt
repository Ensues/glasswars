package io.github.ensues.ensui.glasswars

import io.github.ensues.ensui.core.Tickable
import io.github.ensues.ensui.glasswars.exceptions.FailedToCreateRoomException
import io.github.ensues.ensui.glasswars.exceptions.NoAvailableRoomsException
import io.github.ensues.ensui.glasswars.maps.GlasswarsMapType
import org.bukkit.Bukkit
import org.bukkit.World
import org.bukkit.WorldCreator
import org.bukkit.entity.Player
import java.io.File
import java.io.IOException

const val GLASSWARS_MAP_PREFIX = "glasswars/maps/"
const val GLASSWARS_GAME_PREFIX = "glasswars/games/game-"

/**
 * The glasswars driver is responsible for handling all the glasswars games.
 */
class GlasswarsDriver : Tickable {
    private val currentGames = arrayOfNulls<GlasswarsGame>(4)

    // Debug default param
    fun createGame(mapType: GlasswarsMapType = GlasswarsMapType.SKYSCRAPERS): GlasswarsGame {
        val index = currentGames.indexOf(null)
        if (index<0) {
            throw NoAvailableRoomsException("There are no available GlassWars rooms.");
        } else {
            val gameWorld = loadMap(GLASSWARS_MAP_PREFIX + mapType.mapName, GLASSWARS_GAME_PREFIX + index)
            if (gameWorld != null) {
                val game = GlasswarsGame(mapType.getInstance(gameWorld))
                currentGames[index] = game
                return game
            } else {
                throw FailedToCreateRoomException("Could not create Glasswars room.");
            }
        }
    }
    fun connectToGame(player: Player) {
        val foundGame = currentGames.filterNotNull().find { it.canJoin() }
        if (foundGame == null) {
            val game = createGame()
            game.addPlayer(player)
        } else {
            foundGame.addPlayer(player)
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
        val uidLoc = File(fromLoc.toPath().resolve("uid.dat").toUri())
        if (uidLoc.exists()) {
            uidLoc.delete()
        }
        // Load new map
        return Bukkit.createWorld(WorldCreator(to))
    }
}