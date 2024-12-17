//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BJ Litterera Ds
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package sp.foxo.train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelBJLittDs extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBJLittDs() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[458];

		initbodyModel_1();

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
		bodyModel[7] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Du loco part17
		bodyModel[8] = new ModelRendererTurbo(this, 120, 310, textureX, textureY); // Du loco part19
		bodyModel[9] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Du loco part20
		bodyModel[10] = new ModelRendererTurbo(this, 106, 348, textureX, textureY); // Du loco part22
		bodyModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Du loco part27
		bodyModel[12] = new ModelRendererTurbo(this, 75, 348, textureX, textureY); // Du loco part28
		bodyModel[13] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Du loco part41
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part47
		bodyModel[15] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Du loco part56
		bodyModel[16] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Du loco part82
		bodyModel[17] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part83
		bodyModel[18] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Du loco part84
		bodyModel[19] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part85
		bodyModel[20] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part94
		bodyModel[21] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Du loco part95
		bodyModel[22] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part97
		bodyModel[23] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part100
		bodyModel[24] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Du loco part101
		bodyModel[25] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Du loco part102
		bodyModel[26] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Lamp
		bodyModel[27] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Lamp
		bodyModel[28] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Lamp
		bodyModel[29] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Lamp
		bodyModel[30] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 149
		bodyModel[31] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 154
		bodyModel[32] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 156
		bodyModel[33] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 174
		bodyModel[34] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 177
		bodyModel[35] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 194
		bodyModel[36] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 195
		bodyModel[37] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 135
		bodyModel[38] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 136
		bodyModel[39] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 138
		bodyModel[40] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 139
		bodyModel[41] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 141
		bodyModel[42] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 142
		bodyModel[43] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 143
		bodyModel[44] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 144
		bodyModel[45] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 145
		bodyModel[46] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 146
		bodyModel[47] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 147
		bodyModel[48] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 148
		bodyModel[49] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 149
		bodyModel[50] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 150
		bodyModel[51] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 151
		bodyModel[52] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 152
		bodyModel[53] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 153
		bodyModel[54] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 154
		bodyModel[55] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 155
		bodyModel[56] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 156
		bodyModel[57] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 157
		bodyModel[58] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 158
		bodyModel[59] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 159
		bodyModel[60] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 160
		bodyModel[61] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Du loco part37
		bodyModel[62] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Du loco part37
		bodyModel[63] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Du loco part37
		bodyModel[64] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Du loco part37
		bodyModel[65] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Du loco part37
		bodyModel[66] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part37
		bodyModel[67] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Du loco part47
		bodyModel[68] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Du loco part47
		bodyModel[69] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Du loco part47
		bodyModel[70] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Du loco part47
		bodyModel[71] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Du loco part42
		bodyModel[72] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Du loco part42
		bodyModel[73] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Du loco part37
		bodyModel[74] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Du loco part37
		bodyModel[75] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Du loco part37
		bodyModel[76] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Du loco part37
		bodyModel[77] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Du loco part37
		bodyModel[78] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Du loco part47
		bodyModel[79] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Lamp
		bodyModel[80] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Du loco part37
		bodyModel[81] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Du loco part37
		bodyModel[82] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[83] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Lamp
		bodyModel[84] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Lamp
		bodyModel[85] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Lamp
		bodyModel[86] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Lamp
		bodyModel[87] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Lamp
		bodyModel[88] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[89] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[90] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 149
		bodyModel[91] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 149
		bodyModel[92] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Du loco part37
		bodyModel[93] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Du loco part23
		bodyModel[94] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Du loco part23
		bodyModel[95] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Du loco part23
		bodyModel[96] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[97] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Du loco part23
		bodyModel[98] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Du loco part23
		bodyModel[99] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Du loco part23
		bodyModel[100] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Du loco part23
		bodyModel[101] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Du loco part09
		bodyModel[102] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Du loco part71
		bodyModel[103] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Du loco part71
		bodyModel[104] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Du loco part71
		bodyModel[105] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 174
		bodyModel[106] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Du loco part28
		bodyModel[107] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part28
		bodyModel[108] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[109] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[110] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Du loco part28
		bodyModel[111] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Du loco part28
		bodyModel[112] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Du loco part28
		bodyModel[113] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part28
		bodyModel[114] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Du loco part28
		bodyModel[115] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Du loco part28
		bodyModel[116] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Du loco part47
		bodyModel[117] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[118] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[119] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Du loco part28
		bodyModel[120] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Du loco part28
		bodyModel[121] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part05
		bodyModel[122] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Du loco part06
		bodyModel[123] = new ModelRendererTurbo(this, 137, 346, textureX, textureY); // Box 167
		bodyModel[124] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[125] = new ModelRendererTurbo(this, 206, 89, textureX, textureY); // Du loco part06
		bodyModel[126] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Du loco part06
		bodyModel[127] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Du loco part06
		bodyModel[128] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Du loco part06
		bodyModel[129] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Du loco part06
		bodyModel[130] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Du loco part06
		bodyModel[131] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Du loco part06
		bodyModel[132] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Du loco part05
		bodyModel[133] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Du loco part06
		bodyModel[134] = new ModelRendererTurbo(this, 119, 392, textureX, textureY); // Du loco part19
		bodyModel[135] = new ModelRendererTurbo(this, 106, 370, textureX, textureY); // Du loco part22
		bodyModel[136] = new ModelRendererTurbo(this, 75, 370, textureX, textureY); // Du loco part28
		bodyModel[137] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[138] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[139] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Du loco part Ligjhtpart15
		bodyModel[140] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Du loco part Ligjhtpart13
		bodyModel[141] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[142] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[143] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[144] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[145] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[146] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[147] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Lamp
		bodyModel[148] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Lamp
		bodyModel[149] = new ModelRendererTurbo(this, 137, 371, textureX, textureY); // Box 168
		bodyModel[150] = new ModelRendererTurbo(this, 137, 371, textureX, textureY); // Box 167
		bodyModel[151] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Du loco part28
		bodyModel[152] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part28
		bodyModel[153] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Du loco part28
		bodyModel[154] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Du loco part28
		bodyModel[155] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Du loco part05
		bodyModel[156] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Du loco part06
		bodyModel[157] = new ModelRendererTurbo(this, 137, 346, textureX, textureY); // Box 167
		bodyModel[158] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Du loco part09
		bodyModel[159] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Du loco part41
		bodyModel[160] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Du loco part47
		bodyModel[161] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Du loco part56
		bodyModel[162] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 154
		bodyModel[163] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 156
		bodyModel[164] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Du loco part47
		bodyModel[165] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Du loco part47
		bodyModel[166] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Du loco part47
		bodyModel[167] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Du loco part47
		bodyModel[168] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part42
		bodyModel[169] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Du loco part42
		bodyModel[170] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Du loco part47
		bodyModel[171] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Du loco part47
		bodyModel[172] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Du loco part37
		bodyModel[173] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Du loco part37
		bodyModel[174] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Du loco part37
		bodyModel[175] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Du loco part37
		bodyModel[176] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Du loco part37
		bodyModel[177] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Du loco part37
		bodyModel[178] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Du loco part37
		bodyModel[179] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Du loco part37
		bodyModel[180] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Du loco part37
		bodyModel[181] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Du loco part37
		bodyModel[182] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Du loco part37
		bodyModel[183] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Du loco part37
		bodyModel[184] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Du loco part37
		bodyModel[185] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Du loco part37
		bodyModel[186] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Du loco part37
		bodyModel[187] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Du loco part37
		bodyModel[188] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Du loco part37
		bodyModel[189] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Du loco part37
		bodyModel[190] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Du loco part37
		bodyModel[191] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Du loco part09
		bodyModel[192] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Du loco part82
		bodyModel[193] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Du loco part83
		bodyModel[194] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Du loco part84
		bodyModel[195] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Du loco part85
		bodyModel[196] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Du loco part94
		bodyModel[197] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Du loco part95
		bodyModel[198] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Du loco part97
		bodyModel[199] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Du loco part100
		bodyModel[200] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part101
		bodyModel[201] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Du loco part102
		bodyModel[202] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 177
		bodyModel[203] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 193
		bodyModel[204] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 196
		bodyModel[205] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Du loco part37
		bodyModel[206] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Du loco part37
		bodyModel[207] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Du loco part37
		bodyModel[208] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Du loco part37
		bodyModel[209] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Du loco part37
		bodyModel[210] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Du loco part37
		bodyModel[211] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Du loco part37
		bodyModel[212] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Du loco part37
		bodyModel[213] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Du loco part37
		bodyModel[214] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Du loco part37
		bodyModel[215] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Du loco part37
		bodyModel[216] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Du loco part37
		bodyModel[217] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Du loco part37
		bodyModel[218] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Du loco part37
		bodyModel[219] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Du loco part37
		bodyModel[220] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Du loco part37
		bodyModel[221] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Du loco part37
		bodyModel[222] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Du loco part37
		bodyModel[223] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Du loco part37
		bodyModel[224] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Du loco part37
		bodyModel[225] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Du loco part37
		bodyModel[226] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Du loco part37
		bodyModel[227] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Du loco part37
		bodyModel[228] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Du loco part37
		bodyModel[229] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Du loco part37
		bodyModel[230] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Du loco part37
		bodyModel[231] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Du loco part37
		bodyModel[232] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Du loco part37
		bodyModel[233] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Du loco part37
		bodyModel[234] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Du loco part37
		bodyModel[235] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Du loco part37
		bodyModel[236] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Du loco part37
		bodyModel[237] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Du loco part06
		bodyModel[238] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[239] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[240] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Du loco part06
		bodyModel[241] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[242] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[243] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Du loco part06
		bodyModel[244] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Du loco part06
		bodyModel[245] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Du loco part06
		bodyModel[246] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Du loco part06
		bodyModel[247] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Du loco part28
		bodyModel[248] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Du loco part28
		bodyModel[249] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Du loco part28
		bodyModel[250] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Du loco part28
		bodyModel[251] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Du loco part28
		bodyModel[252] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Du loco part28
		bodyModel[253] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Du loco part28
		bodyModel[254] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Du loco part28
		bodyModel[255] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Du loco part28
		bodyModel[256] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Du loco part28
		bodyModel[257] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 174
		bodyModel[258] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 174
		bodyModel[259] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 156
		bodyModel[260] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 156
		bodyModel[261] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 156
		bodyModel[262] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 156
		bodyModel[263] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		bodyModel[264] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 154
		bodyModel[265] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 154
		bodyModel[266] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 154
		bodyModel[267] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Du loco part23
		bodyModel[268] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Du loco part37
		bodyModel[269] = new ModelRendererTurbo(this, 393, 241, textureX, textureY); // Du loco part37
		bodyModel[270] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Du loco part37
		bodyModel[271] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Du loco part37
		bodyModel[272] = new ModelRendererTurbo(this, 57, 249, textureX, textureY); // Du loco part37
		bodyModel[273] = new ModelRendererTurbo(this, 97, 249, textureX, textureY); // Du loco part37
		bodyModel[274] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Du loco part37
		bodyModel[275] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Du loco part37
		bodyModel[276] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Du loco part23
		bodyModel[277] = new ModelRendererTurbo(this, 145, 349, textureX, textureY); // Du loco part28
		bodyModel[278] = new ModelRendererTurbo(this, 145, 349, textureX, textureY); // Du loco part28
		bodyModel[279] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Du loco part41
		bodyModel[280] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Du loco part41
		bodyModel[281] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Du loco part06
		bodyModel[282] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Du loco part06
		bodyModel[283] = new ModelRendererTurbo(this, 89, 249, textureX, textureY); // Du loco part06
		bodyModel[284] = new ModelRendererTurbo(this, 169, 249, textureX, textureY); // Du loco part06
		bodyModel[285] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Du loco part06
		bodyModel[286] = new ModelRendererTurbo(this, 273, 249, textureX, textureY); // Du loco part06
		bodyModel[287] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Du loco part06
		bodyModel[288] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Du loco part06
		bodyModel[289] = new ModelRendererTurbo(this, 25, 257, textureX, textureY); // Du loco part06
		bodyModel[290] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Du loco part06
		bodyModel[291] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Du loco part06
		bodyModel[292] = new ModelRendererTurbo(this, 49, 265, textureX, textureY); // Du loco part01
		bodyModel[293] = new ModelRendererTurbo(this, 73, 273, textureX, textureY); // Du loco part01
		bodyModel[294] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Du loco part01
		bodyModel[295] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Du loco part01
		bodyModel[296] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Du loco part01
		bodyModel[297] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Du loco part01
		bodyModel[298] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Du loco part01
		bodyModel[299] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Du loco part01
		bodyModel[300] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Du loco part01
		bodyModel[301] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Du loco part01
		bodyModel[302] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Du loco part20
		bodyModel[303] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Du loco part20
		bodyModel[304] = new ModelRendererTurbo(this, 8, 73, textureX, textureY); // Du loco part41
		bodyModel[305] = new ModelRendererTurbo(this, 176, 200, textureX, textureY); // Du loco part41
		bodyModel[306] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Du loco part41
		bodyModel[307] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Du loco part41
		bodyModel[308] = new ModelRendererTurbo(this, 233, 257, textureX, textureY); // Du loco part37
		bodyModel[309] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part37
		bodyModel[310] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Du loco part37
		bodyModel[311] = new ModelRendererTurbo(this, 41, 265, textureX, textureY); // Du loco part37
		bodyModel[312] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Du loco part37
		bodyModel[313] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Du loco part37
		bodyModel[314] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Du loco part37
		bodyModel[315] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Du loco part37
		bodyModel[316] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Du loco part37
		bodyModel[317] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Du loco part05
		bodyModel[318] = new ModelRendererTurbo(this, 20, 297, textureX, textureY); // Du loco part05
		bodyModel[319] = new ModelRendererTurbo(this, 1, 300, textureX, textureY); // Du loco part05
		bodyModel[320] = new ModelRendererTurbo(this, 6, 300, textureX, textureY); // Du loco part05
		bodyModel[321] = new ModelRendererTurbo(this, 1, 308, textureX, textureY); // Du loco part05
		bodyModel[322] = new ModelRendererTurbo(this, 20, 308, textureX, textureY); // Du loco part05
		bodyModel[323] = new ModelRendererTurbo(this, 1, 311, textureX, textureY); // Du loco part05
		bodyModel[324] = new ModelRendererTurbo(this, 6, 311, textureX, textureY); // Du loco part05
		bodyModel[325] = new ModelRendererTurbo(this, 1, 319, textureX, textureY); // Du loco part05
		bodyModel[326] = new ModelRendererTurbo(this, 20, 319, textureX, textureY); // Du loco part05
		bodyModel[327] = new ModelRendererTurbo(this, 1, 322, textureX, textureY); // Du loco part05
		bodyModel[328] = new ModelRendererTurbo(this, 6, 322, textureX, textureY); // Du loco part05
		bodyModel[329] = new ModelRendererTurbo(this, 1, 330, textureX, textureY); // Du loco part05
		bodyModel[330] = new ModelRendererTurbo(this, 20, 330, textureX, textureY); // Du loco part05
		bodyModel[331] = new ModelRendererTurbo(this, 1, 333, textureX, textureY); // Du loco part05
		bodyModel[332] = new ModelRendererTurbo(this, 6, 333, textureX, textureY); // Du loco part05
		bodyModel[333] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[334] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[335] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[336] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[337] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[338] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[339] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[340] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[341] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[342] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[343] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[344] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[345] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[346] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[347] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[348] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[349] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[350] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[351] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[352] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[353] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[354] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[355] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[356] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[357] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[358] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[359] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[360] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[361] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[362] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[363] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[364] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[365] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[366] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[367] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[368] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[369] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[370] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[371] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[372] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[373] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[374] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[375] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[376] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[377] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[378] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[379] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[380] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[381] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[382] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[383] = new ModelRendererTurbo(this, 206, 92, textureX, textureY); // Du loco part06
		bodyModel[384] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[385] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[386] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[387] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[388] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[389] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[390] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[391] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[392] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[393] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[394] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[395] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[396] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[397] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[398] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[399] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[400] = new ModelRendererTurbo(this, 16, 377, textureX, textureY); // Du loco part05
		bodyModel[401] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[402] = new ModelRendererTurbo(this, 8, 384, textureX, textureY); // Du loco part05
		bodyModel[403] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[404] = new ModelRendererTurbo(this, 16, 377, textureX, textureY); // Du loco part05
		bodyModel[405] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[406] = new ModelRendererTurbo(this, 8, 384, textureX, textureY); // Du loco part05
		bodyModel[407] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[408] = new ModelRendererTurbo(this, 2, 378, textureX, textureY); // Du loco part05
		bodyModel[409] = new ModelRendererTurbo(this, 2, 378, textureX, textureY); // Du loco part05
		bodyModel[410] = new ModelRendererTurbo(this, 8, 401, textureX, textureY); // Du loco part05
		bodyModel[411] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Du loco part05
		bodyModel[412] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[413] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[414] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[415] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[416] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[417] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[418] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[419] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[420] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[421] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[422] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[423] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[424] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[425] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[426] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[427] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[428] = new ModelRendererTurbo(this, 16, 377, textureX, textureY); // Du loco part05
		bodyModel[429] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[430] = new ModelRendererTurbo(this, 8, 384, textureX, textureY); // Du loco part05
		bodyModel[431] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[432] = new ModelRendererTurbo(this, 16, 377, textureX, textureY); // Du loco part05
		bodyModel[433] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[434] = new ModelRendererTurbo(this, 8, 384, textureX, textureY); // Du loco part05
		bodyModel[435] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[436] = new ModelRendererTurbo(this, 2, 378, textureX, textureY); // Du loco part05
		bodyModel[437] = new ModelRendererTurbo(this, 2, 378, textureX, textureY); // Du loco part05
		bodyModel[438] = new ModelRendererTurbo(this, 8, 401, textureX, textureY); // Du loco part05
		bodyModel[439] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Du loco part05
		bodyModel[440] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[441] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[442] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[443] = new ModelRendererTurbo(this, 74, 392, textureX, textureY); // Du loco part19
		bodyModel[444] = new ModelRendererTurbo(this, 144, 371, textureX, textureY); // Box 168
		bodyModel[445] = new ModelRendererTurbo(this, 75, 309, textureX, textureY); // Du loco part19
		bodyModel[446] = new ModelRendererTurbo(this, 137, 349, textureX, textureY); // Du loco part28
		bodyModel[447] = new ModelRendererTurbo(this, 137, 349, textureX, textureY); // Du loco part28
		bodyModel[448] = new ModelRendererTurbo(this, 144, 371, textureX, textureY); // Box 168
		bodyModel[449] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Du loco part37
		bodyModel[450] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Du loco part37
		bodyModel[451] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Du loco part37
		bodyModel[452] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Du loco part37
		bodyModel[453] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Lamp
		bodyModel[454] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Du loco part37
		bodyModel[455] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Du loco part37
		bodyModel[456] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Du loco part37
		bodyModel[457] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Du loco part37

		bodyModel[0].addBox(0F, 0F, 0F, 62, 8, 12, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(11F, -11F, -6F);

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

		bodyModel[6].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[6].setRotationPoint(-21F, -8F, 6.05F);

		bodyModel[7].addBox(0F, 0F, 0F, 46, 3, 0, 0F); // Du loco part17
		bodyModel[7].setRotationPoint(19F, -10F, -6.15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[8].setRotationPoint(-1F, -20F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Du loco part20
		bodyModel[9].setRotationPoint(68F, -30F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[10].setRotationPoint(1F, -30F, 10F);

		bodyModel[11].addBox(0F, 0F, 0F, 46, 3, 0, 0F); // Du loco part27
		bodyModel[11].setRotationPoint(19F, -10F, 6.15F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 14, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[12].setRotationPoint(1F, -30F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[13].setRotationPoint(-2F, -9F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[14].setRotationPoint(-6F, -9F, 4F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[15].setRotationPoint(-6F, -9F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[16].setRotationPoint(1F, -19F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[17].setRotationPoint(6F, -13F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[18].setRotationPoint(6F, -13F, -6F);
		bodyModel[18].rotateAngleY = -1.57079633F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[19].setRotationPoint(6F, -13F, -3F);
		bodyModel[19].rotateAngleY = -1.57079633F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[20].setRotationPoint(6F, -16F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[21].setRotationPoint(6F, -16F, -3F);
		bodyModel[21].rotateAngleY = -1.57079633F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[22].setRotationPoint(6F, -16F, -6F);
		bodyModel[22].rotateAngleY = -1.57079633F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[23].setRotationPoint(9F, -20F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[24].setRotationPoint(9F, -20F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[25].setRotationPoint(9F, -20F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[26].setRotationPoint(-2F, -17F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[27].setRotationPoint(-2F, -15F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[28].setRotationPoint(-2F, -15F, 4F);

		bodyModel[29].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[29].setRotationPoint(-2F, -17F, 4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 83, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 149
		bodyModel[30].setRotationPoint(0.5F, -31F, 9F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[31].setRotationPoint(-5F, -9F, -6F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[32].setRotationPoint(-5F, -9F, 5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 174
		bodyModel[33].setRotationPoint(-1F, -11F, 10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[34].setRotationPoint(9F, -16F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[35].setRotationPoint(8F, -15F, -4F);
		bodyModel[35].rotateAngleY = -1.57079633F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[36].setRotationPoint(7F, -15F, -4F);
		bodyModel[36].rotateAngleY = -1.57079633F;

		bodyModel[37].addBox(0F, 0F, 0F, 54, 20, 1, 0F); // Box 135
		bodyModel[37].setRotationPoint(15F, -30F, 10F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 136
		bodyModel[38].setRotationPoint(15F, -30F, -10F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[39].setRotationPoint(20F, -16F, -2F);

		bodyModel[40].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[40].setRotationPoint(19F, -22F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[41].setRotationPoint(19F, -24F, -3F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 142
		bodyModel[42].setRotationPoint(20F, -25F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 143
		bodyModel[43].setRotationPoint(19F, -26F, -3F);

		bodyModel[44].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 144
		bodyModel[44].setRotationPoint(19F, -30F, -3F);

		bodyModel[45].addBox(0F, 0F, 0F, 12, 15, 12, 0F); // Box 145
		bodyModel[45].setRotationPoint(28F, -27F, -5F);

		bodyModel[46].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 146
		bodyModel[46].setRotationPoint(27F, -28F, -6F);

		bodyModel[47].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[47].setRotationPoint(22F, -19F, -4F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 148
		bodyModel[48].setRotationPoint(26F, -26F, -4F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[49].setRotationPoint(27F, -26F, -4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[50].setRotationPoint(41F, -16F, -2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[51].setRotationPoint(51F, -16F, -2F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 152
		bodyModel[52].setRotationPoint(52F, -30F, -1F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 153
		bodyModel[53].setRotationPoint(42F, -30F, -1F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 154
		bodyModel[54].setRotationPoint(45F, -27F, -1F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 155
		bodyModel[55].setRotationPoint(49F, -27F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 156
		bodyModel[56].setRotationPoint(49F, -18F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F); // Box 157
		bodyModel[57].setRotationPoint(45F, -18F, -1F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 158
		bodyModel[58].setRotationPoint(47F, -26F, -1F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 159
		bodyModel[59].setRotationPoint(51F, -26F, -1F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 160
		bodyModel[60].setRotationPoint(44F, -26F, -1F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[61].setRotationPoint(5F, -33F, -6F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[62].setRotationPoint(5F, -33F, 5F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[63].setRotationPoint(23F, -33F, -6F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[64].setRotationPoint(23F, -33F, 5F);

		bodyModel[65].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[65].setRotationPoint(5F, -34F, -6F);

		bodyModel[66].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[66].setRotationPoint(5F, -34F, 5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[67].setRotationPoint(-6F, -8F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[68].setRotationPoint(-6F, -10F, 4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[69].setRotationPoint(-6F, -8F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[70].setRotationPoint(-6F, -10F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part42
		bodyModel[71].setRotationPoint(-3F, -7F, 4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[72].setRotationPoint(-3F, -7F, -10F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[73].setRotationPoint(13F, -37F, -4F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[74].setRotationPoint(13F, -37F, 3F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[75].setRotationPoint(14F, -38F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[76].setRotationPoint(14F, -38F, 6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[77].setRotationPoint(14F, -38F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[78].setRotationPoint(-3F, -8F, -1F);

		bodyModel[79].addBox(0F, 0F, 0F, 20, 1, 0, 0F); // Lamp
		bodyModel[79].setRotationPoint(32F, -34F, -7.05F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[80].setRotationPoint(2F, -35F, -5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[81].setRotationPoint(2F, -36F, -4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part Ligjhtpart8
		bodyModel[82].setRotationPoint(0.5F, -34F, -2F);

		bodyModel[83].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[83].setRotationPoint(-2F, -16F, -9F);

		bodyModel[84].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[84].setRotationPoint(-2F, -16F, 4F);

		bodyModel[85].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[85].setRotationPoint(-0.5F, -34F, -3F);

		bodyModel[86].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[86].setRotationPoint(-0.5F, -31F, -3F);

		bodyModel[87].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Lamp
		bodyModel[87].setRotationPoint(-0.5F, -33F, -3F);

		bodyModel[88].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[88].setRotationPoint(-0.5F, -31F, 1F);

		bodyModel[89].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[89].setRotationPoint(-0.5F, -32F, 1F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 83, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[90].setRotationPoint(0.5F, -32F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 83, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[91].setRotationPoint(0.5F, -33F, 2F);

		bodyModel[92].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[92].setRotationPoint(13F, -34F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[93].setRotationPoint(18F, -11F, 6.05F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[94].setRotationPoint(4F, -11F, 6.05F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[95].setRotationPoint(-10F, -11F, 6.05F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[96].setRotationPoint(-24F, -11F, 6.05F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[97].setRotationPoint(18F, -11F, -6.05F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[98].setRotationPoint(4F, -11F, -6.05F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[99].setRotationPoint(-10F, -11F, -6.05F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[100].setRotationPoint(-24F, -11F, -6.05F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[101].setRotationPoint(-21F, -8F, -6.05F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 83, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[102].setRotationPoint(0.5F, -33F, -6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 83, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[103].setRotationPoint(0.5F, -32F, -9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 83, 1, 2, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[104].setRotationPoint(0.5F, -31F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[105].setRotationPoint(-1F, -11F, -11F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[106].setRotationPoint(10F, -11F, -9F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[107].setRotationPoint(13F, -11F, -9F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[108].setRotationPoint(10F, -11F, 8F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[109].setRotationPoint(13F, -11F, 8F);

		bodyModel[110].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[110].setRotationPoint(10F, -5F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[111].setRotationPoint(10F, -7F, -11F);

		bodyModel[112].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[112].setRotationPoint(10F, -9F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[113].setRotationPoint(10F, -5F, 9F);

		bodyModel[114].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[114].setRotationPoint(10F, -7F, 9F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[115].setRotationPoint(10F, -9F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[116].setRotationPoint(-4F, -9F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[117].setRotationPoint(9F, -25F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[118].setRotationPoint(14F, -25F, 11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[119].setRotationPoint(9F, -25F, -12F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[120].setRotationPoint(14F, -25F, -12F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Du loco part05
		bodyModel[121].setRotationPoint(-1F, -20F, 11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[122].setRotationPoint(-1F, -20F, -12F);

		bodyModel[123].addShapeBox(0F, 0F, 1F, 1, 1, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 167
		bodyModel[123].setRotationPoint(-2F, -20F, -12F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[124].setRotationPoint(61F, -9F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[125].setRotationPoint(26F, -9F, 9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[126].setRotationPoint(27F, -10F, 9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[127].setRotationPoint(27F, -10F, 10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[128].setRotationPoint(29F, -10F, 10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[129].setRotationPoint(26F, -10F, 10F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[130].setRotationPoint(61F, -10F, -11F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[131].setRotationPoint(64F, -10F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[132].setRotationPoint(75F, -11F, 11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[133].setRotationPoint(75F, -11F, -12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 9, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[134].setRotationPoint(83F, -20F, -10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 14, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[135].setRotationPoint(69F, -30F, 10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 14, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[136].setRotationPoint(69F, -30F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[137].setRotationPoint(85F, -17F, -9F);

		bodyModel[138].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[138].setRotationPoint(85F, -15F, -9F);

		bodyModel[139].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart15
		bodyModel[139].setRotationPoint(85F, -15F, 4F);

		bodyModel[140].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart13
		bodyModel[140].setRotationPoint(85F, -17F, 4F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part Ligjhtpart8
		bodyModel[141].setRotationPoint(79.5F, -34F, -2F);

		bodyModel[142].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[142].setRotationPoint(85F, -16F, -9F);

		bodyModel[143].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[143].setRotationPoint(85F, -16F, 4F);

		bodyModel[144].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[144].setRotationPoint(83.5F, -34F, -3F);

		bodyModel[145].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[145].setRotationPoint(83.5F, -31F, -3F);

		bodyModel[146].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Du loco part Ligjhtpart18
		bodyModel[146].setRotationPoint(83.5F, -33F, -3F);

		bodyModel[147].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[147].setRotationPoint(83.5F, -31F, -5F);

		bodyModel[148].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[148].setRotationPoint(83.5F, -32F, -5F);

		bodyModel[149].addShapeBox(0F, 0F, 1F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[149].setRotationPoint(83F, -20F, 9F);

		bodyModel[150].addShapeBox(0F, 0F, 1F, 2, 9, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[150].setRotationPoint(83F, -20F, -12F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[151].setRotationPoint(69F, -25F, 11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[152].setRotationPoint(74F, -25F, 11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[153].setRotationPoint(69F, -25F, -12F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[154].setRotationPoint(74F, -25F, -12F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[155].setRotationPoint(75F, -20F, 11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[156].setRotationPoint(75F, -20F, -12F);

		bodyModel[157].addShapeBox(0F, 0F, 1F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 167
		bodyModel[157].setRotationPoint(85F, -20F, -12F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[158].setRotationPoint(52F, -8F, -6.05F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[159].setRotationPoint(85F, -9F, -8F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[160].setRotationPoint(89F, -9F, 4F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[161].setRotationPoint(89F, -9F, -7F);

		bodyModel[162].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[162].setRotationPoint(86F, -9F, -6F);

		bodyModel[163].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[163].setRotationPoint(86F, -9F, 5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[164].setRotationPoint(89F, -8F, 4F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[165].setRotationPoint(89F, -10F, 4F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[166].setRotationPoint(89F, -8F, -7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[167].setRotationPoint(89F, -10F, -7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[168].setRotationPoint(82F, -7F, 4F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[169].setRotationPoint(82F, -7F, -10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[170].setRotationPoint(86F, -8F, -1F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[171].setRotationPoint(87F, -9F, -1F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[172].setRotationPoint(60F, -33F, -6F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[173].setRotationPoint(60F, -33F, 5F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[174].setRotationPoint(78F, -33F, -6F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[175].setRotationPoint(78F, -33F, 5F);

		bodyModel[176].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[176].setRotationPoint(60F, -34F, -6F);

		bodyModel[177].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[177].setRotationPoint(60F, -34F, 5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[178].setRotationPoint(73F, -40F, 4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[179].setRotationPoint(60F, -40F, 4F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[180].setRotationPoint(70F, -46F, 3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[181].setRotationPoint(60F, -46F, 3F);

		bodyModel[182].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[182].setRotationPoint(68F, -47F, -4F);

		bodyModel[183].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[183].setRotationPoint(68F, -47F, 3F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[184].setRotationPoint(69F, -48F, -6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[185].setRotationPoint(69F, -48F, 6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[186].setRotationPoint(69F, -48F, -8F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[187].setRotationPoint(73F, -40F, -5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[188].setRotationPoint(60F, -40F, -5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[189].setRotationPoint(70F, -46F, -4F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[190].setRotationPoint(60F, -46F, -4F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[191].setRotationPoint(52F, -8F, 6.05F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[192].setRotationPoint(78F, -19F, -10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[193].setRotationPoint(74F, -13F, -6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[194].setRotationPoint(74F, -13F, -6F);
		bodyModel[194].rotateAngleY = -1.57079633F;

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[195].setRotationPoint(74F, -13F, -3F);
		bodyModel[195].rotateAngleY = -1.57079633F;

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[196].setRotationPoint(75F, -16F, -6F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[197].setRotationPoint(75F, -16F, -3F);
		bodyModel[197].rotateAngleY = -1.57079633F;

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[198].setRotationPoint(75F, -16F, -6F);
		bodyModel[198].rotateAngleY = -1.57079633F;

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[199].setRotationPoint(74F, -20F, -6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[200].setRotationPoint(74F, -20F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[201].setRotationPoint(74F, -20F, -4F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[202].setRotationPoint(74F, -16F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[203].setRotationPoint(76F, -15F, -4F);
		bodyModel[203].rotateAngleY = -1.57079633F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[204].setRotationPoint(75F, -15F, -4F);
		bodyModel[204].rotateAngleY = -1.57079633F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[205].setRotationPoint(18F, -35F, 4F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, 0F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -7F); // Du loco part37
		bodyModel[206].setRotationPoint(16F, -37F, -4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[207].setRotationPoint(2F, -35F, 4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[208].setRotationPoint(2F, -36F, 3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[209].setRotationPoint(18F, -35F, -5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[210].setRotationPoint(15F, -36F, -4F);

		bodyModel[211].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[211].setRotationPoint(68F, -37F, -4F);

		bodyModel[212].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[212].setRotationPoint(68F, -37F, 3F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[213].setRotationPoint(69F, -38F, -6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[214].setRotationPoint(69F, -38F, 6F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[215].setRotationPoint(69F, -38F, -8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[216].setRotationPoint(57F, -35F, -5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[217].setRotationPoint(57F, -36F, -4F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[218].setRotationPoint(73F, -35F, 4F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[219].setRotationPoint(70F, -36F, 3F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[220].setRotationPoint(57F, -35F, 4F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[221].setRotationPoint(57F, -36F, 3F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[222].setRotationPoint(73F, -35F, -5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[223].setRotationPoint(70F, -36F, -4F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[224].setRotationPoint(18F, -40F, 4F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[225].setRotationPoint(5F, -40F, 4F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[226].setRotationPoint(15F, -46F, 3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[227].setRotationPoint(5F, -46F, 3F);

		bodyModel[228].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[228].setRotationPoint(13F, -47F, -4F);

		bodyModel[229].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[229].setRotationPoint(13F, -47F, 3F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[230].setRotationPoint(14F, -48F, -6F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[231].setRotationPoint(14F, -48F, 6F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[232].setRotationPoint(14F, -48F, -8F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[233].setRotationPoint(18F, -40F, -5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[234].setRotationPoint(5F, -40F, -5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[235].setRotationPoint(15F, -46F, -4F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[236].setRotationPoint(5F, -46F, -4F);

		bodyModel[237].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Du loco part06
		bodyModel[237].setRotationPoint(11F, -11F, 6F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[238].setRotationPoint(25F, -10F, -11F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[239].setRotationPoint(29F, -8F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[240].setRotationPoint(24F, -8F, -11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[241].setRotationPoint(25F, -8F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[242].setRotationPoint(29F, -10F, -11F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[243].setRotationPoint(24F, -10F, -11F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[244].setRotationPoint(24F, -9F, -11F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[245].setRotationPoint(29F, -9F, -11F);

		bodyModel[246].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[246].setRotationPoint(25F, -9F, -11F);

		bodyModel[247].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[247].setRotationPoint(70F, -11F, -9F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[248].setRotationPoint(73F, -11F, -9F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[249].setRotationPoint(70F, -11F, 8F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[250].setRotationPoint(73F, -11F, 8F);

		bodyModel[251].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[251].setRotationPoint(70F, -5F, -11F);

		bodyModel[252].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[252].setRotationPoint(70F, -7F, -11F);

		bodyModel[253].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[253].setRotationPoint(70F, -9F, -11F);

		bodyModel[254].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[254].setRotationPoint(70F, -5F, 9F);

		bodyModel[255].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[255].setRotationPoint(70F, -7F, 9F);

		bodyModel[256].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[256].setRotationPoint(70F, -9F, 9F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[257].setRotationPoint(83F, -11F, 10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[258].setRotationPoint(83F, -11F, -11F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 156
		bodyModel[259].setRotationPoint(83F, -30F, -11F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[260].setRotationPoint(83F, -30F, 10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 156
		bodyModel[261].setRotationPoint(-1F, -30F, -11F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[262].setRotationPoint(-1F, -30F, 10F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[263].setRotationPoint(-1F, -32F, -10.75F);

		bodyModel[264].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[264].setRotationPoint(-0.5F, -32F, -11.25F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[265].setRotationPoint(-1F, -32F, 10.75F);

		bodyModel[266].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[266].setRotationPoint(-0.5F, -32F, 10.25F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[267].setRotationPoint(-3F, -21F, 11.05F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F); // Du loco part37
		bodyModel[268].setRotationPoint(16F, -46F, -4F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F); // Du loco part37
		bodyModel[269].setRotationPoint(16F, -46F, -4F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[270].setRotationPoint(15F, -36F, 3F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, -7F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F); // Du loco part37
		bodyModel[271].setRotationPoint(16F, -37F, -4F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[272].setRotationPoint(57F, -37F, -4F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[273].setRotationPoint(60F, -46F, -4F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[274].setRotationPoint(60F, -46F, -4F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[275].setRotationPoint(57F, -37F, -4F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[276].setRotationPoint(-3F, -21F, -11.05F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[277].setRotationPoint(-1F, -20F, -11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[278].setRotationPoint(-1F, -20F, 10F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part41
		bodyModel[279].setRotationPoint(-2F, -11F, -10F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part41
		bodyModel[280].setRotationPoint(85F, -11F, -10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part06
		bodyModel[281].setRotationPoint(11F, -8F, 6F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F); // Du loco part06
		bodyModel[282].setRotationPoint(13F, -7F, 6F);

		bodyModel[283].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Du loco part06
		bodyModel[283].setRotationPoint(11F, -11F, -8F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part06
		bodyModel[284].setRotationPoint(11F, -8F, -8F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part06
		bodyModel[285].setRotationPoint(13F, -7F, -8F);

		bodyModel[286].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Du loco part06
		bodyModel[286].setRotationPoint(68F, -11F, 6F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[287].setRotationPoint(68F, -8F, 6F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F); // Du loco part06
		bodyModel[288].setRotationPoint(68F, -7F, 6F);

		bodyModel[289].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Du loco part06
		bodyModel[289].setRotationPoint(68F, -11F, -8F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[290].setRotationPoint(68F, -8F, -8F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[291].setRotationPoint(68F, -7F, -8F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[292].setRotationPoint(1F, -9F, -6F);

		bodyModel[293].addBox(0F, 0F, 0F, 10, 2, 12, 0F); // Du loco part01
		bodyModel[293].setRotationPoint(1F, -11F, -6F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Du loco part01
		bodyModel[294].setRotationPoint(7F, -9F, -6F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part01
		bodyModel[295].setRotationPoint(81F, -9F, -6F);

		bodyModel[296].addBox(0F, 0F, 0F, 10, 2, 12, 0F); // Du loco part01
		bodyModel[296].setRotationPoint(73F, -11F, -6F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[297].setRotationPoint(73F, -9F, -6F);

		bodyModel[298].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[298].setRotationPoint(78F, -5F, -6F);

		bodyModel[299].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Du loco part01
		bodyModel[299].setRotationPoint(74F, -6F, -1F);

		bodyModel[300].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Du loco part01
		bodyModel[300].setRotationPoint(5F, -6F, -1F);

		bodyModel[301].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[301].setRotationPoint(5F, -5F, -6F);

		bodyModel[302].addBox(0F, 0F, 0F, 4, 18, 8, 0F); // Du loco part20
		bodyModel[302].setRotationPoint(69F, -30F, -4F);

		bodyModel[303].addBox(0F, 0F, 0F, 4, 18, 8, 0F); // Du loco part20
		bodyModel[303].setRotationPoint(11F, -30F, -4F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F); // Du loco part41
		bodyModel[304].setRotationPoint(-2F, -5F, 4F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 2.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[305].setRotationPoint(-2F, -5F, -5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F); // Du loco part41
		bodyModel[306].setRotationPoint(84F, -5F, 4F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Du loco part41
		bodyModel[307].setRotationPoint(84F, -5F, -5F);

		bodyModel[308].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[308].setRotationPoint(16F, -34F, -9F);

		bodyModel[309].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[309].setRotationPoint(30F, -34F, -8F);

		bodyModel[310].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[310].setRotationPoint(41F, -34F, -8F);

		bodyModel[311].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[311].setRotationPoint(52F, -34F, -8F);

		bodyModel[312].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[312].setRotationPoint(52F, -34F, 6F);

		bodyModel[313].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[313].setRotationPoint(66F, -34F, 7F);

		bodyModel[314].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[314].setRotationPoint(69F, -34F, 7F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part37
		bodyModel[315].setRotationPoint(54F, -34F, 7F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part37
		bodyModel[316].setRotationPoint(15F, -34F, -8F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[317].setRotationPoint(22F, -22F, 10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[318].setRotationPoint(22F, -28F, 10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[319].setRotationPoint(22F, -28F, 10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[320].setRotationPoint(29F, -28F, 10F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[321].setRotationPoint(38F, -22F, 10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[322].setRotationPoint(38F, -28F, 10F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[323].setRotationPoint(38F, -28F, 10F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[324].setRotationPoint(45F, -28F, 10F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[325].setRotationPoint(22F, -22F, -11F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[326].setRotationPoint(22F, -28F, -11F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[327].setRotationPoint(22F, -28F, -11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[328].setRotationPoint(29F, -28F, -11F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[329].setRotationPoint(38F, -22F, -11F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[330].setRotationPoint(38F, -28F, -11F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[331].setRotationPoint(38F, -28F, -11F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[332].setRotationPoint(45F, -28F, -11F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[333].setRotationPoint(53F, -28F, 10F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[334].setRotationPoint(62F, -28F, 10F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[335].setRotationPoint(54F, -21F, 10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[336].setRotationPoint(54F, -29F, 10F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[337].setRotationPoint(54F, -27F, 10F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[338].setRotationPoint(58F, -27F, 10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[339].setRotationPoint(58F, -27F, 10F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[340].setRotationPoint(54F, -26.25F, 10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[341].setRotationPoint(58F, -26.25F, 10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[342].setRotationPoint(54F, -25.5F, 10F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[343].setRotationPoint(58F, -25.5F, 10F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[344].setRotationPoint(54F, -24.75F, 10F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[345].setRotationPoint(58F, -24.75F, 10F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[346].setRotationPoint(54F, -24F, 10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[347].setRotationPoint(58F, -24F, 10F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[348].setRotationPoint(54F, -23.25F, 10F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[349].setRotationPoint(58F, -23.25F, 10F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[350].setRotationPoint(54F, -22.5F, 10F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[351].setRotationPoint(58F, -22.5F, 10F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[352].setRotationPoint(53F, -28F, -11F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[353].setRotationPoint(62F, -28F, -11F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[354].setRotationPoint(54F, -21F, -11F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[355].setRotationPoint(54F, -29F, -11F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[356].setRotationPoint(58F, -28F, -11F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[357].setRotationPoint(54F, -27F, -11F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[358].setRotationPoint(58F, -27F, -11F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[359].setRotationPoint(54F, -26.25F, -11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[360].setRotationPoint(58F, -26.25F, -11F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[361].setRotationPoint(54F, -25.5F, -11F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[362].setRotationPoint(58F, -25.5F, -11F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[363].setRotationPoint(54F, -24.75F, -11F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[364].setRotationPoint(58F, -24.75F, -11F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[365].setRotationPoint(54F, -24F, -11F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[366].setRotationPoint(58F, -24F, -11F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[367].setRotationPoint(54F, -23.25F, -11F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[368].setRotationPoint(58F, -23.25F, -11F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[369].setRotationPoint(54F, -22.5F, -11F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[370].setRotationPoint(58F, -22.5F, -11F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[371].setRotationPoint(54F, -21.75F, 10F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[372].setRotationPoint(58F, -21.75F, 10F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[373].setRotationPoint(58F, -28.5F, 10F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[374].setRotationPoint(54F, -28.5F, 10F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[375].setRotationPoint(54F, -21.75F, -11F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[376].setRotationPoint(58F, -21.75F, -11F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[377].setRotationPoint(58F, -28.5F, -11F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[378].setRotationPoint(54F, -28.5F, -11F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[379].setRotationPoint(54F, -27.75F, -11F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[380].setRotationPoint(58F, -27.75F, -11F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[381].setRotationPoint(54F, -27.75F, 10F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[382].setRotationPoint(58F, -27.75F, 10F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Du loco part06
		bodyModel[383].setRotationPoint(26F, -9F, 10F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[384].setRotationPoint(3F, -22F, 10F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[385].setRotationPoint(3F, -28F, 10F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[386].setRotationPoint(3F, -28F, 10F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[387].setRotationPoint(7F, -28F, 10F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[388].setRotationPoint(11F, -22F, 10F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[389].setRotationPoint(11F, -28F, 10F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[390].setRotationPoint(11F, -28F, 10F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[391].setRotationPoint(12F, -28F, 10F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[392].setRotationPoint(3F, -22F, -11F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[393].setRotationPoint(3F, -28F, -11F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[394].setRotationPoint(3F, -28F, -11F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[395].setRotationPoint(7F, -28F, -11F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[396].setRotationPoint(11F, -22F, -11F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[397].setRotationPoint(11F, -28F, -11F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[398].setRotationPoint(11F, -28F, -11F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[399].setRotationPoint(12F, -28F, -11F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[400].setRotationPoint(-1F, -22F, 4F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[401].setRotationPoint(-1F, -29F, 4F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[402].setRotationPoint(-1F, -29F, 4F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[403].setRotationPoint(-1F, -29F, 8F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[404].setRotationPoint(-1F, -22F, -9F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[405].setRotationPoint(-1F, -29F, -9F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[406].setRotationPoint(-1F, -29F, -9F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[407].setRotationPoint(-1F, -29F, -5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[408].setRotationPoint(-1F, -22F, -2F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.75F, 0F); // Du loco part05
		bodyModel[409].setRotationPoint(-1F, -29F, -2F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[410].setRotationPoint(-1F, -29F, -2F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,-0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[411].setRotationPoint(-1F, -29F, 1F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[412].setRotationPoint(76F, -22F, 10F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[413].setRotationPoint(76F, -28F, 10F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[414].setRotationPoint(76F, -28F, 10F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[415].setRotationPoint(80F, -28F, 10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[416].setRotationPoint(71F, -22F, 10F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[417].setRotationPoint(71F, -28F, 10F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[418].setRotationPoint(71F, -28F, 10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[419].setRotationPoint(72F, -28F, 10F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[420].setRotationPoint(76F, -22F, -11F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[421].setRotationPoint(76F, -28F, -11F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[422].setRotationPoint(76F, -28F, -11F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[423].setRotationPoint(80F, -28F, -11F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[424].setRotationPoint(71F, -22F, -11F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[425].setRotationPoint(71F, -28F, -11F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[426].setRotationPoint(71F, -28F, -11F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[427].setRotationPoint(72F, -28F, -11F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[428].setRotationPoint(83F, -22F, 4F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[429].setRotationPoint(83F, -29F, 4F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[430].setRotationPoint(83F, -29F, 4F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[431].setRotationPoint(83F, -29F, 8F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[432].setRotationPoint(83F, -22F, -9F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[433].setRotationPoint(83F, -29F, -9F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[434].setRotationPoint(83F, -29F, -9F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[435].setRotationPoint(83F, -29F, -5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[436].setRotationPoint(83F, -22F, -2F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[437].setRotationPoint(83F, -29F, -2F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[438].setRotationPoint(83F, -29F, -2F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[439].setRotationPoint(83F, -29F, 1F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[440].setRotationPoint(61F, -9F, -10F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[441].setRotationPoint(61F, -10F, -10F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[442].setRotationPoint(61F, -10F, -11F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 10, 20, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[443].setRotationPoint(83F, -30F, -10F);

		bodyModel[444].addShapeBox(0F, 0F, 1F, 2, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[444].setRotationPoint(83F, -30F, 9F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 2, 10, 20, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[445].setRotationPoint(-1F, -30F, -10F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[446].setRotationPoint(-1F, -30F, 10F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[447].setRotationPoint(-1F, -30F, -11F);

		bodyModel[448].addShapeBox(0F, 0F, 1F, 2, 10, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[448].setRotationPoint(83F, -30F, -12F);

		bodyModel[449].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[449].setRotationPoint(30F, -34F, 6F);

		bodyModel[450].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[450].setRotationPoint(13F, -34F, 7F);

		bodyModel[451].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[451].setRotationPoint(16F, -34F, 7F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part37
		bodyModel[452].setRotationPoint(15F, -34F, 7F);

		bodyModel[453].addBox(0F, 0F, 0F, 20, 1, 0, 0F); // Lamp
		bodyModel[453].setRotationPoint(32F, -34F, 6.95F);

		bodyModel[454].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[454].setRotationPoint(41F, -34F, 6F);

		bodyModel[455].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[455].setRotationPoint(66F, -34F, -9F);

		bodyModel[456].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[456].setRotationPoint(69F, -34F, -9F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part37
		bodyModel[457].setRotationPoint(54F, -34F, -8F);
	}
}