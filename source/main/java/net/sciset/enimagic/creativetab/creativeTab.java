package net.sciset.enimagic.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class creativeTab
{
    public static CreativeTabs customTab = new CreativeTabs("tabEniMagic")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.ender_eye;
        }
    };
}