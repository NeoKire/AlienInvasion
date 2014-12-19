
package alieninvasion.client.renderer.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import alieninvasion.AlienInvasion;
import alieninvasion.entity.monster.EntityVidesaiInvader;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderVidesaiInvader extends RenderLiving
{
	private static final ResourceLocation mobTextures = new ResourceLocation(AlienInvasion.MODID + ":textures/entities/First-Model-Real.png");
	public RenderVidesaiInvader(ModelBase par1ModelBase, float par2)
	{
		super(par1ModelBase, par2);
	}
	
	protected ResourceLocation getEntityTexture(EntityVidesaiInvader par1EntityCow)
	{
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return this.getEntityTexture((EntityVidesaiInvader)par1Entity);
	}
}