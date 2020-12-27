package com.redevoxel.voxelutils.messages;

import com.redevoxel.voxelutils.VoxelUtils;

public class Error extends Throwable {
    public Error(String message) {
        super(VoxelUtils.getErrorPrefix() + " " + message);
        
        VoxelUtils.getPlugin().getLogger().warning(message);
    }
}
