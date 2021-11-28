package com.Joy187.newmod.init;

import java.util.ArrayList;
import java.util.List;

import com.Joy187.newmod.Main;
import com.Joy187.newmod.blocks.BlockBase;
import com.Joy187.newmod.blocks.CageBlock;
import com.Joy187.newmod.blocks.DHandsBlock;
import com.Joy187.newmod.blocks.DLightBlock;
import com.Joy187.newmod.blocks.FantomBlock;
import com.Joy187.newmod.blocks.FantomOre;
import com.Joy187.newmod.blocks.FluidBlock;
import com.Joy187.newmod.blocks.Herb1Block;
import com.Joy187.newmod.blocks.MucusBlock;
import com.Joy187.newmod.blocks.MutamyceteBlock;
import com.Joy187.newmod.blocks.PlankBlock;
import com.Joy187.newmod.blocks.ZSOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block FANTOM_BLOCK = new FantomBlock("fantom_block", Material.IRON, Main.BLOCK_TAB);
	public static final Block ZS_BLOCK = new FantomBlock("zs_block", Material.IRON, Main.BLOCK_TAB);
	public static final Block Mutamycete_BLOCK = new MutamyceteBlock("mutamycete_block", Material.GRASS, Main.BLOCK_TAB);
	public static final Block ZSORE_BLOCK = new ZSOre("zsore_block", Material.ROCK, Main.BLOCK_TAB);
	public static final Block FANTOMORE_BLOCK = new FantomOre("fantomore_block", Material.ROCK, Main.BLOCK_TAB);
	public static final Block DHANDS_BLOCK = new DHandsBlock("dhands_block", Material.ROCK, Main.BLOCK_TAB);
	public static final Block BAOHUSAN = new FantomBlock("baohusan_block", Material.ROCK, Main.BLOCK_TAB);
	public static final Block DLIGHT = new DLightBlock("dlight_block", Material.ROCK, Main.BLOCK_TAB);
	public static final Block DEYE = new DLightBlock("deye_block", Material.SPONGE, Main.BLOCK_TAB);
	public static final Block PLANK = new PlankBlock("plank_block", Material.WOOD, Main.BLOCK_TAB);
	public static final Block MUCUS_BLOCK = new MucusBlock("mucus_block", Material.SNOW, Main.BLOCK_TAB);
	public static final Block PILEW_BLOCK = new DHandsBlock("palewall_block", Material.ROCK, Main.BLOCK_TAB);
	public static final Block FACTW_BLOCK = new DHandsBlock("factorywall_block", Material.IRON, Main.BLOCK_TAB);
	public static final Block CAGE = new CageBlock("cage", Material.IRON, Main.BLOCK_TAB);
	public static final Block FACT_IRON_BLOCK = new FantomBlock("fact_iron_block", Material.IRON, Main.BLOCK_TAB);
	public static final Block CASTLE_BLOCK = new DHandsBlock("castlewall_block", Material.ROCK, Main.BLOCK_TAB);
	public static final Block DUNGEON_BLOCK = new DHandsBlock("dungeonwall_block", Material.ROCK, Main.BLOCK_TAB);
	
	
	public static final Block HERB1_BLOCK = new Herb1Block("herb1_block");
	
	public static final Block VIRGINIS_BLOCK = new FluidBlock("virginis", ModFluid.VIRGINIS , Material.WATER);
}
