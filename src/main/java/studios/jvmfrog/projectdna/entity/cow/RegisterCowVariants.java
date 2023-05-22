package studios.jvmfrog.projectdna.entity.cow;

import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;

public class RegisterCowVariants {

    private void registerCowVariants() {
        Registry.register(Registry.ENTITY_TYPE, "mod:black_cow", EntityType.Builder.create(BlackCowEntity::new, EntityType.COW.getSpawnGroup())
                .dimensions(EntityType.COW.getDimensions())
                .build("black_cow"));

        Registry.register(Registry.ENTITY_TYPE, "mod:brown_cow", EntityType.Builder.create(BrownCowEntity::new, EntityType.COW.getSpawnGroup())
                .dimensions(EntityType.COW.getDimensions())
                .build("brown_cow"));

        Registry.register(Registry.ENTITY_TYPE, "mod:red_cow", EntityType.Builder.create(RedCowEntity::new, EntityType.COW.getSpawnGroup())
                .dimensions(EntityType.COW.getDimensions())
                .build("red_cow"));
    }
}
