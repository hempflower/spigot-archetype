package it.pkg;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class basic extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.basic.Command basic, String label, String[] args){
        return true;
    }
}
