package alieninvasion.item;

import alieninvasion.AlienInvasion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLDAC extends Item {
	public ItemLDAC() {
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("lDAC");
		setTextureName(AlienInvasion.MODID + ":" + "LDA-C");
	}
}