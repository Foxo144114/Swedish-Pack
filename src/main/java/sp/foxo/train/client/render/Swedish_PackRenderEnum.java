package sp.foxo.train.client.render;

import sp.foxo.train.client.render.models.*;
import sp.foxo.train.common.entity.rollingStock.*;
import sp.foxo.train.common.library.Swedish_PackAddonInfo;
import train.common.api.EntityRollingStock;
import train.common.api.TrainRenderRecord;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;

public enum Swedish_PackRenderEnum implements TrainRenderRecord {

	//PropagandaCzech(Ctyrk4EntityPropagandaCzech.class, new train.client.render.models.ModelPropagandaCar(), "propaganda_Czech_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ElectricSJLittDa(Swedish_PackEntityLocoElectricSJLittDa.class, new ModelSJLittDa(), "Da_", true, new float[] { -4.75F, -0.5F, 0.0F }, new float[] { 0F, 180F, 180F }, null,"",0,null, "", null, 0, false),
	ElectricSJLittDmA(Swedish_PackEntityLocoElectricSJLittDmA.class, new ModelSJLittDmA(), "DmA_", true, new float[] { -4.75F, -0.5F, 0.0F }, new float[] { 0F, 180F, 180F }, null,"",0,null, "", null, 0, false),
	ElectricSJLittDmB(Swedish_PackEntityLocoElectricSJLittDmB.class, new ModelSJLittDmB(), "DmB_", true, new float[] { -4.75F, -0.5F, 0.0F }, new float[] { 0F, 180F, 180F }, null,"",0,null, "", null, 0, false),
	ElectricSJLittD(Swedish_PackEntityLocoElectricSJLittD.class, new ModelSJLittD(), "D_", true, new float[] { -4.7F, -0.5F, 0.0F }, new float[] { 0F, 180F, 180F }, null,"",0,null, "", null, 0, false),
	ElectricSJLittDu2(Swedish_PackEntityLocoElectricSJLittDu2.class, new ModelSJLittDu2(), "Du2_", true, new float[] { -4.7F, -0.5F, 0.0F }, new float[] { 0F, 180F, 180F }, null,"",0,null, "", null, 0, false),
	ElectricSJLittRc(Swedish_PackEntityLocoElectricSJLittRc.class, new ModelSJLittRc(), "Rc_", true, new float[] { -0.125F, -0.5F, 0.0F }, new float[] { 0F, 180F, 180F }, null,"",0,null, "", null, 0, false),



	FreightSJLittDm3(Swedish_PackEntityFreightSJLittDm3.class, new ModelSJLittDm3(), "Dm3_", true, new float[] { -3.0255F, -0.5F, 0.0F },  new float[] { 0F, 180F, 180F }, null,"", 0, null, "", null, 0, false),

	/*SteamSJLittB1919(Swedish_PackEntityLocoSteamSJLittB1919.class, new ModelSJLittB1919(), "BLok", true, new float[] { -3.25F, -0.5F, 0.0F }, new float[] { 0F, 180F, 180F }, null,"largesmoke",3,new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.5D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.2, -0.5, 0.60D });
		}}, 2, true),

*/
	;


	private Class<? extends EntityRollingStock> entityClass;
	private ModelBase model;
	private String texture;
	private boolean multiTexture;
	private float[] trans;
	private float[] rotate;
	private float[] scale;
	private String smokeType;
	private ArrayList<double[]> smokeFX;
	private String explosionType;
	private ArrayList<double[]> explosionFX;
	private int smokeIterations;
	private int explosionFXIterations;
	private boolean hasSmokeOnSlopes;

	/**
	 * Defines the render @param for a RollingStock
	 *
	 * @param model ModelBase
	 * @param texture String
	 * @param multiTexture boolean
	 * @param trans float[]
	 * @param rotate float[]
	 * @param scale float[]
	 * @param smokeType String
	 * @param smokeFX ArrayList
	 * @param explosionType String
	 * @param explosionFX ArrayList
	 */
	Swedish_PackRenderEnum(Class<? extends EntityRollingStock> entityClass, ModelBase model, String texture, boolean multiTexture, float[] trans, float[] rotate, float[] scale, String smokeType, int smokeIterations, ArrayList<double[]> smokeFX, String explosionType, ArrayList<double[]> explosionFX, int explosionFXIterations, boolean hasSmokeOnSlopes) {
		this.entityClass = entityClass;
		this.model = model;
		this.texture = texture;
		this.multiTexture = multiTexture;
		this.trans = trans;
		this.rotate = rotate;
		this.scale = scale;
		this.smokeType = smokeType;
		this.smokeFX = smokeFX;
		this.explosionType = explosionType;
		this.explosionFX = explosionFX;
		this.smokeIterations = smokeIterations;
		this.explosionFXIterations = explosionFXIterations;
		this.hasSmokeOnSlopes = hasSmokeOnSlopes;
	}

    @Override
	public Class<? extends EntityRollingStock> getEntityClass() {
		return entityClass;
	}

    @Override
	public ModelBase getModel() {
		return model;
	}

	public boolean getIsMultiTextured() {
		return multiTexture;
	}

    @Override
	public boolean hasSmoke() {
		return smokeType.length() > 0;
	}

    @Override
	public boolean hasSmokeOnSlopes() {
		return hasSmokeOnSlopes;
	}

    @Override
	public String getSmokeType() {
		return smokeType;
	}

    @Override
	public ArrayList<double[]> getSmokeFX() {
		return smokeFX;
	}

    @Override
	public String getExplosionType() {
		return explosionType;
	}

    @Override
	public boolean hasExplosion() {
		return explosionType.length() > 0;
	}

    @Override
	public ArrayList<double[]> getExplosionFX() {
		return explosionFX;
	}

    @Override
	public float[] getTrans() {
		return trans;
	}

    @Override
	public float[] getRotate() {
		return rotate;
	}

    @Override
	public float[] getScale() {
		return scale;
	}

    @Override
    public ResourceLocation getTextureFile(String colorString) {
		if (multiTexture) {
			return new ResourceLocation(Swedish_PackAddonInfo.resourceLocation, Swedish_PackAddonInfo.trainsPrefix + texture + colorString + ".png");
		} else {
			return new ResourceLocation(Swedish_PackAddonInfo.resourceLocation, Swedish_PackAddonInfo.trainsPrefix + texture + ".png");
		}
	}

    @Override
	public int getSmokeIterations() {
		return smokeIterations;
	}

    @Override
	public int getExplosionFXIterations() {
		return explosionFXIterations;
	}
}
