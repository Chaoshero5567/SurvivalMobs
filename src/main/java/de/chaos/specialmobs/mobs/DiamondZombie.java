package de.chaos.specialmobs.mobs;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;

public class DiamondZombie  {
    private final String NAME = "§6Zombie";


    public DiamondZombie(Location location) {
        Zombie specialZombie = (Zombie) location.getWorld().spawnEntity(location, EntityType.ZOMBIE);
        specialZombie.setCustomName(NAME);
        specialZombie.setHealth(50);
        specialZombie.setAI(true);
        specialZombie.damage(6);
    }
}
