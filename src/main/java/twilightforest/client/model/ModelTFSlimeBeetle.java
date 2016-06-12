// Date: 11/5/2012 7:35:56 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package twilightforest.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelTFSlimeBeetle extends ModelBase
{
	//fields
	ModelRenderer head;
	ModelRenderer RearEnd;
	ModelRenderer Leg6;
	ModelRenderer Leg4;
	ModelRenderer Leg2;
	ModelRenderer Leg5;
	ModelRenderer Leg3;
	ModelRenderer Leg1;
	ModelRenderer connector1;
	ModelRenderer antenna1;
	ModelRenderer antenna2;
	ModelRenderer eye1;
	ModelRenderer eye2;

	ModelRenderer slimeCube;
	ModelRenderer tail1;
	ModelRenderer tail2;
	ModelRenderer mouth;
	ModelRenderer slimeCenter;
	
	boolean renderPassModel = false;


	public ModelTFSlimeBeetle()
	{
		this(false);
	}
	
	public ModelTFSlimeBeetle(boolean renderpass)
	{
		this.renderPassModel = renderpass;
		
		textureWidth = 64;
		textureHeight = 64;

		connector1 = new ModelRenderer(this, 0, 12);
		connector1.addBox(-3F, -3F, -1F, 6, 6, 1);
		connector1.setRotationPoint(0F, 19F, -4F);

		RearEnd = new ModelRenderer(this, 31, 6);
		RearEnd.addBox(-4F, -11F, -4F, 8, 10, 8);
		RearEnd.setRotationPoint(0F, 18F, 7F);
		setRotation(RearEnd, 1.570796F, 0F, 0F);

		Leg6 = new ModelRenderer(this, 40, 0);
		Leg6.addBox(-1F, -1F, -1F, 10, 2, 2);
		Leg6.setRotationPoint(2F, 21F, -4F);
		setRotation(Leg6, 0F, 0.2792527F, 0.3490659F);

		Leg5 = new ModelRenderer(this, 40, 0);
		Leg5.mirror = true;
		Leg5.addBox(-9F, -1F, -1F, 10, 2, 2);
		Leg5.setRotationPoint(-2F, 21F, -4F);
		setRotation(Leg5, 0F, -0.2792527F, -0.3490659F);

		Leg4 = new ModelRenderer(this, 40, 0);
		Leg4.addBox(-1F, -1F, -1F, 10, 2, 2);
		Leg4.setRotationPoint(2F, 21F, -1F);
		setRotation(Leg4, 0F, -0.2792527F, 0.3490659F);

		Leg2 = new ModelRenderer(this, 40, 0);
		Leg2.addBox(-1F, -1F, -1F, 10, 2, 2);
		Leg2.setRotationPoint(2F, 21F, 4F);
		setRotation(Leg2, 0F, -0.6981317F, 0.3490659F);

		Leg3 = new ModelRenderer(this, 40, 0);
		Leg3.mirror = true;
		Leg3.addBox(-9F, -1F, -1F, 10, 2, 2);
		Leg3.setRotationPoint(-2F, 21F, -1F);
		setRotation(Leg3, 0F, 0.2792527F, -0.3490659F);

		Leg1 = new ModelRenderer(this, 40, 0);
		Leg1.mirror = true;
		Leg1.addBox(-9F, -1F, -1F, 10, 2, 2);
		Leg1.setRotationPoint(-2F, 21F, 4F);
		Leg1.setTextureSize(64, 32);
		setRotation(Leg1, 0F, 0.6981317F, -0.3490659F);

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4F, -4F, -6F, 8, 6, 6);
		head.setRotationPoint(0F, 19F, -5F);

		antenna1 = new ModelRenderer(this, 38, 4);
		antenna1.addBox(0F, -0.5F, -0.5F, 12, 1, 1);
		antenna1.setRotationPoint(1F, -3F, -5F);
		setRotation(antenna1, 0F, 1.047198F, -0.296706F);

		antenna2 = new ModelRenderer(this, 38, 4);
		antenna2.addBox(0F, -0.5F, -0.5F, 12, 1, 1);
		antenna2.setRotationPoint(-1F, -3F, -5F);
		setRotation(antenna2, 0F, 2.094395F, 0.296706F);

		eye1 = new ModelRenderer(this, 15, 12);
		eye1.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		eye1.setRotationPoint(-3F, -2F, -5F);

		eye2 = new ModelRenderer(this, 15, 12);
		eye2.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		eye2.setRotationPoint(3F, -2F, -5F);


		mouth = new ModelRenderer(this, 17, 12);
		mouth.addBox(-1F, -1F, -1F, 2, 2, 1);
		mouth.setRotationPoint(0F, 1, -6F);


		head.addChild(antenna1);
		head.addChild(antenna2);
		head.addChild(eye1);
		head.addChild(eye2);
		head.addChild(mouth);


		tail1 = new ModelRenderer(this, 0, 20);
		tail1.addBox(-3F, -3F, -3F, 6, 6, 6);
		tail1.setRotationPoint(0F, 19F, 9F);

		tail2 = new ModelRenderer(this, 0, 20);
		tail2.addBox(-3F, -6F, -3F, 6, 6, 6);
		tail2.setRotationPoint(0F, -3F, 2F);

		slimeCube = new ModelRenderer(this, 0, 40);
		slimeCube.addBox(-6F, -12F, -9F, 12, 12, 12);
		slimeCube.setRotationPoint(0F, -6, 0);

		slimeCenter = new ModelRenderer(this, 32, 24);
		slimeCenter.addBox(-4F, -10F, -7F, 8, 8, 8);
		slimeCenter.setRotationPoint(0F, -6, 0);

		tail1.addChild(tail2);
		
		if (renderPassModel)
		{
			tail2.addChild(slimeCube);
		}
		else
		{
			tail2.addChild(slimeCenter);
		}
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		tail1.render(f5);
		
		if (renderPassModel)
		{
		}
		else
		{
			head.render(f5);
			RearEnd.render(f5);
			Leg6.render(f5);
			Leg4.render(f5);
			Leg2.render(f5);
			Leg5.render(f5);
			Leg3.render(f5);
			Leg1.render(f5);
			connector1.render(f5);
			//tail1.render(f5);
//			tail2.render(f5);
//			slimeCenter.render(f5);
		}
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
	 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
	 * "far" arms and legs can swing at most.
	 */
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
	{
		this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
		this.head.rotateAngleX = par5 / (180F / (float)Math.PI);

		// legs!
		float legZ = ((float)Math.PI / 11F);
		this.Leg1.rotateAngleZ = -legZ;
		this.Leg2.rotateAngleZ = legZ;
		this.Leg3.rotateAngleZ = -legZ * 0.74F;
		this.Leg4.rotateAngleZ = legZ * 0.74F;
		this.Leg5.rotateAngleZ = -legZ;
		this.Leg6.rotateAngleZ = legZ;

		float var9 = -0.0F;
		float var10 = 0.3926991F;
		this.Leg1.rotateAngleY = var10 * 2.0F + var9;
		this.Leg2.rotateAngleY = -var10 * 2.0F - var9;
		this.Leg3.rotateAngleY = var10 * 1.0F + var9;
		this.Leg4.rotateAngleY = -var10 * 1.0F - var9;
		this.Leg5.rotateAngleY = -var10 * 2.0F + var9;
		this.Leg6.rotateAngleY = var10 * 2.0F - var9;

		float var11 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * par2;
		float var12 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * par2;
		float var14 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + ((float)Math.PI * 3F / 2F)) * 0.4F) * par2;

		float var15 = Math.abs(MathHelper.sin(par1 * 0.6662F + 0.0F) * 0.4F) * par2;
		float var16 = Math.abs(MathHelper.sin(par1 * 0.6662F + (float)Math.PI) * 0.4F) * par2;
		float var18 = Math.abs(MathHelper.sin(par1 * 0.6662F + ((float)Math.PI * 3F / 2F)) * 0.4F) * par2;

		this.Leg1.rotateAngleY += var11;
		this.Leg2.rotateAngleY += -var11;
		this.Leg3.rotateAngleY += var12;
		this.Leg4.rotateAngleY += -var12;
		this.Leg5.rotateAngleY += var14;
		this.Leg6.rotateAngleY += -var14;

		this.Leg1.rotateAngleZ += var15;
		this.Leg2.rotateAngleZ += -var15;

		this.Leg3.rotateAngleZ += var16;
		this.Leg4.rotateAngleZ += -var16;

		this.Leg5.rotateAngleZ += var18;
		this.Leg6.rotateAngleZ += -var18;


		
		// tail wiggle
		this.tail1.rotateAngleX   = MathHelper.cos(par3 * 0.3335F) * 0.15F;
		this.tail2.rotateAngleX = MathHelper.cos(par3 * 0.4445F) * 0.20F;
		this.slimeCube.rotateAngleX = MathHelper.cos(par3 * 0.5555F) * 0.25F;
		this.slimeCenter.rotateAngleX = MathHelper.cos(par3 * 0.5555F + 0.25F) * 0.25F;

	}


}
