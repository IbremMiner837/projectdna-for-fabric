package studios.jvmfrog.projectdna.entity.cow;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

import java.util.Random;

public class BlackCowEntity extends CowEntity {
    public BlackCowEntity(EntityType<? extends CowEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public CowEntity createChild(ServerWorld serverWorld, PassiveEntity passiveEntity) {
        return super.createChild(serverWorld, passiveEntity);
    }

    public static boolean canSpawn(EntityType<BlackCowEntity> type, World world, Random random, int chunkX, int chunkZ) {
        return canSpawn(type, world, random, chunkX, chunkZ) && random.nextInt(10) == 0;
    }
}
