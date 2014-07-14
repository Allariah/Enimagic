package net.sciset.enimagic.Initialisers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.sciset.enimagic.block.Block_enigmaCore;


public class Blocks
{
    public static final Block enigmaCore = new Block_enigmaCore();

    public static void init()
    {
        GameRegistry.registerBlock(enigmaCore, "enigmaCore");
    }
}
