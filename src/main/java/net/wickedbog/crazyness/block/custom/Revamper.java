package net.wickedbog.crazyness.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.wickedbog.crazyness.item.ModItems;
import net.wickedbog.crazyness.visual_effects.ExampleParticleEffect;

public class Revamper extends Block {
    public Revamper(Properties pProperties) {
        super(pProperties);
    }

    //@SubscribeEvent
    //public static void clientTick(TickEvent.ClientTickEvent event) {
    //    final LocalPlayer player = Minecraft.getInstance().player;
    //    final BlockPos pPos = player.blockPosition();
    //    if (player != null) {
    //            ExampleParticleEffect.spawnExampleParticles(player.level(), new Vec3(pPos.getX(), pPos.getY() + 1, pPos.getZ()));

    //    }
    //}


    @Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, RandomSource pRandom) {
        ExampleParticleEffect.spawnExampleParticles(pLevel, new Vec3(pPos.getX(), pPos.getY() + 0.5, pPos.getZ()));
        ExampleParticleEffect.spawnSecondParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pPlayer.isHolding(ModItems.SAPPHIRE.get())) {
            pLevel.playSound(pPlayer, pPos, SoundEvents.LIGHTNING_BOLT_IMPACT, SoundSource.MASTER);
            pPlayer.getItemInHand(pHand).setCount(pPlayer.getItemInHand(pHand).getCount() - 1);
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            ExampleParticleEffect.spawnExplodeParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));
            pLevel.playSound(pPlayer, pPos, SoundEvents.LIGHTNING_BOLT_THUNDER, SoundSource.MASTER);
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.FAIL;
    }
}
