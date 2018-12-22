package com.thedasmc.spawnables;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;

public class SpawnableLightning extends SpawnableEntity {

    private final boolean isEffect;

    public SpawnableLightning(Location location, int count, boolean isEffect) {
        super(EntityType.LIGHTNING, count);
        this.isEffect = isEffect;
    }

    @Override
    public void spawn(Location location) {
        World world = location.getWorld();

        if (isEffect) {
            for (int i = 0; i < count; i++) {
                world.strikeLightningEffect(location);
            }
        } else {
            for (int i = 0; i < count; i++) {
                world.strikeLightning(location);
            }
        }
    }

}
