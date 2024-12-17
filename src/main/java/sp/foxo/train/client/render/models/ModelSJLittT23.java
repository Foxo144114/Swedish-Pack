//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera T23
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package sp.foxo.train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelSJLittT23 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittT23() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[456];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 39, 308, textureX, textureY); // Du loco part01
		bodyModel[1] = new ModelRendererTurbo(this, 43, 303, textureX, textureY); // Du loco part03
		bodyModel[2] = new ModelRendererTurbo(this, 39, 329, textureX, textureY); // Du loco part27
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part47
		bodyModel[4] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Du loco part56
		bodyModel[5] = new ModelRendererTurbo(this, 253, 37, textureX, textureY); // Du loco part82
		bodyModel[6] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part83
		bodyModel[7] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Du loco part84
		bodyModel[8] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part85
		bodyModel[9] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part94
		bodyModel[10] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Du loco part95
		bodyModel[11] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part97
		bodyModel[12] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part100
		bodyModel[13] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Du loco part101
		bodyModel[14] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Du loco part102
		bodyModel[15] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 154
		bodyModel[16] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 156
		bodyModel[17] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 177
		bodyModel[18] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 194
		bodyModel[19] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 195
		bodyModel[20] = new ModelRendererTurbo(this, 4, 6, textureX, textureY); // Box 138
		bodyModel[21] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Du loco part47
		bodyModel[22] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Du loco part47
		bodyModel[23] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Du loco part47
		bodyModel[24] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Du loco part47
		bodyModel[25] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Du loco part47
		bodyModel[26] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Du loco part28
		bodyModel[27] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part28
		bodyModel[28] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[29] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[30] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Du loco part28
		bodyModel[31] = new ModelRendererTurbo(this, 146, 74, textureX, textureY); // Du loco part28
		bodyModel[32] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part28
		bodyModel[33] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[34] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Du loco part47
		bodyModel[35] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[36] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[37] = new ModelRendererTurbo(this, 470, 78, textureX, textureY); // Du loco part28
		bodyModel[38] = new ModelRendererTurbo(this, 469, 78, textureX, textureY); // Du loco part28
		bodyModel[39] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Du loco part47
		bodyModel[40] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Du loco part56
		bodyModel[41] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 154
		bodyModel[42] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 156
		bodyModel[43] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Du loco part47
		bodyModel[44] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Du loco part47
		bodyModel[45] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Du loco part47
		bodyModel[46] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Du loco part47
		bodyModel[47] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Du loco part47
		bodyModel[48] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Du loco part47
		bodyModel[49] = new ModelRendererTurbo(this, 317, 213, textureX, textureY); // Du loco part82
		bodyModel[50] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Du loco part83
		bodyModel[51] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Du loco part84
		bodyModel[52] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Du loco part85
		bodyModel[53] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Du loco part94
		bodyModel[54] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Du loco part95
		bodyModel[55] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Du loco part97
		bodyModel[56] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Du loco part100
		bodyModel[57] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part101
		bodyModel[58] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Du loco part102
		bodyModel[59] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 177
		bodyModel[60] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 193
		bodyModel[61] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 196
		bodyModel[62] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Du loco part28
		bodyModel[63] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Du loco part28
		bodyModel[64] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Du loco part28
		bodyModel[65] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Du loco part28
		bodyModel[66] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Du loco part28
		bodyModel[67] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[68] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Du loco part28
		bodyModel[69] = new ModelRendererTurbo(this, 98, 241, textureX, textureY); // Du loco part28
		bodyModel[70] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 154
		bodyModel[71] = new ModelRendererTurbo(this, 115, 251, textureX, textureY); // Du loco part41
		bodyModel[72] = new ModelRendererTurbo(this, 29, 357, textureX, textureY); // Du loco part05
		bodyModel[73] = new ModelRendererTurbo(this, 36, 357, textureX, textureY); // Du loco part05
		bodyModel[74] = new ModelRendererTurbo(this, 115, 252, textureX, textureY); // Du loco part41
		bodyModel[75] = new ModelRendererTurbo(this, 39, 309, textureX, textureY); // Du loco part01
		bodyModel[76] = new ModelRendererTurbo(this, 91, 385, textureX, textureY); // Du loco part19
		bodyModel[77] = new ModelRendererTurbo(this, 245, 357, textureX, textureY); // Du loco part19
		bodyModel[78] = new ModelRendererTurbo(this, 316, 436, textureX, textureY); // Du loco part19
		bodyModel[79] = new ModelRendererTurbo(this, 316, 436, textureX, textureY); // Du loco part19
		bodyModel[80] = new ModelRendererTurbo(this, 293, 456, textureX, textureY); // Du loco part19
		bodyModel[81] = new ModelRendererTurbo(this, 242, 456, textureX, textureY); // Du loco part19
		bodyModel[82] = new ModelRendererTurbo(this, 208, 421, textureX, textureY); // Du loco part19
		bodyModel[83] = new ModelRendererTurbo(this, 316, 421, textureX, textureY); // Du loco part19
		bodyModel[84] = new ModelRendererTurbo(this, 287, 414, textureX, textureY); // Du loco part19
		bodyModel[85] = new ModelRendererTurbo(this, 257, 414, textureX, textureY); // Du loco part19
		bodyModel[86] = new ModelRendererTurbo(this, 287, 435, textureX, textureY); // Du loco part19
		bodyModel[87] = new ModelRendererTurbo(this, 257, 435, textureX, textureY); // Du loco part19
		bodyModel[88] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[89] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[90] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[91] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[92] = new ModelRendererTurbo(this, 43, 351, textureX, textureY); // Du loco part05
		bodyModel[93] = new ModelRendererTurbo(this, 45, 352, textureX, textureY); // Du loco part05
		bodyModel[94] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[95] = new ModelRendererTurbo(this, 41, 350, textureX, textureY); // Du loco part05
		bodyModel[96] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[97] = new ModelRendererTurbo(this, 44, 352, textureX, textureY); // Du loco part05
		bodyModel[98] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[99] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[100] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[101] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[102] = new ModelRendererTurbo(this, 214, 403, textureX, textureY); // Du loco part19
		bodyModel[103] = new ModelRendererTurbo(this, 308, 403, textureX, textureY); // Du loco part19
		bodyModel[104] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[105] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[106] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[107] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[108] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[109] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[110] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[111] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[112] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[113] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[114] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[115] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[116] = new ModelRendererTurbo(this, 6, 345, textureX, textureY); // Du loco part05
		bodyModel[117] = new ModelRendererTurbo(this, 6, 345, textureX, textureY); // Du loco part05
		bodyModel[118] = new ModelRendererTurbo(this, 26, 378, textureX, textureY); // Du loco part05
		bodyModel[119] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[120] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[121] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[122] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[123] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[124] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[125] = new ModelRendererTurbo(this, 26, 378, textureX, textureY); // Du loco part05
		bodyModel[126] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[127] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[128] = new ModelRendererTurbo(this, 191, 439, textureX, textureY); // Du loco part19
		bodyModel[129] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[130] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[131] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[132] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[133] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[134] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[135] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[136] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[137] = new ModelRendererTurbo(this, 201, 339, textureX, textureY); // Du loco part19
		bodyModel[138] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[139] = new ModelRendererTurbo(this, 477, 63, textureX, textureY); // Du loco part28
		bodyModel[140] = new ModelRendererTurbo(this, 90, 308, textureX, textureY); // Du loco part03
		bodyModel[141] = new ModelRendererTurbo(this, 77, 308, textureX, textureY); // Du loco part03
		bodyModel[142] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[143] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[144] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[145] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[146] = new ModelRendererTurbo(this, 327, 299, textureX, textureY); // Du loco part19
		bodyModel[147] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[148] = new ModelRendererTurbo(this, 325, 56, textureX, textureY); // Du loco part28
		bodyModel[149] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[150] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[151] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[152] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[153] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[154] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[155] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[156] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[157] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[158] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[159] = new ModelRendererTurbo(this, 451, 27, textureX, textureY); // Lamp
		bodyModel[160] = new ModelRendererTurbo(this, 132, 40, textureX, textureY); // Lamp
		bodyModel[161] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[162] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[163] = new ModelRendererTurbo(this, 456, 58, textureX, textureY); // Lamp
		bodyModel[164] = new ModelRendererTurbo(this, 441, 58, textureX, textureY); // Lamp
		bodyModel[165] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[166] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[167] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[168] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[169] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[170] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[171] = new ModelRendererTurbo(this, 451, 27, textureX, textureY); // Lamp
		bodyModel[172] = new ModelRendererTurbo(this, 132, 40, textureX, textureY); // Lamp
		bodyModel[173] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[174] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[175] = new ModelRendererTurbo(this, 414, 59, textureX, textureY); // Lamp
		bodyModel[176] = new ModelRendererTurbo(this, 399, 59, textureX, textureY); // Lamp
		bodyModel[177] = new ModelRendererTurbo(this, 227, 251, textureX, textureY); // Du loco part41
		bodyModel[178] = new ModelRendererTurbo(this, 227, 251, textureX, textureY); // Du loco part41
		bodyModel[179] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[180] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[181] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[182] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[183] = new ModelRendererTurbo(this, 69, 445, textureX, textureY); // Du loco part19
		bodyModel[184] = new ModelRendererTurbo(this, 148, 350, textureX, textureY); // Du loco part19
		bodyModel[185] = new ModelRendererTurbo(this, 156, 367, textureX, textureY); // Du loco part19
		bodyModel[186] = new ModelRendererTurbo(this, 148, 350, textureX, textureY); // Du loco part19
		bodyModel[187] = new ModelRendererTurbo(this, 127, 367, textureX, textureY); // Du loco part19
		bodyModel[188] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[189] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 138
		bodyModel[190] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 138
		bodyModel[191] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[192] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[193] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[194] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[195] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[196] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[197] = new ModelRendererTurbo(this, 124, 395, textureX, textureY); // Du loco part19
		bodyModel[198] = new ModelRendererTurbo(this, 83, 356, textureX, textureY); // Du loco part41
		bodyModel[199] = new ModelRendererTurbo(this, 80, 351, textureX, textureY); // Du loco part41
		bodyModel[200] = new ModelRendererTurbo(this, 80, 354, textureX, textureY); // Du loco part41
		bodyModel[201] = new ModelRendererTurbo(this, 78, 351, textureX, textureY); // Du loco part41
		bodyModel[202] = new ModelRendererTurbo(this, 85, 350, textureX, textureY); // Du loco part41
		bodyModel[203] = new ModelRendererTurbo(this, 88, 352, textureX, textureY); // Du loco part41
		bodyModel[204] = new ModelRendererTurbo(this, 132, 309, textureX, textureY); // Du loco part28
		bodyModel[205] = new ModelRendererTurbo(this, 105, 311, textureX, textureY); // Du loco part28
		bodyModel[206] = new ModelRendererTurbo(this, 135, 309, textureX, textureY); // Du loco part28
		bodyModel[207] = new ModelRendererTurbo(this, 143, 312, textureX, textureY); // Du loco part28
		bodyModel[208] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[209] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[210] = new ModelRendererTurbo(this, 83, 356, textureX, textureY); // Du loco part41
		bodyModel[211] = new ModelRendererTurbo(this, 80, 351, textureX, textureY); // Du loco part41
		bodyModel[212] = new ModelRendererTurbo(this, 80, 354, textureX, textureY); // Du loco part41
		bodyModel[213] = new ModelRendererTurbo(this, 78, 351, textureX, textureY); // Du loco part41
		bodyModel[214] = new ModelRendererTurbo(this, 85, 350, textureX, textureY); // Du loco part41
		bodyModel[215] = new ModelRendererTurbo(this, 88, 352, textureX, textureY); // Du loco part41
		bodyModel[216] = new ModelRendererTurbo(this, 132, 309, textureX, textureY); // Du loco part28
		bodyModel[217] = new ModelRendererTurbo(this, 105, 311, textureX, textureY); // Du loco part28
		bodyModel[218] = new ModelRendererTurbo(this, 135, 309, textureX, textureY); // Du loco part28
		bodyModel[219] = new ModelRendererTurbo(this, 143, 312, textureX, textureY); // Du loco part28
		bodyModel[220] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[221] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[222] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[223] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[224] = new ModelRendererTurbo(this, 42, 354, textureX, textureY); // Du loco part05
		bodyModel[225] = new ModelRendererTurbo(this, 40, 355, textureX, textureY); // Du loco part05
		bodyModel[226] = new ModelRendererTurbo(this, 45, 351, textureX, textureY); // Du loco part05
		bodyModel[227] = new ModelRendererTurbo(this, 44, 352, textureX, textureY); // Du loco part05
		bodyModel[228] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[229] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[230] = new ModelRendererTurbo(this, 29, 357, textureX, textureY); // Du loco part05
		bodyModel[231] = new ModelRendererTurbo(this, 34, 357, textureX, textureY); // Du loco part05
		bodyModel[232] = new ModelRendererTurbo(this, 43, 304, textureX, textureY); // Du loco part03
		bodyModel[233] = new ModelRendererTurbo(this, 70, 443, textureX, textureY); // Du loco part19
		bodyModel[234] = new ModelRendererTurbo(this, 120, 411, textureX, textureY); // Du loco part19
		bodyModel[235] = new ModelRendererTurbo(this, 442, 59, textureX, textureY); // Lamp
		bodyModel[236] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[237] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[238] = new ModelRendererTurbo(this, 69, 444, textureX, textureY); // Du loco part19
		bodyModel[239] = new ModelRendererTurbo(this, 70, 447, textureX, textureY); // Du loco part19
		bodyModel[240] = new ModelRendererTurbo(this, 106, 385, textureX, textureY); // Du loco part19
		bodyModel[241] = new ModelRendererTurbo(this, 442, 59, textureX, textureY); // Lamp
		bodyModel[242] = new ModelRendererTurbo(this, 214, 434, textureX, textureY); // Du loco part19
		bodyModel[243] = new ModelRendererTurbo(this, 223, 434, textureX, textureY); // Du loco part19
		bodyModel[244] = new ModelRendererTurbo(this, 268, 393, textureX, textureY); // Du loco part19
		bodyModel[245] = new ModelRendererTurbo(this, 121, 385, textureX, textureY); // Du loco part19
		bodyModel[246] = new ModelRendererTurbo(this, 136, 385, textureX, textureY); // Du loco part19
		bodyModel[247] = new ModelRendererTurbo(this, 151, 385, textureX, textureY); // Du loco part19
		bodyModel[248] = new ModelRendererTurbo(this, 166, 385, textureX, textureY); // Du loco part19
		bodyModel[249] = new ModelRendererTurbo(this, 181, 385, textureX, textureY); // Du loco part19
		bodyModel[250] = new ModelRendererTurbo(this, 196, 385, textureX, textureY); // Du loco part19
		bodyModel[251] = new ModelRendererTurbo(this, 43, 351, textureX, textureY); // Du loco part05
		bodyModel[252] = new ModelRendererTurbo(this, 45, 352, textureX, textureY); // Du loco part05
		bodyModel[253] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[254] = new ModelRendererTurbo(this, 41, 350, textureX, textureY); // Du loco part05
		bodyModel[255] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[256] = new ModelRendererTurbo(this, 44, 352, textureX, textureY); // Du loco part05
		bodyModel[257] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[258] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[259] = new ModelRendererTurbo(this, 201, 339, textureX, textureY); // Du loco part19
		bodyModel[260] = new ModelRendererTurbo(this, 376, 331, textureX, textureY); // Du loco part19
		bodyModel[261] = new ModelRendererTurbo(this, 84, 444, textureX, textureY); // Du loco part19
		bodyModel[262] = new ModelRendererTurbo(this, 313, 331, textureX, textureY); // Du loco part19
		bodyModel[263] = new ModelRendererTurbo(this, 88, 444, textureX, textureY); // Du loco part19
		bodyModel[264] = new ModelRendererTurbo(this, 89, 445, textureX, textureY); // Du loco part19
		bodyModel[265] = new ModelRendererTurbo(this, 87, 444, textureX, textureY); // Du loco part19
		bodyModel[266] = new ModelRendererTurbo(this, 90, 446, textureX, textureY); // Du loco part19
		bodyModel[267] = new ModelRendererTurbo(this, 308, 331, textureX, textureY); // Du loco part19
		bodyModel[268] = new ModelRendererTurbo(this, 112, 442, textureX, textureY); // Du loco part19
		bodyModel[269] = new ModelRendererTurbo(this, 42, 302, textureX, textureY); // Du loco part03
		bodyModel[270] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[271] = new ModelRendererTurbo(this, 39, 329, textureX, textureY); // Du loco part27
		bodyModel[272] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Du loco part23
		bodyModel[273] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[274] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[275] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[276] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[277] = new ModelRendererTurbo(this, 345, 331, textureX, textureY); // Du loco part19
		bodyModel[278] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[279] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[280] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[281] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[282] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[283] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[284] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[285] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[286] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[287] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[288] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[289] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[290] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[291] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[292] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[293] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[294] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[295] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[296] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[297] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[298] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[299] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[300] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[301] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[302] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[303] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[304] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[305] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[306] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[307] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[308] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[309] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[310] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[311] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[312] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[313] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[314] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[315] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[316] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[317] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[318] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[319] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[320] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[321] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[322] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[323] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[324] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[325] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[326] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[327] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[328] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[329] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[330] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[331] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[332] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[333] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[334] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[335] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[336] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[337] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[338] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[339] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[340] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[341] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[342] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[343] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[344] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[345] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[346] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[347] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[348] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[349] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[350] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[351] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[352] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[353] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[354] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[355] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[356] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[357] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[358] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[359] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[360] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[361] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[362] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[363] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[364] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[365] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[366] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[367] = new ModelRendererTurbo(this, 1, 347, textureX, textureY); // Du loco part05
		bodyModel[368] = new ModelRendererTurbo(this, 1, 347, textureX, textureY); // Du loco part05
		bodyModel[369] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[370] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[371] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[372] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[373] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[374] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[375] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[376] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[377] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[378] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[379] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[380] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[381] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[382] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[383] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[384] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[385] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[386] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[387] = new ModelRendererTurbo(this, 50, 353, textureX, textureY); // Du loco part05
		bodyModel[388] = new ModelRendererTurbo(this, 81, 445, textureX, textureY); // Du loco part19
		bodyModel[389] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[390] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[391] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part28
		bodyModel[392] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[393] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Du loco part28
		bodyModel[394] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Du loco part28
		bodyModel[395] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Du loco part28
		bodyModel[396] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[397] = new ModelRendererTurbo(this, 43, 302, textureX, textureY); // Du loco part03
		bodyModel[398] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[399] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[400] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[401] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[402] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[403] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[404] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[405] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[406] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[407] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[408] = new ModelRendererTurbo(this, 478, 61, textureX, textureY); // Du loco part28
		bodyModel[409] = new ModelRendererTurbo(this, 478, 61, textureX, textureY); // Du loco part28
		bodyModel[410] = new ModelRendererTurbo(this, 469, 80, textureX, textureY); // Du loco part28
		bodyModel[411] = new ModelRendererTurbo(this, 469, 81, textureX, textureY); // Du loco part28
		bodyModel[412] = new ModelRendererTurbo(this, 470, 80, textureX, textureY); // Du loco part28
		bodyModel[413] = new ModelRendererTurbo(this, 469, 81, textureX, textureY); // Du loco part28
		bodyModel[414] = new ModelRendererTurbo(this, 144, 450, textureX, textureY); // Du loco part19
		bodyModel[415] = new ModelRendererTurbo(this, 147, 451, textureX, textureY); // Du loco part19
		bodyModel[416] = new ModelRendererTurbo(this, 98, 444, textureX, textureY); // Du loco part19
		bodyModel[417] = new ModelRendererTurbo(this, 442, 59, textureX, textureY); // Lamp
		bodyModel[418] = new ModelRendererTurbo(this, 442, 59, textureX, textureY); // Lamp
		bodyModel[419] = new ModelRendererTurbo(this, 165, 395, textureX, textureY); // Du loco part19
		bodyModel[420] = new ModelRendererTurbo(this, 340, 381, textureX, textureY); // Du loco part19
		bodyModel[421] = new ModelRendererTurbo(this, 340, 362, textureX, textureY); // Du loco part19
		bodyModel[422] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Du loco part23
		bodyModel[423] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[424] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[425] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[426] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[427] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[428] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[429] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[430] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[431] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[432] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[433] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[434] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[435] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[436] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[437] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[438] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[439] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[440] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[441] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[442] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[443] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[444] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[445] = new ModelRendererTurbo(this, 478, 61, textureX, textureY); // Du loco part28
		bodyModel[446] = new ModelRendererTurbo(this, 478, 61, textureX, textureY); // Du loco part28
		bodyModel[447] = new ModelRendererTurbo(this, 81, 445, textureX, textureY); // Du loco part19
		bodyModel[448] = new ModelRendererTurbo(this, 470, 78, textureX, textureY); // Du loco part28
		bodyModel[449] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[450] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[451] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[452] = new ModelRendererTurbo(this, 477, 63, textureX, textureY); // Du loco part28
		bodyModel[453] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[454] = new ModelRendererTurbo(this, 81, 445, textureX, textureY); // Du loco part19
		bodyModel[455] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 154

		bodyModel[0].addShapeBox(0F, 0F, 0F, 69, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(0F, -7F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 25, 1, 24, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(36F, -12F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 120, 8, 0, 0F,0F, -4F, 0F, -60F, -4F, 0F, -60F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F); // Du loco part27
		bodyModel[2].setRotationPoint(6F, -15F, 6.15F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[3].setRotationPoint(-10F, -9F, 4F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[4].setRotationPoint(-10F, -9F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[5].setRotationPoint(38F, -25F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[6].setRotationPoint(42F, -19F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[7].setRotationPoint(42F, -19F, -6F);
		bodyModel[7].rotateAngleY = -1.57079633F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[8].setRotationPoint(42F, -19F, -3F);
		bodyModel[8].rotateAngleY = -1.57079633F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[9].setRotationPoint(42F, -22F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[10].setRotationPoint(42F, -22F, -3F);
		bodyModel[10].rotateAngleY = -1.57079633F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[11].setRotationPoint(42F, -22F, -6F);
		bodyModel[11].rotateAngleY = -1.57079633F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[12].setRotationPoint(45F, -26F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[13].setRotationPoint(45F, -26F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[14].setRotationPoint(45F, -26F, -4F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[15].setRotationPoint(-9F, -9F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[16].setRotationPoint(-9F, -9F, 5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[17].setRotationPoint(45F, -22F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[18].setRotationPoint(44F, -21F, -4F);
		bodyModel[18].rotateAngleY = -1.57079633F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[19].setRotationPoint(43F, -21F, -4F);
		bodyModel[19].rotateAngleY = -1.57079633F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 19, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 138
		bodyModel[20].setRotationPoint(10F, -20F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[21].setRotationPoint(-10F, -8F, 4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[22].setRotationPoint(-10F, -10F, 4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[23].setRotationPoint(-10F, -8F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[24].setRotationPoint(-10F, -10F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[25].setRotationPoint(-7F, -8F, -1F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[26].setRotationPoint(0F, -11F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[27].setRotationPoint(3F, -11F, -9F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[28].setRotationPoint(0F, -11F, 8F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[29].setRotationPoint(3F, -11F, 8F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[30].setRotationPoint(0F, -5F, -11F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[31].setRotationPoint(0F, -8F, -9F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[32].setRotationPoint(0F, -5F, 9F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[33].setRotationPoint(0F, -8F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[34].setRotationPoint(-8F, -9F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[35].setRotationPoint(-1F, -16F, 11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[36].setRotationPoint(4F, -16F, 11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[37].setRotationPoint(63F, -16F, 11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[38].setRotationPoint(68F, -16F, 11F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[39].setRotationPoint(78F, -9F, 4F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[40].setRotationPoint(78F, -9F, -7F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[41].setRotationPoint(75F, -9F, -6F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[42].setRotationPoint(75F, -9F, 5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[43].setRotationPoint(78F, -8F, 4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[44].setRotationPoint(78F, -10F, 4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[45].setRotationPoint(78F, -8F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[46].setRotationPoint(78F, -10F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[47].setRotationPoint(75F, -8F, -1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[48].setRotationPoint(76F, -9F, -1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[49].setRotationPoint(52F, -25F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[50].setRotationPoint(49F, -19F, 4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[51].setRotationPoint(49F, -19F, 4F);
		bodyModel[51].rotateAngleY = -1.57079633F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[52].setRotationPoint(49F, -19F, 7F);
		bodyModel[52].rotateAngleY = -1.57079633F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[53].setRotationPoint(50F, -22F, 4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[54].setRotationPoint(50F, -22F, 7F);
		bodyModel[54].rotateAngleY = -1.57079633F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[55].setRotationPoint(50F, -22F, 4F);
		bodyModel[55].rotateAngleY = -1.57079633F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[56].setRotationPoint(49F, -26F, 4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[57].setRotationPoint(49F, -26F, 3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[58].setRotationPoint(49F, -26F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[59].setRotationPoint(49F, -22F, 3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[60].setRotationPoint(51F, -21F, 6F);
		bodyModel[60].rotateAngleY = -1.57079633F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[61].setRotationPoint(50F, -21F, 6F);
		bodyModel[61].rotateAngleY = -1.57079633F;

		bodyModel[62].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[62].setRotationPoint(64F, -11F, -9F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[63].setRotationPoint(67F, -11F, -9F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[64].setRotationPoint(64F, -11F, 8F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[65].setRotationPoint(67F, -11F, 8F);

		bodyModel[66].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[66].setRotationPoint(64F, -5F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[67].setRotationPoint(64F, -8F, -9F);

		bodyModel[68].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[68].setRotationPoint(64F, -5F, 9F);

		bodyModel[69].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[69].setRotationPoint(64F, -8F, 8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 154
		bodyModel[70].setRotationPoint(-6.05F, -23F, 8.05F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[71].setRotationPoint(-6F, -11F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[72].setRotationPoint(38.5F, -28F, 10.75F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[73].setRotationPoint(40.5F, -34F, 9.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Du loco part41
		bodyModel[74].setRotationPoint(-6F, -8F, -9F);

		bodyModel[75].addBox(0F, 0F, 0F, 79, 4, 12, 0F); // Du loco part01
		bodyModel[75].setRotationPoint(-5F, -11F, -6F);

		bodyModel[76].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[76].setRotationPoint(12F, -27F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 23, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[77].setRotationPoint(37F, -18F, -12F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 23, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[78].setRotationPoint(37F, -26F, -12F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 23, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[79].setRotationPoint(37F, -26F, 11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[80].setRotationPoint(37F, -26F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[81].setRotationPoint(57F, -26F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 21, 9, 3, 0F,-3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part19
		bodyModel[82].setRotationPoint(37F, -35F, -12F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 21, 9, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[83].setRotationPoint(37F, -35F, 9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 9, 10, 0F,-2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[84].setRotationPoint(37F, -35F, 1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 9, 10, 0F,-3F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[85].setRotationPoint(37F, -35F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 9, 10, 0F,-1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part19
		bodyModel[86].setRotationPoint(54F, -35F, 1F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 9, 10, 0F,0F, 0F, -2F, -3F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part19
		bodyModel[87].setRotationPoint(54F, -35F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Du loco part05
		bodyModel[88].setRotationPoint(49F, -34F, 9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-0.75F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -2.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F); // Du loco part05
		bodyModel[89].setRotationPoint(53.5F, -34F, 9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-2F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -1.75F, -2F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, -2.75F, -0.25F, -1.75F, -2.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part05
		bodyModel[90].setRotationPoint(38.5F, -34F, 9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Du loco part05
		bodyModel[91].setRotationPoint(44F, -34F, 9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[92].setRotationPoint(38.25F, -34F, 2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-2.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -1F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -0.75F, -1F, -0.25F, -0.75F); // Du loco part05
		bodyModel[93].setRotationPoint(36.25F, -34F, 2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -1F, -2.25F, -0.25F, -1F, -0.75F, -0.25F, -1.75F, -2.25F, -0.25F, -1.75F, -2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[94].setRotationPoint(37F, -34F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[95].setRotationPoint(36.75F, -30F, 2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F); // Du loco part05
		bodyModel[96].setRotationPoint(38.25F, -34F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-2.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -2.25F, -0.25F, -0.5F, -1F, -0.25F, -0.75F, -2F, -0.25F, -0.75F, -2F, -0.25F, 0F, -1F, -0.25F, 0F); // Du loco part05
		bodyModel[97].setRotationPoint(36.25F, -34F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-2.25F, -0.25F, -1F, -0.75F, -0.25F, -1F, -0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[98].setRotationPoint(37F, -34F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part05
		bodyModel[99].setRotationPoint(36.75F, -30F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[100].setRotationPoint(49F, -34F, -12F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[101].setRotationPoint(44F, -34F, -12F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,-3F, 0F, -2F, -3F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[102].setRotationPoint(39F, -36F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[103].setRotationPoint(39F, -36F, 1F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[104].setRotationPoint(-3F, -13F, 8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[105].setRotationPoint(-3F, -27F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[106].setRotationPoint(-3F, -25F, 8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[107].setRotationPoint(-3F, -24.25F, 8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[108].setRotationPoint(-3F, -23.5F, 8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[109].setRotationPoint(-3F, -22.75F, 8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[110].setRotationPoint(-3F, -22F, 8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[111].setRotationPoint(-3F, -21.25F, 8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[112].setRotationPoint(-3F, -20.5F, 8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[113].setRotationPoint(-3F, -19.75F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[114].setRotationPoint(-3F, -26.5F, 8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[115].setRotationPoint(-3F, -25.75F, 8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part05
		bodyModel[116].setRotationPoint(-7F, -25F, 5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[117].setRotationPoint(-7F, -25F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[118].setRotationPoint(-7F, -12.25F, -5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[119].setRotationPoint(-7F, -25F, -5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[120].setRotationPoint(-7F, -22F, -5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[121].setRotationPoint(-7F, -21.25F, -5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[122].setRotationPoint(-7F, -20.5F, -5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[123].setRotationPoint(-7F, -19.75F, -5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[124].setRotationPoint(-7F, -19F, -5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[125].setRotationPoint(-7F, -13F, -5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[126].setRotationPoint(-7F, -25F, -5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[127].setRotationPoint(-7F, -22.75F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[128].setRotationPoint(-7F, -27F, -5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[129].setRotationPoint(-7F, -18.25F, -5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[130].setRotationPoint(-7F, -17.5F, -5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[131].setRotationPoint(-7F, -16.75F, -5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[132].setRotationPoint(-7F, -16F, -5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[133].setRotationPoint(-7F, -15.25F, -5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[134].setRotationPoint(-7F, -14.5F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[135].setRotationPoint(-7F, -13.75F, -5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[136].setRotationPoint(-1F, -16F, 9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[137].setRotationPoint(-6F, -27F, 8F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[138].setRotationPoint(-1F, -16F, 10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[139].setRotationPoint(4F, -16F, 10F);

		bodyModel[140].addBox(0F, 0F, 0F, 11, 1, 18, 0F); // Du loco part03
		bodyModel[140].setRotationPoint(-6F, -12F, -9F);

		bodyModel[141].addBox(0F, 0F, 0F, 11, 1, 18, 0F); // Du loco part03
		bodyModel[141].setRotationPoint(64F, -12F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[142].setRotationPoint(68F, -16F, 9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[143].setRotationPoint(61F, -16F, 10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[144].setRotationPoint(62F, -16F, 10F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[145].setRotationPoint(68F, -16F, 10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[146].setRotationPoint(74F, -27F, -8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[147].setRotationPoint(-1F, -16F, -12F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[148].setRotationPoint(68F, -16F, -12F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[149].setRotationPoint(-1F, -16F, -10F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[150].setRotationPoint(-1F, -16F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[151].setRotationPoint(68F, -16F, -10F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[152].setRotationPoint(68F, -16F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[153].setRotationPoint(-6.05F, -14F, 5.25F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[154].setRotationPoint(-6.05F, -13F, 5.25F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[155].setRotationPoint(-6.05F, -14F, -7.25F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[156].setRotationPoint(-6.05F, -13F, -7.25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[157].setRotationPoint(-6.3F, -29F, -3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[158].setRotationPoint(-6.3F, -28F, -3F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[159].setRotationPoint(-6.3F, -29F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[160].setRotationPoint(-6.3F, -28F, -1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[161].setRotationPoint(-6.3F, -29F, 1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[162].setRotationPoint(-6.3F, -28F, 1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[163].setRotationPoint(-6.25F, -29F, -3F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Lamp
		bodyModel[164].setRotationPoint(-6.25F, -28F, -3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[165].setRotationPoint(75.05F, -14F, 5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[166].setRotationPoint(75.05F, -13F, 5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[167].setRotationPoint(75.05F, -14F, -7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[168].setRotationPoint(75.05F, -13F, -7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[169].setRotationPoint(75.3F, -29F, -3F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[170].setRotationPoint(75.3F, -28F, -3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[171].setRotationPoint(75.3F, -29F, -1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[172].setRotationPoint(75.3F, -28F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[173].setRotationPoint(75.3F, -29F, 1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[174].setRotationPoint(75.3F, -28F, 1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[175].setRotationPoint(74.25F, -29F, -3F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Lamp
		bodyModel[176].setRotationPoint(74.25F, -28F, -3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[177].setRotationPoint(74F, -11F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Du loco part41
		bodyModel[178].setRotationPoint(74F, -8F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -2.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[179].setRotationPoint(44F, -34F, -13F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -2.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[180].setRotationPoint(49F, -34F, -13F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1.5F, -0.75F, -1.25F, -1.5F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -2.25F, -0.5F, -0.75F, -2.25F, -0.5F); // Du loco part05
		bodyModel[181].setRotationPoint(44F, -34F, 10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1.5F, -0.75F, -1.25F, -1.5F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -2.25F, -0.5F, -0.75F, -2.25F, -0.5F); // Du loco part05
		bodyModel[182].setRotationPoint(49F, -34F, 10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 43, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[183].setRotationPoint(-6F, -29F, -2F);

		bodyModel[184].addBox(0F, 0F, 0F, 17, 15, 1, 0F); // Du loco part19
		bodyModel[184].setRotationPoint(-5F, -27F, -9F);

		bodyModel[185].addBox(0F, 0F, 0F, 13, 15, 1, 0F); // Du loco part19
		bodyModel[185].setRotationPoint(24F, -27F, -9F);

		bodyModel[186].addBox(0F, 0F, 0F, 17, 15, 1, 0F); // Du loco part19
		bodyModel[186].setRotationPoint(-5F, -27F, 8F);

		bodyModel[187].addBox(0F, 0F, 0F, 13, 15, 1, 0F); // Du loco part19
		bodyModel[187].setRotationPoint(24F, -27F, 8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[188].setRotationPoint(26F, -21F, -4F);

		bodyModel[189].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 138
		bodyModel[189].setRotationPoint(9.5F, -20.25F, 3F);

		bodyModel[190].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 138
		bodyModel[190].setRotationPoint(9.5F, -20.25F, -5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[191].setRotationPoint(23.5F, -21F, -4F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[192].setRotationPoint(21F, -21F, -4F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[193].setRotationPoint(18.5F, -21F, -4F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[194].setRotationPoint(16F, -21F, -4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[195].setRotationPoint(13.5F, -21F, -4F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[196].setRotationPoint(11F, -21F, -4F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 0, 22, 20, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -6F, 0F, 0.125F, -6F, 0F, -9.125F, 0F, 0F, -9.125F, 0F, 0F, -9.125F, -6F, 0F, -9.125F, -6F); // Du loco part19
		bodyModel[197].setRotationPoint(75.05F, -26F, -7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -2.875F, -1F, -1F, -2F, -1F, -1F, -4.875F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[198].setRotationPoint(-6F, -3F, -9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[199].setRotationPoint(-6F, -5F, -9F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 0F, -1F, 0F, 0F, -1F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[200].setRotationPoint(-6F, -6F, -9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, -1F, -4.875F, 0F, -1F, -2F, -1F, -1F, -2.875F, -1F, -1F); // Du loco part41
		bodyModel[201].setRotationPoint(-6F, -3F, 2F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[202].setRotationPoint(-6F, -5F, 2F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, -1F, -4.875F, 0F, -1F, -1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F); // Du loco part41
		bodyModel[203].setRotationPoint(-6F, -6F, 2F);

		bodyModel[204].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[204].setRotationPoint(-2F, -4F, 6F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[205].setRotationPoint(-2F, -7F, 4F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[206].setRotationPoint(-2F, -4F, -7F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part28
		bodyModel[207].setRotationPoint(-2F, -7F, -7F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part28
		bodyModel[208].setRotationPoint(-3F, -4F, -7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F); // Du loco part28
		bodyModel[209].setRotationPoint(-3F, -4F, 6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, -2F, -1F, -1F, -2.875F, -1F, -1F, 0F, 0F, -1F, -4.875F, 0F, -1F); // Du loco part41
		bodyModel[210].setRotationPoint(70F, -3F, -9F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[211].setRotationPoint(70F, -5F, -9F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 0F, -1F, -4.875F, 0F, -1F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[212].setRotationPoint(70F, -6F, -9F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, -1F, 0F, 0F, -1F, -2.875F, -1F, -1F, -2F, -1F, -1F); // Du loco part41
		bodyModel[213].setRotationPoint(70F, -3F, 2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[214].setRotationPoint(70F, -5F, 2F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, -1F, 0F, 0F, -1F, -3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F); // Du loco part41
		bodyModel[215].setRotationPoint(70F, -6F, 2F);

		bodyModel[216].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[216].setRotationPoint(69F, -4F, 6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[217].setRotationPoint(69F, -7F, 4F);

		bodyModel[218].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[218].setRotationPoint(69F, -4F, -7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part28
		bodyModel[219].setRotationPoint(69F, -7F, -7F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[220].setRotationPoint(71F, -4F, -7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[221].setRotationPoint(71F, -4F, 6F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[222].setRotationPoint(-4F, -26F, 8F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[223].setRotationPoint(1F, -26F, 8F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[224].setRotationPoint(64F, -20F, -9F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[225].setRotationPoint(64F, -25F, -9F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[226].setRotationPoint(63F, -24F, -9F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[227].setRotationPoint(70F, -24F, -9F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-0.75F, -0.25F, -1.75F, -2F, -0.25F, -1.75F, -2F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -2.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[228].setRotationPoint(53.5F, -34F, -12F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-2F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F, -2.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F); // Du loco part05
		bodyModel[229].setRotationPoint(38.5F, -34F, -12F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[230].setRotationPoint(38.5F, -28F, -11.75F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[231].setRotationPoint(40.5F, -34F, -10.25F);

		bodyModel[232].addBox(0F, 0F, 0F, 30, 1, 22, 0F); // Du loco part03
		bodyModel[232].setRotationPoint(5F, -12F, -11F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 43, 1, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Du loco part19
		bodyModel[233].setRotationPoint(-6F, -29F, 2F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 43, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part19
		bodyModel[234].setRotationPoint(-6F, -28F, 7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[235].setRotationPoint(-6F, -28F, 2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[236].setRotationPoint(-7F, -24.25F, -5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[237].setRotationPoint(-7F, -23.5F, -5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 43, 1, 5, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[238].setRotationPoint(-6F, -29F, -7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 43, 1, 2, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[239].setRotationPoint(-6F, -28F, -9F);

		bodyModel[240].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[240].setRotationPoint(18F, -27F, -9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[241].setRotationPoint(-6F, -28F, -7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[242].setRotationPoint(-6F, -27F, 5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[243].setRotationPoint(-6F, -27F, -8F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F,-2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[244].setRotationPoint(36F, -36F, -2F);

		bodyModel[245].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[245].setRotationPoint(12F, -27F, 8F);

		bodyModel[246].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[246].setRotationPoint(18F, -27F, 8F);

		bodyModel[247].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[247].setRotationPoint(6F, -27F, 9F);

		bodyModel[248].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[248].setRotationPoint(24F, -27F, 9F);

		bodyModel[249].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[249].setRotationPoint(6F, -27F, -10F);

		bodyModel[250].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[250].setRotationPoint(24F, -27F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[251].setRotationPoint(54.5F, -34F, 2F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.75F, -0.25F, -0.5F, -2.25F, -0.25F, -0.5F, -2.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -2F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, -2F, -0.25F, -0.75F); // Du loco part05
		bodyModel[252].setRotationPoint(54.5F, -34F, 2F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -2.25F, -0.25F, -1F, -0.75F, -0.25F, -1F, -2.25F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F); // Du loco part05
		bodyModel[253].setRotationPoint(53.75F, -34F, 8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[254].setRotationPoint(56F, -30F, 2F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F); // Du loco part05
		bodyModel[255].setRotationPoint(54.5F, -34F, -9F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -2F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, -2F, -0.25F, 0F); // Du loco part05
		bodyModel[256].setRotationPoint(54.5F, -34F, -3F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-0.75F, -0.25F, -1F, -2.25F, -0.25F, -1F, -2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -1.75F, -2.25F, -0.25F, -1.75F); // Du loco part05
		bodyModel[257].setRotationPoint(53.75F, -34F, -10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part05
		bodyModel[258].setRotationPoint(56F, -30F, -10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[259].setRotationPoint(-6F, -27F, -9F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[260].setRotationPoint(74F, -27F, 8F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[261].setRotationPoint(57F, -29F, -2F);

		bodyModel[262].addBox(0F, 0F, 0F, 14, 15, 1, 0F); // Du loco part19
		bodyModel[262].setRotationPoint(60F, -27F, -9F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Du loco part19
		bodyModel[263].setRotationPoint(57F, -29F, 2F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part19
		bodyModel[264].setRotationPoint(57F, -28F, 7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[265].setRotationPoint(57F, -29F, -7F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[266].setRotationPoint(57F, -28F, -9F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[267].setRotationPoint(74F, -27F, -9F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 24, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[268].setRotationPoint(58F, -27F, -12F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 24, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part03
		bodyModel[269].setRotationPoint(35F, -12F, -12F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[270].setRotationPoint(6F, -16F, 10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 120, 8, 0, 0F,0F, -4F, 0F, -60F, -4F, 0F, -60F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F); // Du loco part27
		bodyModel[271].setRotationPoint(6F, -15F, -6.15F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[272].setRotationPoint(-9.5F, -10F, -6.05F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[273].setRotationPoint(-35.5F, -10F, -6.05F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[274].setRotationPoint(-22.5F, -10F, -6.05F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[275].setRotationPoint(3.5F, -10F, -6.05F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[276].setRotationPoint(16.5F, -10F, -6.05F);

		bodyModel[277].addBox(0F, 0F, 0F, 14, 15, 1, 0F); // Du loco part19
		bodyModel[277].setRotationPoint(60F, -27F, 8F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[278].setRotationPoint(31F, -22F, 8F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[279].setRotationPoint(31F, -27F, 8F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[280].setRotationPoint(31F, -26F, 8F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[281].setRotationPoint(31F, -25.25F, 8F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[282].setRotationPoint(31F, -24.5F, 8F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[283].setRotationPoint(31F, -23.75F, 8F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[284].setRotationPoint(30F, -26F, 8F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[285].setRotationPoint(35F, -26F, 8F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[286].setRotationPoint(31F, -26.5F, 8F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[287].setRotationPoint(31F, -23F, 8F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[288].setRotationPoint(-3F, -19F, 8F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[289].setRotationPoint(-3F, -18.25F, 8F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[290].setRotationPoint(-3F, -17.5F, 8F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[291].setRotationPoint(-3F, -16.75F, 8F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[292].setRotationPoint(-3F, -16F, 8F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[293].setRotationPoint(-3F, -15.25F, 8F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[294].setRotationPoint(-3F, -14.5F, 8F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[295].setRotationPoint(-3F, -13.75F, 8F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[296].setRotationPoint(2F, -13F, 8F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[297].setRotationPoint(2F, -27F, 8F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[298].setRotationPoint(2F, -25F, 8F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[299].setRotationPoint(2F, -24.25F, 8F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[300].setRotationPoint(2F, -23.5F, 8F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[301].setRotationPoint(2F, -22.75F, 8F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[302].setRotationPoint(2F, -22F, 8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[303].setRotationPoint(2F, -21.25F, 8F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[304].setRotationPoint(2F, -20.5F, 8F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[305].setRotationPoint(2F, -19.75F, 8F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[306].setRotationPoint(2F, -26.5F, 8F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[307].setRotationPoint(2F, -25.75F, 8F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[308].setRotationPoint(1F, -26F, 8F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[309].setRotationPoint(6F, -26F, 8F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[310].setRotationPoint(2F, -19F, 8F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[311].setRotationPoint(2F, -18.25F, 8F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[312].setRotationPoint(2F, -17.5F, 8F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[313].setRotationPoint(2F, -16.75F, 8F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[314].setRotationPoint(2F, -16F, 8F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[315].setRotationPoint(2F, -15.25F, 8F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[316].setRotationPoint(2F, -14.5F, 8F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[317].setRotationPoint(2F, -13.75F, 8F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[318].setRotationPoint(-3F, -13F, -9F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[319].setRotationPoint(-3F, -27F, -9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[320].setRotationPoint(-3F, -25F, -9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[321].setRotationPoint(-3F, -24.25F, -9F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[322].setRotationPoint(-3F, -23.5F, -9F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[323].setRotationPoint(-3F, -22.75F, -9F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[324].setRotationPoint(-3F, -22F, -9F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[325].setRotationPoint(-3F, -21.25F, -9F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[326].setRotationPoint(-3F, -20.5F, -9F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[327].setRotationPoint(-3F, -19.75F, -9F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[328].setRotationPoint(-3F, -26.5F, -9F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[329].setRotationPoint(-3F, -25.75F, -9F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[330].setRotationPoint(-4F, -26F, -9F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[331].setRotationPoint(1F, -26F, -9F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[332].setRotationPoint(-3F, -19F, -9F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[333].setRotationPoint(-3F, -18.25F, -9F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[334].setRotationPoint(-3F, -17.5F, -9F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[335].setRotationPoint(-3F, -16.75F, -9F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[336].setRotationPoint(-3F, -16F, -9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[337].setRotationPoint(-3F, -15.25F, -9F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[338].setRotationPoint(-3F, -14.5F, -9F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[339].setRotationPoint(-3F, -13.75F, -9F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[340].setRotationPoint(2F, -13F, -9F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[341].setRotationPoint(2F, -27F, -9F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[342].setRotationPoint(2F, -25F, -9F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[343].setRotationPoint(2F, -24.25F, -9F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[344].setRotationPoint(2F, -23.5F, -9F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[345].setRotationPoint(2F, -22.75F, -9F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[346].setRotationPoint(2F, -22F, -9F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[347].setRotationPoint(2F, -21.25F, -9F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[348].setRotationPoint(2F, -20.5F, -9F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[349].setRotationPoint(2F, -19.75F, -9F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[350].setRotationPoint(2F, -26.5F, -9F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[351].setRotationPoint(2F, -25.75F, -9F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[352].setRotationPoint(1F, -26F, -9F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[353].setRotationPoint(6F, -26F, -9F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[354].setRotationPoint(2F, -19F, -9F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[355].setRotationPoint(2F, -18.25F, -9F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[356].setRotationPoint(2F, -17.5F, -9F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[357].setRotationPoint(2F, -16.75F, -9F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[358].setRotationPoint(2F, -16F, -9F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[359].setRotationPoint(2F, -15.25F, -9F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[360].setRotationPoint(2F, -14.5F, -9F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[361].setRotationPoint(2F, -13.75F, -9F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[362].setRotationPoint(31F, -13F, -9F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[363].setRotationPoint(31F, -22F, -9F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[364].setRotationPoint(31F, -20.5F, -9F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[365].setRotationPoint(31F, -19.75F, -9F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[366].setRotationPoint(31F, -21.25F, -9F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[367].setRotationPoint(30F, -21F, -9F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[368].setRotationPoint(35F, -21F, -9F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[369].setRotationPoint(31F, -19F, -9F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[370].setRotationPoint(31F, -18.25F, -9F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[371].setRotationPoint(31F, -17.5F, -9F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[372].setRotationPoint(31F, -16.75F, -9F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[373].setRotationPoint(31F, -16F, -9F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[374].setRotationPoint(31F, -15.25F, -9F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[375].setRotationPoint(31F, -14.5F, -9F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[376].setRotationPoint(31F, -13.75F, -9F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[377].setRotationPoint(31F, -22F, -9F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[378].setRotationPoint(31F, -27F, -9F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[379].setRotationPoint(31F, -26F, -9F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[380].setRotationPoint(31F, -25.25F, -9F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[381].setRotationPoint(31F, -24.5F, -9F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[382].setRotationPoint(31F, -23.75F, -9F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[383].setRotationPoint(30F, -26F, -9F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[384].setRotationPoint(35F, -26F, -9F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[385].setRotationPoint(31F, -26.5F, -9F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[386].setRotationPoint(31F, -23F, -9F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[387].setRotationPoint(67F, -24F, -9F);

		bodyModel[388].addBox(0F, 0F, 0F, 27, 1, 4, 0F); // Du loco part19
		bodyModel[388].setRotationPoint(6F, -30F, -2F);

		bodyModel[389].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[389].setRotationPoint(40F, -11F, 10F);

		bodyModel[390].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[390].setRotationPoint(43F, -11F, 10F);

		bodyModel[391].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[391].setRotationPoint(40F, -5F, 10F);

		bodyModel[392].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[392].setRotationPoint(40F, -8F, 10F);

		bodyModel[393].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[393].setRotationPoint(51F, -11F, -11F);

		bodyModel[394].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[394].setRotationPoint(54F, -11F, -11F);

		bodyModel[395].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[395].setRotationPoint(51F, -5F, -12F);

		bodyModel[396].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[396].setRotationPoint(51F, -8F, -12F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 3, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Du loco part03
		bodyModel[397].setRotationPoint(61F, -12F, -12F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[398].setRotationPoint(73F, -29F, 9F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[399].setRotationPoint(70.05F, -29F, 9F);

		bodyModel[400].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[400].setRotationPoint(70F, -13F, 9F);

		bodyModel[401].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[401].setRotationPoint(70F, -15F, 9F);

		bodyModel[402].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[402].setRotationPoint(70F, -17F, 9F);

		bodyModel[403].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[403].setRotationPoint(70F, -19F, 9F);

		bodyModel[404].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[404].setRotationPoint(70F, -21F, 9F);

		bodyModel[405].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[405].setRotationPoint(70F, -23F, 9F);

		bodyModel[406].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[406].setRotationPoint(70F, -25F, 9F);

		bodyModel[407].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[407].setRotationPoint(70F, -27F, 9F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[408].setRotationPoint(73F, -30F, 5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[409].setRotationPoint(70.05F, -30F, 5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[410].setRotationPoint(55F, -22F, -13F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[411].setRotationPoint(50F, -22F, -13F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[412].setRotationPoint(44F, -22F, 12F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[413].setRotationPoint(39F, -22F, 12F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 4, 9, 2, 0F,-1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part19
		bodyModel[414].setRotationPoint(54F, -35F, -1F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 4, 9, 2, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[415].setRotationPoint(37F, -35F, -1F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[416].setRotationPoint(39F, -36F, -1F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[417].setRotationPoint(74F, -28F, 2F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[418].setRotationPoint(74F, -28F, -7F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 0, 22, 20, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -6F, 0F, 0.125F, -6F, 0F, -9.125F, 0F, 0F, -9.125F, 0F, 0F, -9.125F, -6F, 0F, -9.125F, -6F); // Du loco part19
		bodyModel[419].setRotationPoint(-7.05F, -26F, -7F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 36, 18, 0, 0F,0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -24F, -12F, 0F, -24F, -12F, 0F, 0F, -12F, 0F); // Du loco part19
		bodyModel[420].setRotationPoint(45F, -23F, 12.05F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 36, 18, 0, 0F,0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -24F, -12F, 0F, -24F, -12F, 0F, 0F, -12F, 0F); // Du loco part19
		bodyModel[421].setRotationPoint(38F, -23F, -12.05F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[422].setRotationPoint(-9.5F, -10F, 6.05F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[423].setRotationPoint(-35.5F, -10F, 6.05F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[424].setRotationPoint(-22.5F, -10F, 6.05F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[425].setRotationPoint(3.5F, -10F, 6.05F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[426].setRotationPoint(16.5F, -10F, 6.05F);

		bodyModel[427].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[427].setRotationPoint(43F, -11F, 5.05F);

		bodyModel[428].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[428].setRotationPoint(28F, -11F, 5.05F);

		bodyModel[429].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[429].setRotationPoint(56F, -11F, 5.05F);

		bodyModel[430].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[430].setRotationPoint(15F, -11F, 5.05F);

		bodyModel[431].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[431].setRotationPoint(43F, -11F, -6.05F);

		bodyModel[432].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[432].setRotationPoint(28F, -11F, -6.05F);

		bodyModel[433].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[433].setRotationPoint(56F, -11F, -6.05F);

		bodyModel[434].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[434].setRotationPoint(15F, -11F, -6.05F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[435].setRotationPoint(-1F, -29F, -10F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[436].setRotationPoint(-3.95F, -29F, -10F);

		bodyModel[437].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[437].setRotationPoint(-4F, -13F, -10F);

		bodyModel[438].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[438].setRotationPoint(-4F, -15F, -10F);

		bodyModel[439].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[439].setRotationPoint(-4F, -17F, -10F);

		bodyModel[440].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[440].setRotationPoint(-4F, -19F, -10F);

		bodyModel[441].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[441].setRotationPoint(-4F, -21F, -10F);

		bodyModel[442].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[442].setRotationPoint(-4F, -23F, -10F);

		bodyModel[443].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[443].setRotationPoint(-4F, -25F, -10F);

		bodyModel[444].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[444].setRotationPoint(-4F, -27F, -10F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[445].setRotationPoint(-1F, -30F, -10F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[446].setRotationPoint(-3.95F, -30F, -10F);

		bodyModel[447].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Du loco part19
		bodyModel[447].setRotationPoint(-5F, -29F, -8F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[448].setRotationPoint(63F, -16F, -12F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[449].setRotationPoint(61F, -16F, -11F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[450].setRotationPoint(62F, -16F, -11F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[451].setRotationPoint(4F, -16F, -12F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[452].setRotationPoint(4F, -16F, -11F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[453].setRotationPoint(6F, -16F, -11F);

		bodyModel[454].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Du loco part19
		bodyModel[454].setRotationPoint(69F, -29F, 5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[455].setRotationPoint(-6.05F, -23F, -9.05F);
	}
}