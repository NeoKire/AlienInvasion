package alieninvasion;

import net.minecraft.client.model.ModelBase;
import alieninvasion.client.renderer.entity.RenderVidesaiInvader;
import alieninvasion.entity.monster.EntityVidesaiInvader;
import alieninvasion.model.ModelVidesa;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityVidesaiInvader.class, new RenderVidesaiInvader(new ModelVidesa(), 0));
	}
}
