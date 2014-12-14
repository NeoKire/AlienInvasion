package alieninvasion.items;

import alieninvasion.AlienInvasion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSpaceRevolver extends Item {
	public ItemSpaceRevolver() {
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("spaceRevolver");
		setTextureName(AlienInvasion.MODID + ":" + "SpaceRevolver");
	}
}
