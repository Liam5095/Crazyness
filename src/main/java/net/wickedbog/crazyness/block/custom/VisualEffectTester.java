package net.wickedbog.crazyness.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.wickedbog.crazyness.visual_effects.VisualEffectTesterEffects;

public class VisualEffectTester extends Block {
    public VisualEffectTester(Properties pProperties) {
        super(pProperties);
    }

    //@Override
    //public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, RandomSource pRandom) {
    //    super.animateTick(pState, pLevel, pPos, pRandom);
    //}

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        VisualEffectTesterEffects.spawnTestParticle(pLevel, new Vec3(pPos.getX(), pPos.getY() + 2, pPos.getZ()));

        return InteractionResult.SUCCESS;
    }
}
