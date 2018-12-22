package com.thedasmc.spawnables;

import org.bukkit.Location;
import org.bukkit.Particle;

public class SpawnableParticle extends Spawnable {

    public final Particle particle;
    public final int count;
    public final double offX;
    public final double offY;
    public final double offZ;
    public final double extra;

    public SpawnableParticle(Particle particle, int count, double offX, double offY, double offZ, double extra) {
        this.particle = particle;
        this.count = count;
        this.offX = offX;
        this.offY = offY;
        this.offZ = offZ;
        this.extra = extra;
    }

    @Override
    public void spawn(Location location) {
        location.getWorld().spawnParticle(particle, location, count, offX, offY, offZ, extra);
    }

}
