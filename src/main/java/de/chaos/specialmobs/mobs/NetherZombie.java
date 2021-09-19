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

public class NetherZombie {
    public static String NAME = ChatColor.BLACK + "Nether Zombie";
    public NetherZombie(Zombie zombie) {
        zombie.setCustomName(NAME);
        zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(250);
        zombie.getAttribute(Attribute.GENERIC_ARMOR).setBaseValue(40);
        zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(30);
        zombie.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).setBaseValue(100);
        zombie.getAttribute(Attribute.GENERIC_FOLLOW_RANGE).setBaseValue(1000);
        zombie.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.5);
        zombie.getEquipment().setChestplate(new ItemBuilder(Material.NETHERITE_CHESTPLATE).enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3).itemStack());
        zombie.getEquipment().setLeggings(new ItemBuilder(Material.NETHERITE_LEGGINGS).enchantment(Enchantment.PROTECTION_EXPLOSIONS, 3).itemStack());
        zombie.getEquipment().setBoots(new ItemBuilder(Material.NETHERITE_BOOTS).enchantment(Enchantment.PROTECTION_FALL, 3).itemStack());
        zombie.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 99999, 9999, false, false));
        Objects.requireNonNull(zombie.getLocation().getWorld()).strikeLightning(zombie.getLocation());
    }
}
