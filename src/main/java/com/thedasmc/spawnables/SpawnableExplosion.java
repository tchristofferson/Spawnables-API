package com.thedasmc.spawnables;

import org.bukkit.Location;

public class SpawnableExplosion implements Spawnable {

    public final float power;
    public final boolean setFire;
    public final boolean breakBlocks;

    public SpawnableExplosion(float power, boolean setFire, boolean breakBlocks) {
        this.power = power;
        this.setFire = setFire;
        this.breakBlocks = breakBlocks;
    }

    @Override
    public void spawn(Location location) {
        location.getWorld().createExplosion(location.getX(), location.getY(), location.getZ(), power, setFire, breakBlocks);
    }

}
