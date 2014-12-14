package alieninvasion.block;

import alieninvasion.AlienInvasion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockZarkOre extends Block {

	public BlockZarkOre() {
		super(Material.rock);
		setHardness(1.5f);
		setResistance(10.0f);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockName("blockZarkOre");
		setBlockTextureName(AlienInvasion.MODID + ":zark_ore");
	}

}
