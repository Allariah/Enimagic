package net.sciset.enimagic.item;

import net.minecraft.item.Item;

//Generic Item Class for EniMagic

public class ItemEni extends Item
{
    public ItemEni()
    {
        super();
        this.maxStackSize = 1;
        this.setUnlocalizedName("NULL_NAME");
        //CreativeTab goes here
        this.setNoRepair();
    }
}
