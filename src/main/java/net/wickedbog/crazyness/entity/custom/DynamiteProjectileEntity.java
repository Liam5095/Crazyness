package net.wickedbog.crazyness.entity.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.wickedbog.crazyness.entity.ModEntities;
import net.wickedbog.crazyness.item.ModItems;

public class DynamiteProjectileEntity extends ThrowableItemProjectile {

    public DynamiteProjectileEntity(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public DynamiteProjectileEntity(Level pLevel) {
        super(ModEntities.DYNAMITE_PROJECTILE.get(), pLevel);
    }

    public DynamiteProjectileEntity(Level pLevel, LivingEntity livingEntity) {
        super(ModEntities.DYNAMITE_PROJECTILE.get(), livingEntity, pLevel);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.DYANMITE.get();
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        PrimedTnt TNT = (PrimedTnt) EntityType.TNT.create(this.level());

        if(!this.level().isClientSide()) {
            this.level().broadcastEntityEvent(this, ((byte) 3));
            TNT.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
            TNT.setFuse(0);
            this.level().addFreshEntity(TNT);
        }

        this.discard();
        super.onHitBlock(pResult);
    }
}
