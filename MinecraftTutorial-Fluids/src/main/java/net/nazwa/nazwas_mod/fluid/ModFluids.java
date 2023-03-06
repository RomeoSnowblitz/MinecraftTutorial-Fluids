package net.nazwa.nazwas_mod.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nazwa.nazwas_mod.NazwasMod;

public class ModFluids {
    public static final FlowableFluid TAR_FLUID_STILL = register("tar_fluid_still", new TarFluid.Still());
    public static final FlowableFluid TAR_FLUID_FLOWING = register("tar_fluid_flowing", new TarFluid.Flowing());

    private static FlowableFluid register(String name, FlowableFluid flowableFluid){
        return Registry.register(Registries.FLUID, new Identifier(NazwasMod.MOD_ID, name), flowableFluid);
    }
}
