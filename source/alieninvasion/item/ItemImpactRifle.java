package alieninvasion.item;

import alieninvasion.AlienInvasion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemImpactRifle extends Item {
	public ItemImpactRifle() {
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("impactRifle");
		setTextureName(AlienInvasion.MODID + ":" + "ImpactRifle");
	}
}
