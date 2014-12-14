package alieninvasion.block;

import alieninvasion.AlienInvasion;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BlockVidesaiLog extends Block {
	
	@SideOnly(Side.CLIENT)
	private IIcon top;

	public BlockVidesaiLog() {
		super(Material.wood);
		setHardness(2.0f);
		setResistance(5.0f);
		setBlockName("blockVidesaiLog");
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegistry) {
		this.blockIcon = iconRegistry.registerIcon(AlienInvasion.MODID + ":videsai_log");
		this.top = iconRegistry.registerIcon(AlienInvasion.MODID + ":videsai_log_top");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		if(side < 2)
			return this.top;

		return this.blockIcon;
	}

}
