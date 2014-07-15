package net.sciset.enimagic.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.sciset.enimagic.creativetab.creativeTab;

/**
 * This blocks function is that in the core rooms it will keep the fire alight as Netherrack would,
 * Only it will look and act as obsidian, HOWEVER. When it is broken it will return standard Obsidian.
 */

public class obsidian_Lighter extends Block {
    public obsidian_Lighter()
    {

        super(Material.rock);
        this.setBlockName("obsidian_Lighter");
        this.setHardness(50.0f);
        this.setCreativeTab(creativeTab.ENIMAGICTAB);


    }
}

