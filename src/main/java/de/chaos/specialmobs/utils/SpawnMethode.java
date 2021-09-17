package de.chaos.specialmobs.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;
import java.util.Random;

import static org.bukkit.entity.EntityType.ZOMBIE;

public class SpawnMethode implements Listener {
    private static String NAME = ChatColor.AQUA + "DiamondZombie";
    @EventHandler
    public static void onMobSpawn(EntitySpawnEvent event) {
        if (event.getEntity().getType() == ZOMBIE) {
            int random = new Random().nextInt(100);
            if (random == 1) {
                Zombie zombie = (Zombie) event.getEntity();
                zombie.setCustomName(NAME);
                zombie.setFireTicks(0);
                zombie.setMaxHealth(50);
                zombie.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999, 3, false, false));
                Objects.requireNonNull(zombie.getLocation().getWorld()).strikeLightning(zombie.getLocation());
            }
        }
    }

}
