package com.Joy187.newmod.util.handlers;

import com.Joy187.newmod.entity.EntityInit;
import com.Joy187.newmod.init.ModBlocks;
import com.Joy187.newmod.init.ModEnchantment;
import com.Joy187.newmod.init.ModFluid;
import com.Joy187.newmod.init.ModItems;
import com.Joy187.newmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onEnchantmentRegister(RegistryEvent.Register<Enchantment> event)
	{
		event.getRegistry().registerAll(ModEnchantment.ENCHANTNENTS.toArray(new Enchantment[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item: ModItems.ITEMS){
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		
		for (Block block: ModBlocks.BLOCKS) {
			if (block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
		
	}
	
	public static void preInitRegistries(){
		
		ModFluid.registerFluids();
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
		RenderHandler.registerCustomMeshesAndStates();
	}
	
	public static void initRegistries() {
		SoundsHandler.registerSounds();
	}
	
	public static void postInitRegistries() {
		
	}
}
