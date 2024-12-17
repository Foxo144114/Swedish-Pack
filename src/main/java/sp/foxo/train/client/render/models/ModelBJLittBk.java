//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BJ Litterera Bk
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package sp.foxo.train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelBJLittBk extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBJLittBk() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[662];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Du loco part03
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Du loco part05
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Du loco part06
		bodyModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Du loco part07
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Du loco part08
		bodyModel[6] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[7] = new ModelRendererTurbo(this, 120, 310, textureX, textureY); // Du loco part19
		bodyModel[8] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Du loco part20
		bodyModel[9] = new ModelRendererTurbo(this, 106, 348, textureX, textureY); // Du loco part22
		bodyModel[10] = new ModelRendererTurbo(this, 75, 348, textureX, textureY); // Du loco part28
		bodyModel[11] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Du loco part41
		bodyModel[12] = new ModelRendererTurbo(this, 23, 3, textureX, textureY); // Du loco part47
		bodyModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Du loco part56
		bodyModel[14] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Du loco part82
		bodyModel[15] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part83
		bodyModel[16] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Du loco part84
		bodyModel[17] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part85
		bodyModel[18] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part94
		bodyModel[19] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Du loco part95
		bodyModel[20] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part97
		bodyModel[21] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part100
		bodyModel[22] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Du loco part101
		bodyModel[23] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Du loco part102
		bodyModel[24] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Lamp
		bodyModel[25] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Lamp
		bodyModel[26] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Lamp
		bodyModel[27] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Lamp
		bodyModel[28] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 149
		bodyModel[29] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 154
		bodyModel[30] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 156
		bodyModel[31] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 174
		bodyModel[32] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 177
		bodyModel[33] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 194
		bodyModel[34] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 195
		bodyModel[35] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 135
		bodyModel[36] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 136
		bodyModel[37] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 138
		bodyModel[38] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 139
		bodyModel[39] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 141
		bodyModel[40] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 142
		bodyModel[41] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 143
		bodyModel[42] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 144
		bodyModel[43] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 145
		bodyModel[44] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 146
		bodyModel[45] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 147
		bodyModel[46] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 148
		bodyModel[47] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 149
		bodyModel[48] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 150
		bodyModel[49] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 151
		bodyModel[50] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 152
		bodyModel[51] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 153
		bodyModel[52] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 154
		bodyModel[53] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 155
		bodyModel[54] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 156
		bodyModel[55] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 157
		bodyModel[56] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 158
		bodyModel[57] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 159
		bodyModel[58] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 160
		bodyModel[59] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Du loco part37
		bodyModel[60] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Du loco part37
		bodyModel[61] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Du loco part37
		bodyModel[62] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Du loco part37
		bodyModel[63] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Du loco part37
		bodyModel[64] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part37
		bodyModel[65] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Du loco part47
		bodyModel[66] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Du loco part47
		bodyModel[67] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Du loco part47
		bodyModel[68] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Du loco part47
		bodyModel[69] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Du loco part42
		bodyModel[70] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Du loco part42
		bodyModel[71] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Du loco part37
		bodyModel[72] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Du loco part37
		bodyModel[73] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Du loco part37
		bodyModel[74] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Du loco part37
		bodyModel[75] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Du loco part37
		bodyModel[76] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Du loco part47
		bodyModel[77] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Lamp
		bodyModel[78] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Du loco part37
		bodyModel[79] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Du loco part37
		bodyModel[80] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[81] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Lamp
		bodyModel[82] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Lamp
		bodyModel[83] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Lamp
		bodyModel[84] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Lamp
		bodyModel[85] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Lamp
		bodyModel[86] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[87] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[88] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 149
		bodyModel[89] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 149
		bodyModel[90] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Du loco part37
		bodyModel[91] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Du loco part71
		bodyModel[92] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Du loco part71
		bodyModel[93] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Du loco part71
		bodyModel[94] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 174
		bodyModel[95] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Du loco part28
		bodyModel[96] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part28
		bodyModel[97] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[98] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[99] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Du loco part28
		bodyModel[100] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Du loco part28
		bodyModel[101] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Du loco part28
		bodyModel[102] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part28
		bodyModel[103] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Du loco part28
		bodyModel[104] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Du loco part28
		bodyModel[105] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Du loco part47
		bodyModel[106] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[107] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[108] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Du loco part28
		bodyModel[109] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Du loco part28
		bodyModel[110] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part05
		bodyModel[111] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Du loco part06
		bodyModel[112] = new ModelRendererTurbo(this, 137, 346, textureX, textureY); // Box 167
		bodyModel[113] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[114] = new ModelRendererTurbo(this, 206, 89, textureX, textureY); // Du loco part06
		bodyModel[115] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Du loco part06
		bodyModel[116] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Du loco part06
		bodyModel[117] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Du loco part06
		bodyModel[118] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Du loco part06
		bodyModel[119] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Du loco part06
		bodyModel[120] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Du loco part06
		bodyModel[121] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Du loco part05
		bodyModel[122] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Du loco part06
		bodyModel[123] = new ModelRendererTurbo(this, 119, 392, textureX, textureY); // Du loco part19
		bodyModel[124] = new ModelRendererTurbo(this, 106, 370, textureX, textureY); // Du loco part22
		bodyModel[125] = new ModelRendererTurbo(this, 75, 370, textureX, textureY); // Du loco part28
		bodyModel[126] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[127] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[128] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Du loco part Ligjhtpart15
		bodyModel[129] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Du loco part Ligjhtpart13
		bodyModel[130] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[131] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[132] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[133] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[134] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[135] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[136] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Lamp
		bodyModel[137] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Lamp
		bodyModel[138] = new ModelRendererTurbo(this, 137, 371, textureX, textureY); // Box 168
		bodyModel[139] = new ModelRendererTurbo(this, 137, 371, textureX, textureY); // Box 167
		bodyModel[140] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Du loco part28
		bodyModel[141] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part28
		bodyModel[142] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Du loco part28
		bodyModel[143] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Du loco part28
		bodyModel[144] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Du loco part05
		bodyModel[145] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Du loco part06
		bodyModel[146] = new ModelRendererTurbo(this, 137, 346, textureX, textureY); // Box 167
		bodyModel[147] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Du loco part41
		bodyModel[148] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Du loco part47
		bodyModel[149] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Du loco part56
		bodyModel[150] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 154
		bodyModel[151] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 156
		bodyModel[152] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Du loco part47
		bodyModel[153] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Du loco part47
		bodyModel[154] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Du loco part47
		bodyModel[155] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Du loco part47
		bodyModel[156] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part42
		bodyModel[157] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Du loco part42
		bodyModel[158] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Du loco part47
		bodyModel[159] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Du loco part47
		bodyModel[160] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Du loco part37
		bodyModel[161] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Du loco part37
		bodyModel[162] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Du loco part37
		bodyModel[163] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Du loco part37
		bodyModel[164] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Du loco part37
		bodyModel[165] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Du loco part37
		bodyModel[166] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Du loco part37
		bodyModel[167] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Du loco part37
		bodyModel[168] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Du loco part37
		bodyModel[169] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Du loco part37
		bodyModel[170] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Du loco part37
		bodyModel[171] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Du loco part37
		bodyModel[172] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Du loco part37
		bodyModel[173] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Du loco part37
		bodyModel[174] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Du loco part37
		bodyModel[175] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Du loco part37
		bodyModel[176] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Du loco part37
		bodyModel[177] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Du loco part37
		bodyModel[178] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Du loco part37
		bodyModel[179] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Du loco part82
		bodyModel[180] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Du loco part83
		bodyModel[181] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Du loco part84
		bodyModel[182] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Du loco part85
		bodyModel[183] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Du loco part94
		bodyModel[184] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Du loco part95
		bodyModel[185] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Du loco part97
		bodyModel[186] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Du loco part100
		bodyModel[187] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part101
		bodyModel[188] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Du loco part102
		bodyModel[189] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 177
		bodyModel[190] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 193
		bodyModel[191] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 196
		bodyModel[192] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Du loco part37
		bodyModel[193] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Du loco part37
		bodyModel[194] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Du loco part37
		bodyModel[195] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Du loco part37
		bodyModel[196] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Du loco part37
		bodyModel[197] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Du loco part37
		bodyModel[198] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Du loco part37
		bodyModel[199] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Du loco part37
		bodyModel[200] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Du loco part37
		bodyModel[201] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Du loco part37
		bodyModel[202] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Du loco part37
		bodyModel[203] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Du loco part37
		bodyModel[204] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Du loco part37
		bodyModel[205] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Du loco part37
		bodyModel[206] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Du loco part37
		bodyModel[207] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Du loco part37
		bodyModel[208] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Du loco part37
		bodyModel[209] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Du loco part37
		bodyModel[210] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Du loco part37
		bodyModel[211] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Du loco part37
		bodyModel[212] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Du loco part37
		bodyModel[213] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Du loco part37
		bodyModel[214] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Du loco part37
		bodyModel[215] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Du loco part37
		bodyModel[216] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Du loco part37
		bodyModel[217] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Du loco part37
		bodyModel[218] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Du loco part37
		bodyModel[219] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Du loco part37
		bodyModel[220] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Du loco part37
		bodyModel[221] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Du loco part37
		bodyModel[222] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Du loco part37
		bodyModel[223] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Du loco part37
		bodyModel[224] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[225] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[226] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Du loco part06
		bodyModel[227] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[228] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[229] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Du loco part06
		bodyModel[230] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Du loco part06
		bodyModel[231] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Du loco part06
		bodyModel[232] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Du loco part06
		bodyModel[233] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Du loco part28
		bodyModel[234] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Du loco part28
		bodyModel[235] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Du loco part28
		bodyModel[236] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Du loco part28
		bodyModel[237] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Du loco part28
		bodyModel[238] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Du loco part28
		bodyModel[239] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Du loco part28
		bodyModel[240] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Du loco part28
		bodyModel[241] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Du loco part28
		bodyModel[242] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Du loco part28
		bodyModel[243] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 174
		bodyModel[244] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 174
		bodyModel[245] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 156
		bodyModel[246] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 156
		bodyModel[247] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 156
		bodyModel[248] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 156
		bodyModel[249] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		bodyModel[250] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 154
		bodyModel[251] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 154
		bodyModel[252] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 154
		bodyModel[253] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Du loco part23
		bodyModel[254] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Du loco part37
		bodyModel[255] = new ModelRendererTurbo(this, 393, 241, textureX, textureY); // Du loco part37
		bodyModel[256] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Du loco part37
		bodyModel[257] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Du loco part37
		bodyModel[258] = new ModelRendererTurbo(this, 57, 249, textureX, textureY); // Du loco part37
		bodyModel[259] = new ModelRendererTurbo(this, 97, 249, textureX, textureY); // Du loco part37
		bodyModel[260] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Du loco part37
		bodyModel[261] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Du loco part37
		bodyModel[262] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Du loco part23
		bodyModel[263] = new ModelRendererTurbo(this, 145, 349, textureX, textureY); // Du loco part28
		bodyModel[264] = new ModelRendererTurbo(this, 145, 349, textureX, textureY); // Du loco part28
		bodyModel[265] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Du loco part41
		bodyModel[266] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Du loco part41
		bodyModel[267] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Du loco part20
		bodyModel[268] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Du loco part20
		bodyModel[269] = new ModelRendererTurbo(this, 8, 73, textureX, textureY); // Du loco part41
		bodyModel[270] = new ModelRendererTurbo(this, 176, 200, textureX, textureY); // Du loco part41
		bodyModel[271] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Du loco part41
		bodyModel[272] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Du loco part41
		bodyModel[273] = new ModelRendererTurbo(this, 233, 257, textureX, textureY); // Du loco part37
		bodyModel[274] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part37
		bodyModel[275] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Du loco part37
		bodyModel[276] = new ModelRendererTurbo(this, 41, 265, textureX, textureY); // Du loco part37
		bodyModel[277] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Du loco part37
		bodyModel[278] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Du loco part37
		bodyModel[279] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Du loco part37
		bodyModel[280] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Du loco part37
		bodyModel[281] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Du loco part37
		bodyModel[282] = new ModelRendererTurbo(this, 1, 319, textureX, textureY); // Du loco part05
		bodyModel[283] = new ModelRendererTurbo(this, 20, 319, textureX, textureY); // Du loco part05
		bodyModel[284] = new ModelRendererTurbo(this, 1, 322, textureX, textureY); // Du loco part05
		bodyModel[285] = new ModelRendererTurbo(this, 6, 322, textureX, textureY); // Du loco part05
		bodyModel[286] = new ModelRendererTurbo(this, 1, 330, textureX, textureY); // Du loco part05
		bodyModel[287] = new ModelRendererTurbo(this, 20, 330, textureX, textureY); // Du loco part05
		bodyModel[288] = new ModelRendererTurbo(this, 1, 333, textureX, textureY); // Du loco part05
		bodyModel[289] = new ModelRendererTurbo(this, 6, 333, textureX, textureY); // Du loco part05
		bodyModel[290] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[291] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[292] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[293] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[294] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[295] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[296] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[297] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[298] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[299] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[300] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[301] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[302] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[303] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[304] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[305] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[306] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[307] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[308] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[309] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[310] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[311] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[312] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[313] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[314] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[315] = new ModelRendererTurbo(this, 206, 92, textureX, textureY); // Du loco part06
		bodyModel[316] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[317] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[318] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[319] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[320] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[321] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[322] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[323] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[324] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[325] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[326] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[327] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[328] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[329] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[330] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[331] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[332] = new ModelRendererTurbo(this, 16, 377, textureX, textureY); // Du loco part05
		bodyModel[333] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[334] = new ModelRendererTurbo(this, 8, 384, textureX, textureY); // Du loco part05
		bodyModel[335] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[336] = new ModelRendererTurbo(this, 16, 377, textureX, textureY); // Du loco part05
		bodyModel[337] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[338] = new ModelRendererTurbo(this, 8, 384, textureX, textureY); // Du loco part05
		bodyModel[339] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[340] = new ModelRendererTurbo(this, 2, 378, textureX, textureY); // Du loco part05
		bodyModel[341] = new ModelRendererTurbo(this, 2, 378, textureX, textureY); // Du loco part05
		bodyModel[342] = new ModelRendererTurbo(this, 8, 401, textureX, textureY); // Du loco part05
		bodyModel[343] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Du loco part05
		bodyModel[344] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[345] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[346] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[347] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[348] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[349] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[350] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[351] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[352] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[353] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[354] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[355] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[356] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[357] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[358] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[359] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[360] = new ModelRendererTurbo(this, 16, 377, textureX, textureY); // Du loco part05
		bodyModel[361] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[362] = new ModelRendererTurbo(this, 8, 384, textureX, textureY); // Du loco part05
		bodyModel[363] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[364] = new ModelRendererTurbo(this, 16, 377, textureX, textureY); // Du loco part05
		bodyModel[365] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[366] = new ModelRendererTurbo(this, 8, 384, textureX, textureY); // Du loco part05
		bodyModel[367] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[368] = new ModelRendererTurbo(this, 2, 378, textureX, textureY); // Du loco part05
		bodyModel[369] = new ModelRendererTurbo(this, 2, 378, textureX, textureY); // Du loco part05
		bodyModel[370] = new ModelRendererTurbo(this, 8, 401, textureX, textureY); // Du loco part05
		bodyModel[371] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Du loco part05
		bodyModel[372] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[373] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[374] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[375] = new ModelRendererTurbo(this, 74, 392, textureX, textureY); // Du loco part19
		bodyModel[376] = new ModelRendererTurbo(this, 144, 371, textureX, textureY); // Box 168
		bodyModel[377] = new ModelRendererTurbo(this, 75, 309, textureX, textureY); // Du loco part19
		bodyModel[378] = new ModelRendererTurbo(this, 137, 349, textureX, textureY); // Du loco part28
		bodyModel[379] = new ModelRendererTurbo(this, 137, 349, textureX, textureY); // Du loco part28
		bodyModel[380] = new ModelRendererTurbo(this, 144, 371, textureX, textureY); // Box 168
		bodyModel[381] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[382] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[383] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[384] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[385] = new ModelRendererTurbo(this, 22, 2, textureX, textureY); // Du loco part01
		bodyModel[386] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[387] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[388] = new ModelRendererTurbo(this, 23, 2, textureX, textureY); // Du loco part01
		bodyModel[389] = new ModelRendererTurbo(this, 25, 2, textureX, textureY); // Du loco part01
		bodyModel[390] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Du loco part01
		bodyModel[391] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part01
		bodyModel[392] = new ModelRendererTurbo(this, 21, 3, textureX, textureY); // Du loco part01
		bodyModel[393] = new ModelRendererTurbo(this, 23, 9, textureX, textureY); // Du loco part01
		bodyModel[394] = new ModelRendererTurbo(this, 22, 9, textureX, textureY); // Du loco part01
		bodyModel[395] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Du loco part01
		bodyModel[396] = new ModelRendererTurbo(this, 20, 2, textureX, textureY); // Du loco part01
		bodyModel[397] = new ModelRendererTurbo(this, 24, 2, textureX, textureY); // Du loco part01
		bodyModel[398] = new ModelRendererTurbo(this, 30, 11, textureX, textureY); // Du loco part01
		bodyModel[399] = new ModelRendererTurbo(this, 27, 10, textureX, textureY); // Du loco part01
		bodyModel[400] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[401] = new ModelRendererTurbo(this, 20, 7, textureX, textureY); // Du loco part01
		bodyModel[402] = new ModelRendererTurbo(this, 22, 7, textureX, textureY); // Du loco part01
		bodyModel[403] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Du loco part01
		bodyModel[404] = new ModelRendererTurbo(this, 20, 8, textureX, textureY); // Du loco part01
		bodyModel[405] = new ModelRendererTurbo(this, 19, 3, textureX, textureY); // Du loco part01
		bodyModel[406] = new ModelRendererTurbo(this, 22, 6, textureX, textureY); // Du loco part01
		bodyModel[407] = new ModelRendererTurbo(this, 20, 3, textureX, textureY); // Du loco part01
		bodyModel[408] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Du loco part01
		bodyModel[409] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Du loco part01
		bodyModel[410] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[411] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[412] = new ModelRendererTurbo(this, 25, 4, textureX, textureY); // Du loco part01
		bodyModel[413] = new ModelRendererTurbo(this, 21, 3, textureX, textureY); // Du loco part01
		bodyModel[414] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[415] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[416] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[417] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[418] = new ModelRendererTurbo(this, 25, 5, textureX, textureY); // Du loco part01
		bodyModel[419] = new ModelRendererTurbo(this, 25, 5, textureX, textureY); // Du loco part01
		bodyModel[420] = new ModelRendererTurbo(this, 25, 3, textureX, textureY); // Du loco part01
		bodyModel[421] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[422] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[423] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[424] = new ModelRendererTurbo(this, 22, 2, textureX, textureY); // Du loco part01
		bodyModel[425] = new ModelRendererTurbo(this, 23, 2, textureX, textureY); // Du loco part01
		bodyModel[426] = new ModelRendererTurbo(this, 25, 2, textureX, textureY); // Du loco part01
		bodyModel[427] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Du loco part01
		bodyModel[428] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part01
		bodyModel[429] = new ModelRendererTurbo(this, 21, 3, textureX, textureY); // Du loco part01
		bodyModel[430] = new ModelRendererTurbo(this, 23, 9, textureX, textureY); // Du loco part01
		bodyModel[431] = new ModelRendererTurbo(this, 22, 9, textureX, textureY); // Du loco part01
		bodyModel[432] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Du loco part01
		bodyModel[433] = new ModelRendererTurbo(this, 20, 2, textureX, textureY); // Du loco part01
		bodyModel[434] = new ModelRendererTurbo(this, 24, 2, textureX, textureY); // Du loco part01
		bodyModel[435] = new ModelRendererTurbo(this, 30, 11, textureX, textureY); // Du loco part01
		bodyModel[436] = new ModelRendererTurbo(this, 27, 10, textureX, textureY); // Du loco part01
		bodyModel[437] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[438] = new ModelRendererTurbo(this, 20, 7, textureX, textureY); // Du loco part01
		bodyModel[439] = new ModelRendererTurbo(this, 22, 7, textureX, textureY); // Du loco part01
		bodyModel[440] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Du loco part01
		bodyModel[441] = new ModelRendererTurbo(this, 20, 8, textureX, textureY); // Du loco part01
		bodyModel[442] = new ModelRendererTurbo(this, 19, 3, textureX, textureY); // Du loco part01
		bodyModel[443] = new ModelRendererTurbo(this, 22, 6, textureX, textureY); // Du loco part01
		bodyModel[444] = new ModelRendererTurbo(this, 20, 3, textureX, textureY); // Du loco part01
		bodyModel[445] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Du loco part01
		bodyModel[446] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Du loco part01
		bodyModel[447] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[448] = new ModelRendererTurbo(this, 25, 4, textureX, textureY); // Du loco part01
		bodyModel[449] = new ModelRendererTurbo(this, 21, 3, textureX, textureY); // Du loco part01
		bodyModel[450] = new ModelRendererTurbo(this, 25, 5, textureX, textureY); // Du loco part01
		bodyModel[451] = new ModelRendererTurbo(this, 25, 5, textureX, textureY); // Du loco part01
		bodyModel[452] = new ModelRendererTurbo(this, 25, 3, textureX, textureY); // Du loco part01
		bodyModel[453] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[454] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[455] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[456] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[457] = new ModelRendererTurbo(this, 22, 2, textureX, textureY); // Du loco part01
		bodyModel[458] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[459] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[460] = new ModelRendererTurbo(this, 23, 2, textureX, textureY); // Du loco part01
		bodyModel[461] = new ModelRendererTurbo(this, 25, 2, textureX, textureY); // Du loco part01
		bodyModel[462] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Du loco part01
		bodyModel[463] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part01
		bodyModel[464] = new ModelRendererTurbo(this, 21, 3, textureX, textureY); // Du loco part01
		bodyModel[465] = new ModelRendererTurbo(this, 23, 9, textureX, textureY); // Du loco part01
		bodyModel[466] = new ModelRendererTurbo(this, 22, 9, textureX, textureY); // Du loco part01
		bodyModel[467] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Du loco part01
		bodyModel[468] = new ModelRendererTurbo(this, 20, 2, textureX, textureY); // Du loco part01
		bodyModel[469] = new ModelRendererTurbo(this, 24, 2, textureX, textureY); // Du loco part01
		bodyModel[470] = new ModelRendererTurbo(this, 30, 11, textureX, textureY); // Du loco part01
		bodyModel[471] = new ModelRendererTurbo(this, 27, 10, textureX, textureY); // Du loco part01
		bodyModel[472] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[473] = new ModelRendererTurbo(this, 20, 7, textureX, textureY); // Du loco part01
		bodyModel[474] = new ModelRendererTurbo(this, 22, 7, textureX, textureY); // Du loco part01
		bodyModel[475] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Du loco part01
		bodyModel[476] = new ModelRendererTurbo(this, 20, 8, textureX, textureY); // Du loco part01
		bodyModel[477] = new ModelRendererTurbo(this, 19, 3, textureX, textureY); // Du loco part01
		bodyModel[478] = new ModelRendererTurbo(this, 22, 6, textureX, textureY); // Du loco part01
		bodyModel[479] = new ModelRendererTurbo(this, 20, 3, textureX, textureY); // Du loco part01
		bodyModel[480] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Du loco part01
		bodyModel[481] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Du loco part01
		bodyModel[482] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[483] = new ModelRendererTurbo(this, 22, 2, textureX, textureY); // Du loco part01
		bodyModel[484] = new ModelRendererTurbo(this, 23, 2, textureX, textureY); // Du loco part01
		bodyModel[485] = new ModelRendererTurbo(this, 25, 2, textureX, textureY); // Du loco part01
		bodyModel[486] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Du loco part01
		bodyModel[487] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part01
		bodyModel[488] = new ModelRendererTurbo(this, 21, 3, textureX, textureY); // Du loco part01
		bodyModel[489] = new ModelRendererTurbo(this, 23, 9, textureX, textureY); // Du loco part01
		bodyModel[490] = new ModelRendererTurbo(this, 22, 9, textureX, textureY); // Du loco part01
		bodyModel[491] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Du loco part01
		bodyModel[492] = new ModelRendererTurbo(this, 20, 2, textureX, textureY); // Du loco part01
		bodyModel[493] = new ModelRendererTurbo(this, 24, 2, textureX, textureY); // Du loco part01
		bodyModel[494] = new ModelRendererTurbo(this, 30, 11, textureX, textureY); // Du loco part01
		bodyModel[495] = new ModelRendererTurbo(this, 27, 10, textureX, textureY); // Du loco part01
		bodyModel[496] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[497] = new ModelRendererTurbo(this, 20, 7, textureX, textureY); // Du loco part01
		bodyModel[498] = new ModelRendererTurbo(this, 22, 7, textureX, textureY); // Du loco part01
		bodyModel[499] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Du loco part01

		bodyModel[0].addBox(0F, 0F, 0F, 28, 6, 13, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(6F, -9F, -6.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 84, 1, 20, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(0F, -12F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part05
		bodyModel[2].setRotationPoint(0F, -11F, 11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[3].setRotationPoint(0F, -11F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 54, 20, 1, 0F); // Du loco part07
		bodyModel[4].setRotationPoint(15F, -30F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 83, 3, 4, 0F); // Du loco part08
		bodyModel[5].setRotationPoint(0.5F, -33F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[6].setRotationPoint(-16F, -10F, 6.05F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[7].setRotationPoint(-1F, -20F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Du loco part20
		bodyModel[8].setRotationPoint(68F, -30F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 14, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[9].setRotationPoint(1F, -30F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[10].setRotationPoint(1F, -30F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[11].setRotationPoint(-2F, -9F, -8F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[12].setRotationPoint(-6F, -9F, 4F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[13].setRotationPoint(-6F, -9F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[14].setRotationPoint(1F, -19F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[15].setRotationPoint(6F, -13F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[16].setRotationPoint(6F, -13F, -6F);
		bodyModel[16].rotateAngleY = -1.57079633F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[17].setRotationPoint(6F, -13F, -3F);
		bodyModel[17].rotateAngleY = -1.57079633F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[18].setRotationPoint(6F, -16F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[19].setRotationPoint(6F, -16F, -3F);
		bodyModel[19].rotateAngleY = -1.57079633F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[20].setRotationPoint(6F, -16F, -6F);
		bodyModel[20].rotateAngleY = -1.57079633F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[21].setRotationPoint(9F, -20F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[22].setRotationPoint(9F, -20F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[23].setRotationPoint(9F, -20F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[24].setRotationPoint(-2F, -17F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[25].setRotationPoint(-2F, -15F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[26].setRotationPoint(-2F, -15F, 4F);

		bodyModel[27].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[27].setRotationPoint(-2F, -17F, 4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 83, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 149
		bodyModel[28].setRotationPoint(0.5F, -31F, 9F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[29].setRotationPoint(-5F, -9F, -6F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[30].setRotationPoint(-5F, -9F, 5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 174
		bodyModel[31].setRotationPoint(-1F, -11F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[32].setRotationPoint(9F, -16F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[33].setRotationPoint(8F, -15F, -4F);
		bodyModel[33].rotateAngleY = -1.57079633F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[34].setRotationPoint(7F, -15F, -4F);
		bodyModel[34].rotateAngleY = -1.57079633F;

		bodyModel[35].addBox(0F, 0F, 0F, 54, 20, 1, 0F); // Box 135
		bodyModel[35].setRotationPoint(15F, -30F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 136
		bodyModel[36].setRotationPoint(15F, -30F, -10F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[37].setRotationPoint(20F, -16F, -2F);

		bodyModel[38].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[38].setRotationPoint(19F, -22F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[39].setRotationPoint(19F, -24F, -3F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 142
		bodyModel[40].setRotationPoint(20F, -25F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 143
		bodyModel[41].setRotationPoint(19F, -26F, -3F);

		bodyModel[42].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 144
		bodyModel[42].setRotationPoint(19F, -30F, -3F);

		bodyModel[43].addBox(0F, 0F, 0F, 12, 15, 12, 0F); // Box 145
		bodyModel[43].setRotationPoint(28F, -27F, -5F);

		bodyModel[44].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 146
		bodyModel[44].setRotationPoint(27F, -28F, -6F);

		bodyModel[45].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[45].setRotationPoint(22F, -19F, -4F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 148
		bodyModel[46].setRotationPoint(26F, -26F, -4F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[47].setRotationPoint(27F, -26F, -4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[48].setRotationPoint(41F, -16F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[49].setRotationPoint(51F, -16F, -2F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 152
		bodyModel[50].setRotationPoint(52F, -30F, -1F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 153
		bodyModel[51].setRotationPoint(42F, -30F, -1F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 154
		bodyModel[52].setRotationPoint(45F, -27F, -1F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 155
		bodyModel[53].setRotationPoint(49F, -27F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 156
		bodyModel[54].setRotationPoint(49F, -18F, -1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F); // Box 157
		bodyModel[55].setRotationPoint(45F, -18F, -1F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 158
		bodyModel[56].setRotationPoint(47F, -26F, -1F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 159
		bodyModel[57].setRotationPoint(51F, -26F, -1F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 160
		bodyModel[58].setRotationPoint(44F, -26F, -1F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[59].setRotationPoint(5F, -33F, -6F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[60].setRotationPoint(5F, -33F, 5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[61].setRotationPoint(23F, -33F, -6F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[62].setRotationPoint(23F, -33F, 5F);

		bodyModel[63].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[63].setRotationPoint(5F, -34F, -6F);

		bodyModel[64].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[64].setRotationPoint(5F, -34F, 5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[65].setRotationPoint(-6F, -8F, 4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[66].setRotationPoint(-6F, -10F, 4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[67].setRotationPoint(-6F, -8F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[68].setRotationPoint(-6F, -10F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part42
		bodyModel[69].setRotationPoint(-3F, -7F, 4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[70].setRotationPoint(-3F, -7F, -10F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[71].setRotationPoint(13F, -37F, -4F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[72].setRotationPoint(13F, -37F, 3F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[73].setRotationPoint(14F, -38F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[74].setRotationPoint(14F, -38F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[75].setRotationPoint(14F, -38F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[76].setRotationPoint(-3F, -8F, -1F);

		bodyModel[77].addBox(0F, 0F, 0F, 20, 1, 0, 0F); // Lamp
		bodyModel[77].setRotationPoint(32F, -34F, -7.05F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[78].setRotationPoint(2F, -35F, -5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[79].setRotationPoint(2F, -36F, -4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part Ligjhtpart8
		bodyModel[80].setRotationPoint(0.5F, -34F, -2F);

		bodyModel[81].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[81].setRotationPoint(-2F, -16F, -9F);

		bodyModel[82].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[82].setRotationPoint(-2F, -16F, 4F);

		bodyModel[83].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[83].setRotationPoint(-0.5F, -34F, -3F);

		bodyModel[84].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[84].setRotationPoint(-0.5F, -31F, -3F);

		bodyModel[85].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Lamp
		bodyModel[85].setRotationPoint(-0.5F, -33F, -3F);

		bodyModel[86].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[86].setRotationPoint(-0.5F, -31F, 1F);

		bodyModel[87].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[87].setRotationPoint(-0.5F, -32F, 1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 83, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[88].setRotationPoint(0.5F, -32F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 83, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[89].setRotationPoint(0.5F, -33F, 2F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[90].setRotationPoint(13F, -34F, -9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 83, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[91].setRotationPoint(0.5F, -33F, -6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 83, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[92].setRotationPoint(0.5F, -32F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 83, 1, 2, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[93].setRotationPoint(0.5F, -31F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[94].setRotationPoint(-1F, -11F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[95].setRotationPoint(10F, -11F, -9F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[96].setRotationPoint(13F, -11F, -9F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[97].setRotationPoint(10F, -11F, 8F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[98].setRotationPoint(13F, -11F, 8F);

		bodyModel[99].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[99].setRotationPoint(10F, -5F, -11F);

		bodyModel[100].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[100].setRotationPoint(10F, -7F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[101].setRotationPoint(10F, -9F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[102].setRotationPoint(10F, -5F, 9F);

		bodyModel[103].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[103].setRotationPoint(10F, -7F, 9F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[104].setRotationPoint(10F, -9F, 9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[105].setRotationPoint(-4F, -9F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[106].setRotationPoint(9F, -25F, 11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[107].setRotationPoint(14F, -25F, 11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[108].setRotationPoint(9F, -25F, -12F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[109].setRotationPoint(14F, -25F, -12F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Du loco part05
		bodyModel[110].setRotationPoint(-1F, -20F, 11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[111].setRotationPoint(-1F, -20F, -12F);

		bodyModel[112].addShapeBox(0F, 0F, 1F, 1, 1, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 167
		bodyModel[112].setRotationPoint(-2F, -20F, -12F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[113].setRotationPoint(61F, -9F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[114].setRotationPoint(26F, -9F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[115].setRotationPoint(27F, -10F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[116].setRotationPoint(27F, -10F, 10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[117].setRotationPoint(29F, -10F, 10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[118].setRotationPoint(26F, -10F, 10F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[119].setRotationPoint(61F, -10F, -11F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[120].setRotationPoint(64F, -10F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[121].setRotationPoint(75F, -11F, 11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[122].setRotationPoint(75F, -11F, -12F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[123].setRotationPoint(83F, -20F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 14, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[124].setRotationPoint(69F, -30F, 10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 14, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[125].setRotationPoint(69F, -30F, -11F);

		bodyModel[126].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[126].setRotationPoint(85F, -17F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[127].setRotationPoint(85F, -15F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart15
		bodyModel[128].setRotationPoint(85F, -15F, 4F);

		bodyModel[129].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart13
		bodyModel[129].setRotationPoint(85F, -17F, 4F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part Ligjhtpart8
		bodyModel[130].setRotationPoint(79.5F, -34F, -2F);

		bodyModel[131].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[131].setRotationPoint(85F, -16F, -9F);

		bodyModel[132].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[132].setRotationPoint(85F, -16F, 4F);

		bodyModel[133].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[133].setRotationPoint(83.5F, -34F, -3F);

		bodyModel[134].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[134].setRotationPoint(83.5F, -31F, -3F);

		bodyModel[135].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Du loco part Ligjhtpart18
		bodyModel[135].setRotationPoint(83.5F, -33F, -3F);

		bodyModel[136].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[136].setRotationPoint(83.5F, -31F, -5F);

		bodyModel[137].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[137].setRotationPoint(83.5F, -32F, -5F);

		bodyModel[138].addShapeBox(0F, 0F, 1F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[138].setRotationPoint(83F, -20F, 9F);

		bodyModel[139].addShapeBox(0F, 0F, 1F, 2, 9, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[139].setRotationPoint(83F, -20F, -12F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[140].setRotationPoint(69F, -25F, 11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[141].setRotationPoint(74F, -25F, 11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[142].setRotationPoint(69F, -25F, -12F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[143].setRotationPoint(74F, -25F, -12F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[144].setRotationPoint(75F, -20F, 11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[145].setRotationPoint(75F, -20F, -12F);

		bodyModel[146].addShapeBox(0F, 0F, 1F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 167
		bodyModel[146].setRotationPoint(85F, -20F, -12F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[147].setRotationPoint(85F, -9F, -8F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[148].setRotationPoint(89F, -9F, 4F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[149].setRotationPoint(89F, -9F, -7F);

		bodyModel[150].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[150].setRotationPoint(86F, -9F, -6F);

		bodyModel[151].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[151].setRotationPoint(86F, -9F, 5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[152].setRotationPoint(89F, -8F, 4F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[153].setRotationPoint(89F, -10F, 4F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[154].setRotationPoint(89F, -8F, -7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[155].setRotationPoint(89F, -10F, -7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[156].setRotationPoint(82F, -7F, 4F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[157].setRotationPoint(82F, -7F, -10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[158].setRotationPoint(86F, -8F, -1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[159].setRotationPoint(87F, -9F, -1F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[160].setRotationPoint(60F, -33F, -6F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[161].setRotationPoint(60F, -33F, 5F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[162].setRotationPoint(78F, -33F, -6F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[163].setRotationPoint(78F, -33F, 5F);

		bodyModel[164].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[164].setRotationPoint(60F, -34F, -6F);

		bodyModel[165].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[165].setRotationPoint(60F, -34F, 5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[166].setRotationPoint(73F, -40F, 4F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[167].setRotationPoint(60F, -40F, 4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[168].setRotationPoint(70F, -46F, 3F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[169].setRotationPoint(60F, -46F, 3F);

		bodyModel[170].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[170].setRotationPoint(68F, -47F, -4F);

		bodyModel[171].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[171].setRotationPoint(68F, -47F, 3F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[172].setRotationPoint(69F, -48F, -6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[173].setRotationPoint(69F, -48F, 6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[174].setRotationPoint(69F, -48F, -8F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[175].setRotationPoint(73F, -40F, -5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[176].setRotationPoint(60F, -40F, -5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[177].setRotationPoint(70F, -46F, -4F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[178].setRotationPoint(60F, -46F, -4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[179].setRotationPoint(78F, -19F, -10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[180].setRotationPoint(74F, -13F, -6F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[181].setRotationPoint(74F, -13F, -6F);
		bodyModel[181].rotateAngleY = -1.57079633F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[182].setRotationPoint(74F, -13F, -3F);
		bodyModel[182].rotateAngleY = -1.57079633F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[183].setRotationPoint(75F, -16F, -6F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[184].setRotationPoint(75F, -16F, -3F);
		bodyModel[184].rotateAngleY = -1.57079633F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[185].setRotationPoint(75F, -16F, -6F);
		bodyModel[185].rotateAngleY = -1.57079633F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[186].setRotationPoint(74F, -20F, -6F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[187].setRotationPoint(74F, -20F, -7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[188].setRotationPoint(74F, -20F, -4F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[189].setRotationPoint(74F, -16F, -7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[190].setRotationPoint(76F, -15F, -4F);
		bodyModel[190].rotateAngleY = -1.57079633F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[191].setRotationPoint(75F, -15F, -4F);
		bodyModel[191].rotateAngleY = -1.57079633F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[192].setRotationPoint(18F, -35F, 4F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, 0F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -7F); // Du loco part37
		bodyModel[193].setRotationPoint(16F, -37F, -4F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[194].setRotationPoint(2F, -35F, 4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[195].setRotationPoint(2F, -36F, 3F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[196].setRotationPoint(18F, -35F, -5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[197].setRotationPoint(15F, -36F, -4F);

		bodyModel[198].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[198].setRotationPoint(68F, -37F, -4F);

		bodyModel[199].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[199].setRotationPoint(68F, -37F, 3F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[200].setRotationPoint(69F, -38F, -6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[201].setRotationPoint(69F, -38F, 6F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[202].setRotationPoint(69F, -38F, -8F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[203].setRotationPoint(57F, -35F, -5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[204].setRotationPoint(57F, -36F, -4F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[205].setRotationPoint(73F, -35F, 4F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[206].setRotationPoint(70F, -36F, 3F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[207].setRotationPoint(57F, -35F, 4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[208].setRotationPoint(57F, -36F, 3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[209].setRotationPoint(73F, -35F, -5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[210].setRotationPoint(70F, -36F, -4F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[211].setRotationPoint(18F, -40F, 4F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[212].setRotationPoint(5F, -40F, 4F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[213].setRotationPoint(15F, -46F, 3F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[214].setRotationPoint(5F, -46F, 3F);

		bodyModel[215].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[215].setRotationPoint(13F, -47F, -4F);

		bodyModel[216].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[216].setRotationPoint(13F, -47F, 3F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[217].setRotationPoint(14F, -48F, -6F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[218].setRotationPoint(14F, -48F, 6F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[219].setRotationPoint(14F, -48F, -8F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[220].setRotationPoint(18F, -40F, -5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[221].setRotationPoint(5F, -40F, -5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[222].setRotationPoint(15F, -46F, -4F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[223].setRotationPoint(5F, -46F, -4F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[224].setRotationPoint(25F, -10F, -11F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[225].setRotationPoint(29F, -8F, -11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[226].setRotationPoint(24F, -8F, -11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[227].setRotationPoint(25F, -8F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[228].setRotationPoint(29F, -10F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[229].setRotationPoint(24F, -10F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[230].setRotationPoint(24F, -9F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[231].setRotationPoint(29F, -9F, -11F);

		bodyModel[232].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[232].setRotationPoint(25F, -9F, -11F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[233].setRotationPoint(70F, -11F, -9F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[234].setRotationPoint(73F, -11F, -9F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[235].setRotationPoint(70F, -11F, 8F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[236].setRotationPoint(73F, -11F, 8F);

		bodyModel[237].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[237].setRotationPoint(70F, -5F, -11F);

		bodyModel[238].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[238].setRotationPoint(70F, -7F, -11F);

		bodyModel[239].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[239].setRotationPoint(70F, -9F, -11F);

		bodyModel[240].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[240].setRotationPoint(70F, -5F, 9F);

		bodyModel[241].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[241].setRotationPoint(70F, -7F, 9F);

		bodyModel[242].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[242].setRotationPoint(70F, -9F, 9F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[243].setRotationPoint(83F, -11F, 10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[244].setRotationPoint(83F, -11F, -11F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 156
		bodyModel[245].setRotationPoint(83F, -30F, -11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[246].setRotationPoint(83F, -30F, 10F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 156
		bodyModel[247].setRotationPoint(-1F, -30F, -11F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[248].setRotationPoint(-1F, -30F, 10F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[249].setRotationPoint(-1F, -32F, -10.75F);

		bodyModel[250].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[250].setRotationPoint(-0.5F, -32F, -11.25F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[251].setRotationPoint(-1F, -32F, 10.75F);

		bodyModel[252].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[252].setRotationPoint(-0.5F, -32F, 10.25F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[253].setRotationPoint(-3F, -21F, 11.05F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F); // Du loco part37
		bodyModel[254].setRotationPoint(16F, -46F, -4F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F); // Du loco part37
		bodyModel[255].setRotationPoint(16F, -46F, -4F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[256].setRotationPoint(15F, -36F, 3F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, -7F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F); // Du loco part37
		bodyModel[257].setRotationPoint(16F, -37F, -4F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[258].setRotationPoint(57F, -37F, -4F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[259].setRotationPoint(60F, -46F, -4F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[260].setRotationPoint(60F, -46F, -4F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[261].setRotationPoint(57F, -37F, -4F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[262].setRotationPoint(-3F, -21F, -11.05F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[263].setRotationPoint(-1F, -20F, -11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[264].setRotationPoint(-1F, -20F, 10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part41
		bodyModel[265].setRotationPoint(-2F, -11F, -10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part41
		bodyModel[266].setRotationPoint(85F, -11F, -10F);

		bodyModel[267].addBox(0F, 0F, 0F, 4, 18, 8, 0F); // Du loco part20
		bodyModel[267].setRotationPoint(69F, -30F, -4F);

		bodyModel[268].addBox(0F, 0F, 0F, 4, 18, 8, 0F); // Du loco part20
		bodyModel[268].setRotationPoint(11F, -30F, -4F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F); // Du loco part41
		bodyModel[269].setRotationPoint(-2F, -5F, 4F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[270].setRotationPoint(-2F, -5F, -5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F); // Du loco part41
		bodyModel[271].setRotationPoint(84F, -5F, 4F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[272].setRotationPoint(84F, -5F, -5F);

		bodyModel[273].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[273].setRotationPoint(16F, -34F, -9F);

		bodyModel[274].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[274].setRotationPoint(30F, -34F, -8F);

		bodyModel[275].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[275].setRotationPoint(41F, -34F, -8F);

		bodyModel[276].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[276].setRotationPoint(52F, -34F, -8F);

		bodyModel[277].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[277].setRotationPoint(52F, -34F, 6F);

		bodyModel[278].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[278].setRotationPoint(66F, -34F, 7F);

		bodyModel[279].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[279].setRotationPoint(69F, -34F, 7F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part37
		bodyModel[280].setRotationPoint(54F, -34F, 7F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part37
		bodyModel[281].setRotationPoint(15F, -34F, -8F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[282].setRotationPoint(20F, -22F, -11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[283].setRotationPoint(20F, -28F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[284].setRotationPoint(20F, -28F, -11F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[285].setRotationPoint(27F, -28F, -11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[286].setRotationPoint(56F, -22F, -11F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[287].setRotationPoint(56F, -28F, -11F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[288].setRotationPoint(56F, -28F, -11F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[289].setRotationPoint(63F, -28F, -11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[290].setRotationPoint(37F, -28F, -11F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[291].setRotationPoint(46F, -28F, -11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[292].setRotationPoint(38F, -21F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[293].setRotationPoint(38F, -29F, -11F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[294].setRotationPoint(42F, -28F, -11F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[295].setRotationPoint(38F, -27F, -11F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[296].setRotationPoint(42F, -27F, -11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[297].setRotationPoint(38F, -26.25F, -11F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[298].setRotationPoint(42F, -26.25F, -11F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[299].setRotationPoint(38F, -25.5F, -11F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[300].setRotationPoint(42F, -25.5F, -11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[301].setRotationPoint(38F, -24.75F, -11F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[302].setRotationPoint(42F, -24.75F, -11F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[303].setRotationPoint(38F, -24F, -11F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[304].setRotationPoint(42F, -24F, -11F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[305].setRotationPoint(38F, -23.25F, -11F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[306].setRotationPoint(42F, -23.25F, -11F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[307].setRotationPoint(38F, -22.5F, -11F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[308].setRotationPoint(42F, -22.5F, -11F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[309].setRotationPoint(38F, -21.75F, -11F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[310].setRotationPoint(42F, -21.75F, -11F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[311].setRotationPoint(42F, -28.5F, -11F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[312].setRotationPoint(38F, -28.5F, -11F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[313].setRotationPoint(38F, -27.75F, -11F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[314].setRotationPoint(42F, -27.75F, -11F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Du loco part06
		bodyModel[315].setRotationPoint(26F, -9F, 10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[316].setRotationPoint(3F, -22F, 10F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[317].setRotationPoint(3F, -28F, 10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[318].setRotationPoint(3F, -28F, 10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[319].setRotationPoint(7F, -28F, 10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[320].setRotationPoint(11F, -22F, 10F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[321].setRotationPoint(11F, -28F, 10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[322].setRotationPoint(11F, -28F, 10F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[323].setRotationPoint(12F, -28F, 10F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[324].setRotationPoint(3F, -22F, -11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[325].setRotationPoint(3F, -28F, -11F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[326].setRotationPoint(3F, -28F, -11F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[327].setRotationPoint(7F, -28F, -11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[328].setRotationPoint(11F, -22F, -11F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[329].setRotationPoint(11F, -28F, -11F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[330].setRotationPoint(11F, -28F, -11F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[331].setRotationPoint(12F, -28F, -11F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[332].setRotationPoint(-1F, -22F, 4F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[333].setRotationPoint(-1F, -29F, 4F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[334].setRotationPoint(-1F, -29F, 4F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[335].setRotationPoint(-1F, -29F, 8F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[336].setRotationPoint(-1F, -22F, -9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[337].setRotationPoint(-1F, -29F, -9F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[338].setRotationPoint(-1F, -29F, -9F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[339].setRotationPoint(-1F, -29F, -5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[340].setRotationPoint(-1F, -22F, -2F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.75F, 0F); // Du loco part05
		bodyModel[341].setRotationPoint(-1F, -29F, -2F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[342].setRotationPoint(-1F, -29F, -2F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[343].setRotationPoint(-1F, -29F, 1F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[344].setRotationPoint(76F, -22F, 10F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[345].setRotationPoint(76F, -28F, 10F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[346].setRotationPoint(76F, -28F, 10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[347].setRotationPoint(80F, -28F, 10F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[348].setRotationPoint(71F, -22F, 10F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[349].setRotationPoint(71F, -28F, 10F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[350].setRotationPoint(71F, -28F, 10F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[351].setRotationPoint(72F, -28F, 10F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[352].setRotationPoint(76F, -22F, -11F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[353].setRotationPoint(76F, -28F, -11F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[354].setRotationPoint(76F, -28F, -11F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[355].setRotationPoint(80F, -28F, -11F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[356].setRotationPoint(71F, -22F, -11F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[357].setRotationPoint(71F, -28F, -11F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[358].setRotationPoint(71F, -28F, -11F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[359].setRotationPoint(72F, -28F, -11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[360].setRotationPoint(83F, -22F, 4F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[361].setRotationPoint(83F, -29F, 4F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[362].setRotationPoint(83F, -29F, 4F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[363].setRotationPoint(83F, -29F, 8F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[364].setRotationPoint(83F, -22F, -9F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[365].setRotationPoint(83F, -29F, -9F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[366].setRotationPoint(83F, -29F, -9F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[367].setRotationPoint(83F, -29F, -5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[368].setRotationPoint(83F, -22F, -2F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[369].setRotationPoint(83F, -29F, -2F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[370].setRotationPoint(83F, -29F, -2F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[371].setRotationPoint(83F, -29F, 1F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[372].setRotationPoint(61F, -9F, -10F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[373].setRotationPoint(61F, -10F, -10F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[374].setRotationPoint(61F, -10F, -11F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 10, 20, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[375].setRotationPoint(83F, -30F, -10F);

		bodyModel[376].addShapeBox(0F, 0F, 1F, 2, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[376].setRotationPoint(83F, -30F, 9F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 10, 20, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[377].setRotationPoint(-1F, -30F, -10F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[378].setRotationPoint(-1F, -30F, 10F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[379].setRotationPoint(-1F, -30F, -11F);

		bodyModel[380].addShapeBox(0F, 0F, 1F, 2, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[380].setRotationPoint(83F, -30F, -12F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 5, 6, 13, 0F,0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[381].setRotationPoint(1F, -9F, -6.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 5, 6, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[382].setRotationPoint(34F, -9F, -6.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[383].setRotationPoint(5F, -10F, 6.05F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 86, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part01
		bodyModel[384].setRotationPoint(-1F, -11F, -6.5F);

		bodyModel[385].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[385].setRotationPoint(4.5F, -8F, -7.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[386].setRotationPoint(-16F, -10F, -6.05F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[387].setRotationPoint(5F, -10F, -6.05F);

		bodyModel[388].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[388].setRotationPoint(7.5F, -6F, -7.5F);

		bodyModel[389].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[389].setRotationPoint(10.5F, -6F, -7.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[390].setRotationPoint(8.5F, -6F, -7.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[391].setRotationPoint(8.5F, -5F, -7.5F);

		bodyModel[392].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[392].setRotationPoint(13.5F, -8F, -7.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part01
		bodyModel[393].setRotationPoint(5.5F, -8F, -7.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[394].setRotationPoint(8.5F, -6F, -7.5F);

		bodyModel[395].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[395].setRotationPoint(25.5F, -8F, -7.5F);

		bodyModel[396].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[396].setRotationPoint(28.5F, -6F, -7.5F);

		bodyModel[397].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[397].setRotationPoint(31.5F, -6F, -7.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[398].setRotationPoint(29.5F, -6F, -7.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[399].setRotationPoint(29.5F, -5F, -7.5F);

		bodyModel[400].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[400].setRotationPoint(34.5F, -8F, -7.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part01
		bodyModel[401].setRotationPoint(26.5F, -8F, -7.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[402].setRotationPoint(29.5F, -6F, -7.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part01
		bodyModel[403].setRotationPoint(20F, -5.5F, -8.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[404].setRotationPoint(18.5F, -6.5F, -8.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part01
		bodyModel[405].setRotationPoint(19F, -7.75F, -8.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part01
		bodyModel[406].setRotationPoint(18.5F, -8.5F, -8.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[407].setRotationPoint(19F, -5.5F, -8.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part01
		bodyModel[408].setRotationPoint(20F, -7.75F, -8.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part01
		bodyModel[409].setRotationPoint(18.5F, -8F, -8.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part01
		bodyModel[410].setRotationPoint(18.75F, -9F, -7.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Du loco part01
		bodyModel[411].setRotationPoint(37F, -7F, -8.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part01
		bodyModel[412].setRotationPoint(37.25F, -5F, -8.25F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part01
		bodyModel[413].setRotationPoint(39.5F, -7F, -8.25F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 3, 3, 13, 0F,-0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[414].setRotationPoint(39F, -9F, -6.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 3, 3, 13, 0F,0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[415].setRotationPoint(42F, -9F, -6.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 3, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F); // Du loco part01
		bodyModel[416].setRotationPoint(39F, -6F, -6.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 3, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[417].setRotationPoint(42F, -6F, -6.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F); // Du loco part01
		bodyModel[418].setRotationPoint(40.5F, -11F, -8.25F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F); // Du loco part01
		bodyModel[419].setRotationPoint(41.5F, -11F, -8.25F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[420].setRotationPoint(38.25F, -4F, -8.25F);

		bodyModel[421].addBox(0F, 0F, 0F, 28, 6, 13, 0F); // Du loco part01
		bodyModel[421].setRotationPoint(50F, -9F, -6.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 5, 6, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[422].setRotationPoint(45F, -9F, -6.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 5, 6, 13, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[423].setRotationPoint(78F, -9F, -6.5F);

		bodyModel[424].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[424].setRotationPoint(4.5F, -8F, 6.5F);

		bodyModel[425].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[425].setRotationPoint(7.5F, -6F, 6.5F);

		bodyModel[426].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[426].setRotationPoint(10.5F, -6F, 6.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[427].setRotationPoint(8.5F, -6F, 6.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[428].setRotationPoint(8.5F, -5F, 6.5F);

		bodyModel[429].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[429].setRotationPoint(13.5F, -8F, 6.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part01
		bodyModel[430].setRotationPoint(5.5F, -8F, 6.5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part01
		bodyModel[431].setRotationPoint(8.5F, -6F, 6.5F);

		bodyModel[432].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[432].setRotationPoint(25.5F, -8F, 6.5F);

		bodyModel[433].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[433].setRotationPoint(28.5F, -6F, 6.5F);

		bodyModel[434].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[434].setRotationPoint(31.5F, -6F, 6.5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[435].setRotationPoint(29.5F, -6F, 6.5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[436].setRotationPoint(29.5F, -5F, 6.5F);

		bodyModel[437].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[437].setRotationPoint(34.5F, -8F, 6.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part01
		bodyModel[438].setRotationPoint(26.5F, -8F, 6.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part01
		bodyModel[439].setRotationPoint(29.5F, -6F, 6.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F); // Du loco part01
		bodyModel[440].setRotationPoint(20F, -5.5F, 5.5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[441].setRotationPoint(18.5F, -6.5F, 5.5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part01
		bodyModel[442].setRotationPoint(19F, -7.75F, 5.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part01
		bodyModel[443].setRotationPoint(18.5F, -8.5F, 5.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Du loco part01
		bodyModel[444].setRotationPoint(19F, -5.5F, 5.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part01
		bodyModel[445].setRotationPoint(20F, -7.75F, 5.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part01
		bodyModel[446].setRotationPoint(18.5F, -8F, 5.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Du loco part01
		bodyModel[447].setRotationPoint(37F, -7F, 7.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part01
		bodyModel[448].setRotationPoint(37.25F, -5F, 7F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part01
		bodyModel[449].setRotationPoint(39.5F, -7F, 7F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F); // Du loco part01
		bodyModel[450].setRotationPoint(40.5F, -11F, 6.75F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F); // Du loco part01
		bodyModel[451].setRotationPoint(41.5F, -11F, 6.75F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part01
		bodyModel[452].setRotationPoint(38.25F, -4F, 7F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Du loco part01
		bodyModel[453].setRotationPoint(37F, -7F, 6.5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Du loco part01
		bodyModel[454].setRotationPoint(37F, -7F, -7.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[455].setRotationPoint(28F, -10F, 6.05F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[456].setRotationPoint(49F, -10F, 6.05F);

		bodyModel[457].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[457].setRotationPoint(48.5F, -8F, -7.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[458].setRotationPoint(28F, -10F, -6.05F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[459].setRotationPoint(49F, -10F, -6.05F);

		bodyModel[460].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[460].setRotationPoint(51.5F, -6F, -7.5F);

		bodyModel[461].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[461].setRotationPoint(54.5F, -6F, -7.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[462].setRotationPoint(52.5F, -6F, -7.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[463].setRotationPoint(52.5F, -5F, -7.5F);

		bodyModel[464].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[464].setRotationPoint(57.5F, -8F, -7.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part01
		bodyModel[465].setRotationPoint(49.5F, -8F, -7.5F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[466].setRotationPoint(52.5F, -6F, -7.5F);

		bodyModel[467].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[467].setRotationPoint(69.5F, -8F, -7.5F);

		bodyModel[468].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[468].setRotationPoint(72.5F, -6F, -7.5F);

		bodyModel[469].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[469].setRotationPoint(75.5F, -6F, -7.5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[470].setRotationPoint(73.5F, -6F, -7.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[471].setRotationPoint(73.5F, -5F, -7.5F);

		bodyModel[472].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[472].setRotationPoint(78.5F, -8F, -7.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part01
		bodyModel[473].setRotationPoint(70.5F, -8F, -7.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[474].setRotationPoint(73.5F, -6F, -7.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part01
		bodyModel[475].setRotationPoint(64F, -5.5F, -8.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[476].setRotationPoint(62.5F, -6.5F, -8.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part01
		bodyModel[477].setRotationPoint(63F, -7.75F, -8.5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part01
		bodyModel[478].setRotationPoint(62.5F, -8.5F, -8.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[479].setRotationPoint(63F, -5.5F, -8.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part01
		bodyModel[480].setRotationPoint(64F, -7.75F, -8.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part01
		bodyModel[481].setRotationPoint(62.5F, -8F, -8.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part01
		bodyModel[482].setRotationPoint(62.75F, -9F, -7.5F);

		bodyModel[483].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[483].setRotationPoint(48.5F, -8F, 6.5F);

		bodyModel[484].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[484].setRotationPoint(51.5F, -6F, 6.5F);

		bodyModel[485].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[485].setRotationPoint(54.5F, -6F, 6.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[486].setRotationPoint(52.5F, -6F, 6.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[487].setRotationPoint(52.5F, -5F, 6.5F);

		bodyModel[488].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[488].setRotationPoint(57.5F, -8F, 6.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part01
		bodyModel[489].setRotationPoint(49.5F, -8F, 6.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part01
		bodyModel[490].setRotationPoint(52.5F, -6F, 6.5F);

		bodyModel[491].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[491].setRotationPoint(69.5F, -8F, 6.5F);

		bodyModel[492].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[492].setRotationPoint(72.5F, -6F, 6.5F);

		bodyModel[493].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part01
		bodyModel[493].setRotationPoint(75.5F, -6F, 6.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[494].setRotationPoint(73.5F, -6F, 6.5F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[495].setRotationPoint(73.5F, -5F, 6.5F);

		bodyModel[496].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part01
		bodyModel[496].setRotationPoint(78.5F, -8F, 6.5F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part01
		bodyModel[497].setRotationPoint(70.5F, -8F, 6.5F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part01
		bodyModel[498].setRotationPoint(73.5F, -6F, 6.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F); // Du loco part01
		bodyModel[499].setRotationPoint(64F, -5.5F, 5.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 20, 8, textureX, textureY); // Du loco part01
		bodyModel[501] = new ModelRendererTurbo(this, 19, 3, textureX, textureY); // Du loco part01
		bodyModel[502] = new ModelRendererTurbo(this, 22, 6, textureX, textureY); // Du loco part01
		bodyModel[503] = new ModelRendererTurbo(this, 20, 3, textureX, textureY); // Du loco part01
		bodyModel[504] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Du loco part01
		bodyModel[505] = new ModelRendererTurbo(this, 24, 6, textureX, textureY); // Du loco part01
		bodyModel[506] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[507] = new ModelRendererTurbo(this, 25, 4, textureX, textureY); // Du loco part01
		bodyModel[508] = new ModelRendererTurbo(this, 21, 3, textureX, textureY); // Du loco part01
		bodyModel[509] = new ModelRendererTurbo(this, 25, 3, textureX, textureY); // Du loco part01
		bodyModel[510] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[511] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[512] = new ModelRendererTurbo(this, 25, 4, textureX, textureY); // Du loco part01
		bodyModel[513] = new ModelRendererTurbo(this, 21, 3, textureX, textureY); // Du loco part01
		bodyModel[514] = new ModelRendererTurbo(this, 25, 3, textureX, textureY); // Du loco part01
		bodyModel[515] = new ModelRendererTurbo(this, 26, 5, textureX, textureY); // Du loco part01
		bodyModel[516] = new ModelRendererTurbo(this, 46, 2, textureX, textureY); // Du loco part41
		bodyModel[517] = new ModelRendererTurbo(this, 46, 2, textureX, textureY); // Du loco part41
		bodyModel[518] = new ModelRendererTurbo(this, 46, 2, textureX, textureY); // Du loco part41
		bodyModel[519] = new ModelRendererTurbo(this, 46, 2, textureX, textureY); // Du loco part41
		bodyModel[520] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[521] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[522] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[523] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[524] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[525] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[526] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[527] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[528] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[529] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[530] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[531] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[532] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[533] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[534] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[535] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[536] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[537] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[538] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[539] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[540] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[541] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[542] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[543] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[544] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[545] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[546] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[547] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[548] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[549] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[550] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[551] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[552] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[553] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[554] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[555] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[556] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[557] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[558] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[559] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[560] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[561] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[562] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[563] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[564] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[565] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[566] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[567] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[568] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[569] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[570] = new ModelRendererTurbo(this, 1, 319, textureX, textureY); // Du loco part05
		bodyModel[571] = new ModelRendererTurbo(this, 20, 319, textureX, textureY); // Du loco part05
		bodyModel[572] = new ModelRendererTurbo(this, 1, 322, textureX, textureY); // Du loco part05
		bodyModel[573] = new ModelRendererTurbo(this, 6, 322, textureX, textureY); // Du loco part05
		bodyModel[574] = new ModelRendererTurbo(this, 1, 330, textureX, textureY); // Du loco part05
		bodyModel[575] = new ModelRendererTurbo(this, 20, 330, textureX, textureY); // Du loco part05
		bodyModel[576] = new ModelRendererTurbo(this, 1, 333, textureX, textureY); // Du loco part05
		bodyModel[577] = new ModelRendererTurbo(this, 6, 333, textureX, textureY); // Du loco part05
		bodyModel[578] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[579] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[580] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[581] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[582] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[583] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[584] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[585] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[586] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[587] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[588] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[589] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[590] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[591] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[592] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[593] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[594] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[595] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[596] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[597] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[598] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[599] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[600] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[601] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[602] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[603] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[604] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[605] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[606] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[607] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[608] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[609] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[610] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[611] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[612] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[613] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[614] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[615] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[616] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[617] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[618] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[619] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[620] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[621] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[622] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[623] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[624] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[625] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[626] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[627] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[628] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[629] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[630] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[631] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[632] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[633] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[634] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[635] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[636] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[637] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[638] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[639] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[640] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[641] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[642] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[643] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[644] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[645] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[646] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[647] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[648] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[649] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[650] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[651] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[652] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[653] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Lamp
		bodyModel[654] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Du loco part37
		bodyModel[655] = new ModelRendererTurbo(this, 233, 257, textureX, textureY); // Du loco part37
		bodyModel[656] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part37
		bodyModel[657] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Du loco part37
		bodyModel[658] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Du loco part37
		bodyModel[659] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Du loco part37
		bodyModel[660] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Du loco part37
		bodyModel[661] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Du loco part37

		bodyModel[500].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[500].setRotationPoint(62.5F, -6.5F, 5.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part01
		bodyModel[501].setRotationPoint(63F, -7.75F, 5.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part01
		bodyModel[502].setRotationPoint(62.5F, -8.5F, 5.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Du loco part01
		bodyModel[503].setRotationPoint(63F, -5.5F, 5.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part01
		bodyModel[504].setRotationPoint(64F, -7.75F, 5.5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part01
		bodyModel[505].setRotationPoint(62.5F, -8F, 5.5F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Du loco part01
		bodyModel[506].setRotationPoint(45F, -7F, -8.5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part01
		bodyModel[507].setRotationPoint(45.25F, -5F, -8.25F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part01
		bodyModel[508].setRotationPoint(42.5F, -7F, -8.25F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[509].setRotationPoint(43.75F, -4F, -8.25F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Du loco part01
		bodyModel[510].setRotationPoint(45F, -7F, -7.5F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Du loco part01
		bodyModel[511].setRotationPoint(45F, -7F, 6.25F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part01
		bodyModel[512].setRotationPoint(45.25F, -5F, 6.5F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part01
		bodyModel[513].setRotationPoint(42.5F, -7F, 6.5F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[514].setRotationPoint(43.75F, -4F, 6.5F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Du loco part01
		bodyModel[515].setRotationPoint(45F, -7F, 7.25F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Du loco part41
		bodyModel[516].setRotationPoint(-1F, -10F, 3F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Du loco part41
		bodyModel[517].setRotationPoint(-1F, -10F, -4F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[518].setRotationPoint(83F, -10F, 3F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[519].setRotationPoint(83F, -10F, -4F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[520].setRotationPoint(46F, -28F, -11F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[521].setRotationPoint(55F, -28F, -11F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[522].setRotationPoint(47F, -21F, -11F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[523].setRotationPoint(47F, -29F, -11F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[524].setRotationPoint(51F, -28F, -11F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[525].setRotationPoint(47F, -27F, -11F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[526].setRotationPoint(51F, -27F, -11F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[527].setRotationPoint(47F, -26.25F, -11F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[528].setRotationPoint(51F, -26.25F, -11F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[529].setRotationPoint(47F, -25.5F, -11F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[530].setRotationPoint(51F, -25.5F, -11F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[531].setRotationPoint(47F, -24.75F, -11F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[532].setRotationPoint(51F, -24.75F, -11F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[533].setRotationPoint(47F, -24F, -11F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[534].setRotationPoint(51F, -24F, -11F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[535].setRotationPoint(47F, -23.25F, -11F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[536].setRotationPoint(51F, -23.25F, -11F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[537].setRotationPoint(47F, -22.5F, -11F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[538].setRotationPoint(51F, -22.5F, -11F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[539].setRotationPoint(47F, -21.75F, -11F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[540].setRotationPoint(51F, -21.75F, -11F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[541].setRotationPoint(51F, -28.5F, -11F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[542].setRotationPoint(47F, -28.5F, -11F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[543].setRotationPoint(47F, -27.75F, -11F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[544].setRotationPoint(51F, -27.75F, -11F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[545].setRotationPoint(28F, -28F, -11F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[546].setRotationPoint(37F, -28F, -11F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[547].setRotationPoint(29F, -21F, -11F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[548].setRotationPoint(29F, -29F, -11F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[549].setRotationPoint(33F, -28F, -11F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[550].setRotationPoint(29F, -27F, -11F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[551].setRotationPoint(33F, -27F, -11F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[552].setRotationPoint(29F, -26.25F, -11F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[553].setRotationPoint(33F, -26.25F, -11F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[554].setRotationPoint(29F, -25.5F, -11F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[555].setRotationPoint(33F, -25.5F, -11F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[556].setRotationPoint(29F, -24.75F, -11F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[557].setRotationPoint(33F, -24.75F, -11F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[558].setRotationPoint(29F, -24F, -11F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[559].setRotationPoint(33F, -24F, -11F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[560].setRotationPoint(29F, -23.25F, -11F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[561].setRotationPoint(33F, -23.25F, -11F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[562].setRotationPoint(29F, -22.5F, -11F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[563].setRotationPoint(33F, -22.5F, -11F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[564].setRotationPoint(29F, -21.75F, -11F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[565].setRotationPoint(33F, -21.75F, -11F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[566].setRotationPoint(33F, -28.5F, -11F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[567].setRotationPoint(29F, -28.5F, -11F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[568].setRotationPoint(29F, -27.75F, -11F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[569].setRotationPoint(33F, -27.75F, -11F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[570].setRotationPoint(20F, -22F, 10F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[571].setRotationPoint(20F, -28F, 10F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[572].setRotationPoint(20F, -28F, 10F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[573].setRotationPoint(27F, -28F, 10F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[574].setRotationPoint(56F, -22F, 10F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[575].setRotationPoint(56F, -28F, 10F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[576].setRotationPoint(56F, -28F, 10F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[577].setRotationPoint(63F, -28F, 10F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[578].setRotationPoint(37F, -28F, 10F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[579].setRotationPoint(46F, -28F, 10F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[580].setRotationPoint(38F, -21F, 10F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[581].setRotationPoint(38F, -29F, 10F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[582].setRotationPoint(42F, -28F, 10F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[583].setRotationPoint(38F, -27F, 10F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[584].setRotationPoint(42F, -27F, 10F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[585].setRotationPoint(38F, -26.25F, 10F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[586].setRotationPoint(42F, -26.25F, 10F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[587].setRotationPoint(38F, -25.5F, 10F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[588].setRotationPoint(42F, -25.5F, 10F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[589].setRotationPoint(38F, -24.75F, 10F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[590].setRotationPoint(42F, -24.75F, 10F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[591].setRotationPoint(38F, -24F, 10F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[592].setRotationPoint(42F, -24F, 10F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[593].setRotationPoint(38F, -23.25F, 10F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[594].setRotationPoint(42F, -23.25F, 10F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[595].setRotationPoint(38F, -22.5F, 10F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[596].setRotationPoint(42F, -22.5F, 10F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[597].setRotationPoint(38F, -21.75F, 10F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[598].setRotationPoint(42F, -21.75F, 10F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[599].setRotationPoint(42F, -28.5F, 10F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[600].setRotationPoint(38F, -28.5F, 10F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[601].setRotationPoint(38F, -27.75F, 10F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[602].setRotationPoint(42F, -27.75F, 10F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[603].setRotationPoint(46F, -28F, 10F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[604].setRotationPoint(55F, -28F, 10F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[605].setRotationPoint(47F, -21F, 10F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[606].setRotationPoint(47F, -29F, 10F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[607].setRotationPoint(51F, -28F, 10F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[608].setRotationPoint(47F, -27F, 10F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[609].setRotationPoint(51F, -27F, 10F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[610].setRotationPoint(47F, -26.25F, 10F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[611].setRotationPoint(51F, -26.25F, 10F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[612].setRotationPoint(47F, -25.5F, 10F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[613].setRotationPoint(51F, -25.5F, 10F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[614].setRotationPoint(47F, -24.75F, 10F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[615].setRotationPoint(51F, -24.75F, 10F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[616].setRotationPoint(47F, -24F, 10F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[617].setRotationPoint(51F, -24F, 10F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[618].setRotationPoint(47F, -23.25F, 10F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[619].setRotationPoint(51F, -23.25F, 10F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[620].setRotationPoint(47F, -22.5F, 10F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[621].setRotationPoint(51F, -22.5F, 10F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[622].setRotationPoint(47F, -21.75F, 10F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[623].setRotationPoint(51F, -21.75F, 10F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[624].setRotationPoint(51F, -28.5F, 10F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[625].setRotationPoint(47F, -28.5F, 10F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[626].setRotationPoint(47F, -27.75F, 10F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[627].setRotationPoint(51F, -27.75F, 10F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[628].setRotationPoint(28F, -28F, 10F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[629].setRotationPoint(37F, -28F, 10F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[630].setRotationPoint(29F, -21F, 10F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[631].setRotationPoint(29F, -29F, 10F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[632].setRotationPoint(33F, -28F, 10F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[633].setRotationPoint(29F, -27F, 10F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[634].setRotationPoint(33F, -27F, 10F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[635].setRotationPoint(29F, -26.25F, 10F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[636].setRotationPoint(33F, -26.25F, 10F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[637].setRotationPoint(29F, -25.5F, 10F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[638].setRotationPoint(33F, -25.5F, 10F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[639].setRotationPoint(29F, -24.75F, 10F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[640].setRotationPoint(33F, -24.75F, 10F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[641].setRotationPoint(29F, -24F, 10F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[642].setRotationPoint(33F, -24F, 10F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[643].setRotationPoint(29F, -23.25F, 10F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[644].setRotationPoint(33F, -23.25F, 10F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[645].setRotationPoint(29F, -22.5F, 10F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[646].setRotationPoint(33F, -22.5F, 10F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[647].setRotationPoint(29F, -21.75F, 10F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[648].setRotationPoint(33F, -21.75F, 10F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[649].setRotationPoint(33F, -28.5F, 10F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[650].setRotationPoint(29F, -28.5F, 10F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[651].setRotationPoint(29F, -27.75F, 10F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[652].setRotationPoint(33F, -27.75F, 10F);

		bodyModel[653].addBox(0F, 0F, 0F, 20, 1, 0, 0F); // Lamp
		bodyModel[653].setRotationPoint(32F, -34F, 6.95F);

		bodyModel[654].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[654].setRotationPoint(13F, -34F, 7F);

		bodyModel[655].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[655].setRotationPoint(16F, -34F, 7F);

		bodyModel[656].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[656].setRotationPoint(30F, -34F, 6F);

		bodyModel[657].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[657].setRotationPoint(41F, -34F, 6F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part37
		bodyModel[658].setRotationPoint(15F, -34F, 7F);

		bodyModel[659].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[659].setRotationPoint(66F, -34F, -9F);

		bodyModel[660].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[660].setRotationPoint(69F, -34F, -9F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part37
		bodyModel[661].setRotationPoint(54F, -34F, -8F);
	}
}