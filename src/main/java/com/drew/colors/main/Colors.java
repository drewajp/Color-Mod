package com.drew.colors.main;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import com.drew.colors.colors.*;

import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;

@Mod(modid = Colors.MODID, version = Colors.VERSION)
public class Colors {

	public static final String MODID = "colors";
	public static final String VERSION = "1.0";
	
	public static Block color000255000; //green
	public static Block color255000000; //red
	public static Block color000000255; //blue
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		
		color000255000 = new greenBlock();
		color255000000 = new redBlock();
		color000000255 = new blueBlock();

		
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		if(event.getSide() == Side.CLIENT)
		{
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
	renderItem.getItemModelMesher().register(Item.getItemFromBlock(color000255000), 0, new ModelResourceLocation(Colors.MODID + ":" + ((greenBlock) color000255000).getName(), "inventory"));
	renderItem.getItemModelMesher().register(Item.getItemFromBlock(color255000000), 0, new ModelResourceLocation(Colors.MODID + ":" + ((redBlock) color255000000).getName(), "inventory"));
	renderItem.getItemModelMesher().register(Item.getItemFromBlock(color000000255), 0, new ModelResourceLocation(Colors.MODID + ":" + ((blueBlock) color000000255).getName(), "inventory"));

		}
	}	
}
