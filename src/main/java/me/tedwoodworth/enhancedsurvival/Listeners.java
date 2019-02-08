package me.tedwoodworth.enhancedsurvival;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Listeners implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        // Runs when a player sends a chat message.

        // If someone says hi, say hello back.
        if (event.getMessage().equals("hi")) {
            Bukkit.broadcastMessage("Hello!");
        }
    }
}
