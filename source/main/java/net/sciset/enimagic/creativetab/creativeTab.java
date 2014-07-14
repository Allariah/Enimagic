package net.sciset.enimagic.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class creativeTab
{
    public static final CreativeTabs ENIMAGICTAB = new CreativeTabs("EniMagic")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.ender_eye;
        }
    };
}