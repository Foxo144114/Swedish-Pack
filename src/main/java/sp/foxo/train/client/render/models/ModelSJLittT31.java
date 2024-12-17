//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera T31
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package sp.foxo.train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelSJLittT31 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittT31() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[541];

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
		bodyModel[37] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[38] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[39] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[40] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Du loco part47
		bodyModel[41] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[42] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Du loco part28
		bodyModel[43] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Du loco part47
		bodyModel[44] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Du loco part56
		bodyModel[45] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 154
		bodyModel[46] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 156
		bodyModel[47] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Du loco part47
		bodyModel[48] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Du loco part47
		bodyModel[49] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Du loco part47
		bodyModel[50] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Du loco part47
		bodyModel[51] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Du loco part47
		bodyModel[52] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Du loco part47
		bodyModel[53] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Du loco part28
		bodyModel[54] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Du loco part28
		bodyModel[55] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Du loco part28
		bodyModel[56] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Du loco part28
		bodyModel[57] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[58] = new ModelRendererTurbo(this, 98, 241, textureX, textureY); // Du loco part28
		bodyModel[59] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 156
		bodyModel[60] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 156
		bodyModel[61] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		bodyModel[62] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 154
		bodyModel[63] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 154
		bodyModel[64] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 154
		bodyModel[65] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Du loco part23
		bodyModel[66] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Du loco part23
		bodyModel[67] = new ModelRendererTurbo(this, 111, 247, textureX, textureY); // Du loco part41
		bodyModel[68] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[69] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[70] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[71] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[72] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[73] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[74] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[75] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[76] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[77] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[78] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[79] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[80] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[81] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[82] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[83] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[84] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[85] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[86] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[87] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[88] = new ModelRendererTurbo(this, 111, 247, textureX, textureY); // Du loco part41
		bodyModel[89] = new ModelRendererTurbo(this, 39, 309, textureX, textureY); // Du loco part01
		bodyModel[90] = new ModelRendererTurbo(this, 189, 371, textureX, textureY); // Du loco part19
		bodyModel[91] = new ModelRendererTurbo(this, 249, 357, textureX, textureY); // Du loco part19
		bodyModel[92] = new ModelRendererTurbo(this, 214, 435, textureX, textureY); // Du loco part19
		bodyModel[93] = new ModelRendererTurbo(this, 214, 435, textureX, textureY); // Du loco part19
		bodyModel[94] = new ModelRendererTurbo(this, 271, 392, textureX, textureY); // Du loco part19
		bodyModel[95] = new ModelRendererTurbo(this, 271, 392, textureX, textureY); // Du loco part19
		bodyModel[96] = new ModelRendererTurbo(this, 210, 421, textureX, textureY); // Du loco part19
		bodyModel[97] = new ModelRendererTurbo(this, 440, 55, textureX, textureY); // Lamp
		bodyModel[98] = new ModelRendererTurbo(this, 440, 60, textureX, textureY); // Lamp
		bodyModel[99] = new ModelRendererTurbo(this, 398, 56, textureX, textureY); // Lamp
		bodyModel[100] = new ModelRendererTurbo(this, 423, 61, textureX, textureY); // Lamp
		bodyModel[101] = new ModelRendererTurbo(this, 423, 56, textureX, textureY); // Lamp
		bodyModel[102] = new ModelRendererTurbo(this, 398, 61, textureX, textureY); // Lamp
		bodyModel[103] = new ModelRendererTurbo(this, 328, 421, textureX, textureY); // Du loco part19
		bodyModel[104] = new ModelRendererTurbo(this, 288, 393, textureX, textureY); // Du loco part19
		bodyModel[105] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[106] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[107] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[108] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[109] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[110] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[111] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[112] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[113] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[114] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[115] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[116] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[117] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[118] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[119] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[120] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[121] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[122] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[123] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[124] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[125] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[126] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[127] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[128] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[129] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[130] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[131] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[132] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[133] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[134] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[135] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[136] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[137] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[138] = new ModelRendererTurbo(this, 351, 383, textureX, textureY); // Du loco part19
		bodyModel[139] = new ModelRendererTurbo(this, 352, 381, textureX, textureY); // Du loco part19
		bodyModel[140] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[141] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[142] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[143] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[144] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[145] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[146] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[147] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[148] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[149] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[150] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[151] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[152] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[153] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[154] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[155] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[156] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[157] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[158] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[159] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[160] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[161] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[162] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[163] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[164] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[165] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[166] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[167] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[168] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[169] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[170] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[171] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[172] = new ModelRendererTurbo(this, 20, 384, textureX, textureY); // Du loco part05
		bodyModel[173] = new ModelRendererTurbo(this, 20, 384, textureX, textureY); // Du loco part05
		bodyModel[174] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[175] = new ModelRendererTurbo(this, 26, 379, textureX, textureY); // Du loco part05
		bodyModel[176] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[177] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[178] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[179] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[180] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[181] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[182] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[183] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[184] = new ModelRendererTurbo(this, 162, 387, textureX, textureY); // Du loco part19
		bodyModel[185] = new ModelRendererTurbo(this, 174, 399, textureX, textureY); // Du loco part19
		bodyModel[186] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[187] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[188] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[189] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[190] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[191] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[192] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[193] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[194] = new ModelRendererTurbo(this, 201, 339, textureX, textureY); // Du loco part19
		bodyModel[195] = new ModelRendererTurbo(this, 165, 339, textureX, textureY); // Du loco part19
		bodyModel[196] = new ModelRendererTurbo(this, 270, 393, textureX, textureY); // Du loco part19
		bodyModel[197] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part28
		bodyModel[198] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[199] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part28
		bodyModel[200] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[201] = new ModelRendererTurbo(this, 491, 73, textureX, textureY); // Du loco part28
		bodyModel[202] = new ModelRendererTurbo(this, 304, 332, textureX, textureY); // Du loco part19
		bodyModel[203] = new ModelRendererTurbo(this, 348, 332, textureX, textureY); // Du loco part19
		bodyModel[204] = new ModelRendererTurbo(this, 313, 347, textureX, textureY); // Du loco part19
		bodyModel[205] = new ModelRendererTurbo(this, 333, 308, textureX, textureY); // Du loco part19
		bodyModel[206] = new ModelRendererTurbo(this, 388, 331, textureX, textureY); // Du loco part19
		bodyModel[207] = new ModelRendererTurbo(this, 296, 331, textureX, textureY); // Du loco part19
		bodyModel[208] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part28
		bodyModel[209] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[210] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[211] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[212] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[213] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[214] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[215] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[216] = new ModelRendererTurbo(this, 460, 62, textureX, textureY); // Lamp
		bodyModel[217] = new ModelRendererTurbo(this, 445, 62, textureX, textureY); // Lamp
		bodyModel[218] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[219] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[220] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[221] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[222] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[223] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[224] = new ModelRendererTurbo(this, 418, 63, textureX, textureY); // Lamp
		bodyModel[225] = new ModelRendererTurbo(this, 403, 63, textureX, textureY); // Lamp
		bodyModel[226] = new ModelRendererTurbo(this, 223, 247, textureX, textureY); // Du loco part41
		bodyModel[227] = new ModelRendererTurbo(this, 223, 247, textureX, textureY); // Du loco part41
		bodyModel[228] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[229] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[230] = new ModelRendererTurbo(this, 247, 233, textureX, textureY); // Du loco part06
		bodyModel[231] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[232] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[233] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[234] = new ModelRendererTurbo(this, 294, 233, textureX, textureY); // Du loco part06
		bodyModel[235] = new ModelRendererTurbo(this, 290, 233, textureX, textureY); // Du loco part06
		bodyModel[236] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Du loco part06
		bodyModel[237] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[238] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[239] = new ModelRendererTurbo(this, 248, 233, textureX, textureY); // Du loco part06
		bodyModel[240] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[241] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[242] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[243] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[244] = new ModelRendererTurbo(this, 294, 233, textureX, textureY); // Du loco part06
		bodyModel[245] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[246] = new ModelRendererTurbo(this, 164, 344, textureX, textureY); // Du loco part19
		bodyModel[247] = new ModelRendererTurbo(this, 120, 411, textureX, textureY); // Du loco part19
		bodyModel[248] = new ModelRendererTurbo(this, 129, 387, textureX, textureY); // Du loco part19
		bodyModel[249] = new ModelRendererTurbo(this, 129, 387, textureX, textureY); // Du loco part19
		bodyModel[250] = new ModelRendererTurbo(this, 160, 356, textureX, textureY); // Du loco part19
		bodyModel[251] = new ModelRendererTurbo(this, 135, 367, textureX, textureY); // Du loco part19
		bodyModel[252] = new ModelRendererTurbo(this, 90, 392, textureX, textureY); // Du loco part19
		bodyModel[253] = new ModelRendererTurbo(this, 154, 371, textureX, textureY); // Du loco part19
		bodyModel[254] = new ModelRendererTurbo(this, 188, 356, textureX, textureY); // Du loco part19
		bodyModel[255] = new ModelRendererTurbo(this, 135, 367, textureX, textureY); // Du loco part19
		bodyModel[256] = new ModelRendererTurbo(this, 90, 392, textureX, textureY); // Du loco part19
		bodyModel[257] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[258] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[259] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[260] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[261] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[262] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[263] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[264] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[265] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[266] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[267] = new ModelRendererTurbo(this, 210, 338, textureX, textureY); // Du loco part19
		bodyModel[268] = new ModelRendererTurbo(this, 126, 338, textureX, textureY); // Du loco part19
		bodyModel[269] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[270] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[271] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[272] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[273] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[274] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[275] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[276] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[277] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[278] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[279] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[280] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 138
		bodyModel[281] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 138
		bodyModel[282] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[283] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[284] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[285] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[286] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[287] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[288] = new ModelRendererTurbo(this, 165, 395, textureX, textureY); // Du loco part19
		bodyModel[289] = new ModelRendererTurbo(this, 124, 395, textureX, textureY); // Du loco part19
		bodyModel[290] = new ModelRendererTurbo(this, 83, 356, textureX, textureY); // Du loco part41
		bodyModel[291] = new ModelRendererTurbo(this, 80, 351, textureX, textureY); // Du loco part41
		bodyModel[292] = new ModelRendererTurbo(this, 80, 354, textureX, textureY); // Du loco part41
		bodyModel[293] = new ModelRendererTurbo(this, 78, 351, textureX, textureY); // Du loco part41
		bodyModel[294] = new ModelRendererTurbo(this, 85, 350, textureX, textureY); // Du loco part41
		bodyModel[295] = new ModelRendererTurbo(this, 88, 352, textureX, textureY); // Du loco part41
		bodyModel[296] = new ModelRendererTurbo(this, 132, 309, textureX, textureY); // Du loco part28
		bodyModel[297] = new ModelRendererTurbo(this, 105, 311, textureX, textureY); // Du loco part28
		bodyModel[298] = new ModelRendererTurbo(this, 135, 309, textureX, textureY); // Du loco part28
		bodyModel[299] = new ModelRendererTurbo(this, 143, 312, textureX, textureY); // Du loco part28
		bodyModel[300] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[301] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[302] = new ModelRendererTurbo(this, 83, 356, textureX, textureY); // Du loco part41
		bodyModel[303] = new ModelRendererTurbo(this, 80, 351, textureX, textureY); // Du loco part41
		bodyModel[304] = new ModelRendererTurbo(this, 80, 354, textureX, textureY); // Du loco part41
		bodyModel[305] = new ModelRendererTurbo(this, 78, 351, textureX, textureY); // Du loco part41
		bodyModel[306] = new ModelRendererTurbo(this, 85, 350, textureX, textureY); // Du loco part41
		bodyModel[307] = new ModelRendererTurbo(this, 88, 352, textureX, textureY); // Du loco part41
		bodyModel[308] = new ModelRendererTurbo(this, 132, 309, textureX, textureY); // Du loco part28
		bodyModel[309] = new ModelRendererTurbo(this, 105, 311, textureX, textureY); // Du loco part28
		bodyModel[310] = new ModelRendererTurbo(this, 135, 309, textureX, textureY); // Du loco part28
		bodyModel[311] = new ModelRendererTurbo(this, 143, 312, textureX, textureY); // Du loco part28
		bodyModel[312] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[313] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[314] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[315] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[316] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[317] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[318] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[319] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[320] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[321] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[322] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[323] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[324] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[325] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[326] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[327] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[328] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[329] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[330] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[331] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[332] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[333] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[334] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[335] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[336] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[337] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[338] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[339] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[340] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[341] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[342] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[343] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[344] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[345] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[346] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[347] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[348] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[349] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[350] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[351] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[352] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[353] = new ModelRendererTurbo(this, 30, 357, textureX, textureY); // Du loco part05
		bodyModel[354] = new ModelRendererTurbo(this, 36, 357, textureX, textureY); // Du loco part05
		bodyModel[355] = new ModelRendererTurbo(this, 218, 361, textureX, textureY); // Du loco part19
		bodyModel[356] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[357] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[358] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[359] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[360] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[361] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[362] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[363] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[364] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[365] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[366] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[367] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[368] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[369] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[370] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[371] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[372] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[373] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[374] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[375] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[376] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[377] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[378] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[379] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[380] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[381] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[382] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[383] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[384] = new ModelRendererTurbo(this, 115, 392, textureX, textureY); // Du loco part19
		bodyModel[385] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[386] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[387] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[388] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[389] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[390] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[391] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[392] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[393] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[394] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[395] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[396] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[397] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[398] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[399] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[400] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[401] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[402] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[403] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[404] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[405] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[406] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[407] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[408] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[409] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[410] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[411] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[412] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[413] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[414] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[415] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[416] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[417] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[418] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[419] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[420] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[421] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[422] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[423] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[424] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[425] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[426] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[427] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[428] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[429] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[430] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[431] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[432] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[433] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[434] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[435] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[436] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[437] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[438] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[439] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[440] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[441] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[442] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[443] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[444] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[445] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[446] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[447] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[448] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[449] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[450] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[451] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[452] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[453] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[454] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[455] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[456] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[457] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[458] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[459] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[460] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[461] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[462] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[463] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[464] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[465] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[466] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[467] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[468] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[469] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[470] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[471] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[472] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[473] = new ModelRendererTurbo(this, 115, 392, textureX, textureY); // Du loco part19
		bodyModel[474] = new ModelRendererTurbo(this, 218, 361, textureX, textureY); // Du loco part19
		bodyModel[475] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[476] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[477] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[478] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[479] = new ModelRendererTurbo(this, 89, 407, textureX, textureY); // Du loco part19
		bodyModel[480] = new ModelRendererTurbo(this, 89, 407, textureX, textureY); // Du loco part19
		bodyModel[481] = new ModelRendererTurbo(this, 250, 423, textureX, textureY); // Du loco part19
		bodyModel[482] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[483] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[484] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[485] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[486] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[487] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[488] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[489] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[490] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[491] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[492] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[493] = new ModelRendererTurbo(this, 235, 454, textureX, textureY); // Du loco part19
		bodyModel[494] = new ModelRendererTurbo(this, 316, 421, textureX, textureY); // Du loco part19
		bodyModel[495] = new ModelRendererTurbo(this, 235, 454, textureX, textureY); // Du loco part19
		bodyModel[496] = new ModelRendererTurbo(this, 328, 421, textureX, textureY); // Du loco part19
		bodyModel[497] = new ModelRendererTurbo(this, 235, 454, textureX, textureY); // Du loco part19
		bodyModel[498] = new ModelRendererTurbo(this, 316, 421, textureX, textureY); // Du loco part19
		bodyModel[499] = new ModelRendererTurbo(this, 235, 454, textureX, textureY); // Du loco part19

		bodyModel[0].addShapeBox(0F, 0F, 0F, 52, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(13F, -7F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 68, 1, 22, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(4F, -12F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 120, 8, 0, 0F,0F, -4F, 0F, -60F, -4F, 0F, -60F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F); // Du loco part17
		bodyModel[2].setRotationPoint(15F, -15F, -6.15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 120, 8, 0, 0F,0F, -4F, 0F, -60F, -4F, 0F, -60F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F); // Du loco part27
		bodyModel[3].setRotationPoint(15F, -15F, 6.15F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[4].setRotationPoint(0F, -9F, 4F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[5].setRotationPoint(0F, -9F, -7F);

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
		bodyModel[16].setRotationPoint(5F, -15F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[17].setRotationPoint(5F, -13F, -7F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[18].setRotationPoint(1F, -9F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[19].setRotationPoint(1F, -9F, 5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[20].setRotationPoint(45F, -22F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[21].setRotationPoint(44F, -21F, -4F);
		bodyModel[21].rotateAngleY = -1.57079633F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[22].setRotationPoint(43F, -21F, -4F);
		bodyModel[22].rotateAngleY = -1.57079633F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 19, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 138
		bodyModel[23].setRotationPoint(14F, -20F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[24].setRotationPoint(0F, -8F, 4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[25].setRotationPoint(0F, -10F, 4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[26].setRotationPoint(0F, -8F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[27].setRotationPoint(0F, -10F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[28].setRotationPoint(3F, -8F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[29].setRotationPoint(12F, -11F, 6.05F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[30].setRotationPoint(-1F, -11F, 6.05F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[31].setRotationPoint(-12F, -11F, 6.05F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[32].setRotationPoint(-24F, -11F, 6.05F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[33].setRotationPoint(12F, -11F, -6.05F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[34].setRotationPoint(-1F, -11F, -6.05F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[35].setRotationPoint(-12F, -11F, -6.05F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[36].setRotationPoint(-24F, -11F, -6.05F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[37].setRotationPoint(5F, -11F, 10F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[38].setRotationPoint(8F, -11F, 10F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[39].setRotationPoint(5F, -8F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[40].setRotationPoint(2F, -9F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[41].setRotationPoint(4F, -16F, 10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[42].setRotationPoint(54F, -23F, 10F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[43].setRotationPoint(75F, -9F, 4F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[44].setRotationPoint(75F, -9F, -7F);

		bodyModel[45].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[45].setRotationPoint(72F, -9F, -6F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[46].setRotationPoint(72F, -9F, 5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[47].setRotationPoint(75F, -8F, 4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[48].setRotationPoint(75F, -10F, 4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[49].setRotationPoint(75F, -8F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[50].setRotationPoint(75F, -10F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[51].setRotationPoint(72F, -8F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[52].setRotationPoint(73F, -9F, -1F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[53].setRotationPoint(67F, -11F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[54].setRotationPoint(70F, -11F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[55].setRotationPoint(55F, -11F, 10F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[56].setRotationPoint(58F, -11F, 10F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[57].setRotationPoint(67F, -8F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[58].setRotationPoint(55F, -8F, 10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[59].setRotationPoint(5F, -25F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 156
		bodyModel[60].setRotationPoint(5F, -25F, 5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[61].setRotationPoint(4.75F, -27F, -5.75F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[62].setRotationPoint(5.25F, -27F, -6.25F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[63].setRotationPoint(4.75F, -27F, 5.75F);

		bodyModel[64].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[64].setRotationPoint(5.25F, -27F, 5.25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[65].setRotationPoint(0F, -23F, 11.05F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[66].setRotationPoint(0F, -23F, -11.05F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[67].setRotationPoint(4F, -11F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[68].setRotationPoint(7F, -19F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[69].setRotationPoint(7F, -18.25F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[70].setRotationPoint(7F, -17.5F, -6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[71].setRotationPoint(7F, -16.75F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[72].setRotationPoint(7F, -16F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[73].setRotationPoint(7F, -15.25F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[74].setRotationPoint(7F, -14.5F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[75].setRotationPoint(7F, -13.75F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[76].setRotationPoint(7F, -23.5F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[77].setRotationPoint(7F, -22.75F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[78].setRotationPoint(7F, -19F, 5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[79].setRotationPoint(7F, -18.25F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[80].setRotationPoint(7F, -17.5F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[81].setRotationPoint(7F, -16.75F, 5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[82].setRotationPoint(7F, -16F, 5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[83].setRotationPoint(7F, -15.25F, 5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[84].setRotationPoint(7F, -14.5F, 5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[85].setRotationPoint(7F, -13.75F, 5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[86].setRotationPoint(7F, -23.5F, 5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[87].setRotationPoint(7F, -22.75F, 5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[88].setRotationPoint(4F, -7F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 66, 4, 12, 0F); // Du loco part01
		bodyModel[89].setRotationPoint(5F, -11F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 16, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[90].setRotationPoint(16F, -26F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 14, 6, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[91].setRotationPoint(38F, -18F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[92].setRotationPoint(38F, -26F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[93].setRotationPoint(38F, -26F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[94].setRotationPoint(37F, -26F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[95].setRotationPoint(52F, -26F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part19
		bodyModel[96].setRotationPoint(38F, -32F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[97].setRotationPoint(5F, -15F, 5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[98].setRotationPoint(5F, -13F, 5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[99].setRotationPoint(70F, -15F, -7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[100].setRotationPoint(70F, -13F, -7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[101].setRotationPoint(70F, -15F, 5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[102].setRotationPoint(70F, -13F, 5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,-2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[103].setRotationPoint(37F, -32F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,-3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[104].setRotationPoint(34F, -36F, -1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -1.75F, 0F, -0.25F, -1.75F); // Du loco part05
		bodyModel[105].setRotationPoint(38F, -31F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[106].setRotationPoint(37F, -27F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, -0.75F, -0.25F, -1F); // Du loco part05
		bodyModel[107].setRotationPoint(44F, -31F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[108].setRotationPoint(28F, -22F, -7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[109].setRotationPoint(28F, -21.25F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[110].setRotationPoint(28F, -20.5F, -7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[111].setRotationPoint(28F, -19.75F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[112].setRotationPoint(28F, -19F, -7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[113].setRotationPoint(28F, -18.25F, -7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[114].setRotationPoint(28F, -17.5F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[115].setRotationPoint(28F, -16.75F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[116].setRotationPoint(28F, -23.5F, -7F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[117].setRotationPoint(28F, -22.75F, -7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[118].setRotationPoint(57F, -22F, -6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[119].setRotationPoint(57F, -21.25F, -6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[120].setRotationPoint(57F, -20.5F, -6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[121].setRotationPoint(57F, -19.75F, -6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[122].setRotationPoint(57F, -19F, -6F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[123].setRotationPoint(57F, -18.25F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[124].setRotationPoint(57F, -17.5F, -6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[125].setRotationPoint(57F, -16.75F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[126].setRotationPoint(57F, -23.5F, -6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[127].setRotationPoint(57F, -22.75F, -6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[128].setRotationPoint(63F, -22F, -6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[129].setRotationPoint(63F, -21.25F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[130].setRotationPoint(63F, -20.5F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[131].setRotationPoint(63F, -19.75F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[132].setRotationPoint(63F, -19F, -6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[133].setRotationPoint(63F, -18.25F, -6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[134].setRotationPoint(63F, -17.5F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[135].setRotationPoint(63F, -16.75F, -6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[136].setRotationPoint(63F, -23.5F, -6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[137].setRotationPoint(63F, -22.75F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,-3F, 0F, -2F, -3F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[138].setRotationPoint(38F, -33F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[139].setRotationPoint(38F, -33F, 7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[140].setRotationPoint(28F, -22F, 6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[141].setRotationPoint(28F, -21.25F, 6F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[142].setRotationPoint(28F, -20.5F, 6F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[143].setRotationPoint(28F, -19.75F, 6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[144].setRotationPoint(28F, -19F, 6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[145].setRotationPoint(28F, -18.25F, 6F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[146].setRotationPoint(28F, -17.5F, 6F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[147].setRotationPoint(28F, -16.75F, 6F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[148].setRotationPoint(28F, -23.5F, 6F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[149].setRotationPoint(28F, -22.75F, 6F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[150].setRotationPoint(57F, -16F, 5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[151].setRotationPoint(57F, -24F, 5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[152].setRotationPoint(57F, -22F, 5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[153].setRotationPoint(57F, -21.25F, 5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[154].setRotationPoint(57F, -20.5F, 5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[155].setRotationPoint(57F, -19.75F, 5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[156].setRotationPoint(57F, -19F, 5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[157].setRotationPoint(57F, -18.25F, 5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[158].setRotationPoint(57F, -17.5F, 5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[159].setRotationPoint(57F, -16.75F, 5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[160].setRotationPoint(57F, -23.5F, 5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[161].setRotationPoint(57F, -22.75F, 5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[162].setRotationPoint(63F, -22F, 5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[163].setRotationPoint(63F, -21.25F, 5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[164].setRotationPoint(63F, -20.5F, 5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[165].setRotationPoint(63F, -19.75F, 5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[166].setRotationPoint(63F, -19F, 5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[167].setRotationPoint(63F, -18.25F, 5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[168].setRotationPoint(63F, -17.5F, 5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[169].setRotationPoint(63F, -16.75F, 5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[170].setRotationPoint(63F, -23.5F, 5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[171].setRotationPoint(63F, -22.75F, 5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part05
		bodyModel[172].setRotationPoint(5F, -23F, -5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[173].setRotationPoint(5F, -23F, 4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[174].setRotationPoint(5F, -12.25F, -5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[175].setRotationPoint(5F, -24F, -5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[176].setRotationPoint(5F, -22F, -5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[177].setRotationPoint(5F, -21.25F, -5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[178].setRotationPoint(5F, -20.5F, -5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[179].setRotationPoint(5F, -19.75F, -5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[180].setRotationPoint(5F, -19F, -5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[181].setRotationPoint(5F, -13F, -5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[182].setRotationPoint(5F, -23.5F, -5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[183].setRotationPoint(5F, -22.75F, -5F);

		bodyModel[184].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Du loco part19
		bodyModel[184].setRotationPoint(32F, -25F, -5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[185].setRotationPoint(5F, -24F, -5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[186].setRotationPoint(5F, -18.25F, -5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[187].setRotationPoint(5F, -17.5F, -5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[188].setRotationPoint(5F, -16.75F, -5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[189].setRotationPoint(5F, -16F, -5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[190].setRotationPoint(5F, -15.25F, -5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[191].setRotationPoint(5F, -14.5F, -5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[192].setRotationPoint(5F, -13.75F, -5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[193].setRotationPoint(31F, -20F, 10F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[194].setRotationPoint(5F, -25F, 5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[195].setRotationPoint(5F, -25F, -6F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part19
		bodyModel[196].setRotationPoint(34F, -36F, 0F);

		bodyModel[197].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Du loco part28
		bodyModel[197].setRotationPoint(32F, -20F, 10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[198].setRotationPoint(31F, -20F, -11F);

		bodyModel[199].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Du loco part28
		bodyModel[199].setRotationPoint(32F, -20F, -11F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[200].setRotationPoint(4F, -16F, 9F);

		bodyModel[201].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Du loco part28
		bodyModel[201].setRotationPoint(52F, -23F, 10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 17, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[202].setRotationPoint(53F, -25F, -6F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 17, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[203].setRotationPoint(53F, -25F, 5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[204].setRotationPoint(53F, -25F, -5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[205].setRotationPoint(70F, -24F, -5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[206].setRotationPoint(70F, -25F, 5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[207].setRotationPoint(70F, -25F, -6F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[208].setRotationPoint(71F, -16F, -11F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[209].setRotationPoint(71F, -16F, -10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[210].setRotationPoint(4.95F, -14F, 5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[211].setRotationPoint(4.95F, -13F, 5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[212].setRotationPoint(4.95F, -14F, -7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[213].setRotationPoint(4.95F, -13F, -7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[214].setRotationPoint(4.95F, -26F, -1F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[215].setRotationPoint(4.95F, -25F, -1F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[216].setRotationPoint(5F, -26F, -1F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Lamp
		bodyModel[217].setRotationPoint(5F, -25F, -1F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[218].setRotationPoint(71.05F, -14F, 5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[219].setRotationPoint(71.05F, -13F, 5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[220].setRotationPoint(71.05F, -14F, -7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[221].setRotationPoint(71.05F, -13F, -7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[222].setRotationPoint(71.05F, -26F, -1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[223].setRotationPoint(71.05F, -25F, -1F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[224].setRotationPoint(70F, -26F, -1F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Lamp
		bodyModel[225].setRotationPoint(70F, -25F, -1F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[226].setRotationPoint(71F, -11F, -11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[227].setRotationPoint(71F, -7F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[228].setRotationPoint(54F, -11F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[229].setRotationPoint(61F, -9F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[230].setRotationPoint(53F, -9F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[231].setRotationPoint(54F, -9F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[232].setRotationPoint(61F, -11F, -11F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[233].setRotationPoint(53F, -11F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[234].setRotationPoint(53F, -10F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[235].setRotationPoint(61F, -10F, -11F);

		bodyModel[236].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Du loco part06
		bodyModel[236].setRotationPoint(54F, -10F, -11F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[237].setRotationPoint(9F, -11F, -11F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[238].setRotationPoint(20F, -9F, -11F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[239].setRotationPoint(8F, -9F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[240].setRotationPoint(9F, -9F, -11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[241].setRotationPoint(20F, -11F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[242].setRotationPoint(8F, -11F, -11F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[243].setRotationPoint(8F, -10F, -11F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[244].setRotationPoint(20F, -10F, -11F);

		bodyModel[245].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Du loco part06
		bodyModel[245].setRotationPoint(9F, -10F, -11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 11, 1, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[246].setRotationPoint(5F, -25F, -5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 31, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[247].setRotationPoint(6F, -26F, -1F);

		bodyModel[248].addBox(0F, 0F, 0F, 16, 1, 5, 0F); // Du loco part19
		bodyModel[248].setRotationPoint(16F, -26F, 1F);

		bodyModel[249].addBox(0F, 0F, 0F, 16, 1, 5, 0F); // Du loco part19
		bodyModel[249].setRotationPoint(16F, -26F, -6F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[250].setRotationPoint(6F, -25F, -6F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[251].setRotationPoint(32F, -25F, -6F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[252].setRotationPoint(6F, -26F, -7F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 16, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[253].setRotationPoint(16F, -26F, 6F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[254].setRotationPoint(6F, -25F, 5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[255].setRotationPoint(32F, -25F, 5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 11, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[256].setRotationPoint(6F, -26F, 6F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[257].setRotationPoint(13F, -22F, 6F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[258].setRotationPoint(13F, -21.25F, 6F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[259].setRotationPoint(13F, -20.5F, 6F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[260].setRotationPoint(13F, -19.75F, 6F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[261].setRotationPoint(13F, -19F, 6F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[262].setRotationPoint(13F, -18.25F, 6F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[263].setRotationPoint(13F, -17.5F, 6F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[264].setRotationPoint(13F, -16.75F, 6F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[265].setRotationPoint(13F, -23.5F, 6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[266].setRotationPoint(13F, -22.75F, 6F);

		bodyModel[267].addBox(0F, 0F, 0F, 11, 1, 5, 0F); // Du loco part19
		bodyModel[267].setRotationPoint(6F, -26F, 1F);

		bodyModel[268].addBox(0F, 0F, 0F, 11, 1, 5, 0F); // Du loco part19
		bodyModel[268].setRotationPoint(6F, -26F, -6F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[269].setRotationPoint(13F, -22F, -7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[270].setRotationPoint(13F, -21.25F, -7F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[271].setRotationPoint(13F, -20.5F, -7F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[272].setRotationPoint(13F, -19.75F, -7F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[273].setRotationPoint(13F, -19F, -7F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[274].setRotationPoint(13F, -18.25F, -7F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[275].setRotationPoint(13F, -17.5F, -7F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[276].setRotationPoint(13F, -16.75F, -7F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[277].setRotationPoint(13F, -23.5F, -7F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[278].setRotationPoint(13F, -22.75F, -7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[279].setRotationPoint(30F, -21F, -4F);

		bodyModel[280].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 138
		bodyModel[280].setRotationPoint(13.5F, -20.25F, 3F);

		bodyModel[281].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 138
		bodyModel[281].setRotationPoint(13.5F, -20.25F, -5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[282].setRotationPoint(27.5F, -21F, -4F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[283].setRotationPoint(25F, -21F, -4F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[284].setRotationPoint(22.5F, -21F, -4F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[285].setRotationPoint(20F, -21F, -4F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[286].setRotationPoint(17.5F, -21F, -4F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[287].setRotationPoint(15F, -21F, -4F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 0, 22, 20, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -10F, 0F, 0.125F, -10F, 0F, -11.125F, 0F, 0F, -11.125F, 0F, 0F, -11.125F, -10F, 0F, -11.125F, -10F); // Du loco part19
		bodyModel[288].setRotationPoint(4.95F, -23F, -5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 0, 22, 20, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -10F, 0F, 0.125F, -10F, 0F, -11.125F, 0F, 0F, -11.125F, 0F, 0F, -11.125F, -10F, 0F, -11.125F, -10F); // Du loco part19
		bodyModel[289].setRotationPoint(71.05F, -23F, -5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -2.875F, -1F, -1F, -2F, -1F, -1F, -4.875F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[290].setRotationPoint(2F, -3F, -9F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[291].setRotationPoint(2F, -5F, -9F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 0F, -1F, 0F, 0F, -1F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[292].setRotationPoint(2F, -6F, -9F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, -1F, -4.875F, 0F, -1F, -2F, -1F, -1F, -2.875F, -1F, -1F); // Du loco part41
		bodyModel[293].setRotationPoint(2F, -3F, 2F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[294].setRotationPoint(2F, -5F, 2F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, -1F, -4.875F, 0F, -1F, -1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F); // Du loco part41
		bodyModel[295].setRotationPoint(2F, -6F, 2F);

		bodyModel[296].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[296].setRotationPoint(6F, -4F, 6F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[297].setRotationPoint(6F, -7F, 4F);

		bodyModel[298].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[298].setRotationPoint(6F, -4F, -7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part28
		bodyModel[299].setRotationPoint(6F, -7F, -7F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part28
		bodyModel[300].setRotationPoint(5F, -4F, -7F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F); // Du loco part28
		bodyModel[301].setRotationPoint(5F, -4F, 6F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, -2F, -1F, -1F, -2.875F, -1F, -1F, 0F, 0F, -1F, -4.875F, 0F, -1F); // Du loco part41
		bodyModel[302].setRotationPoint(69F, -3F, -9F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[303].setRotationPoint(69F, -5F, -9F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 0F, -1F, -4.875F, 0F, -1F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[304].setRotationPoint(69F, -6F, -9F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, -1F, 0F, 0F, -1F, -2.875F, -1F, -1F, -2F, -1F, -1F); // Du loco part41
		bodyModel[305].setRotationPoint(69F, -3F, 2F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[306].setRotationPoint(69F, -5F, 2F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, -1F, 0F, 0F, -1F, -3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F); // Du loco part41
		bodyModel[307].setRotationPoint(69F, -6F, 2F);

		bodyModel[308].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[308].setRotationPoint(68F, -4F, 6F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[309].setRotationPoint(68F, -7F, 4F);

		bodyModel[310].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[310].setRotationPoint(68F, -4F, -7F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part28
		bodyModel[311].setRotationPoint(68F, -7F, -7F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[312].setRotationPoint(70F, -4F, -7F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[313].setRotationPoint(70F, -4F, 6F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[314].setRotationPoint(27F, -23F, 6F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[315].setRotationPoint(31F, -23F, 6F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[316].setRotationPoint(28F, -16F, 6F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[317].setRotationPoint(28F, -24F, 6F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[318].setRotationPoint(27F, -23F, -7F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[319].setRotationPoint(31F, -23F, -7F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[320].setRotationPoint(28F, -16F, -7F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[321].setRotationPoint(28F, -24F, -7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[322].setRotationPoint(6F, -23F, 5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[323].setRotationPoint(11F, -23F, 5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[324].setRotationPoint(7F, -13F, 5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[325].setRotationPoint(7F, -24F, 5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[326].setRotationPoint(56F, -23F, 5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[327].setRotationPoint(60F, -23F, 5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[328].setRotationPoint(62F, -23F, 5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[329].setRotationPoint(66F, -23F, 5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[330].setRotationPoint(63F, -16F, 5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[331].setRotationPoint(63F, -24F, 5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[332].setRotationPoint(57F, -16F, -6F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[333].setRotationPoint(57F, -24F, -6F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[334].setRotationPoint(56F, -23F, -6F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[335].setRotationPoint(60F, -23F, -6F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[336].setRotationPoint(62F, -23F, -6F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[337].setRotationPoint(66F, -23F, -6F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[338].setRotationPoint(63F, -16F, -6F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[339].setRotationPoint(63F, -24F, -6F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[340].setRotationPoint(6F, -23F, -6F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[341].setRotationPoint(11F, -23F, -6F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[342].setRotationPoint(7F, -13F, -6F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[343].setRotationPoint(7F, -24F, -6F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[344].setRotationPoint(12F, -23F, 6F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[345].setRotationPoint(16F, -23F, 6F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[346].setRotationPoint(13F, -16F, 6F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[347].setRotationPoint(13F, -24F, 6F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[348].setRotationPoint(12F, -23F, -7F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[349].setRotationPoint(16F, -23F, -7F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[350].setRotationPoint(13F, -16F, -7F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[351].setRotationPoint(13F, -24F, -7F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-1F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -1F, 0F, -0.25F, -1F); // Du loco part05
		bodyModel[352].setRotationPoint(39.5F, -31F, -11F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[353].setRotationPoint(39.5F, -27F, -11F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[354].setRotationPoint(40.5F, -31F, -10.25F);

		bodyModel[355].addBox(0F, 0F, 0F, 16, 3, 1, 0F); // Du loco part19
		bodyModel[355].setRotationPoint(16F, -15F, 5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[356].setRotationPoint(23F, -22F, 6F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[357].setRotationPoint(23F, -21.25F, 6F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[358].setRotationPoint(23F, -20.5F, 6F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[359].setRotationPoint(23F, -19.75F, 6F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[360].setRotationPoint(23F, -19F, 6F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[361].setRotationPoint(23F, -18.25F, 6F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[362].setRotationPoint(23F, -17.5F, 6F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[363].setRotationPoint(23F, -16.75F, 6F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[364].setRotationPoint(23F, -23.5F, 6F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[365].setRotationPoint(23F, -22.75F, 6F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[366].setRotationPoint(22F, -23F, 6F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[367].setRotationPoint(26F, -23F, 6F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[368].setRotationPoint(23F, -16F, 6F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[369].setRotationPoint(23F, -24F, 6F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[370].setRotationPoint(17F, -22F, 6F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[371].setRotationPoint(17F, -21.25F, 6F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[372].setRotationPoint(17F, -20.5F, 6F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[373].setRotationPoint(17F, -19.75F, 6F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[374].setRotationPoint(17F, -19F, 6F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[375].setRotationPoint(17F, -18.25F, 6F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[376].setRotationPoint(17F, -17.5F, 6F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[377].setRotationPoint(17F, -16.75F, 6F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[378].setRotationPoint(17F, -23.5F, 6F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[379].setRotationPoint(17F, -22.75F, 6F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[380].setRotationPoint(16F, -23F, 6F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[381].setRotationPoint(20F, -23F, 6F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[382].setRotationPoint(17F, -16F, 6F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[383].setRotationPoint(17F, -24F, 6F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[384].setRotationPoint(32F, -26F, 6F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[385].setRotationPoint(7F, -22F, 6F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[386].setRotationPoint(7F, -21.25F, 6F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[387].setRotationPoint(7F, -20.5F, 6F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[388].setRotationPoint(7F, -19.75F, 6F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[389].setRotationPoint(7F, -19F, 6F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[390].setRotationPoint(7F, -18.25F, 6F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[391].setRotationPoint(7F, -17.5F, 6F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[392].setRotationPoint(7F, -16.75F, 6F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[393].setRotationPoint(7F, -23.5F, 6F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[394].setRotationPoint(7F, -22.75F, 6F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[395].setRotationPoint(6F, -23F, 6F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[396].setRotationPoint(10F, -23F, 6F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[397].setRotationPoint(7F, -16F, 6F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[398].setRotationPoint(7F, -24F, 6F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[399].setRotationPoint(7F, -21.25F, 5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[400].setRotationPoint(7F, -20.5F, 5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[401].setRotationPoint(7F, -19.75F, 5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[402].setRotationPoint(7F, -22F, 5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[403].setRotationPoint(33F, -22F, 6F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[404].setRotationPoint(33F, -21.25F, 6F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[405].setRotationPoint(33F, -20.5F, 6F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[406].setRotationPoint(33F, -19.75F, 6F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[407].setRotationPoint(33F, -19F, 6F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[408].setRotationPoint(33F, -18.25F, 6F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[409].setRotationPoint(33F, -17.5F, 6F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[410].setRotationPoint(33F, -16.75F, 6F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[411].setRotationPoint(33F, -23.5F, 6F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[412].setRotationPoint(33F, -22.75F, 6F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[413].setRotationPoint(32F, -23F, 6F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[414].setRotationPoint(36F, -23F, 6F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[415].setRotationPoint(33F, -16F, 6F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[416].setRotationPoint(33F, -24F, 6F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[417].setRotationPoint(23F, -22F, -7F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[418].setRotationPoint(23F, -21.25F, -7F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[419].setRotationPoint(23F, -20.5F, -7F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[420].setRotationPoint(23F, -19.75F, -7F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[421].setRotationPoint(23F, -19F, -7F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[422].setRotationPoint(23F, -18.25F, -7F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[423].setRotationPoint(23F, -17.5F, -7F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[424].setRotationPoint(23F, -16.75F, -7F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[425].setRotationPoint(23F, -23.5F, -7F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[426].setRotationPoint(23F, -22.75F, -7F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[427].setRotationPoint(22F, -23F, -7F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[428].setRotationPoint(26F, -23F, -7F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[429].setRotationPoint(23F, -16F, -7F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[430].setRotationPoint(23F, -24F, -7F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[431].setRotationPoint(17F, -22F, -7F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[432].setRotationPoint(17F, -21.25F, -7F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[433].setRotationPoint(17F, -20.5F, -7F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[434].setRotationPoint(17F, -19.75F, -7F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[435].setRotationPoint(17F, -19F, -7F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[436].setRotationPoint(17F, -18.25F, -7F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[437].setRotationPoint(17F, -17.5F, -7F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[438].setRotationPoint(17F, -16.75F, -7F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[439].setRotationPoint(17F, -23.5F, -7F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[440].setRotationPoint(17F, -22.75F, -7F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[441].setRotationPoint(16F, -23F, -7F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[442].setRotationPoint(20F, -23F, -7F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[443].setRotationPoint(17F, -16F, -7F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[444].setRotationPoint(17F, -24F, -7F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[445].setRotationPoint(7F, -22F, -7F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[446].setRotationPoint(7F, -21.25F, -7F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[447].setRotationPoint(7F, -20.5F, -7F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[448].setRotationPoint(7F, -19.75F, -7F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[449].setRotationPoint(7F, -19F, -7F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[450].setRotationPoint(7F, -18.25F, -7F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[451].setRotationPoint(7F, -17.5F, -7F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[452].setRotationPoint(7F, -16.75F, -7F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[453].setRotationPoint(7F, -23.5F, -7F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[454].setRotationPoint(7F, -22.75F, -7F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[455].setRotationPoint(6F, -23F, -7F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[456].setRotationPoint(10F, -23F, -7F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[457].setRotationPoint(7F, -16F, -7F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[458].setRotationPoint(7F, -24F, -7F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[459].setRotationPoint(33F, -22F, -7F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[460].setRotationPoint(33F, -21.25F, -7F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[461].setRotationPoint(33F, -20.5F, -7F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[462].setRotationPoint(33F, -19.75F, -7F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[463].setRotationPoint(33F, -19F, -7F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[464].setRotationPoint(33F, -18.25F, -7F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[465].setRotationPoint(33F, -17.5F, -7F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[466].setRotationPoint(33F, -16.75F, -7F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[467].setRotationPoint(33F, -23.5F, -7F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[468].setRotationPoint(33F, -22.75F, -7F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[469].setRotationPoint(32F, -23F, -7F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[470].setRotationPoint(36F, -23F, -7F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[471].setRotationPoint(33F, -16F, -7F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[472].setRotationPoint(33F, -24F, -7F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[473].setRotationPoint(32F, -26F, -7F);

		bodyModel[474].addBox(0F, 0F, 0F, 16, 3, 1, 0F); // Du loco part19
		bodyModel[474].setRotationPoint(16F, -15F, -6F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[475].setRotationPoint(7F, -22F, -6F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[476].setRotationPoint(7F, -21.25F, -6F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[477].setRotationPoint(7F, -20.5F, -6F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[478].setRotationPoint(7F, -19.75F, -6F);

		bodyModel[479].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Du loco part19
		bodyModel[479].setRotationPoint(32F, -26F, 1F);

		bodyModel[480].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Du loco part19
		bodyModel[480].setRotationPoint(32F, -26F, -6F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[481].setRotationPoint(37F, -32F, -7F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.75F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, -1.75F, -0.25F, -1F); // Du loco part05
		bodyModel[482].setRotationPoint(48.5F, -31F, -11F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[483].setRotationPoint(37.75F, -31F, -9F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[484].setRotationPoint(37F, -31F, -8F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[485].setRotationPoint(37F, -31F, -6F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[486].setRotationPoint(38F, -31F, -6F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[487].setRotationPoint(37F, -27F, -6F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[488].setRotationPoint(37F, -31F, -2F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[489].setRotationPoint(37F, -31F, 1F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[490].setRotationPoint(38F, -31F, 1F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[491].setRotationPoint(37F, -27F, 1F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[492].setRotationPoint(37F, -31F, 5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[493].setRotationPoint(37F, -26F, -11F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[494].setRotationPoint(37F, -32F, 7F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[495].setRotationPoint(37F, -26F, 7F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[496].setRotationPoint(51F, -32F, -11F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[497].setRotationPoint(52F, -26F, -11F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[498].setRotationPoint(51F, -32F, 7F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[499].setRotationPoint(52F, -26F, 7F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 283, 423, textureX, textureY); // Du loco part19
		bodyModel[501] = new ModelRendererTurbo(this, 351, 379, textureX, textureY); // Du loco part19
		bodyModel[502] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[503] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[504] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[505] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[506] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[507] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[508] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[509] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[510] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[511] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[512] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[513] = new ModelRendererTurbo(this, 98, 241, textureX, textureY); // Du loco part28
		bodyModel[514] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part28
		bodyModel[515] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[516] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[517] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Du loco part28
		bodyModel[518] = new ModelRendererTurbo(this, 210, 421, textureX, textureY); // Du loco part19
		bodyModel[519] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[520] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[521] = new ModelRendererTurbo(this, 30, 357, textureX, textureY); // Du loco part05
		bodyModel[522] = new ModelRendererTurbo(this, 36, 357, textureX, textureY); // Du loco part05
		bodyModel[523] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[524] = new ModelRendererTurbo(this, 347, 380, textureX, textureY); // Du loco part19
		bodyModel[525] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[526] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[527] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[528] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[529] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[530] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[531] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[532] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[533] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[534] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[535] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[536] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[537] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[538] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[539] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[540] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05

		bodyModel[500].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[500].setRotationPoint(51F, -32F, -7F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F,-2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[501].setRotationPoint(38F, -34F, -7F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -1.75F, -1F, -0.25F, -1.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[502].setRotationPoint(38F, -31F, 8F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[503].setRotationPoint(37F, -27F, 7F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Du loco part05
		bodyModel[504].setRotationPoint(37.75F, -31F, 7F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[505].setRotationPoint(37F, -31F, 7F);

		bodyModel[506].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[506].setRotationPoint(28F, -11F, -11F);

		bodyModel[507].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[507].setRotationPoint(31F, -11F, -11F);

		bodyModel[508].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[508].setRotationPoint(28F, -8F, -11F);

		bodyModel[509].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[509].setRotationPoint(28F, -5F, -11F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[510].setRotationPoint(9F, -16F, 10F);

		bodyModel[511].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[511].setRotationPoint(9F, -16F, 9F);

		bodyModel[512].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[512].setRotationPoint(5F, -5F, 10F);

		bodyModel[513].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[513].setRotationPoint(55F, -5F, 10F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[514].setRotationPoint(66F, -16F, -11F);

		bodyModel[515].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[515].setRotationPoint(66F, -16F, -10F);

		bodyModel[516].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[516].setRotationPoint(67F, -5F, -11F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[517].setRotationPoint(59F, -20F, 10F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[518].setRotationPoint(38F, -32F, 9F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[519].setRotationPoint(44F, -31F, 9F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-1F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, 0F, -0.25F, -1F, -1.75F, -0.25F, -1F, -1.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[520].setRotationPoint(39.5F, -31F, 9F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[521].setRotationPoint(39.5F, -27F, 10F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[522].setRotationPoint(40.5F, -31F, 9.25F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -1.75F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Du loco part05
		bodyModel[523].setRotationPoint(48.5F, -31F, 9F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[524].setRotationPoint(38F, -34F, 0F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -1F, 0.25F, -0.25F, -1F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.75F, -1F, -0.25F, -1.75F); // Du loco part05
		bodyModel[525].setRotationPoint(51F, -31F, -10F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[526].setRotationPoint(52F, -27F, -10F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Du loco part05
		bodyModel[527].setRotationPoint(50.25F, -31F, -9F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Du loco part05
		bodyModel[528].setRotationPoint(51F, -31F, -8F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F); // Du loco part05
		bodyModel[529].setRotationPoint(51F, -31F, -6F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[530].setRotationPoint(51F, -31F, -6F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[531].setRotationPoint(52F, -27F, -6F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Du loco part05
		bodyModel[532].setRotationPoint(51F, -31F, -2F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F); // Du loco part05
		bodyModel[533].setRotationPoint(51F, -31F, 1F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[534].setRotationPoint(51F, -31F, 1F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[535].setRotationPoint(52F, -27F, 1F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Du loco part05
		bodyModel[536].setRotationPoint(51F, -31F, 5F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Du loco part05
		bodyModel[537].setRotationPoint(51F, -31F, 8F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[538].setRotationPoint(52F, -27F, 7F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Du loco part05
		bodyModel[539].setRotationPoint(50.25F, -31F, 7F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F); // Du loco part05
		bodyModel[540].setRotationPoint(51F, -31F, 7F);
	}
}