package de.chaos.specialmobs.commands;

import de.chaos.specialmobs.SpecialMobs;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Axolotl;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class SummonNewEntityCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Location location = player.getLocation();
        Axolotl axolotl = (Axolotl) location.getWorld().spawnEntity(location, EntityType.AXOLOTL);
        SpecialMobs.spawnAngryAxolotl(axolotl);
        return false;
    }
}
