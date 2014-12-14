package alieninvasion.block;

import alieninvasion.AlienInvasion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockVidesaiOre extends Block {

	public BlockVidesaiOre() {
		super(Material.rock);
		setHardness(4.0f);
		setResistance(10.0f);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockName("blockVidesaiOre");
		setBlockTextureName(AlienInvasion.MODID + ":videsai_ore");
		setHarvestLevel("pickaxe", 3);
	}

}
