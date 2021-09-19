package de.chaos.specialmobs.mobs;

import de.chaos.specialmobs.utils.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Zombie;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class IronZombie {
    public static String NAME = ChatColor.WHITE + "Iron Zombie";
    public IronZombie(Zombie zombie) {
        zombie.setCustomName(NAME);
        zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(50);
        zombie.getAttribute(Attribute.GENERIC_ARMOR).setBaseValue(5);
        zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(6);
        zombie.getAttribute(Attribute.GENERIC_FOLLOW_RANGE).setBaseValue(60);
        zombie.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.3);
        zombie.getEquipment().setChestplate(new ItemBuilder(Material.IRON_CHESTPLATE).enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1).itemStack());
        zombie.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 120, 9999, false, false));
    }

}
