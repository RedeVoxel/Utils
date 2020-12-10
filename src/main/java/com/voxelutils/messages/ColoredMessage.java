package com.voxelutils.messages;

import org.bukkit.ChatColor;

public class ColoredMessage {
    public static String MultipleColors(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static String SingleColor(ChatColor color, String message) {
        return color + message;
    }
}
