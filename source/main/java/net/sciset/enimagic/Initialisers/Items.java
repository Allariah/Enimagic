package net.sciset.enimagic.Initialisers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.sciset.enimagic.item.ItemEni;

public class Items
{
    //Structure:
    //  public static final *GENERIC ITEM CLASS* *ITEM NAME* = new *Item Method*();

    public static final ItemEni coreShard = new net.sciset.enimagic.item.coreShard();

    public static void init()
    {
        GameRegistry.registerItem(coreShard, "coreShard");
    }
}
