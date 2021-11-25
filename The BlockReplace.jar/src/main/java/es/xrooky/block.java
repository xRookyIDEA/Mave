package es.xrooky;

import org.bukkit.Bukkit;
import org.bukkit.*;
import org.bukkit.plugin.PluginDescriñtionFile;
import org.bukkit.plugin.java.JavaPlugin;

public final class block extends JavaPlugin {
    PluginDescriptionFile pdffile = getDescription();
    public String vercion = pdffile.getVercion();
    public String nombre = pdffile.getName();

    @Override
    public void onEnable() {
        Bukkit.getConsoleSernder().sendMessage([BR] The plugin has been successfully activated!);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSernder().sendMessage([BR] The plugin has been successfully deactivated!);
        // Plugin shutdown logic
    }
}
