//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera Oc
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package sp.foxo.train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelSJLittOc extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittOc() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[401];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 73, 162, textureX, textureY); // Du loco part01
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Du loco part03
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Du loco part05
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Du loco part06
		bodyModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Du loco part07
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Du loco part08
		bodyModel[6] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part19
		bodyModel[7] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Du loco part20
		bodyModel[8] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Du loco part22
		bodyModel[9] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Du loco part28
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part47
		bodyModel[11] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Du loco part56
		bodyModel[12] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Du loco part82
		bodyModel[13] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part83
		bodyModel[14] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Du loco part84
		bodyModel[15] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part85
		bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part94
		bodyModel[17] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Du loco part95
		bodyModel[18] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part97
		bodyModel[19] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part100
		bodyModel[20] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Du loco part101
		bodyModel[21] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Du loco part102
		bodyModel[22] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Lamp
		bodyModel[23] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Lamp
		bodyModel[24] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Lamp
		bodyModel[25] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Lamp
		bodyModel[26] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 149
		bodyModel[27] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 154
		bodyModel[28] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 156
		bodyModel[29] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 177
		bodyModel[30] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 194
		bodyModel[31] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 195
		bodyModel[32] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 135
		bodyModel[33] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 136
		bodyModel[34] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 138
		bodyModel[35] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 139
		bodyModel[36] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 141
		bodyModel[37] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 142
		bodyModel[38] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 143
		bodyModel[39] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 144
		bodyModel[40] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 145
		bodyModel[41] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 146
		bodyModel[42] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 147
		bodyModel[43] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 148
		bodyModel[44] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 149
		bodyModel[45] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Du loco part37
		bodyModel[46] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Du loco part37
		bodyModel[47] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Du loco part37
		bodyModel[48] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Du loco part37
		bodyModel[49] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Du loco part37
		bodyModel[50] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part37
		bodyModel[51] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Du loco part47
		bodyModel[52] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Du loco part47
		bodyModel[53] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Du loco part47
		bodyModel[54] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Du loco part47
		bodyModel[55] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Du loco part37
		bodyModel[56] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Du loco part37
		bodyModel[57] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Du loco part37
		bodyModel[58] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Du loco part37
		bodyModel[59] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Du loco part37
		bodyModel[60] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Du loco part47
		bodyModel[61] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Du loco part37
		bodyModel[62] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Du loco part37
		bodyModel[63] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Lamp
		bodyModel[64] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Lamp
		bodyModel[65] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Lamp
		bodyModel[66] = new ModelRendererTurbo(this, 0, 73, textureX, textureY); // Lamp
		bodyModel[67] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Lamp
		bodyModel[68] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 149
		bodyModel[69] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 149
		bodyModel[70] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Du loco part37
		bodyModel[71] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Du loco part71
		bodyModel[72] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Du loco part71
		bodyModel[73] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Du loco part71
		bodyModel[74] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Du loco part28
		bodyModel[75] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part28
		bodyModel[76] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[77] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[78] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Du loco part28
		bodyModel[79] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Du loco part28
		bodyModel[80] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Du loco part28
		bodyModel[81] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part28
		bodyModel[82] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Du loco part28
		bodyModel[83] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Du loco part28
		bodyModel[84] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Du loco part47
		bodyModel[85] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[86] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[87] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Du loco part28
		bodyModel[88] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Du loco part28
		bodyModel[89] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[90] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Du loco part06
		bodyModel[91] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Du loco part06
		bodyModel[92] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Du loco part05
		bodyModel[93] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Du loco part06
		bodyModel[94] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Du loco part19
		bodyModel[95] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Du loco part22
		bodyModel[96] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Du loco part28
		bodyModel[97] = new ModelRendererTurbo(this, 152, 73, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[98] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[99] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Du loco part Ligjhtpart15
		bodyModel[100] = new ModelRendererTurbo(this, 496, 105, textureX, textureY); // Du loco part Ligjhtpart13
		bodyModel[101] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[102] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[103] = new ModelRendererTurbo(this, 440, 73, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[104] = new ModelRendererTurbo(this, 496, 89, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[105] = new ModelRendererTurbo(this, 480, 129, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[106] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 168
		bodyModel[107] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 167
		bodyModel[108] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Du loco part28
		bodyModel[109] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part28
		bodyModel[110] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Du loco part28
		bodyModel[111] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Du loco part28
		bodyModel[112] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Du loco part47
		bodyModel[113] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Du loco part56
		bodyModel[114] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 154
		bodyModel[115] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 156
		bodyModel[116] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Du loco part47
		bodyModel[117] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Du loco part47
		bodyModel[118] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Du loco part47
		bodyModel[119] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Du loco part47
		bodyModel[120] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Du loco part47
		bodyModel[121] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Du loco part47
		bodyModel[122] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Du loco part37
		bodyModel[123] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Du loco part37
		bodyModel[124] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Du loco part37
		bodyModel[125] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Du loco part37
		bodyModel[126] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Du loco part37
		bodyModel[127] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Du loco part37
		bodyModel[128] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Du loco part37
		bodyModel[129] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Du loco part37
		bodyModel[130] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Du loco part37
		bodyModel[131] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Du loco part37
		bodyModel[132] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Du loco part37
		bodyModel[133] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Du loco part37
		bodyModel[134] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Du loco part37
		bodyModel[135] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Du loco part37
		bodyModel[136] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Du loco part37
		bodyModel[137] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Du loco part37
		bodyModel[138] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Du loco part37
		bodyModel[139] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Du loco part37
		bodyModel[140] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Du loco part37
		bodyModel[141] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Du loco part82
		bodyModel[142] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Du loco part83
		bodyModel[143] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Du loco part84
		bodyModel[144] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Du loco part85
		bodyModel[145] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Du loco part94
		bodyModel[146] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Du loco part95
		bodyModel[147] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Du loco part97
		bodyModel[148] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Du loco part100
		bodyModel[149] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part101
		bodyModel[150] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Du loco part102
		bodyModel[151] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 177
		bodyModel[152] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 193
		bodyModel[153] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 196
		bodyModel[154] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Du loco part37
		bodyModel[155] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Du loco part37
		bodyModel[156] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Du loco part37
		bodyModel[157] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Du loco part37
		bodyModel[158] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Du loco part37
		bodyModel[159] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Du loco part37
		bodyModel[160] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Du loco part37
		bodyModel[161] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Du loco part37
		bodyModel[162] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Du loco part37
		bodyModel[163] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Du loco part37
		bodyModel[164] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Du loco part37
		bodyModel[165] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Du loco part37
		bodyModel[166] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Du loco part37
		bodyModel[167] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Du loco part37
		bodyModel[168] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Du loco part37
		bodyModel[169] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Du loco part37
		bodyModel[170] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Du loco part37
		bodyModel[171] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Du loco part37
		bodyModel[172] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Du loco part37
		bodyModel[173] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Du loco part37
		bodyModel[174] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Du loco part37
		bodyModel[175] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Du loco part37
		bodyModel[176] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Du loco part37
		bodyModel[177] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Du loco part37
		bodyModel[178] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Du loco part37
		bodyModel[179] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Du loco part37
		bodyModel[180] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Du loco part37
		bodyModel[181] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Du loco part37
		bodyModel[182] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Du loco part37
		bodyModel[183] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Du loco part37
		bodyModel[184] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Du loco part37
		bodyModel[185] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Du loco part37
		bodyModel[186] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[187] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[188] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Du loco part06
		bodyModel[189] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[190] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[191] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Du loco part06
		bodyModel[192] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Du loco part06
		bodyModel[193] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Du loco part06
		bodyModel[194] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Du loco part06
		bodyModel[195] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Du loco part28
		bodyModel[196] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Du loco part28
		bodyModel[197] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Du loco part28
		bodyModel[198] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Du loco part28
		bodyModel[199] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Du loco part28
		bodyModel[200] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Du loco part28
		bodyModel[201] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Du loco part28
		bodyModel[202] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Du loco part28
		bodyModel[203] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Du loco part28
		bodyModel[204] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Du loco part28
		bodyModel[205] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 156
		bodyModel[206] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 156
		bodyModel[207] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		bodyModel[208] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 154
		bodyModel[209] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 154
		bodyModel[210] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 154
		bodyModel[211] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Du loco part23
		bodyModel[212] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Du loco part37
		bodyModel[213] = new ModelRendererTurbo(this, 393, 241, textureX, textureY); // Du loco part37
		bodyModel[214] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Du loco part37
		bodyModel[215] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Du loco part37
		bodyModel[216] = new ModelRendererTurbo(this, 57, 249, textureX, textureY); // Du loco part37
		bodyModel[217] = new ModelRendererTurbo(this, 97, 249, textureX, textureY); // Du loco part37
		bodyModel[218] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Du loco part37
		bodyModel[219] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Du loco part37
		bodyModel[220] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Du loco part23
		bodyModel[221] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Du loco part28
		bodyModel[222] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Du loco part28
		bodyModel[223] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Du loco part41
		bodyModel[224] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Du loco part41
		bodyModel[225] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Du loco part37
		bodyModel[226] = new ModelRendererTurbo(this, 78, 295, textureX, textureY); // Du loco part37
		bodyModel[227] = new ModelRendererTurbo(this, 78, 295, textureX, textureY); // Du loco part37
		bodyModel[228] = new ModelRendererTurbo(this, 1, 308, textureX, textureY); // Du loco part05
		bodyModel[229] = new ModelRendererTurbo(this, 20, 308, textureX, textureY); // Du loco part05
		bodyModel[230] = new ModelRendererTurbo(this, 1, 311, textureX, textureY); // Du loco part05
		bodyModel[231] = new ModelRendererTurbo(this, 6, 311, textureX, textureY); // Du loco part05
		bodyModel[232] = new ModelRendererTurbo(this, 1, 330, textureX, textureY); // Du loco part05
		bodyModel[233] = new ModelRendererTurbo(this, 20, 330, textureX, textureY); // Du loco part05
		bodyModel[234] = new ModelRendererTurbo(this, 1, 333, textureX, textureY); // Du loco part05
		bodyModel[235] = new ModelRendererTurbo(this, 6, 333, textureX, textureY); // Du loco part05
		bodyModel[236] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[237] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[238] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[239] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[240] = new ModelRendererTurbo(this, 2, 362, textureX, textureY); // Du loco part05
		bodyModel[241] = new ModelRendererTurbo(this, 2, 362, textureX, textureY); // Du loco part05
		bodyModel[242] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[243] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[244] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[245] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[246] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[247] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[248] = new ModelRendererTurbo(this, 2, 362, textureX, textureY); // Du loco part05
		bodyModel[249] = new ModelRendererTurbo(this, 2, 362, textureX, textureY); // Du loco part05
		bodyModel[250] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[251] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[252] = new ModelRendererTurbo(this, 15, 378, textureX, textureY); // Du loco part05
		bodyModel[253] = new ModelRendererTurbo(this, 2, 378, textureX, textureY); // Du loco part05
		bodyModel[254] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[255] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[256] = new ModelRendererTurbo(this, 15, 378, textureX, textureY); // Du loco part05
		bodyModel[257] = new ModelRendererTurbo(this, 2, 378, textureX, textureY); // Du loco part05
		bodyModel[258] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[259] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[260] = new ModelRendererTurbo(this, 14, 391, textureX, textureY); // Du loco part05
		bodyModel[261] = new ModelRendererTurbo(this, 14, 391, textureX, textureY); // Du loco part05
		bodyModel[262] = new ModelRendererTurbo(this, 6, 401, textureX, textureY); // Du loco part05
		bodyModel[263] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Du loco part05
		bodyModel[264] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[265] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[266] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[267] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[268] = new ModelRendererTurbo(this, 2, 362, textureX, textureY); // Du loco part05
		bodyModel[269] = new ModelRendererTurbo(this, 2, 362, textureX, textureY); // Du loco part05
		bodyModel[270] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[271] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[272] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[273] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[274] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[275] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[276] = new ModelRendererTurbo(this, 2, 362, textureX, textureY); // Du loco part05
		bodyModel[277] = new ModelRendererTurbo(this, 2, 362, textureX, textureY); // Du loco part05
		bodyModel[278] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[279] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[280] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[281] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[282] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[283] = new ModelRendererTurbo(this, 266, 84, textureX, textureY); // Du loco part09
		bodyModel[284] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part37
		bodyModel[285] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part37
		bodyModel[286] = new ModelRendererTurbo(this, 71, 290, textureX, textureY); // Du loco part37
		bodyModel[287] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[288] = new ModelRendererTurbo(this, 120, 97, textureX, textureY); // Du loco part01
		bodyModel[289] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[290] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[291] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Du loco part06
		bodyModel[292] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Du loco part06
		bodyModel[293] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[294] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[295] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[296] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[297] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[298] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Du loco part06
		bodyModel[299] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[300] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[301] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Du loco part06
		bodyModel[302] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Du loco part06
		bodyModel[303] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Du loco part06
		bodyModel[304] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Du loco part06
		bodyModel[305] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[306] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[307] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[308] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[309] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[310] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[311] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[312] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[313] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[314] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[315] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[316] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[317] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[318] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[319] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[320] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[321] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[322] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[323] = new ModelRendererTurbo(this, 1, 172, textureX, textureY); // Du loco part19
		bodyModel[324] = new ModelRendererTurbo(this, 12, 95, textureX, textureY); // Du loco part19
		bodyModel[325] = new ModelRendererTurbo(this, 12, 96, textureX, textureY); // Du loco part19
		bodyModel[326] = new ModelRendererTurbo(this, 11, 96, textureX, textureY); // Du loco part19
		bodyModel[327] = new ModelRendererTurbo(this, 13, 95, textureX, textureY); // Du loco part19
		bodyModel[328] = new ModelRendererTurbo(this, 2, 95, textureX, textureY); // Du loco part19
		bodyModel[329] = new ModelRendererTurbo(this, 266, 84, textureX, textureY); // Du loco part09
		bodyModel[330] = new ModelRendererTurbo(this, 289, 293, textureX, textureY); // Du loco part09
		bodyModel[331] = new ModelRendererTurbo(this, 289, 293, textureX, textureY); // Du loco part09
		bodyModel[332] = new ModelRendererTurbo(this, 279, 138, textureX, textureY); // Du loco part09
		bodyModel[333] = new ModelRendererTurbo(this, 1, 144, textureX, textureY); // Du loco part19
		bodyModel[334] = new ModelRendererTurbo(this, 11, 94, textureX, textureY); // Du loco part19
		bodyModel[335] = new ModelRendererTurbo(this, 14, 95, textureX, textureY); // Du loco part19
		bodyModel[336] = new ModelRendererTurbo(this, 12, 96, textureX, textureY); // Du loco part19
		bodyModel[337] = new ModelRendererTurbo(this, 13, 95, textureX, textureY); // Du loco part19
		bodyModel[338] = new ModelRendererTurbo(this, 2, 95, textureX, textureY); // Du loco part19
		bodyModel[339] = new ModelRendererTurbo(this, 120, 97, textureX, textureY); // Du loco part01
		bodyModel[340] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[341] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[342] = new ModelRendererTurbo(this, 133, 152, textureX, textureY); // Du loco part09
		bodyModel[343] = new ModelRendererTurbo(this, 133, 146, textureX, textureY); // Du loco part09
		bodyModel[344] = new ModelRendererTurbo(this, 15, 378, textureX, textureY); // Du loco part05
		bodyModel[345] = new ModelRendererTurbo(this, 2, 378, textureX, textureY); // Du loco part05
		bodyModel[346] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[347] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[348] = new ModelRendererTurbo(this, 15, 378, textureX, textureY); // Du loco part05
		bodyModel[349] = new ModelRendererTurbo(this, 2, 378, textureX, textureY); // Du loco part05
		bodyModel[350] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[351] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[352] = new ModelRendererTurbo(this, 14, 391, textureX, textureY); // Du loco part05
		bodyModel[353] = new ModelRendererTurbo(this, 14, 391, textureX, textureY); // Du loco part05
		bodyModel[354] = new ModelRendererTurbo(this, 6, 401, textureX, textureY); // Du loco part05
		bodyModel[355] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Du loco part05
		bodyModel[356] = new ModelRendererTurbo(this, 279, 138, textureX, textureY); // Du loco part09
		bodyModel[357] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Du loco part05
		bodyModel[358] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Du loco part05
		bodyModel[359] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Du loco part06
		bodyModel[360] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Du loco part06
		bodyModel[361] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[362] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[363] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[364] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[365] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[366] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[367] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[368] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[369] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[370] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[371] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[372] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[373] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[374] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[375] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[376] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[377] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[378] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[379] = new ModelRendererTurbo(this, 82, 337, textureX, textureY); // Du loco part41
		bodyModel[380] = new ModelRendererTurbo(this, 82, 337, textureX, textureY); // Du loco part41
		bodyModel[381] = new ModelRendererTurbo(this, 82, 337, textureX, textureY); // Du loco part41
		bodyModel[382] = new ModelRendererTurbo(this, 82, 337, textureX, textureY); // Du loco part41
		bodyModel[383] = new ModelRendererTurbo(this, 82, 337, textureX, textureY); // Du loco part41
		bodyModel[384] = new ModelRendererTurbo(this, 82, 337, textureX, textureY); // Du loco part41
		bodyModel[385] = new ModelRendererTurbo(this, 82, 337, textureX, textureY); // Du loco part41
		bodyModel[386] = new ModelRendererTurbo(this, 82, 337, textureX, textureY); // Du loco part41
		bodyModel[387] = new ModelRendererTurbo(this, 82, 337, textureX, textureY); // Du loco part41
		bodyModel[388] = new ModelRendererTurbo(this, 82, 337, textureX, textureY); // Du loco part41
		bodyModel[389] = new ModelRendererTurbo(this, 82, 337, textureX, textureY); // Du loco part41
		bodyModel[390] = new ModelRendererTurbo(this, 82, 337, textureX, textureY); // Du loco part41
		bodyModel[391] = new ModelRendererTurbo(this, 266, 84, textureX, textureY); // Du loco part09
		bodyModel[392] = new ModelRendererTurbo(this, 266, 84, textureX, textureY); // Du loco part09
		bodyModel[393] = new ModelRendererTurbo(this, 289, 293, textureX, textureY); // Du loco part09
		bodyModel[394] = new ModelRendererTurbo(this, 289, 293, textureX, textureY); // Du loco part09
		bodyModel[395] = new ModelRendererTurbo(this, 279, 138, textureX, textureY); // Du loco part09
		bodyModel[396] = new ModelRendererTurbo(this, 279, 138, textureX, textureY); // Du loco part09
		bodyModel[397] = new ModelRendererTurbo(this, 133, 152, textureX, textureY); // Du loco part09
		bodyModel[398] = new ModelRendererTurbo(this, 133, 146, textureX, textureY); // Du loco part09
		bodyModel[399] = new ModelRendererTurbo(this, 15, 61, textureX, textureY); // Du loco part37
		bodyModel[400] = new ModelRendererTurbo(this, 15, 61, textureX, textureY); // Du loco part37

		bodyModel[0].addBox(0F, 0F, 0F, 88, 7, 11, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(-15F, -10F, -5.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 58, 1, 20, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(0F, -12F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[2].setRotationPoint(0F, -11F, 11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[3].setRotationPoint(0F, -11F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 28, 20, 1, 0F); // Du loco part07
		bodyModel[4].setRotationPoint(15F, -30F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 60, 3, 4, 0F); // Du loco part08
		bodyModel[5].setRotationPoint(-1F, -33F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[6].setRotationPoint(-1F, -30F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Du loco part20
		bodyModel[7].setRotationPoint(42F, -30F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[8].setRotationPoint(0F, -30F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[9].setRotationPoint(0F, -30F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[10].setRotationPoint(-28F, -9F, 4F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[11].setRotationPoint(-28F, -9F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[12].setRotationPoint(1F, -19F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[13].setRotationPoint(6F, -13F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[14].setRotationPoint(6F, -13F, -6F);
		bodyModel[14].rotateAngleY = -1.57079633F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[15].setRotationPoint(6F, -13F, -3F);
		bodyModel[15].rotateAngleY = -1.57079633F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[16].setRotationPoint(6F, -16F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[17].setRotationPoint(6F, -16F, -3F);
		bodyModel[17].rotateAngleY = -1.57079633F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[18].setRotationPoint(6F, -16F, -6F);
		bodyModel[18].rotateAngleY = -1.57079633F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[19].setRotationPoint(9F, -20F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[20].setRotationPoint(9F, -20F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[21].setRotationPoint(9F, -20F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[22].setRotationPoint(-21F, -15F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[23].setRotationPoint(-21F, -13F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[24].setRotationPoint(-21F, -13F, 3F);

		bodyModel[25].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[25].setRotationPoint(-21F, -15F, 3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 60, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 149
		bodyModel[26].setRotationPoint(-1F, -31F, 9F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[27].setRotationPoint(-27F, -9F, -6F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[28].setRotationPoint(-27F, -9F, 5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[29].setRotationPoint(9F, -16F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[30].setRotationPoint(8F, -15F, -4F);
		bodyModel[30].rotateAngleY = -1.57079633F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[31].setRotationPoint(7F, -15F, -4F);
		bodyModel[31].rotateAngleY = -1.57079633F;

		bodyModel[32].addBox(0F, 0F, 0F, 28, 20, 1, 0F); // Box 135
		bodyModel[32].setRotationPoint(15F, -30F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 136
		bodyModel[33].setRotationPoint(15F, -30F, -10F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[34].setRotationPoint(20F, -16F, -2F);

		bodyModel[35].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[35].setRotationPoint(19F, -22F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[36].setRotationPoint(19F, -24F, -3F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 142
		bodyModel[37].setRotationPoint(20F, -25F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 143
		bodyModel[38].setRotationPoint(19F, -26F, -3F);

		bodyModel[39].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 144
		bodyModel[39].setRotationPoint(19F, -30F, -3F);

		bodyModel[40].addBox(0F, 0F, 0F, 12, 15, 12, 0F); // Box 145
		bodyModel[40].setRotationPoint(28F, -27F, -5F);

		bodyModel[41].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 146
		bodyModel[41].setRotationPoint(27F, -28F, -6F);

		bodyModel[42].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[42].setRotationPoint(22F, -19F, -4F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 148
		bodyModel[43].setRotationPoint(26F, -26F, -4F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[44].setRotationPoint(27F, -26F, -4F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[45].setRotationPoint(0F, -33F, -6F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[46].setRotationPoint(0F, -33F, 5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[47].setRotationPoint(18F, -33F, -6F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[48].setRotationPoint(18F, -33F, 5F);

		bodyModel[49].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[49].setRotationPoint(0F, -34F, -6F);

		bodyModel[50].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[50].setRotationPoint(0F, -34F, 5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[51].setRotationPoint(-28F, -8F, 4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[52].setRotationPoint(-28F, -10F, 4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[53].setRotationPoint(-28F, -8F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[54].setRotationPoint(-28F, -10F, -7F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[55].setRotationPoint(8F, -37F, -4F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[56].setRotationPoint(8F, -37F, 3F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[57].setRotationPoint(9F, -38F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[58].setRotationPoint(9F, -38F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[59].setRotationPoint(9F, -38F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[60].setRotationPoint(-25F, -8F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[61].setRotationPoint(-3F, -35F, -5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[62].setRotationPoint(-3F, -36F, -4F);

		bodyModel[63].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[63].setRotationPoint(-21F, -14F, -8F);

		bodyModel[64].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[64].setRotationPoint(-21F, -14F, 3F);

		bodyModel[65].addShapeBox(0F, 0F, 1F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[65].setRotationPoint(-15F, -25F, -3F);

		bodyModel[66].addShapeBox(0F, 0F, 1F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[66].setRotationPoint(-15F, -22F, -3F);

		bodyModel[67].addBox(0F, 0F, 1F, 2, 2, 4, 0F); // Lamp
		bodyModel[67].setRotationPoint(-15F, -24F, -3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 60, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[68].setRotationPoint(-1F, -32F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 60, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[69].setRotationPoint(-1F, -33F, 2F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[70].setRotationPoint(15F, -34F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 60, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[71].setRotationPoint(-1F, -33F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 60, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[72].setRotationPoint(-1F, -32F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 60, 1, 2, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[73].setRotationPoint(-1F, -31F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[74].setRotationPoint(10F, -11F, -9F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[75].setRotationPoint(13F, -11F, -9F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[76].setRotationPoint(10F, -11F, 8F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[77].setRotationPoint(13F, -11F, 8F);

		bodyModel[78].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[78].setRotationPoint(10F, -5F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[79].setRotationPoint(10F, -7F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[80].setRotationPoint(10F, -9F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[81].setRotationPoint(10F, -5F, 9F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[82].setRotationPoint(10F, -7F, 9F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[83].setRotationPoint(10F, -9F, 9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[84].setRotationPoint(-26F, -9F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[85].setRotationPoint(9F, -25F, 11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[86].setRotationPoint(14F, -25F, 11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[87].setRotationPoint(9F, -25F, -12F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[88].setRotationPoint(14F, -25F, -12F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[89].setRotationPoint(16F, -9F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[90].setRotationPoint(16F, -10F, -11F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[91].setRotationPoint(19F, -10F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[92].setRotationPoint(49F, -11F, 11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[93].setRotationPoint(49F, -11F, -12F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[94].setRotationPoint(58F, -30F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 15, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[95].setRotationPoint(43F, -30F, 10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 15, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[96].setRotationPoint(43F, -30F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[97].setRotationPoint(77F, -15F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[98].setRotationPoint(78F, -13F, -8F);

		bodyModel[99].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart15
		bodyModel[99].setRotationPoint(78F, -13F, 3F);

		bodyModel[100].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart13
		bodyModel[100].setRotationPoint(77F, -15F, 3F);

		bodyModel[101].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[101].setRotationPoint(78F, -14F, -8F);

		bodyModel[102].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[102].setRotationPoint(78F, -14F, 3F);

		bodyModel[103].addShapeBox(0F, 0F, 1F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[103].setRotationPoint(71F, -25F, -3F);

		bodyModel[104].addShapeBox(0F, 0F, 1F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[104].setRotationPoint(71F, -22F, -3F);

		bodyModel[105].addBox(0F, 0F, 1F, 2, 2, 4, 0F); // Du loco part Ligjhtpart18
		bodyModel[105].setRotationPoint(71F, -24F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 1F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[106].setRotationPoint(58F, -30F, 9F);

		bodyModel[107].addShapeBox(0F, 0F, 1F, 1, 20, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[107].setRotationPoint(58F, -30F, -12F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[108].setRotationPoint(43F, -25F, 11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[109].setRotationPoint(48F, -25F, 11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[110].setRotationPoint(43F, -25F, -12F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[111].setRotationPoint(48F, -25F, -12F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[112].setRotationPoint(85F, -9F, 4F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[113].setRotationPoint(85F, -9F, -7F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[114].setRotationPoint(82F, -9F, -6F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[115].setRotationPoint(82F, -9F, 5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[116].setRotationPoint(85F, -8F, 4F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[117].setRotationPoint(85F, -10F, 4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[118].setRotationPoint(85F, -8F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[119].setRotationPoint(85F, -10F, -7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[120].setRotationPoint(82F, -8F, -1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[121].setRotationPoint(83F, -9F, -1F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[122].setRotationPoint(39F, -33F, -6F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[123].setRotationPoint(39F, -33F, 5F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[124].setRotationPoint(57F, -33F, -6F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[125].setRotationPoint(57F, -33F, 5F);

		bodyModel[126].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[126].setRotationPoint(39F, -34F, -6F);

		bodyModel[127].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[127].setRotationPoint(39F, -34F, 5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[128].setRotationPoint(52F, -40F, 4F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[129].setRotationPoint(39F, -40F, 4F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[130].setRotationPoint(49F, -46F, 3F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[131].setRotationPoint(39F, -46F, 3F);

		bodyModel[132].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[132].setRotationPoint(47F, -47F, -4F);

		bodyModel[133].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[133].setRotationPoint(47F, -47F, 3F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[134].setRotationPoint(48F, -48F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[135].setRotationPoint(48F, -48F, 6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[136].setRotationPoint(48F, -48F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[137].setRotationPoint(52F, -40F, -5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[138].setRotationPoint(39F, -40F, -5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[139].setRotationPoint(49F, -46F, -4F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[140].setRotationPoint(39F, -46F, -4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[141].setRotationPoint(53F, -19F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[142].setRotationPoint(49F, -13F, -6F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[143].setRotationPoint(49F, -13F, -6F);
		bodyModel[143].rotateAngleY = -1.57079633F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[144].setRotationPoint(49F, -13F, -3F);
		bodyModel[144].rotateAngleY = -1.57079633F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[145].setRotationPoint(50F, -16F, -6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[146].setRotationPoint(50F, -16F, -3F);
		bodyModel[146].rotateAngleY = -1.57079633F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[147].setRotationPoint(50F, -16F, -6F);
		bodyModel[147].rotateAngleY = -1.57079633F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[148].setRotationPoint(49F, -20F, -6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[149].setRotationPoint(49F, -20F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[150].setRotationPoint(49F, -20F, -4F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[151].setRotationPoint(49F, -16F, -7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[152].setRotationPoint(51F, -15F, -4F);
		bodyModel[152].rotateAngleY = -1.57079633F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[153].setRotationPoint(50F, -15F, -4F);
		bodyModel[153].rotateAngleY = -1.57079633F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[154].setRotationPoint(13F, -35F, 4F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, 0F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -7F); // Du loco part37
		bodyModel[155].setRotationPoint(11F, -37F, -4F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[156].setRotationPoint(-3F, -35F, 4F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[157].setRotationPoint(-3F, -36F, 3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[158].setRotationPoint(13F, -35F, -5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[159].setRotationPoint(10F, -36F, -4F);

		bodyModel[160].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[160].setRotationPoint(47F, -37F, -4F);

		bodyModel[161].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[161].setRotationPoint(47F, -37F, 3F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[162].setRotationPoint(48F, -38F, -6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[163].setRotationPoint(48F, -38F, 6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[164].setRotationPoint(48F, -38F, -8F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[165].setRotationPoint(36F, -35F, -5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[166].setRotationPoint(36F, -36F, -4F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[167].setRotationPoint(52F, -35F, 4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[168].setRotationPoint(49F, -36F, 3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[169].setRotationPoint(36F, -35F, 4F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[170].setRotationPoint(36F, -36F, 3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[171].setRotationPoint(52F, -35F, -5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[172].setRotationPoint(49F, -36F, -4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[173].setRotationPoint(13F, -40F, 4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[174].setRotationPoint(0F, -40F, 4F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[175].setRotationPoint(10F, -46F, 3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[176].setRotationPoint(0F, -46F, 3F);

		bodyModel[177].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[177].setRotationPoint(8F, -47F, -4F);

		bodyModel[178].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[178].setRotationPoint(8F, -47F, 3F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[179].setRotationPoint(9F, -48F, -6F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[180].setRotationPoint(9F, -48F, 6F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[181].setRotationPoint(9F, -48F, -8F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[182].setRotationPoint(13F, -40F, -5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[183].setRotationPoint(0F, -40F, -5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[184].setRotationPoint(10F, -46F, -4F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[185].setRotationPoint(0F, -46F, -4F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[186].setRotationPoint(33F, -10F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[187].setRotationPoint(37F, -8F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[188].setRotationPoint(32F, -8F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[189].setRotationPoint(33F, -8F, -11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[190].setRotationPoint(37F, -10F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[191].setRotationPoint(32F, -10F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[192].setRotationPoint(32F, -9F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[193].setRotationPoint(37F, -9F, -11F);

		bodyModel[194].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[194].setRotationPoint(33F, -9F, -11F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[195].setRotationPoint(44F, -11F, -9F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[196].setRotationPoint(47F, -11F, -9F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[197].setRotationPoint(44F, -11F, 8F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[198].setRotationPoint(47F, -11F, 8F);

		bodyModel[199].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[199].setRotationPoint(44F, -5F, -11F);

		bodyModel[200].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[200].setRotationPoint(44F, -7F, -11F);

		bodyModel[201].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[201].setRotationPoint(44F, -9F, -11F);

		bodyModel[202].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[202].setRotationPoint(44F, -5F, 9F);

		bodyModel[203].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[203].setRotationPoint(44F, -7F, 9F);

		bodyModel[204].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[204].setRotationPoint(44F, -9F, 9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 156
		bodyModel[205].setRotationPoint(-2F, -30F, -11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[206].setRotationPoint(-2F, -30F, 10F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[207].setRotationPoint(-2F, -32F, -10.75F);

		bodyModel[208].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[208].setRotationPoint(-1.5F, -32F, -11.25F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[209].setRotationPoint(-2F, -32F, 10.75F);

		bodyModel[210].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[210].setRotationPoint(-1.5F, -32F, 10.25F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[211].setRotationPoint(-16F, -21F, 11.05F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F); // Du loco part37
		bodyModel[212].setRotationPoint(11F, -46F, -4F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F); // Du loco part37
		bodyModel[213].setRotationPoint(11F, -46F, -4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[214].setRotationPoint(10F, -36F, 3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, -7F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F); // Du loco part37
		bodyModel[215].setRotationPoint(11F, -37F, -4F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[216].setRotationPoint(36F, -37F, -4F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[217].setRotationPoint(39F, -46F, -4F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[218].setRotationPoint(39F, -46F, -4F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[219].setRotationPoint(36F, -37F, -4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[220].setRotationPoint(-16F, -21F, -11.05F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[221].setRotationPoint(-1F, -30F, -11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[222].setRotationPoint(-1F, -30F, 10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part41
		bodyModel[223].setRotationPoint(-24F, -9F, -10F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part41
		bodyModel[224].setRotationPoint(81F, -9F, -10F);

		bodyModel[225].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[225].setRotationPoint(41F, -34F, 3F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F); // Du loco part37
		bodyModel[226].setRotationPoint(30F, -35F, 3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -1F); // Du loco part37
		bodyModel[227].setRotationPoint(17F, -35F, -3F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[228].setRotationPoint(25F, -22F, 10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[229].setRotationPoint(25F, -28F, 10F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[230].setRotationPoint(25F, -28F, 10F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[231].setRotationPoint(32F, -28F, 10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[232].setRotationPoint(25F, -22F, -11F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[233].setRotationPoint(25F, -28F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[234].setRotationPoint(25F, -28F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[235].setRotationPoint(32F, -28F, -11F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[236].setRotationPoint(3F, -22F, 10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[237].setRotationPoint(3F, -28F, 10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[238].setRotationPoint(3F, -28F, 10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[239].setRotationPoint(7F, -28F, 10F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[240].setRotationPoint(10F, -22F, 10F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[241].setRotationPoint(10F, -28F, 10F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[242].setRotationPoint(10F, -28F, 10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[243].setRotationPoint(13F, -28F, 10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[244].setRotationPoint(3F, -22F, -11F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[245].setRotationPoint(3F, -28F, -11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[246].setRotationPoint(3F, -28F, -11F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[247].setRotationPoint(7F, -28F, -11F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[248].setRotationPoint(10F, -22F, -11F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[249].setRotationPoint(10F, -28F, -11F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[250].setRotationPoint(10F, -28F, -11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[251].setRotationPoint(13F, -28F, -11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[252].setRotationPoint(-1F, -25F, 5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[253].setRotationPoint(-2F, -29F, 5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[254].setRotationPoint(-1F, -29F, 5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[255].setRotationPoint(-1F, -29F, 8F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[256].setRotationPoint(-1F, -25F, -9F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[257].setRotationPoint(-2F, -29F, -9F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[258].setRotationPoint(-1F, -29F, -9F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[259].setRotationPoint(-1F, -29F, -6F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[260].setRotationPoint(-1F, -25F, -4F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[261].setRotationPoint(-1F, -29F, -4F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[262].setRotationPoint(-1F, -29F, -4F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[263].setRotationPoint(-1F, -29F, 3F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[264].setRotationPoint(50F, -22F, 10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[265].setRotationPoint(50F, -28F, 10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[266].setRotationPoint(50F, -28F, 10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[267].setRotationPoint(54F, -28F, 10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[268].setRotationPoint(44F, -22F, 10F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[269].setRotationPoint(44F, -28F, 10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[270].setRotationPoint(44F, -28F, 10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[271].setRotationPoint(47F, -28F, 10F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[272].setRotationPoint(50F, -22F, -11F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[273].setRotationPoint(50F, -28F, -11F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[274].setRotationPoint(50F, -28F, -11F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[275].setRotationPoint(54F, -28F, -11F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[276].setRotationPoint(44F, -22F, -11F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[277].setRotationPoint(44F, -28F, -11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[278].setRotationPoint(44F, -28F, -11F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[279].setRotationPoint(47F, -28F, -11F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[280].setRotationPoint(16F, -9F, -10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[281].setRotationPoint(16F, -10F, -10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[282].setRotationPoint(16F, -10F, -11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part09
		bodyModel[283].setRotationPoint(-54F, -12F, 6.05F);

		bodyModel[284].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[284].setRotationPoint(28F, -35F, -3F);

		bodyModel[285].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[285].setRotationPoint(28F, -35F, 2F);

		bodyModel[286].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Du loco part37
		bodyModel[286].setRotationPoint(29F, -35F, -1F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[287].setRotationPoint(-16F, -7F, 6.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 22, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[288].setRotationPoint(-23F, -9F, -10F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[289].setRotationPoint(24F, -8F, 6.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[290].setRotationPoint(16F, -9F, 10F);

		bodyModel[291].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[291].setRotationPoint(16F, -10F, 10F);

		bodyModel[292].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[292].setRotationPoint(19F, -10F, 10F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[293].setRotationPoint(16F, -9F, 9F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[294].setRotationPoint(16F, -10F, 9F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[295].setRotationPoint(16F, -10F, 10F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[296].setRotationPoint(33F, -10F, 8F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[297].setRotationPoint(37F, -8F, 8F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[298].setRotationPoint(32F, -8F, 8F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[299].setRotationPoint(33F, -8F, 8F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[300].setRotationPoint(37F, -10F, 8F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[301].setRotationPoint(32F, -10F, 8F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[302].setRotationPoint(32F, -9F, 8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[303].setRotationPoint(37F, -9F, 8F);

		bodyModel[304].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[304].setRotationPoint(33F, -9F, 8F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[305].setRotationPoint(65F, -19F, -8F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[306].setRotationPoint(66F, -16F, -8F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[307].setRotationPoint(66F, -20F, -8F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[308].setRotationPoint(70F, -19F, -8F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[309].setRotationPoint(66F, -19F, -8F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[310].setRotationPoint(66F, -18.25F, -8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[311].setRotationPoint(66F, -17.5F, -8F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[312].setRotationPoint(66F, -19.5F, -8F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[313].setRotationPoint(66F, -16.75F, -8F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[314].setRotationPoint(-13F, -19F, 7F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[315].setRotationPoint(-12F, -16F, 7F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[316].setRotationPoint(-12F, -20F, 7F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[317].setRotationPoint(-8F, -19F, 7F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[318].setRotationPoint(-12F, -19F, 7F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[319].setRotationPoint(-12F, -18.25F, 7F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[320].setRotationPoint(-12F, -17.5F, 7F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[321].setRotationPoint(-12F, -19.5F, 7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[322].setRotationPoint(-12F, -16.75F, 7F);

		bodyModel[323].addBox(0F, 0F, 0F, 14, 12, 16, 0F); // Du loco part19
		bodyModel[323].setRotationPoint(-15F, -21F, -8F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 12, 16, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[324].setRotationPoint(-17F, -21F, -8F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 11, 16, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[325].setRotationPoint(-18F, -20F, -8F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 10, 16, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[326].setRotationPoint(-19F, -19F, -8F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 8, 16, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[327].setRotationPoint(-20F, -17F, -8F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 14, 2, 16, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[328].setRotationPoint(-15F, -23F, -8F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part09
		bodyModel[329].setRotationPoint(-26F, -12F, 6.05F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part09
		bodyModel[330].setRotationPoint(-5F, -12F, 6.05F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part09
		bodyModel[331].setRotationPoint(23F, -12F, 6.05F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part09
		bodyModel[332].setRotationPoint(9F, -12F, 6.05F);

		bodyModel[333].addBox(0F, 0F, 0F, 14, 12, 16, 0F); // Du loco part19
		bodyModel[333].setRotationPoint(59F, -21F, -8F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 12, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[334].setRotationPoint(73F, -21F, -8F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 11, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[335].setRotationPoint(75F, -20F, -8F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 10, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[336].setRotationPoint(76F, -19F, -8F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 8, 16, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[337].setRotationPoint(77F, -17F, -8F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 14, 2, 16, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[338].setRotationPoint(59F, -23F, -8F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 22, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[339].setRotationPoint(59F, -9F, -10F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[340].setRotationPoint(33F, -7F, 6.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[341].setRotationPoint(73F, -8F, 6.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 64, 6, 0, 0F,-32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -32F, -3F, 0F); // Du loco part09
		bodyModel[342].setRotationPoint(-43F, -11F, 6.15F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 64, 6, 0, 0F,-32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -32F, -3F, 0F); // Du loco part09
		bodyModel[343].setRotationPoint(6F, -5F, 6.15F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[344].setRotationPoint(58F, -25F, 5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[345].setRotationPoint(58F, -29F, 5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[346].setRotationPoint(58F, -29F, 5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[347].setRotationPoint(58F, -29F, 8F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[348].setRotationPoint(58F, -25F, -9F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[349].setRotationPoint(58F, -29F, -9F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[350].setRotationPoint(58F, -29F, -9F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[351].setRotationPoint(58F, -29F, -6F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[352].setRotationPoint(58F, -25F, -4F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[353].setRotationPoint(58F, -29F, -4F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[354].setRotationPoint(58F, -29F, -4F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[355].setRotationPoint(58F, -29F, 3F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part09
		bodyModel[356].setRotationPoint(-40F, -12F, 6.05F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[357].setRotationPoint(0F, -20F, 11F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[358].setRotationPoint(49F, -20F, 11F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[359].setRotationPoint(0F, -20F, -12F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[360].setRotationPoint(49F, -20F, -12F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[361].setRotationPoint(65F, -19F, 7F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[362].setRotationPoint(66F, -16F, 7F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[363].setRotationPoint(66F, -20F, 7F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[364].setRotationPoint(70F, -19F, 7F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[365].setRotationPoint(66F, -19F, 7F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[366].setRotationPoint(66F, -18.25F, 7F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[367].setRotationPoint(66F, -17.5F, 7F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[368].setRotationPoint(66F, -19.5F, 7F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[369].setRotationPoint(66F, -16.75F, 7F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[370].setRotationPoint(-13F, -19F, -8F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[371].setRotationPoint(-12F, -16F, -8F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[372].setRotationPoint(-12F, -20F, -8F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[373].setRotationPoint(-8F, -19F, -8F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[374].setRotationPoint(-12F, -19F, -8F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[375].setRotationPoint(-12F, -18.25F, -8F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[376].setRotationPoint(-12F, -17.5F, -8F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[377].setRotationPoint(-12F, -19.5F, -8F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[378].setRotationPoint(-12F, -16.75F, -8F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,-7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[379].setRotationPoint(-22F, -6F, -10F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,-9.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, -2F, 0F, 0F, -4.875F, 0F, 0F, -5F, 0F, 0F, -9.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[380].setRotationPoint(-24F, -4F, -10F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,-7.875F, 0F, 0F, -1F, 0F, 0F, -8.875F, 0F, 0F, 0F, 0F, 0F, -8.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[381].setRotationPoint(-23F, -8F, -10F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,0F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F); // Du loco part41
		bodyModel[382].setRotationPoint(-22F, -6F, 0F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,-2F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -9.875F, 0F, 0F, 0F, 0F, 0F, -9.875F, 0F, 0F, -5F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[383].setRotationPoint(-24F, -4F, 0F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,0F, 0F, 0F, -8.875F, 0F, 0F, -1F, 0F, 0F, -7.875F, 0F, 0F, -1F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -8.875F, 0F, 0F); // Du loco part41
		bodyModel[384].setRotationPoint(-23F, -8F, 0F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,0F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F); // Du loco part41
		bodyModel[385].setRotationPoint(72F, -6F, -10F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,0F, 0F, 0F, -9.875F, 0F, 0F, -2F, 0F, 0F, -7.875F, 0F, 0F, -5F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -9.875F, 0F, 0F); // Du loco part41
		bodyModel[386].setRotationPoint(72F, -4F, -10F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,-1F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -8.875F, 0F, 0F, 0F, 0F, 0F, -8.875F, 0F, 0F, -1F, 0F, 0F, -7.875F, 0F, 0F); // Du loco part41
		bodyModel[387].setRotationPoint(72F, -8F, -10F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 8, 2, 10, 0F,-7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[388].setRotationPoint(72F, -6F, 0F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 10, 3, 10, 0F,-7.875F, 0F, 0F, -2F, 0F, 0F, -9.875F, 0F, 0F, 0F, 0F, 0F, -9.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, -5F, 0F, 0F); // Du loco part41
		bodyModel[389].setRotationPoint(72F, -4F, 0F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 9, 2, 10, 0F,-8.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, -1F, 0F, 0F, -7.875F, 0F, 0F, -1F, 0F, 0F, -8.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[390].setRotationPoint(72F, -8F, 0F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part09
		bodyModel[391].setRotationPoint(-54F, -12F, -6.05F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part09
		bodyModel[392].setRotationPoint(-26F, -12F, -6.05F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part09
		bodyModel[393].setRotationPoint(-5F, -12F, -6.05F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part09
		bodyModel[394].setRotationPoint(23F, -12F, -6.05F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part09
		bodyModel[395].setRotationPoint(9F, -12F, -6.05F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part09
		bodyModel[396].setRotationPoint(-40F, -12F, -6.05F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 64, 6, 0, 0F,-32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -32F, -3F, 0F); // Du loco part09
		bodyModel[397].setRotationPoint(-43F, -11F, -6.15F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 64, 6, 0, 0F,-32F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -32F, 0F, 0F, -32F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -32F, -3F, 0F); // Du loco part09
		bodyModel[398].setRotationPoint(6F, -5F, -6.15F);

		bodyModel[399].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[399].setRotationPoint(56F, -35F, -2F);

		bodyModel[400].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[400].setRotationPoint(1F, -35F, 1F);
	}
}