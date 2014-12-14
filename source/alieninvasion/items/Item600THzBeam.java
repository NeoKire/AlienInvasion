package alieninvasion.items;

import alieninvasion.AlienInvasion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Item600THzBeam extends Item {
	public Item600THzBeam() {
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("tHzBeam");
		setTextureName(AlienInvasion.MODID + ":" + "600THzBeam");
	}
}
