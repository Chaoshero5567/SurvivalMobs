package de.chaos.specialmobs;

import de.chaos.specialmobs.commands.SummonNewEntityCommand;
import de.chaos.specialmobs.listener.DeathListener;
import de.chaos.specialmobs.mobs.AngryAxolotel;
import de.chaos.specialmobs.mobs.DiamondZombie;
import de.chaos.specialmobs.mobs.IronZombie;
import de.chaos.specialmobs.mobs.NetherZombie;
import de.chaos.specialmobs.utils.SpawnMethode;
import org.bukkit.Bukkit;
import org.bukkit.entity.Axolotl;
import org.bukkit.entity.Zombie;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpecialMobs extends JavaPlugin {

    public static SpecialMobs instance;
    public static DiamondZombie diamondZombie;
    public static IronZombie ironZombie;
    public static NetherZombie netherZombie;
    public static AngryAxolotel angryAxolotel;

    public void onEnable() {
        instance = this;
        init(Bukkit.getPluginManager());
    }
    public void init(PluginManager pluginManager) {
        pluginManager.registerEvents(new SpawnMethode(), this);
        pluginManager.registerEvents(new DeathListener(), this);
        getCommand("spawnNewEntity").setExecutor(new SummonNewEntityCommand());
    }
    public void onDisable() {
    }

    public static SpecialMobs getInstance() {
        return instance;
    }

    public static void spawnDiamonZombie(Zombie zombie) {
        diamondZombie = new DiamondZombie(zombie);
    }
    public static void spawnIronZombie(Zombie zombie) {
        ironZombie = new IronZombie(zombie);
    }
    public static void spawnNetherZombie(Zombie zombie) {
        netherZombie = new NetherZombie(zombie);
    }
    public static void spawnAngryAxolotl(Axolotl axolotl) {
        angryAxolotel = new AngryAxolotel(axolotl);
    }
}
