package io.github.itsk1mlot.boom.commands

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class ToggleBoom: CommandExecutor {

    companion object {
        var toggleBoom = false // true -> toggle, false -> untoggle
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        val p = sender
        if (toggleBoom) {
            p.sendMessage("${ChatColor.RED}Boom is now turned off.")
            toggleBoom = false
        }else if (!toggleBoom) {
            p.sendMessage("${ChatColor.GREEN}Boom is now turned on.")
            toggleBoom = true
        }
        return true
    }
}