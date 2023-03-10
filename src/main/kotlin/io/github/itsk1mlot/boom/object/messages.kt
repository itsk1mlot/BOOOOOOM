package io.github.itsk1mlot.boom.`object`

import net.kyori.adventure.text.Component
import net.kyori.adventure.title.TitlePart
import org.bukkit.Bukkit
import org.bukkit.Sound

object messages {
    fun boomTitle() {
        Bukkit.getOnlinePlayers().forEach { it.sendTitlePart(TitlePart.TITLE, Component.text("§cBoom!")) }
        Bukkit.getOnlinePlayers().forEach { it.sendTitlePart(TitlePart.SUBTITLE, Component.text("BOOOOOOOOOOOOOOOM!")) }
        Bukkit.getOnlinePlayers().forEach { it.playSound(it.location, Sound.BLOCK_NOTE_BLOCK_PLING, 50.0f, 1.0f) }
        //playsound
    }
}