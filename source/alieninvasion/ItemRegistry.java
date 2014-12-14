package alieninvasion;

import net.minecraft.item.Item;
import alieninvasion.item.Item600THzBeam;
import alieninvasion.item.ItemHeavyImpactRifle;
import alieninvasion.item.ItemImpactRifle;
import alieninvasion.item.ItemLDAC;
import alieninvasion.item.ItemLDLC;
import alieninvasion.item.ItemLaserRifle;
import alieninvasion.item.ItemSpaceRevolver;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegistry {
	
	public static final Item laserRifle = new ItemLaserRifle();
	public static final Item spaceRevolver = new ItemSpaceRevolver();
	public static final Item impactRifle = new ItemImpactRifle();
	public static final Item lDAC = new ItemLDAC();
	public static final Item tHzBeam = new Item600THzBeam();
	public static final Item heavyImpactRifle = new ItemHeavyImpactRifle();
	public static final Item lDLC = new ItemLDLC();
	
	public static void registerItems() {
		GameRegistry.registerItem(laserRifle, laserRifle.getUnlocalizedName());
		GameRegistry.registerItem(spaceRevolver, spaceRevolver.getUnlocalizedName());
		GameRegistry.registerItem(lDAC, lDAC.getUnlocalizedName());
		GameRegistry.registerItem(impactRifle, impactRifle.getUnlocalizedName());
		GameRegistry.registerItem(tHzBeam, tHzBeam.getUnlocalizedName());
		GameRegistry.registerItem(heavyImpactRifle, heavyImpactRifle.getUnlocalizedName());
		GameRegistry.registerItem(lDLC, lDLC.getUnlocalizedName());
	}
}
