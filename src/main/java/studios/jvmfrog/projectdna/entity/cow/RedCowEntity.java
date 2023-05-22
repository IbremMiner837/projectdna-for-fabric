package studios.jvmfrog.projectdna.entity.cow;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.world.World;

public class RedCowEntity extends CowEntity {
    public RedCowEntity(EntityType<? extends CowEntity> entityType, World world) {
        super(entityType, world);
    }
}
