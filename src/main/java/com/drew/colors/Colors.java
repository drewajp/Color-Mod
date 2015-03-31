package com.drew.colors;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Colors.MODID, version = Colors.VERSION)
public class Colors {

	public static final String MODID = "Colors";
	public static final String VERSION = "1.0";
	
	public static Block green;
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
    	GameRegistry.registerBlock(green, "green");
	}


	
}
