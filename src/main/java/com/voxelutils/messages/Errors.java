package com.voxelutils.messages;

import com.voxelutils.VoxelUtils;
import org.bukkit.ChatColor;

public class Errors {
    public String ShowError(String msg) {
        String CompleteMsgError = VoxelUtils.Error_Prefix.concat(" " + msg);
        return ColoredMessage.SingleColor(ChatColor.RED, CompleteMsgError);
    }
}
