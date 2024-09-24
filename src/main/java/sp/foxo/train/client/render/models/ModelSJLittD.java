//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera D
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package sp.foxo.train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelSJLittD extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittD() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[243];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	private void initbodyModel_1()
	{
		
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Du loco part02
		bodyModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Du loco part03
		bodyModel[3] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Du loco part04
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Du loco part05
		bodyModel[5] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Du loco part06
		bodyModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Du loco part07
		bodyModel[7] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Du loco part08
		bodyModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Du loco part09
		bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Du loco part10
		bodyModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Du loco part11
		bodyModel[11] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Du loco part12
		bodyModel[12] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Du loco part13
		bodyModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Du loco part14
		bodyModel[14] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Du loco part15
		bodyModel[15] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Du loco part16
		bodyModel[16] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Du loco part17
		bodyModel[17] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Du loco part19
		bodyModel[18] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Du loco part20
		bodyModel[19] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Du loco part22
		bodyModel[20] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Du loco part23
		bodyModel[21] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Du loco part24
		bodyModel[22] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Du loco part25
		bodyModel[23] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Du loco part26
		bodyModel[24] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Du loco part27
		bodyModel[25] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Du loco part28
		bodyModel[26] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Du loco part31
		bodyModel[27] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Du loco part32
		bodyModel[28] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part37
		bodyModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part38
		bodyModel[30] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Du loco part41
		bodyModel[31] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Du loco part42
		bodyModel[32] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Du loco part47
		bodyModel[33] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Du loco part56
		bodyModel[34] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Du loco part68
		bodyModel[35] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Du loco part69
		bodyModel[36] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Du loco part71
		bodyModel[37] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Du loco part82
		bodyModel[38] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Du loco part83
		bodyModel[39] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Du loco part84
		bodyModel[40] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part85
		bodyModel[41] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Du loco part94
		bodyModel[42] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Du loco part95
		bodyModel[43] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Du loco part97
		bodyModel[44] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Du loco part100
		bodyModel[45] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Du loco part101
		bodyModel[46] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Du loco part102
		bodyModel[47] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Du loco part106
		bodyModel[48] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Du loco part107
		bodyModel[49] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Du loco part109
		bodyModel[50] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Du loco part111
		bodyModel[51] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part112
		bodyModel[52] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Du loco part119
		bodyModel[53] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Du loco part120
		bodyModel[54] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Du loco part121
		bodyModel[55] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Du loco part122
		bodyModel[56] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Du loco part123
		bodyModel[57] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Du loco part Ligjhtpart14
		bodyModel[58] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Du loco part Ligjhtpart17
		bodyModel[59] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[60] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[61] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Du loco part Ligjhtpart15
		bodyModel[62] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Du loco part Ligjhtpart13
		bodyModel[63] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Du loco part Ligjhtpart10
		bodyModel[64] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Du loco part Ligjhtpart12
		bodyModel[65] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Du loco part Ligjhtpart11
		bodyModel[66] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Du loco part Ligjhtpart6
		bodyModel[67] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Du loco part Ligjhtpart4
		bodyModel[68] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[69] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Du loco part Ligjhtpart9
		bodyModel[70] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Du loco part Ligjhtpart7
		bodyModel[71] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Du loco part Ligjhtpart5
		bodyModel[72] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Du loco part Ligjhtpart3
		bodyModel[73] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Du loco part Ligjhtpart1
		bodyModel[74] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 146
		bodyModel[75] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 147
		bodyModel[76] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 148
		bodyModel[77] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 149
		bodyModel[78] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 154
		bodyModel[79] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 156
		bodyModel[80] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 167
		bodyModel[81] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 168
		bodyModel[82] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 169
		bodyModel[83] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 170
		bodyModel[84] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 171
		bodyModel[85] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 172
		bodyModel[86] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 173
		bodyModel[87] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 174
		bodyModel[88] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 175
		bodyModel[89] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 176
		bodyModel[90] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 177
		bodyModel[91] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 178
		bodyModel[92] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 179
		bodyModel[93] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 180
		bodyModel[94] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 181
		bodyModel[95] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 182
		bodyModel[96] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 183
		bodyModel[97] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 184
		bodyModel[98] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 185
		bodyModel[99] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 186
		bodyModel[100] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 187
		bodyModel[101] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 188
		bodyModel[102] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 189
		bodyModel[103] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 190
		bodyModel[104] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 191
		bodyModel[105] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 192
		bodyModel[106] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 193
		bodyModel[107] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 194
		bodyModel[108] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 195
		bodyModel[109] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 196
		bodyModel[110] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 197
		bodyModel[111] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 198
		bodyModel[112] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 199
		bodyModel[113] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 200
		bodyModel[114] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 135
		bodyModel[115] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 136
		bodyModel[116] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 137
		bodyModel[117] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 138
		bodyModel[118] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 139
		bodyModel[119] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 141
		bodyModel[120] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 142
		bodyModel[121] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 143
		bodyModel[122] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 144
		bodyModel[123] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 145
		bodyModel[124] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 146
		bodyModel[125] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 147
		bodyModel[126] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 148
		bodyModel[127] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 149
		bodyModel[128] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 150
		bodyModel[129] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 151
		bodyModel[130] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 152
		bodyModel[131] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 153
		bodyModel[132] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 154
		bodyModel[133] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 155
		bodyModel[134] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 156
		bodyModel[135] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 157
		bodyModel[136] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 158
		bodyModel[137] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 159
		bodyModel[138] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 160
		bodyModel[139] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 162
		bodyModel[140] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 163
		bodyModel[141] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 164
		bodyModel[142] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 166
		bodyModel[143] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 167
		bodyModel[144] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 169
		bodyModel[145] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 170
		bodyModel[146] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Box 171
		bodyModel[147] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 175
		bodyModel[148] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 176
		bodyModel[149] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 177
		bodyModel[150] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 178
		bodyModel[151] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 179
		bodyModel[152] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 180
		bodyModel[153] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 181
		bodyModel[154] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 182
		bodyModel[155] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 185
		bodyModel[156] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 186
		bodyModel[157] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 187
		bodyModel[158] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 188
		bodyModel[159] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 189
		bodyModel[160] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 190
		bodyModel[161] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 191
		bodyModel[162] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 192
		bodyModel[163] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 193
		bodyModel[164] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 194
		bodyModel[165] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 195
		bodyModel[166] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 196
		bodyModel[167] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 197
		bodyModel[168] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 198
		bodyModel[169] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 199
		bodyModel[170] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 200
		bodyModel[171] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Du loco part Ligjhtpart15
		bodyModel[172] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[173] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[174] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Du loco part37
		bodyModel[175] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Du loco part37
		bodyModel[176] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Du loco part37
		bodyModel[177] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part37
		bodyModel[178] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Du loco part37
		bodyModel[179] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Du loco part37
		bodyModel[180] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Du loco part37
		bodyModel[181] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Du loco part37
		bodyModel[182] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Du loco part37
		bodyModel[183] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Du loco part37
		bodyModel[184] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Du loco part37
		bodyModel[185] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Du loco part37
		bodyModel[186] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Du loco part37
		bodyModel[187] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Du loco part37
		bodyModel[188] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Du loco part37
		bodyModel[189] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Du loco part37
		bodyModel[190] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Du loco part37
		bodyModel[191] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Du loco part37
		bodyModel[192] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Du loco part37
		bodyModel[193] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Du loco part37
		bodyModel[194] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Du loco part37
		bodyModel[195] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Du loco part37
		bodyModel[196] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Du loco part37
		bodyModel[197] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Du loco part37
		bodyModel[198] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Du loco part37
		bodyModel[199] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Du loco part37
		bodyModel[200] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Du loco part37
		bodyModel[201] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Du loco part37
		bodyModel[202] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Du loco part37
		bodyModel[203] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Du loco part47
		bodyModel[204] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Du loco part47
		bodyModel[205] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Du loco part47
		bodyModel[206] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Du loco part47
		bodyModel[207] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Du loco part47
		bodyModel[208] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Du loco part56
		bodyModel[209] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 154
		bodyModel[210] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 156
		bodyModel[211] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Du loco part47
		bodyModel[212] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Du loco part47
		bodyModel[213] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Du loco part47
		bodyModel[214] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Du loco part47
		bodyModel[215] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Du loco part42
		bodyModel[216] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Du loco part42
		bodyModel[217] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Du loco part42
		bodyModel[218] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Du loco part42
		bodyModel[219] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Du loco part37
		bodyModel[220] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Du loco part37
		bodyModel[221] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Du loco part37
		bodyModel[222] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Du loco part37
		bodyModel[223] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Du loco part37
		bodyModel[224] = new ModelRendererTurbo(this, 225, 121, textureX, textureY); // Du loco part37
		bodyModel[225] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Du loco part37
		bodyModel[226] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Du loco part37
		bodyModel[227] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Du loco part37
		bodyModel[228] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Du loco part37
		bodyModel[229] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Du loco part47
		bodyModel[230] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Du loco part47
		bodyModel[231] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 146
		bodyModel[232] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 146
		bodyModel[233] = new ModelRendererTurbo(this, 65, 66, textureX, textureY); // Box 146
		bodyModel[234] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 146
		bodyModel[235] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 146
		bodyModel[236] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 146
		bodyModel[237] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 146
		bodyModel[238] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 146
		bodyModel[239] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 146
		bodyModel[240] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 146
		bodyModel[241] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 146
		bodyModel[242] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 146

		bodyModel[0].addBox(0F, 0F, 0F, 83, 8, 12, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(0F, -11F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 3, 22, 0F); // Du loco part02
		bodyModel[1].setRotationPoint(-3F, -11F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 89, 1, 22, 0F); // Du loco part03
		bodyModel[2].setRotationPoint(-3F, -12F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 3, 22, 0F); // Du loco part04
		bodyModel[3].setRotationPoint(85F, -11F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 68, 1, 1, 0F); // Du loco part05
		bodyModel[4].setRotationPoint(1F, -11F, 7F);

		bodyModel[5].addBox(0F, 0F, 0F, 68, 1, 1, 0F); // Du loco part06
		bodyModel[5].setRotationPoint(1F, -11F, -8F);

		bodyModel[6].addBox(0F, 0F, 0F, 47, 18, 1, 0F); // Du loco part07
		bodyModel[6].setRotationPoint(18F, -30F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 87, 3, 4, 0F); // Du loco part08
		bodyModel[7].setRotationPoint(-2F, -33F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Du loco part09
		bodyModel[8].setRotationPoint(4F, -7F, 6.05F);

		bodyModel[9].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Du loco part10
		bodyModel[9].setRotationPoint(73F, -7F, 6.05F);

		bodyModel[10].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Du loco part11
		bodyModel[10].setRotationPoint(4F, -7F, -6.05F);

		bodyModel[11].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Du loco part12
		bodyModel[11].setRotationPoint(16F, -11F, -6.05F);

		bodyModel[12].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Du loco part13
		bodyModel[12].setRotationPoint(73F, -7F, -6.05F);

		bodyModel[13].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Du loco part14
		bodyModel[13].setRotationPoint(30F, -11F, -6.05F);

		bodyModel[14].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Du loco part15
		bodyModel[14].setRotationPoint(43F, -11F, -6.05F);

		bodyModel[15].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Du loco part16
		bodyModel[15].setRotationPoint(58F, -11F, -6.05F);

		bodyModel[16].addBox(0F, 0F, 0F, 43, 1, 0, 0F); // Du loco part17
		bodyModel[16].setRotationPoint(20F, -9F, -6.1F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 18, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[17].setRotationPoint(-2F, -30F, -10F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Du loco part20
		bodyModel[18].setRotationPoint(84F, -30F, -10F);

		bodyModel[19].addBox(0F, 0F, 0F, 19, 18, 1, 0F); // Du loco part22
		bodyModel[19].setRotationPoint(-1F, -30F, 10F);

		bodyModel[20].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Du loco part23
		bodyModel[20].setRotationPoint(16F, -11F, 6.05F);

		bodyModel[21].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Du loco part24
		bodyModel[21].setRotationPoint(30F, -11F, 6.05F);

		bodyModel[22].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Du loco part25
		bodyModel[22].setRotationPoint(43F, -11F, 6.05F);

		bodyModel[23].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Du loco part26
		bodyModel[23].setRotationPoint(58F, -11F, 6.05F);

		bodyModel[24].addBox(0F, 0F, 0F, 43, 1, 0, 0F); // Du loco part27
		bodyModel[24].setRotationPoint(20F, -9F, 6.1F);

		bodyModel[25].addBox(0F, 0F, 0F, 19, 18, 1, 0F); // Du loco part28
		bodyModel[25].setRotationPoint(-1F, -30F, -11F);

		bodyModel[26].addBox(0F, 0F, 0F, 19, 18, 1, 0F); // Du loco part31
		bodyModel[26].setRotationPoint(65F, -30F, -11F);

		bodyModel[27].addBox(0F, 0F, 0F, 19, 18, 1, 0F); // Du loco part32
		bodyModel[27].setRotationPoint(65F, -30F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F); // Du loco part37
		bodyModel[28].setRotationPoint(-2F, -34F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Du loco part38
		bodyModel[29].setRotationPoint(83F, -34F, -1F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Du loco part41
		bodyModel[30].setRotationPoint(-3F, -8F, -8F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Du loco part42
		bodyModel[31].setRotationPoint(85F, -8F, -8F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[32].setRotationPoint(-7F, -8F, 4F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[33].setRotationPoint(-7F, -8F, -7F);

		bodyModel[34].addBox(0F, 0F, 0F, 0, 0, 4, 0F); // Du loco part68
		bodyModel[34].setRotationPoint(-2F, -33F, -2F);

		bodyModel[35].addBox(0F, 0F, 0F, 83, 2, 4, 0F); // Du loco part69
		bodyModel[35].setRotationPoint(0F, -32F, 2F);

		bodyModel[36].addBox(0F, 0F, 0F, 83, 2, 4, 0F); // Du loco part71
		bodyModel[36].setRotationPoint(0F, -32F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[37].setRotationPoint(-1F, -19F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[38].setRotationPoint(6F, -13F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part84
		bodyModel[39].setRotationPoint(7F, -13F, -1F);
		bodyModel[39].rotateAngleY = -1.57079633F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part85
		bodyModel[40].setRotationPoint(7F, -13F, 2F);
		bodyModel[40].rotateAngleY = -1.57079633F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[41].setRotationPoint(6F, -16F, -1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[42].setRotationPoint(7F, -16F, 2F);
		bodyModel[42].rotateAngleY = -1.57079633F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[43].setRotationPoint(7F, -16F, -1F);
		bodyModel[43].rotateAngleY = -1.57079633F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[44].setRotationPoint(9F, -20F, -1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[45].setRotationPoint(9F, -19F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[46].setRotationPoint(9F, -19F, 1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part106
		bodyModel[47].setRotationPoint(84F, -19F, 10F);
		bodyModel[47].rotateAngleY = -3.14159265F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part107
		bodyModel[48].setRotationPoint(74F, -16F, -1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part109
		bodyModel[49].setRotationPoint(74F, -13F, 2F);
		bodyModel[49].rotateAngleY = -1.57079633F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part111
		bodyModel[50].setRotationPoint(73F, -13F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part112
		bodyModel[51].setRotationPoint(74F, -13F, -1F);
		bodyModel[51].rotateAngleY = -1.57079633F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part119
		bodyModel[52].setRotationPoint(74F, -16F, 2F);
		bodyModel[52].rotateAngleY = -1.57079633F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part120
		bodyModel[53].setRotationPoint(74F, -16F, -1F);
		bodyModel[53].rotateAngleY = -1.57079633F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part121
		bodyModel[54].setRotationPoint(73F, -20F, -1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part122
		bodyModel[55].setRotationPoint(73F, -19F, 1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part123
		bodyModel[56].setRotationPoint(73F, -19F, -2F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Du loco part Ligjhtpart14
		bodyModel[57].setRotationPoint(-3F, -17F, 4F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Du loco part Ligjhtpart17
		bodyModel[58].setRotationPoint(-3F, -17F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[59].setRotationPoint(-3F, -18F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[60].setRotationPoint(-3F, -15F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart15
		bodyModel[61].setRotationPoint(-3F, -15F, 3F);

		bodyModel[62].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart13
		bodyModel[62].setRotationPoint(-3F, -18F, 3F);

		bodyModel[63].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart10
		bodyModel[63].setRotationPoint(-3F, -34F, -3F);

		bodyModel[64].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart12
		bodyModel[64].setRotationPoint(-3F, -31F, -3F);

		bodyModel[65].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Du loco part Ligjhtpart11
		bodyModel[65].setRotationPoint(-3F, -33F, -3F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Du loco part Ligjhtpart6
		bodyModel[66].setRotationPoint(85F, -17F, 4F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Du loco part Ligjhtpart4
		bodyModel[67].setRotationPoint(85F, -17F, -8F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Du loco part Ligjhtpart8
		bodyModel[68].setRotationPoint(85F, -33F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart9
		bodyModel[69].setRotationPoint(85F, -34F, -2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart7
		bodyModel[70].setRotationPoint(85F, -31F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart5
		bodyModel[71].setRotationPoint(85F, -18F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart3
		bodyModel[72].setRotationPoint(85F, -15F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart1
		bodyModel[73].setRotationPoint(85F, -18F, 4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 83, 1, 1, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 146
		bodyModel[74].setRotationPoint(0F, -31F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 83, 1, 1, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[75].setRotationPoint(0F, -31F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 81, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[76].setRotationPoint(1F, -33F, -3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 81, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 149
		bodyModel[77].setRotationPoint(1F, -33F, 2F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[78].setRotationPoint(-6F, -8F, -6F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[79].setRotationPoint(-6F, -8F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 1F, 1, 18, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[80].setRotationPoint(-2F, -30F, -12F);

		bodyModel[81].addShapeBox(0F, 0F, 1F, 1, 18, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 168
		bodyModel[81].setRotationPoint(-2F, -30F, 9F);

		bodyModel[82].addShapeBox(0F, 0F, 1F, 1, 18, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 169
		bodyModel[82].setRotationPoint(84F, -30F, 9F);

		bodyModel[83].addShapeBox(0F, 0F, 1F, 1, 18, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[83].setRotationPoint(84F, -30F, -12F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 171
		bodyModel[84].setRotationPoint(85F, -8F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[85].setRotationPoint(85F, -8F, -9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[86].setRotationPoint(-3F, -8F, -9F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 174
		bodyModel[87].setRotationPoint(-3F, -8F, 8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[88].setRotationPoint(6F, -16F, -1F);
		bodyModel[88].rotateAngleY = -1.57079633F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[89].setRotationPoint(6F, -16F, 2F);
		bodyModel[89].rotateAngleY = -1.57079633F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[90].setRotationPoint(9F, -16F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[91].setRotationPoint(9F, -20F, 1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[92].setRotationPoint(9F, -20F, -2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[93].setRotationPoint(73F, -20F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[94].setRotationPoint(73F, -20F, 1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 182
		bodyModel[95].setRotationPoint(76F, -16F, 2F);
		bodyModel[95].rotateAngleY = -1.57079633F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[96].setRotationPoint(76F, -16F, -1F);
		bodyModel[96].rotateAngleY = -1.57079633F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[97].setRotationPoint(73F, -16F, 2F);
		bodyModel[97].rotateAngleY = -1.57079633F;

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[98].setRotationPoint(73F, -13F, -1F);
		bodyModel[98].rotateAngleY = -1.57079633F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[99].setRotationPoint(73F, -13F, 2F);
		bodyModel[99].rotateAngleY = -1.57079633F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 187
		bodyModel[100].setRotationPoint(76F, -13F, 2F);
		bodyModel[100].rotateAngleY = -1.57079633F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[101].setRotationPoint(76F, -13F, -1F);
		bodyModel[101].rotateAngleY = -1.57079633F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 189
		bodyModel[102].setRotationPoint(9F, -13F, 2F);
		bodyModel[102].rotateAngleY = -1.57079633F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[103].setRotationPoint(6F, -13F, 2F);
		bodyModel[103].rotateAngleY = -1.57079633F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[104].setRotationPoint(6F, -13F, -1F);
		bodyModel[104].rotateAngleY = -1.57079633F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[105].setRotationPoint(9F, -13F, -1F);
		bodyModel[105].rotateAngleY = -1.57079633F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[106].setRotationPoint(8F, -15F, 1F);
		bodyModel[106].rotateAngleY = -1.57079633F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[107].setRotationPoint(8F, -15F, 0F);
		bodyModel[107].rotateAngleY = -1.57079633F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[108].setRotationPoint(7F, -15F, 0F);
		bodyModel[108].rotateAngleY = -1.57079633F;

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[109].setRotationPoint(7F, -15F, 1F);
		bodyModel[109].rotateAngleY = -1.57079633F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 197
		bodyModel[110].setRotationPoint(75F, -15F, 1F);
		bodyModel[110].rotateAngleY = -1.57079633F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[111].setRotationPoint(74F, -15F, 0F);
		bodyModel[111].rotateAngleY = -1.57079633F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[112].setRotationPoint(75F, -15F, 0F);
		bodyModel[112].rotateAngleY = -1.57079633F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[113].setRotationPoint(74F, -15F, 1F);
		bodyModel[113].rotateAngleY = -1.57079633F;

		bodyModel[114].addBox(0F, 0F, 0F, 47, 18, 1, 0F); // Box 135
		bodyModel[114].setRotationPoint(18F, -30F, 10F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 136
		bodyModel[115].setRotationPoint(18F, -30F, -10F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 137
		bodyModel[116].setRotationPoint(64F, -30F, -10F);

		bodyModel[117].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[117].setRotationPoint(20F, -16F, -2F);

		bodyModel[118].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[118].setRotationPoint(19F, -22F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[119].setRotationPoint(19F, -24F, -3F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 142
		bodyModel[120].setRotationPoint(20F, -25F, -2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 143
		bodyModel[121].setRotationPoint(19F, -26F, -3F);

		bodyModel[122].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 144
		bodyModel[122].setRotationPoint(19F, -30F, -3F);

		bodyModel[123].addBox(0F, 0F, 0F, 12, 15, 12, 0F); // Box 145
		bodyModel[123].setRotationPoint(28F, -27F, -5F);

		bodyModel[124].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 146
		bodyModel[124].setRotationPoint(27F, -28F, -6F);

		bodyModel[125].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[125].setRotationPoint(22F, -19F, -4F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 148
		bodyModel[126].setRotationPoint(26F, -26F, -4F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[127].setRotationPoint(27F, -26F, -4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[128].setRotationPoint(41F, -16F, -2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[129].setRotationPoint(51F, -16F, -2F);

		bodyModel[130].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 152
		bodyModel[130].setRotationPoint(52F, -30F, -1F);

		bodyModel[131].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 153
		bodyModel[131].setRotationPoint(42F, -30F, -1F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 154
		bodyModel[132].setRotationPoint(45F, -27F, -1F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 155
		bodyModel[133].setRotationPoint(49F, -27F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 156
		bodyModel[134].setRotationPoint(49F, -18F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F); // Box 157
		bodyModel[135].setRotationPoint(45F, -18F, -1F);

		bodyModel[136].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 158
		bodyModel[136].setRotationPoint(47F, -26F, -1F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 159
		bodyModel[137].setRotationPoint(51F, -26F, -1F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 160
		bodyModel[138].setRotationPoint(44F, -26F, -1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[139].setRotationPoint(24F, -27F, 10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[140].setRotationPoint(24F, -25F, 10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[141].setRotationPoint(24F, -26F, 10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[142].setRotationPoint(24F, -24F, 10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[143].setRotationPoint(29F, -24F, 10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[144].setRotationPoint(29F, -25F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[145].setRotationPoint(29F, -26F, 10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[146].setRotationPoint(29F, -27F, 10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[147].setRotationPoint(48F, -24F, 10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[148].setRotationPoint(53F, -25F, 10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[149].setRotationPoint(53F, -24F, 10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[150].setRotationPoint(48F, -25F, 10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[151].setRotationPoint(48F, -27F, 10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[152].setRotationPoint(53F, -26F, 10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[153].setRotationPoint(48F, -26F, 10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[154].setRotationPoint(53F, -27F, 10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[155].setRotationPoint(29F, -27F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[156].setRotationPoint(24F, -27F, -11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[157].setRotationPoint(48F, -24F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[158].setRotationPoint(53F, -25F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[159].setRotationPoint(53F, -24F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[160].setRotationPoint(48F, -25F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[161].setRotationPoint(48F, -27F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[162].setRotationPoint(53F, -26F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[163].setRotationPoint(48F, -26F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[164].setRotationPoint(53F, -27F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[165].setRotationPoint(29F, -26F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[166].setRotationPoint(24F, -26F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[167].setRotationPoint(29F, -25F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[168].setRotationPoint(24F, -25F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[169].setRotationPoint(24F, -24F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[170].setRotationPoint(29F, -24F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart15
		bodyModel[171].setRotationPoint(85F, -15F, 3F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part Ligjhtpart8
		bodyModel[172].setRotationPoint(84F, -32F, -4F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part Ligjhtpart8
		bodyModel[173].setRotationPoint(-2F, -32F, 3F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[174].setRotationPoint(0F, -33F, -6F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[175].setRotationPoint(0F, -33F, 5F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[176].setRotationPoint(18F, -33F, -6F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[177].setRotationPoint(18F, -33F, 5F);

		bodyModel[178].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[178].setRotationPoint(0F, -34F, -6F);

		bodyModel[179].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[179].setRotationPoint(0F, -34F, 5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[180].setRotationPoint(13F, -36F, -5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[181].setRotationPoint(13F, -36F, 4F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[182].setRotationPoint(-1F, -36F, -5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[183].setRotationPoint(-1F, -36F, 4F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Du loco part37
		bodyModel[184].setRotationPoint(10F, -38F, 3F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Du loco part37
		bodyModel[185].setRotationPoint(10F, -38F, -4F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[186].setRotationPoint(-1F, -38F, 3F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[187].setRotationPoint(-1F, -38F, -4F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[188].setRotationPoint(64F, -33F, -6F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[189].setRotationPoint(64F, -33F, 5F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[190].setRotationPoint(82F, -33F, -6F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[191].setRotationPoint(82F, -33F, 5F);

		bodyModel[192].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[192].setRotationPoint(64F, -34F, -6F);

		bodyModel[193].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[193].setRotationPoint(64F, -34F, 5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[194].setRotationPoint(77F, -40F, -5F);

		bodyModel[195].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Du loco part37
		bodyModel[195].setRotationPoint(70F, -35F, -6F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[196].setRotationPoint(64F, -46F, -4F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[197].setRotationPoint(64F, -40F, -5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[198].setRotationPoint(74F, -46F, -4F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[199].setRotationPoint(77F, -40F, 4F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[200].setRotationPoint(64F, -46F, 3F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[201].setRotationPoint(64F, -40F, 4F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[202].setRotationPoint(74F, -46F, 3F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[203].setRotationPoint(-7F, -7F, 4F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[204].setRotationPoint(-7F, -9F, 4F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[205].setRotationPoint(-7F, -7F, -7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[206].setRotationPoint(-7F, -9F, -7F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part47
		bodyModel[207].setRotationPoint(89F, -8F, 4F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part56
		bodyModel[208].setRotationPoint(89F, -8F, -7F);

		bodyModel[209].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 154
		bodyModel[209].setRotationPoint(86F, -8F, -6F);

		bodyModel[210].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 156
		bodyModel[210].setRotationPoint(86F, -8F, 5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[211].setRotationPoint(89F, -7F, 4F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[212].setRotationPoint(89F, -9F, 4F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[213].setRotationPoint(89F, -7F, -7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[214].setRotationPoint(89F, -9F, -7F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 5, 4, 8, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Du loco part42
		bodyModel[215].setRotationPoint(-5F, -6F, 3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 4, 8, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[216].setRotationPoint(-5F, -6F, -11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 5, 4, 8, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[217].setRotationPoint(83F, -6F, 3F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 5, 4, 8, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Du loco part42
		bodyModel[218].setRotationPoint(83F, -6F, -11F);

		bodyModel[219].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[219].setRotationPoint(8F, -39F, -4F);

		bodyModel[220].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[220].setRotationPoint(8F, -39F, 3F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[221].setRotationPoint(9F, -40F, -6F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[222].setRotationPoint(9F, -40F, 6F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[223].setRotationPoint(9F, -40F, -8F);

		bodyModel[224].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[224].setRotationPoint(72F, -47F, -4F);

		bodyModel[225].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[225].setRotationPoint(72F, -47F, 3F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[226].setRotationPoint(73F, -48F, -6F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[227].setRotationPoint(73F, -48F, 6F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[228].setRotationPoint(73F, -48F, -8F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Du loco part47
		bodyModel[229].setRotationPoint(-4F, -8F, -1F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Du loco part47
		bodyModel[230].setRotationPoint(86F, -8F, -1F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[231].setRotationPoint(-2F, -32F, 2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[232].setRotationPoint(-2F, -32F, 6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[233].setRotationPoint(0F, -33F, 2F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[234].setRotationPoint(-2F, -32F, -6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, -2F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[235].setRotationPoint(-2F, -32F, -11F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[236].setRotationPoint(0F, -33F, -6F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[237].setRotationPoint(83F, -32F, 2F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[238].setRotationPoint(83F, -32F, 6F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[239].setRotationPoint(82F, -33F, 2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[240].setRotationPoint(83F, -32F, -6F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[241].setRotationPoint(83F, -32F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[242].setRotationPoint(82F, -33F, -6F);


	}
}