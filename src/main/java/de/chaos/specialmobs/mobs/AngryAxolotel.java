package de.chaos.specialmobs.mobs;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Axolotl;
import org.bukkit.entity.LivingEntity;

public class AngryAxolotel {
    public static String NAME = ChatColor.DARK_RED + "Angry Axolotl";
    public AngryAxolotel(Axolotl axolotl) {
        axolotl.setCustomName(NAME);
        axolotl.setVariant(Axolotl.Variant.LUCY);
        axolotl.getAttribute(Attribute.GENERIC_FOLLOW_RANGE).setBaseValue(555);
        axolotl.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(100);
        axolotl.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(200);
        axolotl.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).setBaseValue(100);
        axolotl.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.6);
        axolotl.setGlowing(true);
        axolotl.setAI(true);
    }
}
