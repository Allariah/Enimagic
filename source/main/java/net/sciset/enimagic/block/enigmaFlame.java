package net.sciset.enimagic.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.sciset.enimagic.creativetab.creativeTab;


/**
 *  Purple Flames, basically all they are.
 *  They're caused by Enigma Cracks and Explosions when outside of the Core Room.
 */

public class enigmaFlame extends Block
{
    public enigmaFlame()
    {
        super(Material.fire);
        this.setBlockName("enigmaFlame");
        this.setCreativeTab(creativeTab.ENIMAGICTAB);
    }
}
