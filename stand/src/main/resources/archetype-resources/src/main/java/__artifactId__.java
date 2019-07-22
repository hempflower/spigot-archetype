#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.command.Command1;
import ${package}.event.PlayerEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ${artifactId} extends JavaPlugin {
    //注意！
    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginCommand("cmd1").setExecutor(new Command1());
        Bukkit.getPluginManager().registerEvents(new PlayerEvent(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
