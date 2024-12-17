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
	ElectricSJLittDa(Swedish_PackEntityLocoElectricSJLittDa.class, new ModelSJLittDa(), "Da_", true, new float[]{-4.75F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricSJLittDmA(Swedish_PackEntityLocoElectricSJLittDmA.class, new ModelSJLittDmA(), "DmA_", true, new float[]{-4.75F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricSJLittD(Swedish_PackEntityLocoElectricSJLittD.class, new ModelSJLittD(), "SJLittD_", true, new float[]{-4.7F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricSJLittDu2(Swedish_PackEntityLocoElectricSJLittDu2.class, new ModelSJLittDu2(), "SJLittDu2_", true, new float[]{-4.7F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricSJLittRc(Swedish_PackEntityLocoElectricSJLittRc.class, new ModelSJLittRc(), "Rc_", true, new float[]{-0.125F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricSJLittDg2(Swedish_PackEntityLocoElectricSJLittDg2.class, new ModelSJLittDg2(), "SJLittDg2_", true, new float[]{-5.6F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricBJLittDs(Swedish_PackEntityLocoElectricBJLittDs.class, new ModelBJLittDs(), "BJLittDs_", true, new float[]{-4.7F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricGBJLittBs(Swedish_PackEntityLocoElectricGBJLittBs.class, new ModelGBJLittBs(), "GBJLittBs_", true, new float[]{-3.3F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricBJLittBk(Swedish_PackEntityLocoElectricBJLittBk.class, new ModelBJLittBk(), "BJLittBk_", true, new float[]{-4.7F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricSJLittOaA(Swedish_PackEntityLocoElectricSJLittOaA.class, new ModelSJLittOa(), "SJLittOa_A_", true, new float[]{-3.5F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricSJLittObA(Swedish_PackEntityLocoElectricSJLittObA.class, new ModelSJLittOb(), "SJLittOb_A_", true, new float[]{-3.5F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricSJLittOc(Swedish_PackEntityLocoElectricSJLittOc.class, new ModelSJLittOc(), "SJLittOc_", true, new float[]{-3.3F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricSJLittOd(Swedish_PackEntityLocoElectricSJLittOd.class, new ModelSJLittOd(), "SJLittOd_", true, new float[]{-4.2F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricSJLittOeA(Swedish_PackEntityLocoElectricSJLittOeA.class, new ModelSJLittOe(), "SJLittOe_A_", true, new float[]{-4.0F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricSJLittOfA(Swedish_PackEntityLocoElectricSJLittOfA.class, new ModelSJLittOf(), "SJLittOf_A_", true, new float[]{-4.0F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricSJLittOfAs(Swedish_PackEntityLocoElectricSJLittOfAs.class, new ModelSJLittOf(), "SJLittOf_A_S", true, new float[]{-4.05F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	ElectricSJLittX16(Swedish_PackEntityLocoElectricSJLittX16.class, new ModelSJLittX16(), "X16_", true, new float[]{-5.75F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	DieselSJLittY6(Swedish_PackEntityLocoDieselSJLittY6.class, new ModelSJLittY6(), "Y6_", true, new float[]{-5.75F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { -0.4D, 1.25D, 0.0D });
		}
	}, "", null, 0, false),



	DieselSJLittT21(Swedish_PackEntityLocoDieselSJLittT21.class, new ModelSJLittT21(), "SJLittT21_", true, new float[]{-3.5F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 1.1D, 1.5D, 0.0D });
		}
	}, "", null, 0, false),
	DieselSJLittT23(Swedish_PackEntityLocoDieselSJLittT23.class, new ModelSJLittT23(), "SJLittT23_", true, new float[]{-3.5F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 1.1D, 1.5D, 0.0D });
		}
	}, "", null, 0, false),
	DieselFTRLittPVV8(Swedish_PackEntityLocoDieselFTRLittPVV8.class, new ModelFTRLittPVV8(), "Pall", true, new float[]{-1.9F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { -0.1D, 0.0D, 0.2D });
		}
	}, "", null, 0, false),
	ElectricFTRLittET41A(Swedish_PackEntityLocoElectricFTRLittET41A.class, new ModelET41(), "FTRLittET41_", true, new float[]{-1.5F, 0.2F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	SteamSJLittB1919(Swedish_PackEntityLocoSteamSJLittB1919.class, new ModelSJLittB1919(), "SJLittB1919_", true, new float[] { -3.3F, -0.5F, 0.0F }, new float[] { 0F, 180F, 180.0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.3D, 1.55D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.5D, -0.2D, 0.8D });
		}
	}, 2, true),
	SteamSJLittB1909(Swedish_PackEntityLocoSteamSJLittB1909.class, new ModelSJLittB1909(), "SJLittB1909_", true, new float[] { -3.2F, -0.5F, 0.0F }, new float[] { 0F, 180F, 180.0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.5D, 1.55D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.5D, -0.2D, 0.8D });
		}
	}, 2, true),
	DieselSJLittT31(Swedish_PackEntityLocoDieselSJLittT31.class, new ModelSJLittT31(), "SJLittT31_", true, new float[]{-3.5F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 1.1D, 1.5D, 0.0D });
		}
	}, "", null, 0, false),



	FreightSJLittM1(Swedish_PackEntityFreightSJLittM1.class, new ModelSJLittM1(), "SJLittM1_", true, new float[]{-0.775F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FreightSJLittM21902(Swedish_PackEntityFreightSJLittM21902.class, new ModelSJLittM21902(), "SJLittM21902_", true, new float[]{-0.775F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FreightSJLittM21908(Swedish_PackEntityFreightSJLittM21908.class, new ModelSJLittM21908(), "SJLittM21908_", true, new float[]{-0.775F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FreightSJLittM21908Extended(Swedish_PackEntityFreightSJLittM21908Extended.class, new ModelSJLittM21908Extended(), "SJLittM21908Extended_", true, new float[]{-0.775F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FreightSJLittMAS(Swedish_PackEntityFreightSJLittMAS.class, new ModelSJLittMAS(), "SJLittMAS_", true, new float[]{-0.775F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FreightSJLittO(Swedish_PackEntityFreightSJLittO.class, new ModelSJLittO(), "SJLittO_", true, new float[]{-1.655F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FreightSJLittOs(Swedish_PackEntityFreightSJLittOs.class, new ModelSJLittOs(), "SJLittOs_", true, new float[]{-1.34F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FreightSJLittOs_w(Swedish_PackEntityFreightSJLittOs_w.class, new ModelSJLittOs_w(), "SJLittOs_w_", true, new float[]{-1.900F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FreightSJLittLgs(Swedish_PackEntityFreightSJLittLgs.class, new ModelSJLittLgs(), "SJLittLgs_", true, new float[]{-1.900F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FreightSJLittG(Swedish_PackEntityFreightSJLittG.class, new ModelSJLittG(), "SJLittG_", true, new float[]{-1.900F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FreightSJLittUDFo20(Swedish_PackEntityFreightSJLittUDFo20.class, new ModelSJLittUDFo20(), "UDFo20_", true, new float[]{-3.60F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FreightSJLittUFV(Swedish_PackEntityFreightSJLittUFV.class, new ModelSJLittUFV(), "UFV_", true, new float[]{-1.55F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FreightSJLittElos(Swedish_PackEntityFreightSJLittElos.class, new ModelSJLittElos(), "SJLittElos_", true, new float[]{-1.900F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	FreightSJLittOaVagn(Swedish_PackEntityFreightSJLittOaVagn.class, new ModelSJLittOaVagn(), "SJLittOaVagn_", true, new float[]{-1.655F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),


	tenderSJLittA(Swedish_PackEntityTenderSJLittA.class, new ModelSJLittAtender(), "SJLittAtender_", true,
			new float[] { 0.885F, -0.5F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderSJLittC(Swedish_PackEntityTenderSJLittC.class, new ModelSJLittCtender(), "SJLittCtender_", true,
			new float[] { 0.525F, -0.5F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),

	FreightSJLittDm3(Swedish_PackEntityFreightSJLittDm3.class, new ModelSJLittDm3(), "Dm3_", true, new float[]{-3.0255F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	CabooseSJLittOaB(Swedish_PackEntityCabooseSJLittOaB.class, new ModelSJLittOa(), "SJLittOa_B_", true, new float[] { -2.025F, -0.5F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	CabooseSJLittObB(Swedish_PackEntityCabooseSJLittObB.class, new ModelSJLittOb(), "SJLittOb_B_", true, new float[] { -2.025F, -0.5F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	CabooseSJLittDmB(Swedish_PackEntityCabooseSJLittDmB.class, new ModelSJLittDmB(), "DmB_", true, new float[]{-2.475F, -0.5F, 0.0F}, new float[]{0F, 180F, 180F}, null, "", 0, null, "", null, 0, false),
	CabooseSJLittOeB(Swedish_PackEntityCabooseSJLittOeB.class, new ModelSJLittOe(), "SJLittOe_B_", true, new float[] { -2.025F, -0.5F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	CabooseSJLittOfB(Swedish_PackEntityCabooseSJLittOfB.class, new ModelSJLittOf(), "SJLittOf_B_", true, new float[] { -2.025F, -0.5F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	CabooseFTRLittET41B(Swedish_PackEntityCabooseFTRLittET41B.class, new ModelET41(), "FTRLittET41_", true, new float[] { 0.0F, 0.2F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PassangerSJLittUb(Swedish_PackEntityPassengerSJLittUb.class, new ModelSJLittUb(), "Ub_", true, new float[] { -3.60F, -0.5F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PassangerSJLittUBF6Y(Swedish_PackEntityPassengerSJLittUBF6Y.class, new ModelSJLittUBF6Y(), "UBF6Y_", true, new float[] { -3.60F, -0.5F, 0.0F },   new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),


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
