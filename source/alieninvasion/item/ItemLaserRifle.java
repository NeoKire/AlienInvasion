package alieninvasion.item;

import alieninvasion.AlienInvasion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLaserRifle extends Item {
	public ItemLaserRifle() {
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("laserRifle");
		setTextureName(AlienInvasion.MODID + ":" + "LaserRifle");
	}
}