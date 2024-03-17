package net.wickedbog.crazyness.util;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.wickedbog.crazyness.crazyness;

public class ModWoodTypes {
    public static final WoodType PINE = WoodType.register(new WoodType(crazyness.MOD_ID + ":pine", BlockSetType.OAK));
}
