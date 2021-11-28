package com.Joy187.newmod;

import com.Joy187.newmod.init.ModRecipes;
import com.Joy187.newmod.init.ModSpawn;
import com.Joy187.newmod.proxy.CommonProxy;
import com.Joy187.newmod.tabs.BlockTab;
import com.Joy187.newmod.tabs.ItemTab;
import com.Joy187.newmod.util.Reference;
import com.Joy187.newmod.util.handlers.RegistryHandler;
import com.Joy187.newmod.world.ModWorldGen;
import com.Joy187.newmod.world.ModWorldGenCustomStructure;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.Mod_ID, name = Reference.NAME, version=Reference.VERSION)
public class Main {
	
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	static { FluidRegistry.enableUniversalBucket(); }
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries( );
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		GameRegistry.registerWorldGenerator(new ModWorldGenCustomStructure(), 0);

	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event)
	{
		ModRecipes.init();
		ModSpawn.registerSpawnList();
		RegistryHandler.initRegistries();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static CreativeTabs BLOCK_TAB = new BlockTab( );
	public static CreativeTabs ITEM_TAB = new ItemTab( );
}
