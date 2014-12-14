package alieninvasion.block;

import java.util.Random;

import alieninvasion.AlienInvasion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockVidesaiStone extends Block {

	public BlockVidesaiStone() {
		super(Material.rock);
		setHardness(1.5f);
		setResistance(10.0f);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockName("blockVidesaiStone");
		setBlockTextureName(AlienInvasion.MODID + ":videsai_stone");
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(Blocks.cobblestone);
    }

}
