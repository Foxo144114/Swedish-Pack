//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera M2 1902
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00
package sp.foxo.train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelSJLittM21902 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittM21902() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[176];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	private void initbodyModel_1()
	{
		
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part09
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Du loco part41
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Du loco part47
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Du loco part56
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 154
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 156
		bodyModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Du loco part47
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Du loco part47
		bodyModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Du loco part47
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Du loco part47
		bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Du loco part47
		bodyModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Du loco part47
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Du loco part41
		bodyModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Du loco part47
		bodyModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Du loco part56
		bodyModel[15] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 154
		bodyModel[16] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 156
		bodyModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Du loco part47
		bodyModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Du loco part47
		bodyModel[19] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Du loco part47
		bodyModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Du loco part47
		bodyModel[21] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Du loco part47
		bodyModel[22] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Du loco part47
		bodyModel[23] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Du loco part09
		bodyModel[24] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Du loco part09
		bodyModel[25] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Du loco part09
		bodyModel[26] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Du loco part09
		bodyModel[27] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Du loco part09
		bodyModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Du loco part01
		bodyModel[29] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Du loco part01
		bodyModel[30] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Du loco part01
		bodyModel[31] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Du loco part01
		bodyModel[32] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Du loco part01
		bodyModel[33] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Du loco part01
		bodyModel[34] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Du loco part41
		bodyModel[35] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Du loco part41
		bodyModel[36] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Du loco part41
		bodyModel[37] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Du loco part41
		bodyModel[38] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Du loco part41
		bodyModel[39] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Du loco part41
		bodyModel[40] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Du loco part41
		bodyModel[41] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Du loco part41
		bodyModel[42] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Du loco part41
		bodyModel[43] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Du loco part41
		bodyModel[44] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Du loco part41
		bodyModel[45] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Du loco part41
		bodyModel[46] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Du loco part41
		bodyModel[47] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Du loco part41
		bodyModel[48] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Du loco part41
		bodyModel[49] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Du loco part41
		bodyModel[50] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Du loco part41
		bodyModel[51] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Du loco part41
		bodyModel[52] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Du loco part41
		bodyModel[53] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Du loco part41
		bodyModel[54] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Du loco part41
		bodyModel[55] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part41
		bodyModel[56] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Du loco part41
		bodyModel[57] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Du loco part41
		bodyModel[58] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Du loco part41
		bodyModel[59] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Du loco part41
		bodyModel[60] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Du loco part41
		bodyModel[61] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Du loco part41
		bodyModel[62] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Du loco part41
		bodyModel[63] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Du loco part41
		bodyModel[64] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Du loco part41
		bodyModel[65] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part41
		bodyModel[66] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Du loco part41
		bodyModel[67] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Du loco part41
		bodyModel[68] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Du loco part41
		bodyModel[69] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Du loco part41
		bodyModel[70] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Du loco part41
		bodyModel[71] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Du loco part41
		bodyModel[72] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Du loco part41
		bodyModel[73] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Du loco part41
		bodyModel[74] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Du loco part41
		bodyModel[75] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Du loco part41
		bodyModel[76] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Du loco part41
		bodyModel[77] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Du loco part41
		bodyModel[78] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Du loco part41
		bodyModel[79] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Du loco part41
		bodyModel[80] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Du loco part41
		bodyModel[81] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Du loco part41
		bodyModel[82] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Du loco part41
		bodyModel[83] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Du loco part41
		bodyModel[84] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Du loco part41
		bodyModel[85] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Du loco part41
		bodyModel[86] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Du loco part41
		bodyModel[87] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Du loco part41
		bodyModel[88] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Du loco part41
		bodyModel[89] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Du loco part41
		bodyModel[90] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Du loco part41
		bodyModel[91] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Du loco part41
		bodyModel[92] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Du loco part41
		bodyModel[93] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Du loco part41
		bodyModel[94] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Du loco part41
		bodyModel[95] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Du loco part41
		bodyModel[96] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Du loco part41
		bodyModel[97] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Du loco part41
		bodyModel[98] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Du loco part41
		bodyModel[99] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Du loco part41
		bodyModel[100] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Du loco part41
		bodyModel[101] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Du loco part41
		bodyModel[102] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Du loco part41
		bodyModel[103] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Du loco part41
		bodyModel[104] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Du loco part41
		bodyModel[105] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Du loco part41
		bodyModel[106] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Du loco part41
		bodyModel[107] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Du loco part41
		bodyModel[108] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Du loco part41
		bodyModel[109] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Du loco part41
		bodyModel[110] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Du loco part41
		bodyModel[111] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Du loco part41
		bodyModel[112] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Du loco part41
		bodyModel[113] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Du loco part41
		bodyModel[114] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Du loco part41
		bodyModel[115] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Du loco part41
		bodyModel[116] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Du loco part41
		bodyModel[117] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Du loco part41
		bodyModel[118] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Du loco part41
		bodyModel[119] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Du loco part41
		bodyModel[120] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Du loco part41
		bodyModel[121] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Du loco part41
		bodyModel[122] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Du loco part41
		bodyModel[123] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Du loco part41
		bodyModel[124] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Du loco part41
		bodyModel[125] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Du loco part41
		bodyModel[126] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Du loco part41
		bodyModel[127] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Du loco part41
		bodyModel[128] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Du loco part41
		bodyModel[129] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Du loco part41
		bodyModel[130] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Du loco part41
		bodyModel[131] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Du loco part41
		bodyModel[132] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Du loco part41
		bodyModel[133] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Du loco part41
		bodyModel[134] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Du loco part41
		bodyModel[135] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Du loco part41
		bodyModel[136] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Du loco part41
		bodyModel[137] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Du loco part41
		bodyModel[138] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Du loco part41
		bodyModel[139] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Du loco part41
		bodyModel[140] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Du loco part41
		bodyModel[141] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Du loco part41
		bodyModel[142] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Du loco part41
		bodyModel[143] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Du loco part41
		bodyModel[144] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Du loco part41
		bodyModel[145] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Du loco part41
		bodyModel[146] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Du loco part41
		bodyModel[147] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Du loco part41
		bodyModel[148] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Du loco part41
		bodyModel[149] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Du loco part41
		bodyModel[150] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Du loco part41
		bodyModel[151] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Du loco part41
		bodyModel[152] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Du loco part41
		bodyModel[153] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part41
		bodyModel[154] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Du loco part41
		bodyModel[155] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part41
		bodyModel[156] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Du loco part41
		bodyModel[157] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Du loco part41
		bodyModel[158] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Du loco part41
		bodyModel[159] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Du loco part41
		bodyModel[160] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Du loco part41
		bodyModel[161] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Du loco part41
		bodyModel[162] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Du loco part41
		bodyModel[163] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Du loco part41
		bodyModel[164] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Du loco part41
		bodyModel[165] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Du loco part41
		bodyModel[166] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Du loco part41
		bodyModel[167] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Du loco part41
		bodyModel[168] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Du loco part41
		bodyModel[169] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Du loco part41
		bodyModel[170] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Du loco part41
		bodyModel[171] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part41
		bodyModel[172] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Du loco part01
		bodyModel[173] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Du loco part01
		bodyModel[174] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Du loco part01
		bodyModel[175] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Du loco part01

		bodyModel[0].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[0].setRotationPoint(-3F, -8F, 6.05F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Du loco part41
		bodyModel[1].setRotationPoint(-3F, -9F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[2].setRotationPoint(-7F, -9F, 4F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[3].setRotationPoint(-7F, -9F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[4].setRotationPoint(-6F, -9F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[5].setRotationPoint(-6F, -9F, 5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[6].setRotationPoint(-7F, -8F, 4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[7].setRotationPoint(-7F, -10F, 4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[8].setRotationPoint(-7F, -8F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[9].setRotationPoint(-7F, -10F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[10].setRotationPoint(-4F, -8F, -1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[11].setRotationPoint(-5F, -9F, -1F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Du loco part41
		bodyModel[12].setRotationPoint(27F, -9F, -7F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[13].setRotationPoint(31F, -9F, 4F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[14].setRotationPoint(31F, -9F, -7F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[15].setRotationPoint(28F, -9F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[16].setRotationPoint(28F, -9F, 5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[17].setRotationPoint(31F, -8F, 4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[18].setRotationPoint(31F, -10F, 4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[19].setRotationPoint(31F, -8F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[20].setRotationPoint(31F, -10F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[21].setRotationPoint(28F, -8F, -1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[22].setRotationPoint(29F, -9F, -1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[23].setRotationPoint(-3F, -8F, -6.05F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[24].setRotationPoint(-14F, -8F, 6.05F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[25].setRotationPoint(-14F, -8F, -6.05F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[26].setRotationPoint(-25F, -8F, 6.05F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[27].setRotationPoint(-25F, -8F, -6.05F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part01
		bodyModel[28].setRotationPoint(-2F, -9F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[29].setRotationPoint(-2F, -8F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Du loco part01
		bodyModel[30].setRotationPoint(-2F, -9F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part01
		bodyModel[31].setRotationPoint(-2F, -9F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[32].setRotationPoint(-2F, -8F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Du loco part01
		bodyModel[33].setRotationPoint(-2F, -9F, 6F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part41
		bodyModel[34].setRotationPoint(23F, -5F, -6F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part41
		bodyModel[35].setRotationPoint(12F, -5F, -6F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part41
		bodyModel[36].setRotationPoint(1F, -5F, -6F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[37].setRotationPoint(22.5F, -5.5F, 6F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[38].setRotationPoint(11.5F, -5.5F, 6F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[39].setRotationPoint(0.5F, -5.5F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part41
		bodyModel[40].setRotationPoint(22.5F, -4.5F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part41
		bodyModel[41].setRotationPoint(11.5F, -4.5F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Du loco part41
		bodyModel[42].setRotationPoint(-1.5F, -6.5F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[43].setRotationPoint(22.5F, -5.5F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[44].setRotationPoint(11.5F, -5.5F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[45].setRotationPoint(0.5F, -5.5F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Du loco part41
		bodyModel[46].setRotationPoint(9.5F, -7F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[47].setRotationPoint(13.5F, -7F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[48].setRotationPoint(1.5F, -7.5F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[49].setRotationPoint(0.5F, -7.5F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Du loco part41
		bodyModel[50].setRotationPoint(-2.5F, -7F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[51].setRotationPoint(2.5F, -7F, 6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[52].setRotationPoint(-3F, -7F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[53].setRotationPoint(4F, -7F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -1.5F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.5F, -1.5F, 0F); // Du loco part41
		bodyModel[54].setRotationPoint(16F, -7F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[55].setRotationPoint(19F, -7F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[56].setRotationPoint(26F, -7F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Du loco part41
		bodyModel[57].setRotationPoint(5F, -7F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -0.5F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0.5F, -0.25F, -0.25F, -2F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -2F, -0.25F); // Du loco part41
		bodyModel[58].setRotationPoint(14.5F, -6F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part41
		bodyModel[59].setRotationPoint(18.5F, -7F, 6.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part41
		bodyModel[60].setRotationPoint(0.5F, -4.5F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Du loco part41
		bodyModel[61].setRotationPoint(20.5F, -6.5F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[62].setRotationPoint(23.5F, -7.5F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[63].setRotationPoint(22.5F, -7.5F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Du loco part41
		bodyModel[64].setRotationPoint(19.5F, -7F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[65].setRotationPoint(24.5F, -7F, 6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Du loco part41
		bodyModel[66].setRotationPoint(9.5F, -6.5F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[67].setRotationPoint(12.5F, -7.5F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[68].setRotationPoint(11.5F, -7.5F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[69].setRotationPoint(7F, -7F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -1F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, 0F, -0.5F, -0.25F); // Du loco part41
		bodyModel[70].setRotationPoint(6.5F, -6F, 6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F); // Du loco part41
		bodyModel[71].setRotationPoint(5.5F, -7F, 6.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[72].setRotationPoint(-2.5F, -3.5F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[73].setRotationPoint(-2.5F, -3.5F, -6.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[74].setRotationPoint(-2.5F, -3.5F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[75].setRotationPoint(27F, -3.5F, -6.25F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[76].setRotationPoint(22.5F, -5.5F, -7F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[77].setRotationPoint(11.5F, -5.5F, -7F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[78].setRotationPoint(0.5F, -5.5F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Du loco part41
		bodyModel[79].setRotationPoint(9.5F, -7F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[80].setRotationPoint(13.5F, -7F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Du loco part41
		bodyModel[81].setRotationPoint(-2.5F, -7F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[82].setRotationPoint(2.5F, -7F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[83].setRotationPoint(-3F, -7F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[84].setRotationPoint(4F, -7F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, -1.5F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.5F, -1.5F, 0F); // Du loco part41
		bodyModel[85].setRotationPoint(16F, -7F, -7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[86].setRotationPoint(19F, -7F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[87].setRotationPoint(26F, -7F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Du loco part41
		bodyModel[88].setRotationPoint(19.5F, -7F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[89].setRotationPoint(24.5F, -7F, -7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[90].setRotationPoint(7F, -7F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[91].setRotationPoint(22.5F, -4.5F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[92].setRotationPoint(11.5F, -4.5F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F); // Du loco part41
		bodyModel[93].setRotationPoint(-1.5F, -6.5F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[94].setRotationPoint(22.5F, -5.5F, -8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[95].setRotationPoint(11.5F, -5.5F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[96].setRotationPoint(0.5F, -5.5F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part41
		bodyModel[97].setRotationPoint(1.5F, -7.5F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[98].setRotationPoint(0.5F, -7.5F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[99].setRotationPoint(0.5F, -4.5F, -8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F); // Du loco part41
		bodyModel[100].setRotationPoint(20.5F, -6.5F, -7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part41
		bodyModel[101].setRotationPoint(23.5F, -7.5F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[102].setRotationPoint(22.5F, -7.5F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F); // Du loco part41
		bodyModel[103].setRotationPoint(9.5F, -6.5F, -7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part41
		bodyModel[104].setRotationPoint(12.5F, -7.5F, -7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[105].setRotationPoint(11.5F, -7.5F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Du loco part41
		bodyModel[106].setRotationPoint(5F, -7F, -7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -0.5F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.5F, 0.5F, -0.25F, -0.25F, -2F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -2F, -0.25F); // Du loco part41
		bodyModel[107].setRotationPoint(14.5F, -6F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part41
		bodyModel[108].setRotationPoint(18.5F, -7F, -6.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, -1F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, 0F, -0.5F, -0.25F); // Du loco part41
		bodyModel[109].setRotationPoint(6.5F, -6F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F); // Du loco part41
		bodyModel[110].setRotationPoint(5.5F, -7F, -6.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part41
		bodyModel[111].setRotationPoint(26.5F, -5F, 5.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part41
		bodyModel[112].setRotationPoint(26.5F, -7F, 5.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part41
		bodyModel[113].setRotationPoint(27F, -5F, 5.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part41
		bodyModel[114].setRotationPoint(27F, -7F, 5.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[115].setRotationPoint(26.5F, -5F, -6.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[116].setRotationPoint(26.5F, -7F, -6.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[117].setRotationPoint(27F, -5F, -6.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[118].setRotationPoint(27F, -7F, -6.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part41
		bodyModel[119].setRotationPoint(-2.5F, -5F, 5.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[120].setRotationPoint(-2.5F, -7F, 5.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part41
		bodyModel[121].setRotationPoint(-3F, -5F, 5.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[122].setRotationPoint(-3F, -7F, 5.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part41
		bodyModel[123].setRotationPoint(-2.5F, -5F, -6.75F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[124].setRotationPoint(-2.5F, -7F, -6.75F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part41
		bodyModel[125].setRotationPoint(-3F, -5F, -6.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[126].setRotationPoint(-3F, -7F, -6.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 29, 2, 1, 0F); // Du loco part41
		bodyModel[127].setRotationPoint(-2F, -9F, -4F);

		bodyModel[128].addBox(0F, 0F, 0F, 29, 2, 1, 0F); // Du loco part41
		bodyModel[128].setRotationPoint(-2F, -9F, 3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 27, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -6F, 0F, 0F); // Du loco part41
		bodyModel[129].setRotationPoint(-1F, -13F, -7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, -3F, 0F, 0F, -3F); // Du loco part41
		bodyModel[130].setRotationPoint(19F, -13F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 27, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F); // Du loco part41
		bodyModel[131].setRotationPoint(-1F, -13F, 3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -6F, 0F, -3F); // Du loco part41
		bodyModel[132].setRotationPoint(-1F, -13F, -6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[133].setRotationPoint(4F, -13F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[134].setRotationPoint(8.5F, -13F, -7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[135].setRotationPoint(15.5F, -13F, -7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[136].setRotationPoint(20F, -13F, -7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[137].setRotationPoint(4F, -13F, 4F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[138].setRotationPoint(8.5F, -13F, 4F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[139].setRotationPoint(15.5F, -13F, 4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[140].setRotationPoint(20F, -13F, 4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part41
		bodyModel[141].setRotationPoint(20F, -17F, 7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Du loco part41
		bodyModel[142].setRotationPoint(20F, -17F, 7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part41
		bodyModel[143].setRotationPoint(15.5F, -17F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Du loco part41
		bodyModel[144].setRotationPoint(15.5F, -17F, 7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part41
		bodyModel[145].setRotationPoint(8.5F, -17F, 7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Du loco part41
		bodyModel[146].setRotationPoint(8.5F, -17F, 7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part41
		bodyModel[147].setRotationPoint(4F, -17F, 7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Du loco part41
		bodyModel[148].setRotationPoint(4F, -17F, 7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[149].setRotationPoint(20F, -17F, -8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[150].setRotationPoint(20F, -17F, -8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[151].setRotationPoint(15.5F, -17F, -8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[152].setRotationPoint(15.5F, -17F, -8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[153].setRotationPoint(8.5F, -17F, -8F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[154].setRotationPoint(8.5F, -17F, -8F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[155].setRotationPoint(4F, -17F, -8F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[156].setRotationPoint(4F, -17F, -8F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, -2F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[157].setRotationPoint(-3F, -13F, -4F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, -2F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[158].setRotationPoint(-3F, -13F, 3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, -3F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Du loco part41
		bodyModel[159].setRotationPoint(20F, -13F, -4F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F, -3F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Du loco part41
		bodyModel[160].setRotationPoint(20F, -13F, 3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -7F, 0F, 0F); // Du loco part41
		bodyModel[161].setRotationPoint(5F, -9F, -3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 7, 3, 6, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -1F, 0F); // Du loco part41
		bodyModel[162].setRotationPoint(13F, -9F, -3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Du loco part41
		bodyModel[163].setRotationPoint(10F, -7F, -4F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Du loco part41
		bodyModel[164].setRotationPoint(12F, -7F, -3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Du loco part41
		bodyModel[165].setRotationPoint(10F, -7F, 3F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[166].setRotationPoint(5F, -9F, -3F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 6, 6, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[167].setRotationPoint(18F, -9F, -3F);

		bodyModel[168].addBox(0F, 0F, 0F, 27, 4, 1, 0F); // Du loco part41
		bodyModel[168].setRotationPoint(-1F, -17F, 6F);

		bodyModel[169].addBox(0F, 0F, 0F, 27, 4, 1, 0F); // Du loco part41
		bodyModel[169].setRotationPoint(-1F, -17F, -7F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 4, 12, 0F); // Du loco part41
		bodyModel[170].setRotationPoint(25F, -17F, -6F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 4, 12, 0F); // Du loco part41
		bodyModel[171].setRotationPoint(-1F, -17F, -6F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 28, 1, 2, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part01
		bodyModel[172].setRotationPoint(-1.5F, -18F, 6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 28, 1, 2, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[173].setRotationPoint(-1.5F, -18F, -8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part01
		bodyModel[174].setRotationPoint(24.5F, -18F, -6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[175].setRotationPoint(-1.5F, -18F, -6F);

	}
}