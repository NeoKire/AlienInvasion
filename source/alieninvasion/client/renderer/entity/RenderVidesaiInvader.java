package alieninvasion.client.renderer.entity;

import alieninvasion.AlienInvasion;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderVidesaiInvader extends RenderBiped {
	
	public static final ResourceLocation textureLocation = new ResourceLocation(AlienInvasion.MODID + ":textures/entities/videsai_invader.png");

	public RenderVidesaiInvader(ModelBiped model, float shadowSize) {
		super(model, shadowSize);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return textureLocation;
	}

}
