package alieninvasion.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.model.obj.Face;
import scala.tools.nsc.doc.base.comment.Body;

public class ModelVidesa<ModelFirst> extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Arm_1;
    ModelRenderer Arm_2;
    ModelRenderer Shoulder_1;
    ModelRenderer Shoulder_2;
    ModelRenderer Leg_1;
    ModelRenderer Leg_2;
    ModelRenderer Neck;
    ModelRenderer Nose;
    ModelRenderer Robe_Front_Panel;
    ModelRenderer Robe_Side_1_Panel;
    ModelRenderer Robe_Side_2_Panel;
    ModelRenderer Robe_Back_Panel;
    ModelRenderer Brain_Main;
    ModelRenderer Face;
    ModelRenderer Head_Jaw;
  
  public void Real()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 8, 12, 4);
      Body.setRotationPoint(0F, -8F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Arm_1 = new ModelRenderer(this, 0, 16);
      Arm_1.addBox(0F, 0F, 0F, 2, 12, 2);
      Arm_1.setRotationPoint(-3F, -7F, 1F);
      Arm_1.setTextureSize(64, 32);
      Arm_1.mirror = true;
      setRotation(Arm_1, 0F, 0F, 0F);
      Arm_2 = new ModelRenderer(this, 8, 16);
      Arm_2.addBox(0F, 0F, 0F, 2, 12, 2);
      Arm_2.setRotationPoint(9F, -7F, 1F);
      Arm_2.setTextureSize(64, 32);
      Arm_2.mirror = true;
      setRotation(Arm_2, 0F, 0F, 0F);
      Shoulder_1 = new ModelRenderer(this, 24, 0);
      Shoulder_1.addBox(0F, 0F, 0F, 4, 4, 4);
      Shoulder_1.setRotationPoint(-4F, -9F, 0F);
      Shoulder_1.setTextureSize(64, 32);
      Shoulder_1.mirror = true;
      setRotation(Shoulder_1, 0F, 0F, 0F);
      Shoulder_2 = new ModelRenderer(this, 24, 8);
      Shoulder_2.addBox(0F, 0F, 0F, 4, 4, 4);
      Shoulder_2.setRotationPoint(8F, -9F, 0F);
      Shoulder_2.setTextureSize(64, 32);
      Shoulder_2.mirror = true;
      setRotation(Shoulder_2, 0F, 0F, 0F);
      Leg_1 = new ModelRenderer(this, 16, 16);
      Leg_1.addBox(0F, 0F, 0F, 2, 12, 2);
      Leg_1.setRotationPoint(1F, 4F, 1F);
      Leg_1.setTextureSize(64, 32);
      Leg_1.mirror = true;
      setRotation(Leg_1, 0F, 0F, 0F);
      Leg_2 = new ModelRenderer(this, 24, 16);
      Leg_2.addBox(-1F, 0F, 0F, 2, 12, 2);
      Leg_2.setRotationPoint(6F, 4F, 1F);
      Leg_2.setTextureSize(64, 32);
      Leg_2.mirror = true;
      setRotation(Leg_2, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 32, 16);
      Neck.addBox(0F, 0F, 0F, 2, 4, 2);
      Neck.setRotationPoint(3F, -12F, 1F);
      Neck.setTextureSize(64, 32);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 40, 0);
      Nose.addBox(0F, 0F, 0F, 2, 2, 1);
      Nose.setRotationPoint(3F, -14F, -1F);
      Nose.setTextureSize(64, 32);
      Nose.mirror = true;
      setRotation(Nose, 0.7853982F, 0F, 0F);
      Robe_Front_Panel = new ModelRenderer(this, 40, 3);
      Robe_Front_Panel.addBox(0F, 0F, 0F, 8, 4, 0);
      Robe_Front_Panel.setRotationPoint(0F, 4F, 0F);
      Robe_Front_Panel.setTextureSize(64, 32);
      Robe_Front_Panel.mirror = true;
      setRotation(Robe_Front_Panel, 0F, 0F, 0F);
      Robe_Side_1_Panel = new ModelRenderer(this, 40, 7);
      Robe_Side_1_Panel.addBox(0F, 0F, 0F, 0, 4, 4);
      Robe_Side_1_Panel.setRotationPoint(0F, 4F, 0F);
      Robe_Side_1_Panel.setTextureSize(64, 32);
      Robe_Side_1_Panel.mirror = true;
      setRotation(Robe_Side_1_Panel, 0F, 0F, 0F);
      Robe_Side_2_Panel = new ModelRenderer(this, 48, 7);
      Robe_Side_2_Panel.addBox(0F, 0F, 0F, 0, 4, 4);
      Robe_Side_2_Panel.setRotationPoint(8F, 4F, 0F);
      Robe_Side_2_Panel.setTextureSize(64, 32);
      Robe_Side_2_Panel.mirror = true;
      setRotation(Robe_Side_2_Panel, 0F, 0F, 0F);
      Robe_Back_Panel = new ModelRenderer(this, 40, 15);
      Robe_Back_Panel.addBox(0F, 0F, 0F, 8, 4, 0);
      Robe_Back_Panel.setRotationPoint(0F, 4F, 4F);
      Robe_Back_Panel.setTextureSize(64, 32);
      Robe_Back_Panel.mirror = true;
      setRotation(Robe_Back_Panel, 0F, 0F, 0F);
      Brain_Main = new ModelRenderer(this, 42, 19);
      Brain_Main.addBox(0F, 0F, 0F, 4, 4, 4);
      Brain_Main.setRotationPoint(2F, -18F, 1F);
      Brain_Main.setTextureSize(64, 32);
      Brain_Main.mirror = true;
      setRotation(Brain_Main, 0F, 0F, 0F);
      Face = new ModelRenderer(this, 32, 23);
      Face.addBox(0F, 0F, 0F, 4, 6, 1);
      Face.setRotationPoint(2F, -17F, 0F);
      Face.setTextureSize(64, 32);
      Face.mirror = true;
      setRotation(Face, 0F, 0F, 0F);
      Head_Jaw = new ModelRenderer(this, 42, 27);
      Head_Jaw.addBox(0F, 0F, 0F, 4, 2, 3);
      Head_Jaw.setRotationPoint(2F, -14F, 1F);
      Head_Jaw.setTextureSize(64, 32);
      Head_Jaw.mirror = true;
      setRotation(Head_Jaw, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Arm_1.render(f5);
    Arm_2.render(f5);
    Shoulder_1.render(f5);
    Shoulder_2.render(f5);
    Leg_1.render(f5);
    Leg_2.render(f5);
    Neck.render(f5);
    Nose.render(f5);
    Robe_Front_Panel.render(f5);
    Robe_Side_1_Panel.render(f5);
    Robe_Side_2_Panel.render(f5);
    Robe_Back_Panel.render(f5);
    Brain_Main.render(f5);
    Face.render(f5);
    Head_Jaw.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
