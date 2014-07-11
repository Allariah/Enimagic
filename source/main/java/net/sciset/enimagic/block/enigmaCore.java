package net.sciset.enimagic.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class enigmaCore extends Block
{
    public enigmaCore()
    {

        super(Material.glass);
        this.setBlockName("Enigma Core");
        this.setHardness(5.0f);
        //setCreativeTab(customTab);
    }
}
