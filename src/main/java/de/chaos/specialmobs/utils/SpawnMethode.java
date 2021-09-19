package de.chaos.specialmobs.utils;

import de.chaos.specialmobs.SpecialMobs;
import org.bukkit.entity.Axolotl;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

import java.util.Random;

import static org.bukkit.entity.EntityType.AXOLOTL;
import static org.bukkit.entity.EntityType.ZOMBIE;

public class SpawnMethode implements Listener {
    @EventHandler
    public static void onMobSpawn(EntitySpawnEvent event) {
        if (event.getEntity().getType() == ZOMBIE) {
            Zombie zombie = (Zombie) event.getEntity();
            int Chance = new Random().nextInt(10000);
            if (Chance == 5) {
                SpecialMobs.spawnDiamonZombie(zombie);
            }
            if (Chance % 5 == 0) {
                SpecialMobs.spawnIronZombie(zombie);
            }
            if (Chance == 1) {
                SpecialMobs.spawnNetherZombie(zombie);
            }
        }
        if (event.getEntity().getType() == AXOLOTL) {
            Axolotl axolotl = (Axolotl) event.getEntity();
            int Chance = new Random().nextInt(100);
            if (Chance == 1) {
                SpecialMobs.spawnAngryAxolotl(axolotl);
            }
        }
    }
}
