package io.github.ensues.ensui.glasswars.teams

import io.github.ensues.ensui.core.Tickable
import io.github.ensues.ensui.glasswars.GlasswarsPlayer

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