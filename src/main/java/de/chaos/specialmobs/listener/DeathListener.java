package de.chaos.specialmobs.listener;

import de.chaos.specialmobs.mobs.DiamondZombie;
import de.chaos.specialmobs.mobs.IronZombie;
import de.chaos.specialmobs.mobs.NetherZombie;
import de.chaos.specialmobs.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class DeathListener implements Listener {
    @EventHandler
    public static void onEventDeath(EntityDeathEvent event) {
        if (event.getEntityType() == EntityType.ZOMBIE) {
            Zombie zombie = (Zombie) event.getEntity();
            if (!(zombie.getCustomName() == null)) {
                if (zombie.getCustomName().equalsIgnoreCase(DiamondZombie.NAME)) {
                    zombie.getWorld().dropItemNaturally(zombie.getLocation(), new ItemBuilder(Material.DIAMOND_BLOCK, 1).itemStack());
                }
                if (zombie.getCustomName().equalsIgnoreCase(IronZombie.NAME)) {
                    zombie.getWorld().dropItemNaturally(zombie.getLocation(), new ItemBuilder(Material.IRON_BLOCK, 1).itemStack());
                }
                if (zombie.getCustomName().equalsIgnoreCase(NetherZombie.NAME)) {
                    zombie.getWorld().dropItemNaturally(zombie.getLocation(), new ItemBuilder(Material.NETHERITE_INGOT).itemStack());
                }
            }
        }
    }
}
