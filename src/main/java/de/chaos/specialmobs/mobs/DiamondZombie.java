package de.chaos.specialmobs.mobs;

import de.chaos.specialmobs.utils.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class DiamondZombie {
    public static String NAME = ChatColor.AQUA + "Diamond Zombie";
    public DiamondZombie(Zombie zombie) {
        zombie.setCustomName(NAME);
        zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(100);
        zombie.getAttribute(Attribute.GENERIC_ARMOR).setBaseValue(20);
        zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(10);
        zombie.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).setBaseValue(100);
        zombie.getAttribute(Attribute.GENERIC_FOLLOW_RANGE).setBaseValue(100);
        zombie.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.4);
        zombie.getEquipment().setChestplate(new ItemBuilder(Material.DIAMOND_CHESTPLATE).enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2).itemStack());
        zombie.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 120, 9999, false, false));
        Objects.requireNonNull(zombie.getLocation().getWorld()).strikeLightning(zombie.getLocation());
    }
}
