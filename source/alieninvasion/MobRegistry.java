package alieninvasion;

import net.minecraft.entity.EntityList;
import alieninvasion.entity.monster.EntityVidesaiInvader;
import cpw.mods.fml.common.registry.EntityRegistry;

public class MobRegistry {
	
	public static void registerEntities() {
		int invaderID = EntityRegistry.findGlobalUniqueEntityId();
		int cPrimary = 0xFFCCFF;
		int cSecondary = 0x993399;
		
		EntityRegistry.registerGlobalEntityID(EntityVidesaiInvader.class, "entityVidesaiInvader", invaderID);
		EntityRegistry.registerModEntity(EntityVidesaiInvader.class, "entityVidesaiInvader", invaderID, AlienInvasion.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(invaderID), new EntityList.EntityEggInfo(invaderID, cPrimary, cSecondary));
	}
	
}
