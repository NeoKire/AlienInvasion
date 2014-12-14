package alieninvasion.item;

import alieninvasion.AlienInvasion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLDLC extends Item {
	public ItemLDLC() {
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("lDLC");
		setTextureName(AlienInvasion.MODID + ":" + "LDL-C");
	}
}
