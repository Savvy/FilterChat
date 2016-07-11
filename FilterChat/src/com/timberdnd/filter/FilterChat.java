package com.timberdnd.filter;

import com.timberdnd.filter.events.EventListeners;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class FilterChat extends JavaPlugin {
    
    public static Plugin plugin;
    
    public void onEnable() {
	plugin = this;
	saveDefaultConfig();
	getServer().getPluginManager().registerEvents(new EventListeners(),  this);
    }
}
