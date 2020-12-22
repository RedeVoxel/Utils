package com.voxelutils.messages;

import org.bukkit.ChatColor;

public class Message {
    public static String Colored(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static String SingleColor(ChatColor color, String message){
        return color + message;
    }
}
