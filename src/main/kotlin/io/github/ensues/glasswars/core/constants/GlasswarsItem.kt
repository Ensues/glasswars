package io.github.ensues.glasswars.core.constants

import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemStack

    val currencyWhite = ItemStack(Material.SUGAR, 1)
    val currencyGray = ItemStack(Material.GUNPOWDER, 1)
    val currencyRed = ItemStack(Material.REDSTONE, 1)
    val currencyYellow = ItemStack(Material.GLOWSTONE_DUST, 1)

    fun initItems() {
        val whiteMeta = currencyWhite.itemMeta
        if (whiteMeta != null) {
            whiteMeta.setDisplayName("§fAlpha Essence |")
            currencyWhite.itemMeta = whiteMeta
        }
        val grayMeta = currencyGray.itemMeta
        if (grayMeta != null) {
            grayMeta.setDisplayName("§fBeta Essence§7 ||")
            currencyWhite.itemMeta = grayMeta
        }
        val redMeta = currencyRed.itemMeta
        if (redMeta != null) {
            redMeta.setDisplayName("§fGamma Essence§4 |||")
            currencyRed.itemMeta = redMeta
        }
        val yellowMeta = currencyYellow.itemMeta
        if (yellowMeta != null) {
            yellowMeta.setDisplayName("§fDelta Essence§e ||||")
            currencyYellow.itemMeta = yellowMeta
        }
    }