package alieninvasion;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=AlienInvasion.MODID, version=AlienInvasion.VERSION)
public class AlienInvasion {
	public static final String MODID = "alieninvasion";
	public static final String VERSION = "0.1";
	
	// add instance variable for Forge
	@Instance(value="alieninvasion")
	public static AlienInvasion instance;
	
	// set up our 'proxy' code for separation of client and server
	@SidedProxy(clientSide="alieninvasion.ClientProxy", serverSide="alieninvasion.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		BlockRegistry.registerBlocks();
		ItemRegistry.registerItems();
		CraftingManager.addCraftingRecipes();
		CraftingManager.addSmeltingRecipes();
	}
}
