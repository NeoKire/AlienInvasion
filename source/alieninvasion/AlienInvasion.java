package alieninvasion;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;

@Mod(modid=AlienInvasion.MODID, version=AlienInvasion.VERSION)
public class AlienInvasion {
	public static final String MODID = "alieninvasion";
	public static final String VERSION = "0.1";
	
	@Instance(value="alieninvasion")
	public static AlienInvasion instance;
}
