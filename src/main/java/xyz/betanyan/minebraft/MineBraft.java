package xyz.betanyan.minebraft;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MineBraft extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {

        String message = event.getMessage();

        if (message.toLowerCase().contains("b")
                || message.toLowerCase().contains("c")
                || message.toLowerCase().contains("k")) {

            event.setMessage(message.replaceAll("(?i)[bck]",
                    ChatColor.RED.toString() + ChatColor.BOLD + "B" + ChatColor.RESET));

        }

    }

}
