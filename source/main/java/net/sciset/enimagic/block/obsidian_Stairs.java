package net.sciset.enimagic.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.sciset.enimagic.creativetab.creativeTab;


public class obsidian_Stairs extends BlockStairs
{
    public obsidian_Stairs()
    {
        super(net.minecraft.init.Blocks.obsidian, 0);
        this.setBlockName("obsidian_Stairs");
        this.setCreativeTab(creativeTab.ENIMAGICTAB);
        this.setHardness(50.0f);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int textureID, int var2)
    {
        return net.minecraft.init.Blocks.obsidian.getIcon(textureID, 0);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {

    }
}
