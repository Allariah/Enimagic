package net.sciset.enimagic.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;


public class Blocks
{
    public static final Block enigmaCore = new enigmaCore();

    public static void init()
    {
        GameRegistry.registerBlock(enigmaCore, "enigmaCore");
    }
}
