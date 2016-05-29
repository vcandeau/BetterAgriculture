package com.knoxhack.netherexpansion;

import com.knoxhack.netherexpansion.blocks.ModBlocks;
import com.knoxhack.netherexpansion.crafting.ModCrafting;

import com.knoxhack.netherexpansion.world.WorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.createBlocks();
	}

	public void init(FMLInitializationEvent event) {
		ModCrafting.initCrafting();
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}
