package io.github.ensues.glasswars.core.teams

import io.github.ensues.glasswars.Tickable
import io.github.ensues.glasswars.core.GlasswarsPlayer

class GlasswarsTeam(val teamData : GlasswarsTeamData) : Tickable {
    val players = listOf<GlasswarsPlayer>()
    val canRespawn = true
    private val alphaGenerator = teamData.alphaGenerator.copy()
    private val betaGenerator = teamData.betaGenerator.copy()


    override fun tick() {
        alphaGenerator.tick()
        betaGenerator.tick()
    }

    // TODO add team upgrades and such.
}