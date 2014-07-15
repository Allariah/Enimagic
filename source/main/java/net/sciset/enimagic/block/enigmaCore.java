package net.sciset.enimagic.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.sciset.enimagic.creativetab.creativeTab;

public class enigmaCore extends Block
{
    public enigmaCore()
    {

        super(Material.glass);
        this.setBlockName("Enigma_Core");
        this.setHardness(5.0f);
        this.setCreativeTab(creativeTab.ENIMAGICTAB);
    }
}
