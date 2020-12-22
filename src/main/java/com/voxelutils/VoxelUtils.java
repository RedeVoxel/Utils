package com.voxelutils;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

public class VoxelUtils {
    @Getter
    @Setter
    private static JavaPlugin plugin;

    @Getter
    @Setter
    private static String ErrorPrefix = "[Error]";
}
