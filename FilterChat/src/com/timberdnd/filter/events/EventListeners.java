package com.timberdnd.filter.events;

import com.timberdnd.filter.FilterChat;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class EventListeners implements Listener {

    FileConfiguration fc = FilterChat.plugin.getConfig();

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onChat(AsyncPlayerChatEvent event) {
	for(String s: fc.getConfigurationSection("words").getKeys(false)) {
	    event.setMessage(event.getMessage().replace(s, fc.getString("words." + s + ".replacement")));
	}
    }
}