package alieninvasion.item;

import alieninvasion.AlienInvasion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemHeavyImpactRifle extends Item {
	public ItemHeavyImpactRifle() {
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("heavyImpactRifle");
		setTextureName(AlienInvasion.MODID + ":" + "HeavyImpactRifle");
	}
}