package com.voxelutils.messages;

import com.voxelutils.VoxelUtils;

public class Error extends Throwable {
    public Error(String message) {
        super(message);

        VoxelUtils.getPlugin().getLogger().warning(message);
    }
}
