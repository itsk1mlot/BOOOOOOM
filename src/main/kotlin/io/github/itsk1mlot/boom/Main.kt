package io.github.itsk1mlot.boom

import io.github.itsk1mlot.boom.commands.ToggleBoom
import io.github.itsk1mlot.boom.misc.loop
import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {

    companion object {
        lateinit var instance: Main
    }
    init {
        instance = this
    }

    override fun onEnable() {
        //server.pluginManager.registerEvents(Class(), this)
        getCommand("toggleboom")?.setExecutor(ToggleBoom())
        loop.main() // loop run
        println("[BOOOOOOM] 시스템이 활성화됩니다!")
    }

    override fun onDisable() {
        println("[BOOOOOOM] 시스템이 비활성화됩니다!")
    }
}