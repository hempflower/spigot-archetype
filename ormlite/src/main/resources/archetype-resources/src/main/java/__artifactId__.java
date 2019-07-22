#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.bukkit.plugin.java.JavaPlugin;

public final class ${artifactId} extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        //本脚手架添加了ORELITE依赖，你可以在查询有个ORELITE的具体用法
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
