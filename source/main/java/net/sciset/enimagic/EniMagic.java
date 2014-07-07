package net.sciset.enimagic;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="EniMagic", name="Enimagic", version="1.7.2-10")

public class EniMagic
{
    @Mod.Instance("EniMagic")
    public static EniMagic instance;

    // Pre Initialisation Phase
    // Items, Blocks
    @Mod.EventHandler
    public void preInitialisation(FMLPreInitializationEvent event)
    {

    }

    // Initialisation Phase
    // GUI, Crafting Recipes.
    @Mod.EventHandler
    public void Initialisation(FMLInitializationEvent event)
    {

    }

    // Post Initialisation Phase
    @Mod.EventHandler
    public void PostInitialisation(FMLPostInitializationEvent event)
    {

    }

}
