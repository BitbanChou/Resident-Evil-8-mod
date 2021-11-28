package com.Joy187.newmod.init;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import com.Joy187.newmod.fluids.FluidLiquid;

public class ModFluid {
	public static final Fluid VIRGINIS = new FluidLiquid("virginis", new ResourceLocation("joymod:blocks/virginis_still"), new ResourceLocation("joymod:blocks/virginis_flow"));

	public static void registerFluids() {
		registerFluid(VIRGINIS);
	}
	
	public static void registerFluid(Fluid fluid) {
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
	
}
