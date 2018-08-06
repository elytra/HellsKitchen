package com.elytradev.hellskitchen.tile;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

public class TileEntityVines extends TileEntity {
    public int vinesDown = 3;
    public int vinesUp = 0;
    public int vinesNorth = 0;
    public int vinesSouth = 0;
    public int vinesEast = 0;
    public int vinesWest = 0;

    public boolean vinesVert(EnumFacing facing) {
        int vines = 0;
        switch(facing) {
            case DOWN:
                vines = vinesDown;
                break;
            case UP:
                vines = vinesUp;
                break;
            case NORTH:
                vines = vinesNorth;
                break;
            case SOUTH:
                vines = vinesSouth;
                break;
            case EAST:
                vines = vinesEast;
                break;
            case WEST:
                vines = vinesWest;
                break;
        }
        return (vines & 1) == 1;
    }

    public boolean vinesHoriz(EnumFacing facing) {
        int vines = 0;
        switch(facing) {
            case DOWN:
                vines = vinesDown;
                break;
            case UP:
                vines = vinesUp;
                break;
            case NORTH:
                vines = vinesNorth;
                break;
            case SOUTH:
                vines = vinesSouth;
                break;
            case EAST:
                vines = vinesEast;
                break;
            case WEST:
                vines = vinesWest;
                break;
        }
        return (vines & 2) == 2;
    }
}
