package com.drew.colors.colors;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.drew.colors.main.Colors;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class blueBlock extends Block {
	
	private final String name = "color000000255";
	
	public blueBlock()
	{
		super(Material.cloth);	
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(Colors.MODID + "_" + name);
		setCreativeTab(Colors.colors);
	}

	public String getName() {
		return name;
	}
}
