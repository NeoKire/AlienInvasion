package alieninvasion;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import alieninvasion.block.*;

public class BlockRegistry {
	public static final Block blockVidesaiLog = new BlockVidesaiLog();
	public static final Block blockVidesaiOre = new BlockVidesaiOre();
	public static final Block blockVidesaiStone = new BlockVidesaiStone();
	public static final Block blockZarkOre = new BlockZarkOre();

	public static Fluid baseFluid;
	public static Block blockVidesaiWater;

	public static void registerBlocks() {
		GameRegistry.registerBlock(blockVidesaiLog, blockVidesaiLog.getUnlocalizedName());
		GameRegistry.registerBlock(blockVidesaiOre, blockVidesaiOre.getUnlocalizedName());
		GameRegistry.registerBlock(blockVidesaiStone, blockVidesaiStone.getUnlocalizedName());
		GameRegistry.registerBlock(blockZarkOre, blockZarkOre.getUnlocalizedName());

		// Fluids are a special case
		baseFluid = new Fluid("videsaiWater").setLuminosity(5).setViscosity(2000);
		FluidRegistry.registerFluid(baseFluid);
		blockVidesaiWater = new BlockVidesaiWater(baseFluid, Material.water);
		GameRegistry.registerBlock(blockVidesaiWater, "Videsai Water");
		baseFluid.setUnlocalizedName(blockVidesaiWater.getUnlocalizedName());
	}
}
