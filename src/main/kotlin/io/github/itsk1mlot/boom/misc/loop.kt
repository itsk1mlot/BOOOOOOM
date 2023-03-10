package io.github.itsk1mlot.boom.misc

import io.github.itsk1mlot.boom.Main
import io.github.itsk1mlot.boom.commands.ToggleBoom
import io.github.itsk1mlot.boom.`object`.messages
import org.bukkit.Bukkit
import org.bukkit.entity.EntityType
import org.bukkit.scheduler.BukkitRunnable
import kotlin.random.Random

object loop {
    class Runnable: BukkitRunnable() {
        override fun run() {
            if (ToggleBoom.toggleBoom) {
                val random = Random.nextBoolean() // get random (true, false)
                //println("random의 값은 다음과 같습니다: ${random}")
                if (!random) {
                    messages.boomTitle() // send title to all players.
                    Bukkit.getOnlinePlayers().forEach {
                        val loc = it.location // get player's location
                        // summon entities.
                        it.world.spawnEntity(loc, EntityType.PRIMED_TNT)
                        it.world.spawnEntity(loc, EntityType.PRIMED_TNT)
                        it.world.spawnEntity(loc, EntityType.PRIMED_TNT)
                        it.world.spawnEntity(loc, EntityType.PRIMED_TNT)
                        it.world.spawnEntity(loc, EntityType.PRIMED_TNT)
                        it.world.spawnEntity(loc, EntityType.CREEPER)
                        it.world.spawnEntity(loc, EntityType.CREEPER)
                        it.world.spawnEntity(loc, EntityType.CREEPER)
                        it.world.spawnEntity(loc, EntityType.CREEPER)
                        it.world.spawnEntity(loc, EntityType.CREEPER)
                    }
                }
            }
        }
    }
    fun main() {
        Runnable().runTaskTimer(Main.instance, 1200, 1200) // loop run
    }
}