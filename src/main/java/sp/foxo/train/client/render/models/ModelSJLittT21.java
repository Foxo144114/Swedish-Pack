//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera T21
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package sp.foxo.train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelSJLittT21 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittT21() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[677];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 39, 308, textureX, textureY); // Du loco part01
		bodyModel[1] = new ModelRendererTurbo(this, 43, 304, textureX, textureY); // Du loco part03
		bodyModel[2] = new ModelRendererTurbo(this, 39, 329, textureX, textureY); // Du loco part17
		bodyModel[3] = new ModelRendererTurbo(this, 39, 329, textureX, textureY); // Du loco part27
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part47
		bodyModel[5] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Du loco part56
		bodyModel[6] = new ModelRendererTurbo(this, 253, 37, textureX, textureY); // Du loco part82
		bodyModel[7] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part83
		bodyModel[8] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Du loco part84
		bodyModel[9] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part85
		bodyModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part94
		bodyModel[11] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Du loco part95
		bodyModel[12] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part97
		bodyModel[13] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part100
		bodyModel[14] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Du loco part101
		bodyModel[15] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Du loco part102
		bodyModel[16] = new ModelRendererTurbo(this, 465, 55, textureX, textureY); // Lamp
		bodyModel[17] = new ModelRendererTurbo(this, 465, 60, textureX, textureY); // Lamp
		bodyModel[18] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 154
		bodyModel[19] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 156
		bodyModel[20] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 177
		bodyModel[21] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 194
		bodyModel[22] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 195
		bodyModel[23] = new ModelRendererTurbo(this, 4, 6, textureX, textureY); // Box 138
		bodyModel[24] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Du loco part47
		bodyModel[25] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Du loco part47
		bodyModel[26] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Du loco part47
		bodyModel[27] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Du loco part47
		bodyModel[28] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Du loco part47
		bodyModel[29] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Du loco part23
		bodyModel[30] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Du loco part23
		bodyModel[31] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Du loco part23
		bodyModel[32] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[33] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Du loco part23
		bodyModel[34] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Du loco part23
		bodyModel[35] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Du loco part23
		bodyModel[36] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Du loco part23
		bodyModel[37] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Du loco part28
		bodyModel[38] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part28
		bodyModel[39] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[40] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[41] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Du loco part28
		bodyModel[42] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Du loco part28
		bodyModel[43] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part28
		bodyModel[44] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[45] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Du loco part47
		bodyModel[46] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[47] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[48] = new ModelRendererTurbo(this, 223, 90, textureX, textureY); // Du loco part06
		bodyModel[49] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Du loco part06
		bodyModel[50] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Du loco part06
		bodyModel[51] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Du loco part28
		bodyModel[52] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part28
		bodyModel[53] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Du loco part47
		bodyModel[54] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Du loco part56
		bodyModel[55] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 154
		bodyModel[56] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 156
		bodyModel[57] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Du loco part47
		bodyModel[58] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Du loco part47
		bodyModel[59] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Du loco part47
		bodyModel[60] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Du loco part47
		bodyModel[61] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Du loco part47
		bodyModel[62] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Du loco part47
		bodyModel[63] = new ModelRendererTurbo(this, 317, 213, textureX, textureY); // Du loco part82
		bodyModel[64] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Du loco part83
		bodyModel[65] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Du loco part84
		bodyModel[66] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Du loco part85
		bodyModel[67] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Du loco part94
		bodyModel[68] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Du loco part95
		bodyModel[69] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Du loco part97
		bodyModel[70] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Du loco part100
		bodyModel[71] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part101
		bodyModel[72] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Du loco part102
		bodyModel[73] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 177
		bodyModel[74] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 193
		bodyModel[75] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 196
		bodyModel[76] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[77] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[78] = new ModelRendererTurbo(this, 244, 233, textureX, textureY); // Du loco part06
		bodyModel[79] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[80] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[81] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[82] = new ModelRendererTurbo(this, 295, 233, textureX, textureY); // Du loco part06
		bodyModel[83] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[84] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[85] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Du loco part28
		bodyModel[86] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Du loco part28
		bodyModel[87] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Du loco part28
		bodyModel[88] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Du loco part28
		bodyModel[89] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Du loco part28
		bodyModel[90] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[91] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Du loco part28
		bodyModel[92] = new ModelRendererTurbo(this, 98, 241, textureX, textureY); // Du loco part28
		bodyModel[93] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 156
		bodyModel[94] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 156
		bodyModel[95] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		bodyModel[96] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 154
		bodyModel[97] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 154
		bodyModel[98] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 154
		bodyModel[99] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Du loco part23
		bodyModel[100] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Du loco part23
		bodyModel[101] = new ModelRendererTurbo(this, 115, 251, textureX, textureY); // Du loco part41
		bodyModel[102] = new ModelRendererTurbo(this, 30, 357, textureX, textureY); // Du loco part05
		bodyModel[103] = new ModelRendererTurbo(this, 36, 357, textureX, textureY); // Du loco part05
		bodyModel[104] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[105] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[106] = new ModelRendererTurbo(this, 223, 90, textureX, textureY); // Du loco part06
		bodyModel[107] = new ModelRendererTurbo(this, 12, 340, textureX, textureY); // Du loco part05
		bodyModel[108] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[109] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[110] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[111] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[112] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[113] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[114] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[115] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[116] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[117] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Du loco part23
		bodyModel[118] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Du loco part23
		bodyModel[119] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[120] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[121] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[122] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[123] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[124] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[125] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[126] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[127] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[128] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[129] = new ModelRendererTurbo(this, 115, 252, textureX, textureY); // Du loco part41
		bodyModel[130] = new ModelRendererTurbo(this, 39, 309, textureX, textureY); // Du loco part01
		bodyModel[131] = new ModelRendererTurbo(this, 156, 371, textureX, textureY); // Du loco part19
		bodyModel[132] = new ModelRendererTurbo(this, 244, 357, textureX, textureY); // Du loco part19
		bodyModel[133] = new ModelRendererTurbo(this, 214, 435, textureX, textureY); // Du loco part19
		bodyModel[134] = new ModelRendererTurbo(this, 316, 435, textureX, textureY); // Du loco part19
		bodyModel[135] = new ModelRendererTurbo(this, 265, 386, textureX, textureY); // Du loco part19
		bodyModel[136] = new ModelRendererTurbo(this, 265, 456, textureX, textureY); // Du loco part19
		bodyModel[137] = new ModelRendererTurbo(this, 210, 421, textureX, textureY); // Du loco part19
		bodyModel[138] = new ModelRendererTurbo(this, 316, 421, textureX, textureY); // Du loco part19
		bodyModel[139] = new ModelRendererTurbo(this, 287, 414, textureX, textureY); // Du loco part19
		bodyModel[140] = new ModelRendererTurbo(this, 440, 55, textureX, textureY); // Lamp
		bodyModel[141] = new ModelRendererTurbo(this, 440, 60, textureX, textureY); // Lamp
		bodyModel[142] = new ModelRendererTurbo(this, 398, 56, textureX, textureY); // Lamp
		bodyModel[143] = new ModelRendererTurbo(this, 423, 61, textureX, textureY); // Lamp
		bodyModel[144] = new ModelRendererTurbo(this, 423, 56, textureX, textureY); // Lamp
		bodyModel[145] = new ModelRendererTurbo(this, 398, 61, textureX, textureY); // Lamp
		bodyModel[146] = new ModelRendererTurbo(this, 257, 414, textureX, textureY); // Du loco part19
		bodyModel[147] = new ModelRendererTurbo(this, 287, 435, textureX, textureY); // Du loco part19
		bodyModel[148] = new ModelRendererTurbo(this, 257, 435, textureX, textureY); // Du loco part19
		bodyModel[149] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[150] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[151] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[152] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[153] = new ModelRendererTurbo(this, 288, 393, textureX, textureY); // Du loco part19
		bodyModel[154] = new ModelRendererTurbo(this, 43, 351, textureX, textureY); // Du loco part05
		bodyModel[155] = new ModelRendererTurbo(this, 45, 352, textureX, textureY); // Du loco part05
		bodyModel[156] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[157] = new ModelRendererTurbo(this, 41, 350, textureX, textureY); // Du loco part05
		bodyModel[158] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[159] = new ModelRendererTurbo(this, 44, 352, textureX, textureY); // Du loco part05
		bodyModel[160] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[161] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[162] = new ModelRendererTurbo(this, 43, 351, textureX, textureY); // Du loco part05
		bodyModel[163] = new ModelRendererTurbo(this, 44, 352, textureX, textureY); // Du loco part05
		bodyModel[164] = new ModelRendererTurbo(this, 43, 351, textureX, textureY); // Du loco part05
		bodyModel[165] = new ModelRendererTurbo(this, 41, 350, textureX, textureY); // Du loco part05
		bodyModel[166] = new ModelRendererTurbo(this, 42, 350, textureX, textureY); // Du loco part05
		bodyModel[167] = new ModelRendererTurbo(this, 44, 353, textureX, textureY); // Du loco part05
		bodyModel[168] = new ModelRendererTurbo(this, 43, 351, textureX, textureY); // Du loco part05
		bodyModel[169] = new ModelRendererTurbo(this, 42, 350, textureX, textureY); // Du loco part05
		bodyModel[170] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[171] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[172] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[173] = new ModelRendererTurbo(this, 12, 340, textureX, textureY); // Du loco part05
		bodyModel[174] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[175] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[176] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[177] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[178] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[179] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[180] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[181] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[182] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[183] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[184] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[185] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[186] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[187] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[188] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[189] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[190] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[191] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[192] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[193] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[194] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[195] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[196] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[197] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[198] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[199] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[200] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[201] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[202] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[203] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[204] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[205] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[206] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[207] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[208] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[209] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[210] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[211] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[212] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[213] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[214] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[215] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[216] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[217] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[218] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[219] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[220] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[221] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[222] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[223] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[224] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[225] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[226] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[227] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[228] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[229] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[230] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[231] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[232] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[233] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[234] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[235] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[236] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[237] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[238] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[239] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[240] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[241] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[242] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[243] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[244] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[245] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[246] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[247] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[248] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[249] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[250] = new ModelRendererTurbo(this, 214, 403, textureX, textureY); // Du loco part19
		bodyModel[251] = new ModelRendererTurbo(this, 308, 403, textureX, textureY); // Du loco part19
		bodyModel[252] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[253] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[254] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[255] = new ModelRendererTurbo(this, 12, 340, textureX, textureY); // Du loco part05
		bodyModel[256] = new ModelRendererTurbo(this, 12, 340, textureX, textureY); // Du loco part05
		bodyModel[257] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[258] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[259] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[260] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[261] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[262] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[263] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[264] = new ModelRendererTurbo(this, 13, 337, textureX, textureY); // Du loco part05
		bodyModel[265] = new ModelRendererTurbo(this, 13, 337, textureX, textureY); // Du loco part05
		bodyModel[266] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[267] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[268] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[269] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[270] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[271] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[272] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[273] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[274] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[275] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[276] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[277] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[278] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[279] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[280] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[281] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[282] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[283] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[284] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[285] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[286] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[287] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[288] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[289] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[290] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[291] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[292] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[293] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[294] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[295] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[296] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[297] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[298] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[299] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[300] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[301] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[302] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[303] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[304] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[305] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[306] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[307] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[308] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[309] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[310] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[311] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[312] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[313] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[314] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[315] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[316] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[317] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[318] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[319] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[320] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[321] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[322] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[323] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[324] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[325] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[326] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[327] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[328] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[329] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[330] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[331] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[332] = new ModelRendererTurbo(this, 20, 384, textureX, textureY); // Du loco part05
		bodyModel[333] = new ModelRendererTurbo(this, 20, 384, textureX, textureY); // Du loco part05
		bodyModel[334] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[335] = new ModelRendererTurbo(this, 26, 378, textureX, textureY); // Du loco part05
		bodyModel[336] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[337] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[338] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[339] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[340] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[341] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[342] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[343] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[344] = new ModelRendererTurbo(this, 162, 387, textureX, textureY); // Du loco part19
		bodyModel[345] = new ModelRendererTurbo(this, 174, 399, textureX, textureY); // Du loco part19
		bodyModel[346] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[347] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[348] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[349] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[350] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[351] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[352] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[353] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[354] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[355] = new ModelRendererTurbo(this, 201, 339, textureX, textureY); // Du loco part19
		bodyModel[356] = new ModelRendererTurbo(this, 165, 339, textureX, textureY); // Du loco part19
		bodyModel[357] = new ModelRendererTurbo(this, 270, 393, textureX, textureY); // Du loco part19
		bodyModel[358] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part28
		bodyModel[359] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[360] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part28
		bodyModel[361] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[362] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[363] = new ModelRendererTurbo(this, 90, 308, textureX, textureY); // Du loco part03
		bodyModel[364] = new ModelRendererTurbo(this, 77, 308, textureX, textureY); // Du loco part03
		bodyModel[365] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[366] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[367] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[368] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[369] = new ModelRendererTurbo(this, 301, 331, textureX, textureY); // Du loco part19
		bodyModel[370] = new ModelRendererTurbo(this, 345, 331, textureX, textureY); // Du loco part19
		bodyModel[371] = new ModelRendererTurbo(this, 313, 347, textureX, textureY); // Du loco part19
		bodyModel[372] = new ModelRendererTurbo(this, 333, 308, textureX, textureY); // Du loco part19
		bodyModel[373] = new ModelRendererTurbo(this, 388, 331, textureX, textureY); // Du loco part19
		bodyModel[374] = new ModelRendererTurbo(this, 296, 331, textureX, textureY); // Du loco part19
		bodyModel[375] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[376] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[377] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Du loco part28
		bodyModel[378] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part28
		bodyModel[379] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[380] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[381] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[382] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[383] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[384] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[385] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[386] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[387] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[388] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[389] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[390] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[391] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[392] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[393] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[394] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[395] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[396] = new ModelRendererTurbo(this, 456, 58, textureX, textureY); // Lamp
		bodyModel[397] = new ModelRendererTurbo(this, 441, 58, textureX, textureY); // Lamp
		bodyModel[398] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[399] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[400] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[401] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[402] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[403] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[404] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[405] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[406] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[407] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[408] = new ModelRendererTurbo(this, 414, 59, textureX, textureY); // Lamp
		bodyModel[409] = new ModelRendererTurbo(this, 399, 59, textureX, textureY); // Lamp
		bodyModel[410] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[411] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[412] = new ModelRendererTurbo(this, 227, 251, textureX, textureY); // Du loco part41
		bodyModel[413] = new ModelRendererTurbo(this, 227, 251, textureX, textureY); // Du loco part41
		bodyModel[414] = new ModelRendererTurbo(this, 47, 351, textureX, textureY); // Du loco part05
		bodyModel[415] = new ModelRendererTurbo(this, 46, 352, textureX, textureY); // Du loco part05
		bodyModel[416] = new ModelRendererTurbo(this, 47, 352, textureX, textureY); // Du loco part05
		bodyModel[417] = new ModelRendererTurbo(this, 46, 351, textureX, textureY); // Du loco part05
		bodyModel[418] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[419] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[420] = new ModelRendererTurbo(this, 245, 233, textureX, textureY); // Du loco part06
		bodyModel[421] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[422] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[423] = new ModelRendererTurbo(this, 294, 233, textureX, textureY); // Du loco part06
		bodyModel[424] = new ModelRendererTurbo(this, 293, 233, textureX, textureY); // Du loco part06
		bodyModel[425] = new ModelRendererTurbo(this, 294, 233, textureX, textureY); // Du loco part06
		bodyModel[426] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[427] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[428] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[429] = new ModelRendererTurbo(this, 247, 233, textureX, textureY); // Du loco part06
		bodyModel[430] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[431] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[432] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[433] = new ModelRendererTurbo(this, 294, 233, textureX, textureY); // Du loco part06
		bodyModel[434] = new ModelRendererTurbo(this, 290, 233, textureX, textureY); // Du loco part06
		bodyModel[435] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Du loco part06
		bodyModel[436] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[437] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[438] = new ModelRendererTurbo(this, 248, 233, textureX, textureY); // Du loco part06
		bodyModel[439] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[440] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[441] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[442] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[443] = new ModelRendererTurbo(this, 294, 233, textureX, textureY); // Du loco part06
		bodyModel[444] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[445] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[446] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[447] = new ModelRendererTurbo(this, 244, 233, textureX, textureY); // Du loco part06
		bodyModel[448] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[449] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[450] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[451] = new ModelRendererTurbo(this, 286, 233, textureX, textureY); // Du loco part06
		bodyModel[452] = new ModelRendererTurbo(this, 293, 233, textureX, textureY); // Du loco part06
		bodyModel[453] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[454] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[455] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[456] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[457] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[458] = new ModelRendererTurbo(this, 162, 344, textureX, textureY); // Du loco part19
		bodyModel[459] = new ModelRendererTurbo(this, 120, 411, textureX, textureY); // Du loco part19
		bodyModel[460] = new ModelRendererTurbo(this, 211, 382, textureX, textureY); // Du loco part19
		bodyModel[461] = new ModelRendererTurbo(this, 125, 382, textureX, textureY); // Du loco part19
		bodyModel[462] = new ModelRendererTurbo(this, 158, 356, textureX, textureY); // Du loco part19
		bodyModel[463] = new ModelRendererTurbo(this, 127, 367, textureX, textureY); // Du loco part19
		bodyModel[464] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Du loco part19
		bodyModel[465] = new ModelRendererTurbo(this, 186, 371, textureX, textureY); // Du loco part19
		bodyModel[466] = new ModelRendererTurbo(this, 186, 356, textureX, textureY); // Du loco part19
		bodyModel[467] = new ModelRendererTurbo(this, 215, 367, textureX, textureY); // Du loco part19
		bodyModel[468] = new ModelRendererTurbo(this, 213, 345, textureX, textureY); // Du loco part19
		bodyModel[469] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[470] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[471] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[472] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[473] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[474] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[475] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[476] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[477] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[478] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[479] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[480] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[481] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[482] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[483] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[484] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[485] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[486] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[487] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[488] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[489] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[490] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[491] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[492] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[493] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[494] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[495] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[496] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[497] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[498] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[499] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05

		bodyModel[0].addShapeBox(0F, 0F, 0F, 66, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(5F, -7F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 60, 1, 22, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(8F, -12F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 120, 8, 0, 0F,0F, -4F, 0F, -60F, -4F, 0F, -60F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F); // Du loco part17
		bodyModel[2].setRotationPoint(8F, -15F, -6.15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 120, 8, 0, 0F,0F, -4F, 0F, -60F, -4F, 0F, -60F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F); // Du loco part27
		bodyModel[3].setRotationPoint(8F, -15F, 6.15F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[4].setRotationPoint(-6F, -9F, 4F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[5].setRotationPoint(-6F, -9F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[6].setRotationPoint(38F, -25F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[7].setRotationPoint(42F, -19F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[8].setRotationPoint(42F, -19F, -6F);
		bodyModel[8].rotateAngleY = -1.57079633F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[9].setRotationPoint(42F, -19F, -3F);
		bodyModel[9].rotateAngleY = -1.57079633F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[10].setRotationPoint(42F, -22F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[11].setRotationPoint(42F, -22F, -3F);
		bodyModel[11].rotateAngleY = -1.57079633F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[12].setRotationPoint(42F, -22F, -6F);
		bodyModel[12].rotateAngleY = -1.57079633F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[13].setRotationPoint(45F, -26F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[14].setRotationPoint(45F, -26F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[15].setRotationPoint(45F, -26F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[16].setRotationPoint(-2F, -15F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[17].setRotationPoint(-2F, -13F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[18].setRotationPoint(-5F, -9F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[19].setRotationPoint(-5F, -9F, 5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[20].setRotationPoint(45F, -22F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[21].setRotationPoint(44F, -21F, -4F);
		bodyModel[21].rotateAngleY = -1.57079633F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[22].setRotationPoint(43F, -21F, -4F);
		bodyModel[22].rotateAngleY = -1.57079633F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 19, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 138
		bodyModel[23].setRotationPoint(10F, -20F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[24].setRotationPoint(-6F, -8F, 4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[25].setRotationPoint(-6F, -10F, 4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[26].setRotationPoint(-6F, -8F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[27].setRotationPoint(-6F, -10F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[28].setRotationPoint(-3F, -8F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[29].setRotationPoint(5F, -11F, 6.05F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[30].setRotationPoint(-7F, -11F, 6.05F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[31].setRotationPoint(-19F, -11F, 6.05F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[32].setRotationPoint(-31F, -11F, 6.05F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[33].setRotationPoint(5F, -11F, -6.05F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[34].setRotationPoint(-7F, -11F, -6.05F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[35].setRotationPoint(-19F, -11F, -6.05F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[36].setRotationPoint(-31F, -11F, -6.05F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[37].setRotationPoint(3F, -11F, -9F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[38].setRotationPoint(6F, -11F, -9F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[39].setRotationPoint(3F, -11F, 8F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[40].setRotationPoint(6F, -11F, 8F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[41].setRotationPoint(3F, -5F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[42].setRotationPoint(3F, -8F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[43].setRotationPoint(3F, -5F, 9F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[44].setRotationPoint(3F, -8F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[45].setRotationPoint(-4F, -9F, -1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[46].setRotationPoint(2F, -16F, 10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[47].setRotationPoint(7F, -16F, 10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[48].setRotationPoint(43F, -10F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[49].setRotationPoint(44F, -11F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[50].setRotationPoint(49F, -11F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[51].setRotationPoint(68F, -16F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[52].setRotationPoint(73F, -16F, 10F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[53].setRotationPoint(81F, -9F, 4F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[54].setRotationPoint(81F, -9F, -7F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[55].setRotationPoint(78F, -9F, -6F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[56].setRotationPoint(78F, -9F, 5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[57].setRotationPoint(81F, -8F, 4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[58].setRotationPoint(81F, -10F, 4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[59].setRotationPoint(81F, -8F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[60].setRotationPoint(81F, -10F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[61].setRotationPoint(78F, -8F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[62].setRotationPoint(79F, -9F, -1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[63].setRotationPoint(51F, -25F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[64].setRotationPoint(48F, -19F, 4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[65].setRotationPoint(48F, -19F, 4F);
		bodyModel[65].rotateAngleY = -1.57079633F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[66].setRotationPoint(48F, -19F, 7F);
		bodyModel[66].rotateAngleY = -1.57079633F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[67].setRotationPoint(49F, -22F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[68].setRotationPoint(49F, -22F, 7F);
		bodyModel[68].rotateAngleY = -1.57079633F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[69].setRotationPoint(49F, -22F, 4F);
		bodyModel[69].rotateAngleY = -1.57079633F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[70].setRotationPoint(48F, -26F, 4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[71].setRotationPoint(48F, -26F, 3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[72].setRotationPoint(48F, -26F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[73].setRotationPoint(48F, -22F, 3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[74].setRotationPoint(50F, -21F, 6F);
		bodyModel[74].rotateAngleY = -1.57079633F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[75].setRotationPoint(49F, -21F, 6F);
		bodyModel[75].rotateAngleY = -1.57079633F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[76].setRotationPoint(9F, -11F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[77].setRotationPoint(20F, -9F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[78].setRotationPoint(8F, -9F, 8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[79].setRotationPoint(9F, -9F, 8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[80].setRotationPoint(20F, -11F, 8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[81].setRotationPoint(8F, -11F, 8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[82].setRotationPoint(8F, -10F, 8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[83].setRotationPoint(20F, -10F, 8F);

		bodyModel[84].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Du loco part06
		bodyModel[84].setRotationPoint(9F, -10F, 8F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[85].setRotationPoint(69F, -11F, -9F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[86].setRotationPoint(72F, -11F, -9F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[87].setRotationPoint(69F, -11F, 8F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[88].setRotationPoint(72F, -11F, 8F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[89].setRotationPoint(69F, -5F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[90].setRotationPoint(69F, -8F, -9F);

		bodyModel[91].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[91].setRotationPoint(69F, -5F, 9F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[92].setRotationPoint(69F, -8F, 8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[93].setRotationPoint(-2F, -25F, -6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 156
		bodyModel[94].setRotationPoint(-2F, -25F, 5F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[95].setRotationPoint(-2.25F, -27F, -5.75F);

		bodyModel[96].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[96].setRotationPoint(-1.75F, -27F, -6.25F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[97].setRotationPoint(-2.25F, -27F, 5.75F);

		bodyModel[98].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[98].setRotationPoint(-1.75F, -27F, 5.25F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[99].setRotationPoint(2F, -27F, 11.05F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[100].setRotationPoint(2F, -27F, -11.05F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[101].setRotationPoint(-2F, -11F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[102].setRotationPoint(38.5F, -27F, 9.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[103].setRotationPoint(40.5F, -34F, 8.25F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[104].setRotationPoint(46F, -10F, -10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[105].setRotationPoint(46F, -11F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[106].setRotationPoint(43F, -11F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[107].setRotationPoint(28F, -22F, -6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[108].setRotationPoint(28F, -21.25F, -6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[109].setRotationPoint(28F, -20.5F, -6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[110].setRotationPoint(28F, -19.75F, -6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[111].setRotationPoint(28F, -19F, -6F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[112].setRotationPoint(28F, -18.25F, -6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[113].setRotationPoint(28F, -17.5F, -6F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[114].setRotationPoint(28F, -16.75F, -6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[115].setRotationPoint(28F, -23.5F, -6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[116].setRotationPoint(28F, -22.75F, -6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[117].setRotationPoint(17F, -11F, -6.05F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[118].setRotationPoint(17F, -11F, 6.05F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[119].setRotationPoint(28F, -22F, 5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[120].setRotationPoint(28F, -21.25F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[121].setRotationPoint(28F, -20.5F, 5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[122].setRotationPoint(28F, -19.75F, 5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[123].setRotationPoint(28F, -19F, 5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[124].setRotationPoint(28F, -18.25F, 5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[125].setRotationPoint(28F, -17.5F, 5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[126].setRotationPoint(28F, -16.75F, 5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[127].setRotationPoint(28F, -23.5F, 5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[128].setRotationPoint(28F, -22.75F, 5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Du loco part41
		bodyModel[129].setRotationPoint(-2F, -8F, -9F);

		bodyModel[130].addBox(0F, 0F, 0F, 78, 4, 12, 0F); // Du loco part01
		bodyModel[130].setRotationPoint(-1F, -11F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[131].setRotationPoint(11F, -26F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 20, 6, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[132].setRotationPoint(37F, -18F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[133].setRotationPoint(37F, -25F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[134].setRotationPoint(37F, -25F, 10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[135].setRotationPoint(37F, -25F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[136].setRotationPoint(56F, -25F, -10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 20, 10, 3, 0F,-3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part19
		bodyModel[137].setRotationPoint(37F, -35F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 20, 10, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[138].setRotationPoint(37F, -35F, 8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 10, 10, 0F,-2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[139].setRotationPoint(37F, -35F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[140].setRotationPoint(-2F, -15F, 5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[141].setRotationPoint(-2F, -13F, 5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[142].setRotationPoint(77F, -15F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[143].setRotationPoint(77F, -13F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[144].setRotationPoint(77F, -15F, 5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[145].setRotationPoint(77F, -13F, 5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 10, 10, 0F,-3F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[146].setRotationPoint(37F, -35F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 10, 10, 0F,-1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part19
		bodyModel[147].setRotationPoint(53F, -35F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 10, 10, 0F,0F, 0F, -2F, -3F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part19
		bodyModel[148].setRotationPoint(53F, -35F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Du loco part05
		bodyModel[149].setRotationPoint(46F, -34F, 8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,-0.75F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -2.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F); // Du loco part05
		bodyModel[150].setRotationPoint(52.5F, -34F, 8F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,-2F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -1.75F, -2F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, -2.75F, -0.25F, -1.75F, -2.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part05
		bodyModel[151].setRotationPoint(38.5F, -34F, 8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Du loco part05
		bodyModel[152].setRotationPoint(41F, -34F, 8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,-3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[153].setRotationPoint(34F, -36F, -1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[154].setRotationPoint(38.25F, -33F, 1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -1F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -0.75F, -1F, -0.25F, -0.75F); // Du loco part05
		bodyModel[155].setRotationPoint(36.25F, -33F, 1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -1F, -2.25F, -0.25F, -1F, -0.75F, -0.25F, -1.75F, -2.25F, -0.25F, -1.75F, -2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[156].setRotationPoint(37F, -33F, 7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[157].setRotationPoint(36.75F, -29F, 1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part05
		bodyModel[158].setRotationPoint(38.25F, -33F, -8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -1F, -0.25F, -0.75F, -2F, -0.25F, -0.75F, -2F, -0.25F, 0F, -1F, -0.25F, 0F); // Du loco part05
		bodyModel[159].setRotationPoint(36.25F, -33F, -2F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-2.25F, -0.25F, -1F, -0.75F, -0.25F, -1F, -0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[160].setRotationPoint(37F, -33F, -9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part05
		bodyModel[161].setRotationPoint(36.75F, -29F, -9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[162].setRotationPoint(53.75F, -33F, 1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -2F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, -2F, -0.25F, -0.75F); // Du loco part05
		bodyModel[163].setRotationPoint(53.75F, -33F, 1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -2.25F, -0.25F, -1F, -0.75F, -0.25F, -1F, -2.25F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F); // Du loco part05
		bodyModel[164].setRotationPoint(53F, -33F, 7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[165].setRotationPoint(55.25F, -29F, 1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Du loco part05
		bodyModel[166].setRotationPoint(53.75F, -33F, -8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -2F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, -2F, -0.25F, 0F); // Du loco part05
		bodyModel[167].setRotationPoint(53.75F, -33F, -2F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-0.75F, -0.25F, -1F, -2.25F, -0.25F, -1F, -2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -1.75F, -2.25F, -0.25F, -1.75F); // Du loco part05
		bodyModel[168].setRotationPoint(53F, -33F, -9F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part05
		bodyModel[169].setRotationPoint(55.25F, -29F, -9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[170].setRotationPoint(46F, -34F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[171].setRotationPoint(41F, -34F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[172].setRotationPoint(25F, -16F, -6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[173].setRotationPoint(25F, -22F, -6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[174].setRotationPoint(25F, -21.25F, -6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[175].setRotationPoint(25F, -20.5F, -6F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[176].setRotationPoint(25F, -19.75F, -6F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[177].setRotationPoint(25F, -19F, -6F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[178].setRotationPoint(25F, -18.25F, -6F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[179].setRotationPoint(25F, -17.5F, -6F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[180].setRotationPoint(25F, -23.5F, -6F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[181].setRotationPoint(25F, -22.75F, -6F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[182].setRotationPoint(21F, -16F, -6F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[183].setRotationPoint(21F, -24F, -6F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[184].setRotationPoint(21F, -22F, -6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[185].setRotationPoint(21F, -21.25F, -6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[186].setRotationPoint(21F, -20.5F, -6F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[187].setRotationPoint(21F, -19.75F, -6F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[188].setRotationPoint(21F, -19F, -6F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[189].setRotationPoint(21F, -18.25F, -6F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[190].setRotationPoint(21F, -17.5F, -6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[191].setRotationPoint(21F, -16.75F, -6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[192].setRotationPoint(21F, -23.5F, -6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[193].setRotationPoint(21F, -22.75F, -6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[194].setRotationPoint(18F, -16F, -6F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[195].setRotationPoint(18F, -24F, -6F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[196].setRotationPoint(18F, -22F, -6F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[197].setRotationPoint(18F, -21.25F, -6F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[198].setRotationPoint(18F, -20.5F, -6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[199].setRotationPoint(18F, -19.75F, -6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[200].setRotationPoint(18F, -19F, -6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[201].setRotationPoint(18F, -18.25F, -6F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[202].setRotationPoint(18F, -17.5F, -6F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[203].setRotationPoint(18F, -16.75F, -6F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[204].setRotationPoint(18F, -23.5F, -6F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[205].setRotationPoint(18F, -22.75F, -6F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[206].setRotationPoint(15F, -16F, -6F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[207].setRotationPoint(15F, -24F, -6F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[208].setRotationPoint(15F, -22F, -6F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[209].setRotationPoint(15F, -21.25F, -6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[210].setRotationPoint(15F, -20.5F, -6F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[211].setRotationPoint(15F, -19.75F, -6F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[212].setRotationPoint(15F, -19F, -6F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[213].setRotationPoint(15F, -18.25F, -6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[214].setRotationPoint(15F, -17.5F, -6F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[215].setRotationPoint(15F, -16.75F, -6F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[216].setRotationPoint(15F, -23.5F, -6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[217].setRotationPoint(15F, -22.75F, -6F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[218].setRotationPoint(12F, -16F, -6F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[219].setRotationPoint(12F, -24F, -6F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[220].setRotationPoint(12F, -22F, -6F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[221].setRotationPoint(12F, -21.25F, -6F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[222].setRotationPoint(12F, -20.5F, -6F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[223].setRotationPoint(12F, -19.75F, -6F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[224].setRotationPoint(12F, -19F, -6F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[225].setRotationPoint(12F, -18.25F, -6F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[226].setRotationPoint(12F, -17.5F, -6F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[227].setRotationPoint(12F, -16.75F, -6F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[228].setRotationPoint(12F, -23.5F, -6F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[229].setRotationPoint(12F, -22.75F, -6F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[230].setRotationPoint(62F, -22F, -6F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[231].setRotationPoint(62F, -21.25F, -6F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[232].setRotationPoint(62F, -20.5F, -6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[233].setRotationPoint(62F, -19.75F, -6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[234].setRotationPoint(62F, -19F, -6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[235].setRotationPoint(62F, -18.25F, -6F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[236].setRotationPoint(62F, -17.5F, -6F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[237].setRotationPoint(62F, -16.75F, -6F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[238].setRotationPoint(62F, -23.5F, -6F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[239].setRotationPoint(62F, -22.75F, -6F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[240].setRotationPoint(71F, -22F, -6F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[241].setRotationPoint(71F, -21.25F, -6F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[242].setRotationPoint(71F, -20.5F, -6F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[243].setRotationPoint(71F, -19.75F, -6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[244].setRotationPoint(71F, -19F, -6F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[245].setRotationPoint(71F, -18.25F, -6F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[246].setRotationPoint(71F, -17.5F, -6F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[247].setRotationPoint(71F, -16.75F, -6F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[248].setRotationPoint(71F, -23.5F, -6F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[249].setRotationPoint(71F, -22.75F, -6F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 16, 1, 9, 0F,-3F, 0F, -2F, -3F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[250].setRotationPoint(39F, -36F, -9F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 16, 1, 9, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[251].setRotationPoint(39F, -36F, 0F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[252].setRotationPoint(24F, -23F, 5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[253].setRotationPoint(27F, -23F, 5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[254].setRotationPoint(25F, -16F, 5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[255].setRotationPoint(25F, -24F, 5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[256].setRotationPoint(25F, -22F, 5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[257].setRotationPoint(25F, -21.25F, 5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[258].setRotationPoint(25F, -20.5F, 5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[259].setRotationPoint(25F, -19.75F, 5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[260].setRotationPoint(25F, -19F, 5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[261].setRotationPoint(25F, -18.25F, 5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[262].setRotationPoint(25F, -17.5F, 5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[263].setRotationPoint(25F, -16.75F, 5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[264].setRotationPoint(25F, -23.5F, 5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[265].setRotationPoint(25F, -22.75F, 5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[266].setRotationPoint(21F, -22F, 5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[267].setRotationPoint(21F, -21.25F, 5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[268].setRotationPoint(21F, -20.5F, 5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[269].setRotationPoint(21F, -19.75F, 5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[270].setRotationPoint(21F, -19F, 5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[271].setRotationPoint(21F, -18.25F, 5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[272].setRotationPoint(21F, -17.5F, 5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[273].setRotationPoint(21F, -16.75F, 5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[274].setRotationPoint(21F, -23.5F, 5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[275].setRotationPoint(21F, -22.75F, 5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[276].setRotationPoint(18F, -22F, 5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[277].setRotationPoint(18F, -21.25F, 5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[278].setRotationPoint(18F, -20.5F, 5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[279].setRotationPoint(18F, -19.75F, 5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[280].setRotationPoint(18F, -19F, 5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[281].setRotationPoint(18F, -18.25F, 5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[282].setRotationPoint(18F, -17.5F, 5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[283].setRotationPoint(18F, -16.75F, 5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[284].setRotationPoint(18F, -23.5F, 5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[285].setRotationPoint(18F, -22.75F, 5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[286].setRotationPoint(15F, -22F, 5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[287].setRotationPoint(15F, -21.25F, 5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[288].setRotationPoint(15F, -20.5F, 5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[289].setRotationPoint(15F, -19.75F, 5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[290].setRotationPoint(15F, -19F, 5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[291].setRotationPoint(15F, -18.25F, 5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[292].setRotationPoint(15F, -17.5F, 5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[293].setRotationPoint(15F, -16.75F, 5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[294].setRotationPoint(15F, -23.5F, 5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[295].setRotationPoint(15F, -22.75F, 5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[296].setRotationPoint(11F, -23F, 5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[297].setRotationPoint(14F, -23F, 5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[298].setRotationPoint(12F, -16F, 5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[299].setRotationPoint(12F, -24F, 5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[300].setRotationPoint(12F, -22F, 5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[301].setRotationPoint(12F, -21.25F, 5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[302].setRotationPoint(12F, -20.5F, 5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[303].setRotationPoint(12F, -19.75F, 5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[304].setRotationPoint(12F, -19F, 5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[305].setRotationPoint(12F, -18.25F, 5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[306].setRotationPoint(12F, -17.5F, 5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[307].setRotationPoint(12F, -16.75F, 5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[308].setRotationPoint(12F, -23.5F, 5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[309].setRotationPoint(12F, -22.75F, 5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[310].setRotationPoint(62F, -16F, 5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[311].setRotationPoint(62F, -24F, 5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[312].setRotationPoint(62F, -22F, 5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[313].setRotationPoint(62F, -21.25F, 5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[314].setRotationPoint(62F, -20.5F, 5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[315].setRotationPoint(62F, -19.75F, 5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[316].setRotationPoint(62F, -19F, 5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[317].setRotationPoint(62F, -18.25F, 5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[318].setRotationPoint(62F, -17.5F, 5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[319].setRotationPoint(62F, -16.75F, 5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[320].setRotationPoint(62F, -23.5F, 5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[321].setRotationPoint(62F, -22.75F, 5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[322].setRotationPoint(71F, -22F, 5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[323].setRotationPoint(71F, -21.25F, 5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[324].setRotationPoint(71F, -20.5F, 5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[325].setRotationPoint(71F, -19.75F, 5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[326].setRotationPoint(71F, -19F, 5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[327].setRotationPoint(71F, -18.25F, 5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[328].setRotationPoint(71F, -17.5F, 5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[329].setRotationPoint(71F, -16.75F, 5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[330].setRotationPoint(71F, -23.5F, 5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[331].setRotationPoint(71F, -22.75F, 5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part05
		bodyModel[332].setRotationPoint(-2F, -23F, -5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[333].setRotationPoint(-2F, -23F, 4F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[334].setRotationPoint(-2F, -12.25F, -5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[335].setRotationPoint(-2F, -24F, -5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[336].setRotationPoint(-2F, -22F, -5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[337].setRotationPoint(-2F, -21.25F, -5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[338].setRotationPoint(-2F, -20.5F, -5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[339].setRotationPoint(-2F, -19.75F, -5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[340].setRotationPoint(-2F, -19F, -5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[341].setRotationPoint(-2F, -13F, -5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[342].setRotationPoint(-2F, -23.5F, -5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[343].setRotationPoint(-2F, -22.75F, -5F);

		bodyModel[344].addBox(0F, 0F, 0F, 13, 1, 10, 0F); // Du loco part19
		bodyModel[344].setRotationPoint(24F, -25F, -5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[345].setRotationPoint(-2F, -24F, -5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[346].setRotationPoint(-2F, -18.25F, -5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[347].setRotationPoint(-2F, -17.5F, -5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[348].setRotationPoint(-2F, -16.75F, -5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[349].setRotationPoint(-2F, -16F, -5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[350].setRotationPoint(-2F, -15.25F, -5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[351].setRotationPoint(-2F, -14.5F, -5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[352].setRotationPoint(-2F, -13.75F, -5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[353].setRotationPoint(2F, -16F, 8F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[354].setRotationPoint(31F, -20F, 10F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[355].setRotationPoint(-2F, -25F, 5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[356].setRotationPoint(-2F, -25F, -6F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part19
		bodyModel[357].setRotationPoint(34F, -36F, 0F);

		bodyModel[358].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Du loco part28
		bodyModel[358].setRotationPoint(32F, -20F, 10F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[359].setRotationPoint(31F, -20F, -11F);

		bodyModel[360].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Du loco part28
		bodyModel[360].setRotationPoint(32F, -20F, -11F);

		bodyModel[361].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[361].setRotationPoint(2F, -16F, 9F);

		bodyModel[362].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[362].setRotationPoint(8F, -16F, 10F);

		bodyModel[363].addBox(0F, 0F, 0F, 11, 1, 18, 0F); // Du loco part03
		bodyModel[363].setRotationPoint(-3F, -12F, -9F);

		bodyModel[364].addBox(0F, 0F, 0F, 11, 1, 18, 0F); // Du loco part03
		bodyModel[364].setRotationPoint(68F, -12F, -9F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[365].setRotationPoint(73F, -16F, 8F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[366].setRotationPoint(68F, -16F, 8F);

		bodyModel[367].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[367].setRotationPoint(68F, -16F, 9F);

		bodyModel[368].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[368].setRotationPoint(73F, -16F, 9F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 20, 14, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[369].setRotationPoint(57F, -26F, -6F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 20, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[370].setRotationPoint(57F, -26F, 5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 21, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[371].setRotationPoint(57F, -26F, -5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[372].setRotationPoint(77F, -25F, -5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[373].setRotationPoint(77F, -26F, 5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[374].setRotationPoint(77F, -26F, -6F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[375].setRotationPoint(2F, -16F, -11F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[376].setRotationPoint(7F, -16F, -11F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[377].setRotationPoint(68F, -16F, -11F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[378].setRotationPoint(73F, -16F, -11F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[379].setRotationPoint(7F, -16F, -9F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[380].setRotationPoint(2F, -16F, -9F);

		bodyModel[381].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[381].setRotationPoint(2F, -16F, -10F);

		bodyModel[382].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[382].setRotationPoint(7F, -16F, -10F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[383].setRotationPoint(73F, -16F, -9F);

		bodyModel[384].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[384].setRotationPoint(67F, -16F, -11F);

		bodyModel[385].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[385].setRotationPoint(73F, -16F, -10F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[386].setRotationPoint(-2.05F, -14F, 5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[387].setRotationPoint(-2.05F, -13F, 5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[388].setRotationPoint(-2.05F, -14F, -7F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[389].setRotationPoint(-2.05F, -13F, -7F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[390].setRotationPoint(-2.05F, -26F, -3F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[391].setRotationPoint(-2.05F, -25F, -3F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[392].setRotationPoint(-2.05F, -26F, -1F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[393].setRotationPoint(-2.05F, -25F, -1F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[394].setRotationPoint(-2.05F, -26F, 1F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[395].setRotationPoint(-2.05F, -25F, 1F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[396].setRotationPoint(-2F, -26F, -3F);

		bodyModel[397].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Lamp
		bodyModel[397].setRotationPoint(-2F, -25F, -3F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[398].setRotationPoint(78.05F, -14F, 5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[399].setRotationPoint(78.05F, -13F, 5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[400].setRotationPoint(78.05F, -14F, -7F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[401].setRotationPoint(78.05F, -13F, -7F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[402].setRotationPoint(78.05F, -27F, -3F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[403].setRotationPoint(78.05F, -26F, -3F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[404].setRotationPoint(78.05F, -27F, -1F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[405].setRotationPoint(78.05F, -26F, -1F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[406].setRotationPoint(78.05F, -27F, 1F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[407].setRotationPoint(78.05F, -26F, 1F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[408].setRotationPoint(77F, -27F, -3F);

		bodyModel[409].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Lamp
		bodyModel[409].setRotationPoint(77F, -26F, -3F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[410].setRotationPoint(9F, -19F, 10F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[411].setRotationPoint(66F, -19F, -11F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[412].setRotationPoint(78F, -11F, -9F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Du loco part41
		bodyModel[413].setRotationPoint(78F, -8F, -9F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[414].setRotationPoint(56F, -24F, -8F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[415].setRotationPoint(56F, -22F, -10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part05
		bodyModel[416].setRotationPoint(56F, -24F, -10F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[417].setRotationPoint(56F, -24F, -10F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[418].setRotationPoint(23F, -11F, 8F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[419].setRotationPoint(34F, -9F, 8F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[420].setRotationPoint(22F, -9F, 8F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[421].setRotationPoint(23F, -9F, 8F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[422].setRotationPoint(34F, -11F, 8F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[423].setRotationPoint(22F, -11F, 8F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[424].setRotationPoint(22F, -10F, 8F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[425].setRotationPoint(34F, -10F, 8F);

		bodyModel[426].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Du loco part06
		bodyModel[426].setRotationPoint(23F, -10F, 8F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[427].setRotationPoint(42F, -11F, 8F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[428].setRotationPoint(49F, -9F, 8F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[429].setRotationPoint(41F, -9F, 8F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[430].setRotationPoint(42F, -9F, 8F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[431].setRotationPoint(49F, -11F, 8F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[432].setRotationPoint(41F, -11F, 8F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[433].setRotationPoint(41F, -10F, 8F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[434].setRotationPoint(49F, -10F, 8F);

		bodyModel[435].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Du loco part06
		bodyModel[435].setRotationPoint(42F, -10F, 8F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[436].setRotationPoint(9F, -11F, -11F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[437].setRotationPoint(20F, -9F, -11F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[438].setRotationPoint(8F, -9F, -11F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[439].setRotationPoint(9F, -9F, -11F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[440].setRotationPoint(20F, -11F, -11F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[441].setRotationPoint(8F, -11F, -11F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[442].setRotationPoint(8F, -10F, -11F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[443].setRotationPoint(20F, -10F, -11F);

		bodyModel[444].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Du loco part06
		bodyModel[444].setRotationPoint(9F, -10F, -11F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[445].setRotationPoint(23F, -11F, -11F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[446].setRotationPoint(34F, -9F, -11F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[447].setRotationPoint(22F, -9F, -11F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[448].setRotationPoint(23F, -9F, -11F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[449].setRotationPoint(34F, -11F, -11F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[450].setRotationPoint(22F, -11F, -11F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[451].setRotationPoint(22F, -10F, -11F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[452].setRotationPoint(34F, -10F, -11F);

		bodyModel[453].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Du loco part06
		bodyModel[453].setRotationPoint(23F, -10F, -11F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -2.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[454].setRotationPoint(41F, -34F, -12F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -2.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[455].setRotationPoint(46F, -34F, -12F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1.5F, -0.75F, -1.25F, -1.5F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -2.25F, -0.5F, -0.75F, -2.25F, -0.5F); // Du loco part05
		bodyModel[456].setRotationPoint(41F, -34F, 9F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1.5F, -0.75F, -1.25F, -1.5F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -2.25F, -0.5F, -0.75F, -2.25F, -0.5F); // Du loco part05
		bodyModel[457].setRotationPoint(46F, -34F, 9F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 13, 1, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[458].setRotationPoint(-2F, -25F, -5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[459].setRotationPoint(0F, -26F, -1F);

		bodyModel[460].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Du loco part19
		bodyModel[460].setRotationPoint(11F, -26F, 1F);

		bodyModel[461].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Du loco part19
		bodyModel[461].setRotationPoint(11F, -26F, -5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[462].setRotationPoint(-1F, -25F, -6F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 13, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[463].setRotationPoint(24F, -25F, -6F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[464].setRotationPoint(-1F, -26F, -7F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[465].setRotationPoint(11F, -26F, 5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[466].setRotationPoint(-1F, -25F, 5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 13, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[467].setRotationPoint(24F, -25F, 5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[468].setRotationPoint(-1F, -26F, 6F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[469].setRotationPoint(9F, -22F, 6F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[470].setRotationPoint(9F, -21.25F, 6F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[471].setRotationPoint(9F, -20.5F, 6F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[472].setRotationPoint(9F, -19.75F, 6F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[473].setRotationPoint(9F, -19F, 6F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[474].setRotationPoint(9F, -18.25F, 6F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[475].setRotationPoint(9F, -17.5F, 6F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[476].setRotationPoint(9F, -16.75F, 6F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[477].setRotationPoint(9F, -23.5F, 6F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[478].setRotationPoint(9F, -22.75F, 6F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[479].setRotationPoint(6F, -22F, 6F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[480].setRotationPoint(6F, -21.25F, 6F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[481].setRotationPoint(6F, -20.5F, 6F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[482].setRotationPoint(6F, -19.75F, 6F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[483].setRotationPoint(6F, -19F, 6F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[484].setRotationPoint(6F, -18.25F, 6F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[485].setRotationPoint(6F, -17.5F, 6F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[486].setRotationPoint(6F, -16.75F, 6F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[487].setRotationPoint(6F, -23.5F, 6F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[488].setRotationPoint(6F, -22.75F, 6F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[489].setRotationPoint(3F, -22F, 6F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[490].setRotationPoint(3F, -21.25F, 6F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[491].setRotationPoint(3F, -20.5F, 6F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[492].setRotationPoint(3F, -19.75F, 6F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[493].setRotationPoint(3F, -19F, 6F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[494].setRotationPoint(3F, -18.25F, 6F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[495].setRotationPoint(3F, -17.5F, 6F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[496].setRotationPoint(3F, -16.75F, 6F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[497].setRotationPoint(3F, -23.5F, 6F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[498].setRotationPoint(3F, -22.75F, 6F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[499].setRotationPoint(-1F, -23F, 6F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[501] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[502] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[503] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[504] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[505] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[506] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[507] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[508] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[509] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[510] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[511] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[512] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[513] = new ModelRendererTurbo(this, 210, 339, textureX, textureY); // Du loco part19
		bodyModel[514] = new ModelRendererTurbo(this, 126, 339, textureX, textureY); // Du loco part19
		bodyModel[515] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[516] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[517] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[518] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[519] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[520] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[521] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[522] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[523] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[524] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[525] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[526] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[527] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[528] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[529] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[530] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[531] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[532] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[533] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[534] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[535] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[536] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[537] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[538] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[539] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[540] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[541] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[542] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[543] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[544] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[545] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[546] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[547] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[548] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[549] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[550] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[551] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[552] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[553] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[554] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[555] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[556] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 138
		bodyModel[557] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 138
		bodyModel[558] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[559] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[560] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[561] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[562] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[563] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[564] = new ModelRendererTurbo(this, 165, 395, textureX, textureY); // Du loco part19
		bodyModel[565] = new ModelRendererTurbo(this, 124, 395, textureX, textureY); // Du loco part19
		bodyModel[566] = new ModelRendererTurbo(this, 83, 356, textureX, textureY); // Du loco part41
		bodyModel[567] = new ModelRendererTurbo(this, 80, 351, textureX, textureY); // Du loco part41
		bodyModel[568] = new ModelRendererTurbo(this, 80, 354, textureX, textureY); // Du loco part41
		bodyModel[569] = new ModelRendererTurbo(this, 78, 351, textureX, textureY); // Du loco part41
		bodyModel[570] = new ModelRendererTurbo(this, 85, 350, textureX, textureY); // Du loco part41
		bodyModel[571] = new ModelRendererTurbo(this, 88, 352, textureX, textureY); // Du loco part41
		bodyModel[572] = new ModelRendererTurbo(this, 132, 309, textureX, textureY); // Du loco part28
		bodyModel[573] = new ModelRendererTurbo(this, 105, 311, textureX, textureY); // Du loco part28
		bodyModel[574] = new ModelRendererTurbo(this, 135, 309, textureX, textureY); // Du loco part28
		bodyModel[575] = new ModelRendererTurbo(this, 143, 312, textureX, textureY); // Du loco part28
		bodyModel[576] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[577] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[578] = new ModelRendererTurbo(this, 83, 356, textureX, textureY); // Du loco part41
		bodyModel[579] = new ModelRendererTurbo(this, 80, 351, textureX, textureY); // Du loco part41
		bodyModel[580] = new ModelRendererTurbo(this, 80, 354, textureX, textureY); // Du loco part41
		bodyModel[581] = new ModelRendererTurbo(this, 78, 351, textureX, textureY); // Du loco part41
		bodyModel[582] = new ModelRendererTurbo(this, 85, 350, textureX, textureY); // Du loco part41
		bodyModel[583] = new ModelRendererTurbo(this, 88, 352, textureX, textureY); // Du loco part41
		bodyModel[584] = new ModelRendererTurbo(this, 132, 309, textureX, textureY); // Du loco part28
		bodyModel[585] = new ModelRendererTurbo(this, 105, 311, textureX, textureY); // Du loco part28
		bodyModel[586] = new ModelRendererTurbo(this, 135, 309, textureX, textureY); // Du loco part28
		bodyModel[587] = new ModelRendererTurbo(this, 143, 312, textureX, textureY); // Du loco part28
		bodyModel[588] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[589] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[590] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[591] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[592] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[593] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[594] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[595] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[596] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[597] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[598] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[599] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[600] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[601] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[602] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[603] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[604] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[605] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[606] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[607] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[608] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[609] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[610] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[611] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[612] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[613] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[614] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[615] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[616] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[617] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[618] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[619] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[620] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[621] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[622] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[623] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[624] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[625] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[626] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[627] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[628] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[629] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[630] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[631] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[632] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[633] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[634] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[635] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[636] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[637] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[638] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[639] = new ModelRendererTurbo(this, 12, 340, textureX, textureY); // Du loco part05
		bodyModel[640] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[641] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[642] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[643] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[644] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[645] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[646] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[647] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[648] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[649] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[650] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[651] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[652] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[653] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[654] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[655] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[656] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[657] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[658] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[659] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[660] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[661] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[662] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[663] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[664] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[665] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[666] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[667] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[668] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[669] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[670] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[671] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[672] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[673] = new ModelRendererTurbo(this, 30, 357, textureX, textureY); // Du loco part05
		bodyModel[674] = new ModelRendererTurbo(this, 36, 357, textureX, textureY); // Du loco part05
		bodyModel[675] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[676] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[500].setRotationPoint(2F, -23F, 6F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[501].setRotationPoint(0F, -16F, 6F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[502].setRotationPoint(0F, -24F, 6F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[503].setRotationPoint(0F, -22F, 6F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[504].setRotationPoint(0F, -21.25F, 6F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[505].setRotationPoint(0F, -20.5F, 6F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[506].setRotationPoint(0F, -19.75F, 6F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[507].setRotationPoint(0F, -19F, 6F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[508].setRotationPoint(0F, -18.25F, 6F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[509].setRotationPoint(0F, -17.5F, 6F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[510].setRotationPoint(0F, -16.75F, 6F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[511].setRotationPoint(0F, -23.5F, 6F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[512].setRotationPoint(0F, -22.75F, 6F);

		bodyModel[513].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Du loco part19
		bodyModel[513].setRotationPoint(-1F, -26F, 2F);

		bodyModel[514].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Du loco part19
		bodyModel[514].setRotationPoint(-1F, -26F, -6F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[515].setRotationPoint(9F, -22F, -7F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[516].setRotationPoint(9F, -21.25F, -7F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[517].setRotationPoint(9F, -20.5F, -7F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[518].setRotationPoint(9F, -19.75F, -7F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[519].setRotationPoint(9F, -19F, -7F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[520].setRotationPoint(9F, -18.25F, -7F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[521].setRotationPoint(9F, -17.5F, -7F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[522].setRotationPoint(9F, -16.75F, -7F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[523].setRotationPoint(9F, -23.5F, -7F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[524].setRotationPoint(9F, -22.75F, -7F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[525].setRotationPoint(6F, -22F, -7F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[526].setRotationPoint(6F, -21.25F, -7F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[527].setRotationPoint(6F, -20.5F, -7F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[528].setRotationPoint(6F, -19.75F, -7F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[529].setRotationPoint(6F, -19F, -7F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[530].setRotationPoint(6F, -18.25F, -7F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[531].setRotationPoint(6F, -17.5F, -7F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[532].setRotationPoint(6F, -16.75F, -7F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[533].setRotationPoint(6F, -23.5F, -7F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[534].setRotationPoint(6F, -22.75F, -7F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[535].setRotationPoint(3F, -22F, -7F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[536].setRotationPoint(3F, -21.25F, -7F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[537].setRotationPoint(3F, -20.5F, -7F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[538].setRotationPoint(3F, -19.75F, -7F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[539].setRotationPoint(3F, -19F, -7F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[540].setRotationPoint(3F, -18.25F, -7F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[541].setRotationPoint(3F, -17.5F, -7F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[542].setRotationPoint(3F, -16.75F, -7F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[543].setRotationPoint(3F, -23.5F, -7F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[544].setRotationPoint(3F, -22.75F, -7F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[545].setRotationPoint(0F, -22F, -7F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[546].setRotationPoint(0F, -21.25F, -7F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[547].setRotationPoint(0F, -20.5F, -7F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[548].setRotationPoint(0F, -19.75F, -7F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[549].setRotationPoint(0F, -19F, -7F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[550].setRotationPoint(0F, -18.25F, -7F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[551].setRotationPoint(0F, -17.5F, -7F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[552].setRotationPoint(0F, -16.75F, -7F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[553].setRotationPoint(0F, -23.5F, -7F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[554].setRotationPoint(0F, -22.75F, -7F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[555].setRotationPoint(26F, -21F, -4F);

		bodyModel[556].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 138
		bodyModel[556].setRotationPoint(9.5F, -20.25F, 3F);

		bodyModel[557].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 138
		bodyModel[557].setRotationPoint(9.5F, -20.25F, -5F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[558].setRotationPoint(23.5F, -21F, -4F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[559].setRotationPoint(21F, -21F, -4F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[560].setRotationPoint(18.5F, -21F, -4F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[561].setRotationPoint(16F, -21F, -4F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[562].setRotationPoint(13.5F, -21F, -4F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[563].setRotationPoint(11F, -21F, -4F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 0, 22, 20, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -10F, 0F, 0.125F, -10F, 0F, -11.125F, 0F, 0F, -11.125F, 0F, 0F, -11.125F, -10F, 0F, -11.125F, -10F); // Du loco part19
		bodyModel[564].setRotationPoint(-2.05F, -23F, -5F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 0, 22, 20, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -10F, 0F, 0.125F, -10F, 0F, -11.125F, 0F, 0F, -11.125F, 0F, 0F, -11.125F, -10F, 0F, -11.125F, -10F); // Du loco part19
		bodyModel[565].setRotationPoint(78.05F, -23F, -5F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -2.875F, -1F, -1F, -2F, -1F, -1F, -4.875F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[566].setRotationPoint(-2F, -3F, -9F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[567].setRotationPoint(-2F, -5F, -9F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 0F, -1F, 0F, 0F, -1F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[568].setRotationPoint(-2F, -6F, -9F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, -1F, -4.875F, 0F, -1F, -2F, -1F, -1F, -2.875F, -1F, -1F); // Du loco part41
		bodyModel[569].setRotationPoint(-2F, -3F, 2F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[570].setRotationPoint(-2F, -5F, 2F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, -1F, -4.875F, 0F, -1F, -1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F); // Du loco part41
		bodyModel[571].setRotationPoint(-2F, -6F, 2F);

		bodyModel[572].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[572].setRotationPoint(2F, -4F, 6F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[573].setRotationPoint(2F, -7F, 4F);

		bodyModel[574].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[574].setRotationPoint(2F, -4F, -7F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part28
		bodyModel[575].setRotationPoint(2F, -7F, -7F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part28
		bodyModel[576].setRotationPoint(1F, -4F, -7F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F); // Du loco part28
		bodyModel[577].setRotationPoint(1F, -4F, 6F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, -2F, -1F, -1F, -2.875F, -1F, -1F, 0F, 0F, -1F, -4.875F, 0F, -1F); // Du loco part41
		bodyModel[578].setRotationPoint(74F, -3F, -9F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[579].setRotationPoint(74F, -5F, -9F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 0F, -1F, -4.875F, 0F, -1F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[580].setRotationPoint(74F, -6F, -9F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, -1F, 0F, 0F, -1F, -2.875F, -1F, -1F, -2F, -1F, -1F); // Du loco part41
		bodyModel[581].setRotationPoint(74F, -3F, 2F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[582].setRotationPoint(74F, -5F, 2F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, -1F, 0F, 0F, -1F, -3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F); // Du loco part41
		bodyModel[583].setRotationPoint(74F, -6F, 2F);

		bodyModel[584].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[584].setRotationPoint(73F, -4F, 6F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[585].setRotationPoint(73F, -7F, 4F);

		bodyModel[586].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[586].setRotationPoint(73F, -4F, -7F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part28
		bodyModel[587].setRotationPoint(73F, -7F, -7F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[588].setRotationPoint(75F, -4F, -7F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[589].setRotationPoint(75F, -4F, 6F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[590].setRotationPoint(14F, -23F, 5F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[591].setRotationPoint(17F, -23F, 5F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[592].setRotationPoint(17F, -23F, 5F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[593].setRotationPoint(20F, -23F, 5F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[594].setRotationPoint(20F, -23F, 5F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[595].setRotationPoint(23F, -23F, 5F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[596].setRotationPoint(15F, -16F, 5F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[597].setRotationPoint(15F, -24F, 5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[598].setRotationPoint(18F, -16F, 5F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[599].setRotationPoint(18F, -24F, 5F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[600].setRotationPoint(21F, -16F, 5F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[601].setRotationPoint(21F, -24F, 5F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[602].setRotationPoint(11F, -23F, -6F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[603].setRotationPoint(14F, -23F, -6F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[604].setRotationPoint(12F, -16F, -6F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[605].setRotationPoint(12F, -24F, -6F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[606].setRotationPoint(14F, -23F, -6F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[607].setRotationPoint(17F, -23F, -6F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[608].setRotationPoint(17F, -23F, -6F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[609].setRotationPoint(20F, -23F, -6F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[610].setRotationPoint(20F, -23F, -6F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[611].setRotationPoint(23F, -23F, -6F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[612].setRotationPoint(15F, -16F, -6F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[613].setRotationPoint(15F, -24F, -6F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[614].setRotationPoint(18F, -16F, -6F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[615].setRotationPoint(18F, -24F, -6F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[616].setRotationPoint(21F, -16F, -6F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[617].setRotationPoint(21F, -24F, -6F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[618].setRotationPoint(27F, -23F, 5F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[619].setRotationPoint(30F, -23F, 5F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[620].setRotationPoint(28F, -16F, 5F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[621].setRotationPoint(28F, -24F, 5F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[622].setRotationPoint(61F, -23F, 5F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[623].setRotationPoint(65F, -23F, 5F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[624].setRotationPoint(70F, -23F, 5F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[625].setRotationPoint(74F, -23F, 5F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[626].setRotationPoint(71F, -16F, 5F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[627].setRotationPoint(71F, -24F, 5F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[628].setRotationPoint(62F, -16F, -6F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[629].setRotationPoint(62F, -24F, -6F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[630].setRotationPoint(61F, -23F, -6F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[631].setRotationPoint(65F, -23F, -6F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[632].setRotationPoint(70F, -23F, -6F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[633].setRotationPoint(74F, -23F, -6F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[634].setRotationPoint(71F, -16F, -6F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[635].setRotationPoint(71F, -24F, -6F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[636].setRotationPoint(24F, -23F, -6F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[637].setRotationPoint(27F, -23F, -6F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[638].setRotationPoint(25F, -16F, -6F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[639].setRotationPoint(25F, -24F, -6F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[640].setRotationPoint(27F, -23F, -6F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[641].setRotationPoint(30F, -23F, -6F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[642].setRotationPoint(28F, -16F, -6F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[643].setRotationPoint(28F, -24F, -6F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[644].setRotationPoint(2F, -23F, 6F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[645].setRotationPoint(5F, -23F, 6F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[646].setRotationPoint(3F, -16F, 6F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[647].setRotationPoint(3F, -24F, 6F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[648].setRotationPoint(5F, -23F, 6F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[649].setRotationPoint(8F, -23F, 6F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[650].setRotationPoint(6F, -16F, 6F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[651].setRotationPoint(6F, -24F, 6F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[652].setRotationPoint(8F, -23F, 6F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[653].setRotationPoint(11F, -23F, 6F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[654].setRotationPoint(9F, -16F, 6F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[655].setRotationPoint(9F, -24F, 6F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[656].setRotationPoint(-1F, -23F, -7F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[657].setRotationPoint(0F, -16F, -7F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[658].setRotationPoint(0F, -24F, -7F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[659].setRotationPoint(2F, -23F, -7F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[660].setRotationPoint(5F, -23F, -7F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[661].setRotationPoint(3F, -16F, -7F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[662].setRotationPoint(3F, -24F, -7F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[663].setRotationPoint(5F, -23F, -7F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[664].setRotationPoint(8F, -23F, -7F);

		bodyModel[665].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[665].setRotationPoint(6F, -16F, -7F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[666].setRotationPoint(6F, -24F, -7F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[667].setRotationPoint(8F, -23F, -7F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[668].setRotationPoint(11F, -23F, -7F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[669].setRotationPoint(9F, -16F, -7F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[670].setRotationPoint(9F, -24F, -7F);

		bodyModel[671].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,-0.75F, -0.25F, -1.75F, -2F, -0.25F, -1.75F, -2F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -2.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[671].setRotationPoint(52.5F, -34F, -11F);

		bodyModel[672].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,-2F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F, -2.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F); // Du loco part05
		bodyModel[672].setRotationPoint(38.5F, -34F, -11F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[673].setRotationPoint(38.5F, -27F, -10.75F);

		bodyModel[674].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[674].setRotationPoint(40.5F, -34F, -9.25F);

		bodyModel[675].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[675].setRotationPoint(2F, -23F, -7F);

		bodyModel[676].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[676].setRotationPoint(25F, -16.75F, -6F);
	}
}