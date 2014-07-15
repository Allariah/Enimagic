package net.sciset.enimagic.Initialisers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.sciset.enimagic.block.*;


public class Blocks
{
    public static final Block enigmaCore = new enigmaCore();
    public static final Block obsidian_Stairs = new obsidian_Stairs();
    public static final Block obsidian_Lighter = new obsidian_Lighter();
    public static final Block enigmaFlame = new enigmaFlame();

    public static void init()
    {
        GameRegistry.registerBlock(enigmaCore, "enigmaCore");
        GameRegistry.registerBlock(enigmaFlame, "enigmaFlame");
        GameRegistry.registerBlock(obsidian_Stairs, "obsidianStair");
        GameRegistry.registerBlock(obsidian_Lighter, "obsidianLighter");
    }
}
