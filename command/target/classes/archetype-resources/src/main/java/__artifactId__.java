#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class ${artifactId} extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.${artifactId}.Command ${artifactId}, String label, String[] args){
        return true;
    }
}
