package com.thedasmc.spawnables;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.util.Vector;

public class SpawnableEntity extends Spawnable {

    public final EntityType entityType;
    public final int count;
    public final Vector velocity;

    public SpawnableEntity(EntityType entityType, int count) {
        this.entityType = entityType;
        this.count = count;
        this.velocity = new Vector();
    }

    public SpawnableEntity(EntityType entityType, int count, Vector velocity) {
        this.entityType = entityType;
        this.count = count;
        this.velocity = velocity;
    }

    @Override
    public void spawn(Location location) {
        for (int i = 0; i < count; i++) {
            location.getWorld().spawnEntity(location, entityType).setVelocity(velocity);
        }
    }

}
