// Model: SJ Litterera Lgs
// Model Creator: Foxo, Electric
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package sp.foxo.train.client.render.models; //Path where the model is located

import fexcraft.tmt.slim.ModelConverter;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;
import train.common.api.Freight;

public class ModelSJLittLgs extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittLgs() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[336];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part41
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Du loco part41
		bodyModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Du loco part09
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Du loco part41
		bodyModel[4] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Du loco part41
		bodyModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Du loco part41
		bodyModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Du loco part41
		bodyModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Du loco part41
		bodyModel[8] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Du loco part41
		bodyModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Du loco part41
		bodyModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Du loco part41
		bodyModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Du loco part41
		bodyModel[12] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Du loco part41
		bodyModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Du loco part41
		bodyModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Du loco part41
		bodyModel[15] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Du loco part41
		bodyModel[16] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Du loco part41
		bodyModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Du loco part41
		bodyModel[18] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Du loco part41
		bodyModel[19] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Du loco part41
		bodyModel[20] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Du loco part41
		bodyModel[21] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Du loco part41
		bodyModel[22] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Du loco part41
		bodyModel[23] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Du loco part41
		bodyModel[24] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Du loco part41
		bodyModel[25] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Du loco part41
		bodyModel[26] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Du loco part41
		bodyModel[27] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Du loco part41
		bodyModel[28] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Du loco part41
		bodyModel[29] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Du loco part41
		bodyModel[30] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Du loco part41
		bodyModel[31] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Du loco part41
		bodyModel[32] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Du loco part41
		bodyModel[33] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Du loco part41
		bodyModel[34] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Du loco part41
		bodyModel[35] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Du loco part41
		bodyModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part41
		bodyModel[37] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Du loco part41
		bodyModel[38] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Du loco part41
		bodyModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part41
		bodyModel[40] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Du loco part41
		bodyModel[41] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part41
		bodyModel[42] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Du loco part41
		bodyModel[43] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Du loco part41
		bodyModel[44] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Du loco part41
		bodyModel[45] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Du loco part41
		bodyModel[46] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Du loco part41
		bodyModel[47] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Du loco part41
		bodyModel[48] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Du loco part41
		bodyModel[49] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Du loco part41
		bodyModel[50] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Du loco part41
		bodyModel[51] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Du loco part41
		bodyModel[52] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Du loco part41
		bodyModel[53] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Du loco part41
		bodyModel[54] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Du loco part41
		bodyModel[55] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Du loco part41
		bodyModel[56] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Du loco part41
		bodyModel[57] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Du loco part41
		bodyModel[58] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Du loco part41
		bodyModel[59] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Du loco part41
		bodyModel[60] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part41
		bodyModel[61] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Du loco part41
		bodyModel[62] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Du loco part41
		bodyModel[63] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Du loco part41
		bodyModel[64] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Du loco part41
		bodyModel[65] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part41
		bodyModel[66] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Du loco part41
		bodyModel[67] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Du loco part41
		bodyModel[68] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Du loco part41
		bodyModel[69] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Du loco part41
		bodyModel[70] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Du loco part41
		bodyModel[71] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Du loco part41
		bodyModel[72] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Du loco part41
		bodyModel[73] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Du loco part41
		bodyModel[74] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Du loco part09
		bodyModel[75] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Du loco part09
		bodyModel[76] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Du loco part09
		bodyModel[77] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Du loco part41
		bodyModel[78] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part41
		bodyModel[79] = new ModelRendererTurbo(this, 65, 60, textureX, textureY); // Du loco part41
		bodyModel[80] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Du loco part41
		bodyModel[81] = new ModelRendererTurbo(this, 16, 114, textureX, textureY); // Du loco part41
		bodyModel[82] = new ModelRendererTurbo(this, 1, 114, textureX, textureY); // Du loco part41
		bodyModel[83] = new ModelRendererTurbo(this, 11, 114, textureX, textureY); // Du loco part41
		bodyModel[84] = new ModelRendererTurbo(this, 6, 114, textureX, textureY); // Du loco part41
		bodyModel[85] = new ModelRendererTurbo(this, 16, 102, textureX, textureY); // Du loco part41
		bodyModel[86] = new ModelRendererTurbo(this, 1, 102, textureX, textureY); // Du loco part41
		bodyModel[87] = new ModelRendererTurbo(this, 11, 102, textureX, textureY); // Du loco part41
		bodyModel[88] = new ModelRendererTurbo(this, 6, 102, textureX, textureY); // Du loco part41
		bodyModel[89] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Du loco part41
		bodyModel[90] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Du loco part41
		bodyModel[91] = new ModelRendererTurbo(this, 22, 96, textureX, textureY); // Du loco part41
		bodyModel[92] = new ModelRendererTurbo(this, 15, 96, textureX, textureY); // Du loco part41
		bodyModel[93] = new ModelRendererTurbo(this, 8, 96, textureX, textureY); // Du loco part41
		bodyModel[94] = new ModelRendererTurbo(this, 6, 99, textureX, textureY); // Du loco part41
		bodyModel[95] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Du loco part41
		bodyModel[96] = new ModelRendererTurbo(this, 1, 93, textureX, textureY); // Du loco part41
		bodyModel[97] = new ModelRendererTurbo(this, 22, 90, textureX, textureY); // Du loco part41
		bodyModel[98] = new ModelRendererTurbo(this, 15, 90, textureX, textureY); // Du loco part41
		bodyModel[99] = new ModelRendererTurbo(this, 8, 90, textureX, textureY); // Du loco part41
		bodyModel[100] = new ModelRendererTurbo(this, 6, 93, textureX, textureY); // Du loco part41
		bodyModel[101] = new ModelRendererTurbo(this, 87, 130, textureX, textureY); // Du loco part41
		bodyModel[102] = new ModelRendererTurbo(this, 320, 134, textureX, textureY); // Du loco part41
		bodyModel[103] = new ModelRendererTurbo(this, 370, 229, textureX, textureY); // Du loco part41
		bodyModel[104] = new ModelRendererTurbo(this, 316, 114, textureX, textureY); // Du loco part41
		bodyModel[105] = new ModelRendererTurbo(this, 320, 229, textureX, textureY); // Du loco part41
		bodyModel[106] = new ModelRendererTurbo(this, 365, 229, textureX, textureY); // Du loco part41
		bodyModel[107] = new ModelRendererTurbo(this, 360, 229, textureX, textureY); // Du loco part41
		bodyModel[108] = new ModelRendererTurbo(this, 355, 229, textureX, textureY); // Du loco part41
		bodyModel[109] = new ModelRendererTurbo(this, 350, 229, textureX, textureY); // Du loco part41
		bodyModel[110] = new ModelRendererTurbo(this, 345, 229, textureX, textureY); // Du loco part41
		bodyModel[111] = new ModelRendererTurbo(this, 340, 229, textureX, textureY); // Du loco part41
		bodyModel[112] = new ModelRendererTurbo(this, 335, 229, textureX, textureY); // Du loco part41
		bodyModel[113] = new ModelRendererTurbo(this, 330, 229, textureX, textureY); // Du loco part41
		bodyModel[114] = new ModelRendererTurbo(this, 325, 229, textureX, textureY); // Du loco part41
		bodyModel[115] = new ModelRendererTurbo(this, 370, 209, textureX, textureY); // Du loco part41
		bodyModel[116] = new ModelRendererTurbo(this, 320, 209, textureX, textureY); // Du loco part41
		bodyModel[117] = new ModelRendererTurbo(this, 365, 209, textureX, textureY); // Du loco part41
		bodyModel[118] = new ModelRendererTurbo(this, 360, 209, textureX, textureY); // Du loco part41
		bodyModel[119] = new ModelRendererTurbo(this, 355, 209, textureX, textureY); // Du loco part41
		bodyModel[120] = new ModelRendererTurbo(this, 350, 209, textureX, textureY); // Du loco part41
		bodyModel[121] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Du loco part41
		bodyModel[122] = new ModelRendererTurbo(this, 340, 209, textureX, textureY); // Du loco part41
		bodyModel[123] = new ModelRendererTurbo(this, 335, 209, textureX, textureY); // Du loco part41
		bodyModel[124] = new ModelRendererTurbo(this, 330, 209, textureX, textureY); // Du loco part41
		bodyModel[125] = new ModelRendererTurbo(this, 325, 209, textureX, textureY); // Du loco part41
		bodyModel[126] = new ModelRendererTurbo(this, 335, 189, textureX, textureY); // Du loco part41
		bodyModel[127] = new ModelRendererTurbo(this, 330, 189, textureX, textureY); // Du loco part41
		bodyModel[128] = new ModelRendererTurbo(this, 325, 189, textureX, textureY); // Du loco part41
		bodyModel[129] = new ModelRendererTurbo(this, 320, 189, textureX, textureY); // Du loco part41
		bodyModel[130] = new ModelRendererTurbo(this, 342, 201, textureX, textureY); // Du loco part41
		bodyModel[131] = new ModelRendererTurbo(this, 342, 204, textureX, textureY); // Du loco part41
		bodyModel[132] = new ModelRendererTurbo(this, 345, 172, textureX, textureY); // Du loco part41
		bodyModel[133] = new ModelRendererTurbo(this, 345, 172, textureX, textureY); // Du loco part41
		bodyModel[134] = new ModelRendererTurbo(this, 345, 172, textureX, textureY); // Du loco part41
		bodyModel[135] = new ModelRendererTurbo(this, 345, 172, textureX, textureY); // Du loco part41
		bodyModel[136] = new ModelRendererTurbo(this, 345, 172, textureX, textureY); // Du loco part41
		bodyModel[137] = new ModelRendererTurbo(this, 345, 172, textureX, textureY); // Du loco part41
		bodyModel[138] = new ModelRendererTurbo(this, 345, 172, textureX, textureY); // Du loco part41
		bodyModel[139] = new ModelRendererTurbo(this, 345, 172, textureX, textureY); // Du loco part41
		bodyModel[140] = new ModelRendererTurbo(this, 345, 172, textureX, textureY); // Du loco part41
		bodyModel[141] = new ModelRendererTurbo(this, 345, 172, textureX, textureY); // Du loco part41
		bodyModel[142] = new ModelRendererTurbo(this, 345, 172, textureX, textureY); // Du loco part41
		bodyModel[143] = new ModelRendererTurbo(this, 335, 169, textureX, textureY); // Du loco part41
		bodyModel[144] = new ModelRendererTurbo(this, 330, 169, textureX, textureY); // Du loco part41
		bodyModel[145] = new ModelRendererTurbo(this, 325, 169, textureX, textureY); // Du loco part41
		bodyModel[146] = new ModelRendererTurbo(this, 320, 169, textureX, textureY); // Du loco part41
		bodyModel[147] = new ModelRendererTurbo(this, 237, 250, textureX, textureY); // Du loco part41
		bodyModel[148] = new ModelRendererTurbo(this, 304, 229, textureX, textureY); // Du loco part41
		bodyModel[149] = new ModelRendererTurbo(this, 233, 285, textureX, textureY); // Du loco part41
		bodyModel[150] = new ModelRendererTurbo(this, 254, 229, textureX, textureY); // Du loco part41
		bodyModel[151] = new ModelRendererTurbo(this, 299, 229, textureX, textureY); // Du loco part41
		bodyModel[152] = new ModelRendererTurbo(this, 294, 229, textureX, textureY); // Du loco part41
		bodyModel[153] = new ModelRendererTurbo(this, 289, 229, textureX, textureY); // Du loco part41
		bodyModel[154] = new ModelRendererTurbo(this, 284, 229, textureX, textureY); // Du loco part41
		bodyModel[155] = new ModelRendererTurbo(this, 279, 229, textureX, textureY); // Du loco part41
		bodyModel[156] = new ModelRendererTurbo(this, 274, 229, textureX, textureY); // Du loco part41
		bodyModel[157] = new ModelRendererTurbo(this, 269, 229, textureX, textureY); // Du loco part41
		bodyModel[158] = new ModelRendererTurbo(this, 264, 229, textureX, textureY); // Du loco part41
		bodyModel[159] = new ModelRendererTurbo(this, 259, 229, textureX, textureY); // Du loco part41
		bodyModel[160] = new ModelRendererTurbo(this, 304, 209, textureX, textureY); // Du loco part41
		bodyModel[161] = new ModelRendererTurbo(this, 254, 209, textureX, textureY); // Du loco part41
		bodyModel[162] = new ModelRendererTurbo(this, 299, 209, textureX, textureY); // Du loco part41
		bodyModel[163] = new ModelRendererTurbo(this, 294, 209, textureX, textureY); // Du loco part41
		bodyModel[164] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Du loco part41
		bodyModel[165] = new ModelRendererTurbo(this, 284, 209, textureX, textureY); // Du loco part41
		bodyModel[166] = new ModelRendererTurbo(this, 279, 209, textureX, textureY); // Du loco part41
		bodyModel[167] = new ModelRendererTurbo(this, 274, 209, textureX, textureY); // Du loco part41
		bodyModel[168] = new ModelRendererTurbo(this, 269, 209, textureX, textureY); // Du loco part41
		bodyModel[169] = new ModelRendererTurbo(this, 264, 209, textureX, textureY); // Du loco part41
		bodyModel[170] = new ModelRendererTurbo(this, 259, 209, textureX, textureY); // Du loco part41
		bodyModel[171] = new ModelRendererTurbo(this, 269, 189, textureX, textureY); // Du loco part41
		bodyModel[172] = new ModelRendererTurbo(this, 264, 189, textureX, textureY); // Du loco part41
		bodyModel[173] = new ModelRendererTurbo(this, 259, 189, textureX, textureY); // Du loco part41
		bodyModel[174] = new ModelRendererTurbo(this, 254, 189, textureX, textureY); // Du loco part41
		bodyModel[175] = new ModelRendererTurbo(this, 254, 312, textureX, textureY); // Du loco part41
		bodyModel[176] = new ModelRendererTurbo(this, 254, 315, textureX, textureY); // Du loco part41
		bodyModel[177] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Du loco part41
		bodyModel[178] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Du loco part41
		bodyModel[179] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Du loco part41
		bodyModel[180] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Du loco part41
		bodyModel[181] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Du loco part41
		bodyModel[182] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Du loco part41
		bodyModel[183] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Du loco part41
		bodyModel[184] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Du loco part41
		bodyModel[185] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Du loco part41
		bodyModel[186] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Du loco part41
		bodyModel[187] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Du loco part41
		bodyModel[188] = new ModelRendererTurbo(this, 269, 169, textureX, textureY); // Du loco part41
		bodyModel[189] = new ModelRendererTurbo(this, 264, 169, textureX, textureY); // Du loco part41
		bodyModel[190] = new ModelRendererTurbo(this, 259, 169, textureX, textureY); // Du loco part41
		bodyModel[191] = new ModelRendererTurbo(this, 254, 169, textureX, textureY); // Du loco part41
		bodyModel[192] = new ModelRendererTurbo(this, 73, 251, textureX, textureY); // Du loco part41
		bodyModel[193] = new ModelRendererTurbo(this, 174, 191, textureX, textureY); // Du loco part41
		bodyModel[194] = new ModelRendererTurbo(this, 124, 191, textureX, textureY); // Du loco part41
		bodyModel[195] = new ModelRendererTurbo(this, 169, 191, textureX, textureY); // Du loco part41
		bodyModel[196] = new ModelRendererTurbo(this, 164, 191, textureX, textureY); // Du loco part41
		bodyModel[197] = new ModelRendererTurbo(this, 159, 191, textureX, textureY); // Du loco part41
		bodyModel[198] = new ModelRendererTurbo(this, 154, 191, textureX, textureY); // Du loco part41
		bodyModel[199] = new ModelRendererTurbo(this, 149, 191, textureX, textureY); // Du loco part41
		bodyModel[200] = new ModelRendererTurbo(this, 144, 191, textureX, textureY); // Du loco part41
		bodyModel[201] = new ModelRendererTurbo(this, 139, 191, textureX, textureY); // Du loco part41
		bodyModel[202] = new ModelRendererTurbo(this, 134, 191, textureX, textureY); // Du loco part41
		bodyModel[203] = new ModelRendererTurbo(this, 129, 191, textureX, textureY); // Du loco part41
		bodyModel[204] = new ModelRendererTurbo(this, 174, 171, textureX, textureY); // Du loco part41
		bodyModel[205] = new ModelRendererTurbo(this, 124, 171, textureX, textureY); // Du loco part41
		bodyModel[206] = new ModelRendererTurbo(this, 169, 171, textureX, textureY); // Du loco part41
		bodyModel[207] = new ModelRendererTurbo(this, 164, 171, textureX, textureY); // Du loco part41
		bodyModel[208] = new ModelRendererTurbo(this, 159, 171, textureX, textureY); // Du loco part41
		bodyModel[209] = new ModelRendererTurbo(this, 154, 171, textureX, textureY); // Du loco part41
		bodyModel[210] = new ModelRendererTurbo(this, 149, 171, textureX, textureY); // Du loco part41
		bodyModel[211] = new ModelRendererTurbo(this, 144, 171, textureX, textureY); // Du loco part41
		bodyModel[212] = new ModelRendererTurbo(this, 139, 171, textureX, textureY); // Du loco part41
		bodyModel[213] = new ModelRendererTurbo(this, 134, 171, textureX, textureY); // Du loco part41
		bodyModel[214] = new ModelRendererTurbo(this, 129, 171, textureX, textureY); // Du loco part41
		bodyModel[215] = new ModelRendererTurbo(this, 95, 165, textureX, textureY); // Du loco part41
		bodyModel[216] = new ModelRendererTurbo(this, 95, 168, textureX, textureY); // Du loco part41
		bodyModel[217] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[218] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[219] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[220] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[221] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[222] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[223] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[224] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[225] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[226] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[227] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[228] = new ModelRendererTurbo(this, 124, 231, textureX, textureY); // Du loco part41
		bodyModel[229] = new ModelRendererTurbo(this, 129, 231, textureX, textureY); // Du loco part41
		bodyModel[230] = new ModelRendererTurbo(this, 134, 231, textureX, textureY); // Du loco part41
		bodyModel[231] = new ModelRendererTurbo(this, 139, 231, textureX, textureY); // Du loco part41
		bodyModel[232] = new ModelRendererTurbo(this, 229, 191, textureX, textureY); // Du loco part41
		bodyModel[233] = new ModelRendererTurbo(this, 179, 191, textureX, textureY); // Du loco part41
		bodyModel[234] = new ModelRendererTurbo(this, 224, 191, textureX, textureY); // Du loco part41
		bodyModel[235] = new ModelRendererTurbo(this, 219, 191, textureX, textureY); // Du loco part41
		bodyModel[236] = new ModelRendererTurbo(this, 214, 191, textureX, textureY); // Du loco part41
		bodyModel[237] = new ModelRendererTurbo(this, 209, 191, textureX, textureY); // Du loco part41
		bodyModel[238] = new ModelRendererTurbo(this, 204, 191, textureX, textureY); // Du loco part41
		bodyModel[239] = new ModelRendererTurbo(this, 199, 191, textureX, textureY); // Du loco part41
		bodyModel[240] = new ModelRendererTurbo(this, 194, 191, textureX, textureY); // Du loco part41
		bodyModel[241] = new ModelRendererTurbo(this, 189, 191, textureX, textureY); // Du loco part41
		bodyModel[242] = new ModelRendererTurbo(this, 184, 191, textureX, textureY); // Du loco part41
		bodyModel[243] = new ModelRendererTurbo(this, 229, 171, textureX, textureY); // Du loco part41
		bodyModel[244] = new ModelRendererTurbo(this, 179, 171, textureX, textureY); // Du loco part41
		bodyModel[245] = new ModelRendererTurbo(this, 224, 171, textureX, textureY); // Du loco part41
		bodyModel[246] = new ModelRendererTurbo(this, 219, 171, textureX, textureY); // Du loco part41
		bodyModel[247] = new ModelRendererTurbo(this, 214, 171, textureX, textureY); // Du loco part41
		bodyModel[248] = new ModelRendererTurbo(this, 209, 171, textureX, textureY); // Du loco part41
		bodyModel[249] = new ModelRendererTurbo(this, 204, 171, textureX, textureY); // Du loco part41
		bodyModel[250] = new ModelRendererTurbo(this, 199, 171, textureX, textureY); // Du loco part41
		bodyModel[251] = new ModelRendererTurbo(this, 194, 171, textureX, textureY); // Du loco part41
		bodyModel[252] = new ModelRendererTurbo(this, 189, 171, textureX, textureY); // Du loco part41
		bodyModel[253] = new ModelRendererTurbo(this, 184, 171, textureX, textureY); // Du loco part41
		bodyModel[254] = new ModelRendererTurbo(this, 124, 211, textureX, textureY); // Du loco part41
		bodyModel[255] = new ModelRendererTurbo(this, 129, 211, textureX, textureY); // Du loco part41
		bodyModel[256] = new ModelRendererTurbo(this, 134, 211, textureX, textureY); // Du loco part41
		bodyModel[257] = new ModelRendererTurbo(this, 139, 211, textureX, textureY); // Du loco part41
		bodyModel[258] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[259] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[260] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[261] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[262] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[263] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[264] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[265] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[266] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[267] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[268] = new ModelRendererTurbo(this, 112, 271, textureX, textureY); // Du loco part41
		bodyModel[269] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[270] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[271] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[272] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[273] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[274] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[275] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[276] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[277] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[278] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[279] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[280] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[281] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[282] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[283] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[284] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[285] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[286] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[287] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[288] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[289] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[290] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[291] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[292] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[293] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[294] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[295] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[296] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[297] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[298] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[299] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[300] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[301] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[302] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[303] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[304] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[305] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[306] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[307] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[308] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[309] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[310] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[311] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[312] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[313] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[314] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[315] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[316] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[317] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[318] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[319] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[320] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[321] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[322] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[323] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[324] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[325] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[326] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[327] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[328] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[329] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[330] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[331] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[332] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[333] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[334] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[335] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 1, 8, 20, 0F); // Du loco part41
		bodyModel[0].setRotationPoint(-3F, -15F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 8, 20, 0F); // Du loco part41
		bodyModel[1].setRotationPoint(63F, -15F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[2].setRotationPoint(-18.5F, -7.5F, 6.05F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part41
		bodyModel[3].setRotationPoint(7.5F, -4.5F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[4].setRotationPoint(7F, -5F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[5].setRotationPoint(7F, -5F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part41
		bodyModel[6].setRotationPoint(7F, -4F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[7].setRotationPoint(3.75F, -5.25F, -6.25F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[8].setRotationPoint(7F, -5F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[9].setRotationPoint(9F, -6.5F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[10].setRotationPoint(2.5F, -7F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[11].setRotationPoint(10.5F, -7F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Du loco part41
		bodyModel[12].setRotationPoint(4F, -7F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[13].setRotationPoint(7F, -5F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[14].setRotationPoint(7F, -4F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part41
		bodyModel[15].setRotationPoint(4F, -4.5F, 5.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[16].setRotationPoint(4F, -6.5F, 5.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part41
		bodyModel[17].setRotationPoint(4F, -4.5F, -6.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[18].setRotationPoint(4F, -6.5F, -6.75F);

		bodyModel[19].addBox(0F, 0F, 0F, 65, 1, 20, 0F); // Du loco part41
		bodyModel[19].setRotationPoint(-2F, -9F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part41
		bodyModel[20].setRotationPoint(52.5F, -4.5F, -6F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[21].setRotationPoint(52F, -5F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[22].setRotationPoint(52F, -5F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part41
		bodyModel[23].setRotationPoint(52F, -4F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[24].setRotationPoint(48.75F, -5.25F, -6.25F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[25].setRotationPoint(52F, -5F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[26].setRotationPoint(52F, -5F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[27].setRotationPoint(52F, -4F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part41
		bodyModel[28].setRotationPoint(49F, -4.5F, 5.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[29].setRotationPoint(49F, -6.5F, 5.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part41
		bodyModel[30].setRotationPoint(49F, -4.5F, -6.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[31].setRotationPoint(49F, -6.5F, -6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[32].setRotationPoint(56.25F, -5.25F, -6.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part41
		bodyModel[33].setRotationPoint(56F, -4.5F, 5.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part41
		bodyModel[34].setRotationPoint(56F, -6.5F, 5.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[35].setRotationPoint(56F, -4.5F, -6.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[36].setRotationPoint(56F, -6.5F, -6.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[37].setRotationPoint(11.25F, -5.25F, -6.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part41
		bodyModel[38].setRotationPoint(11F, -4.5F, 5.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part41
		bodyModel[39].setRotationPoint(11F, -6.5F, 5.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[40].setRotationPoint(11F, -4.5F, -6.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[41].setRotationPoint(11F, -6.5F, -6.75F);

		bodyModel[42].addBox(0F, 0F, 0F, 65, 1, 1, 0F); // Du loco part41
		bodyModel[42].setRotationPoint(-2F, -8F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[43].setRotationPoint(5F, -6.5F, -7F);

		bodyModel[44].addBox(0F, 0F, 0F, 65, 1, 1, 0F); // Du loco part41
		bodyModel[44].setRotationPoint(-2F, -8F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[45].setRotationPoint(9F, -6.5F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[46].setRotationPoint(2.5F, -7F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[47].setRotationPoint(11.5F, -7F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part41
		bodyModel[48].setRotationPoint(4F, -7F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[49].setRotationPoint(5F, -6.5F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[50].setRotationPoint(54F, -6.5F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[51].setRotationPoint(47.5F, -7F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[52].setRotationPoint(56.5F, -7F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Du loco part41
		bodyModel[53].setRotationPoint(49F, -7F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[54].setRotationPoint(50F, -6.5F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[55].setRotationPoint(54F, -6.5F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[56].setRotationPoint(47.5F, -7F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[57].setRotationPoint(56.5F, -7F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part41
		bodyModel[58].setRotationPoint(49F, -7F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[59].setRotationPoint(50F, -6.5F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Du loco part41
		bodyModel[60].setRotationPoint(14F, -7F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[61].setRotationPoint(37F, -7F, 6F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part41
		bodyModel[62].setRotationPoint(24F, -7F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Du loco part41
		bodyModel[63].setRotationPoint(14F, -7F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[64].setRotationPoint(37F, -7F, -7F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part41
		bodyModel[65].setRotationPoint(24F, -7F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Du loco part41
		bodyModel[66].setRotationPoint(56.25F, -8.5F, -5.25F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Du loco part41
		bodyModel[67].setRotationPoint(56.25F, -8.5F, 4.25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part41
		bodyModel[68].setRotationPoint(48.75F, -8.5F, -5.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part41
		bodyModel[69].setRotationPoint(48.75F, -8.5F, 4.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Du loco part41
		bodyModel[70].setRotationPoint(11.25F, -8.5F, -5.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Du loco part41
		bodyModel[71].setRotationPoint(11.25F, -8.5F, 4.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part41
		bodyModel[72].setRotationPoint(3.75F, -8.5F, -5.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part41
		bodyModel[73].setRotationPoint(3.75F, -8.5F, 4.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[74].setRotationPoint(-18.5F, -7.5F, -6.05F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[75].setRotationPoint(26.5F, -7.5F, 6.05F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[76].setRotationPoint(26.5F, -7.5F, -6.05F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part41
		bodyModel[77].setRotationPoint(36F, -7F, 6F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part41
		bodyModel[78].setRotationPoint(36F, -7F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Du loco part41
		bodyModel[79].setRotationPoint(25F, -4F, 6F);

		bodyModel[80].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Du loco part41
		bodyModel[80].setRotationPoint(25F, -4F, -7F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Du loco part41
		bodyModel[81].setRotationPoint(64F, -17F, -9F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Du loco part41
		bodyModel[82].setRotationPoint(64F, -17F, 8F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Du loco part41
		bodyModel[83].setRotationPoint(64F, -17F, -4F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Du loco part41
		bodyModel[84].setRotationPoint(64F, -17F, 3F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Du loco part41
		bodyModel[85].setRotationPoint(-4F, -17F, -9F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Du loco part41
		bodyModel[86].setRotationPoint(-4F, -17F, 8F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Du loco part41
		bodyModel[87].setRotationPoint(-4F, -17F, -4F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Du loco part41
		bodyModel[88].setRotationPoint(-4F, -17F, 3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[89].setRotationPoint(-2F, -10F, 9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part41
		bodyModel[90].setRotationPoint(-2F, -10F, 8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[91].setRotationPoint(28F, -10F, 9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[92].setRotationPoint(31F, -10F, 9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[93].setRotationPoint(61F, -10F, 9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[94].setRotationPoint(62F, -10F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part41
		bodyModel[95].setRotationPoint(-2F, -10F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part41
		bodyModel[96].setRotationPoint(-2F, -10F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part41
		bodyModel[97].setRotationPoint(28F, -10F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[98].setRotationPoint(31F, -10F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[99].setRotationPoint(61F, -10F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[100].setRotationPoint(62F, -10F, -9F);

		bodyModel[101].addBox(0F, 0F, 0F, 61, 18, 16, 0F); // Du loco part41
		bodyModel[101].setRotationPoint(0F, -28F, -8F);

		bodyModel[102].addBox(0F, 0F, 0F, 29, 18, 16, 0F); // Du loco part41
		bodyModel[102].setRotationPoint(0F, -28F, -8F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[103].setRotationPoint(-1F, -28F, -9F);

		bodyModel[104].addBox(0F, 0F, 0F, 31, 1, 18, 0F); // Du loco part41
		bodyModel[104].setRotationPoint(-1F, -10F, -9F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[105].setRotationPoint(29F, -28F, -9F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[106].setRotationPoint(2F, -28F, -9F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[107].setRotationPoint(5F, -28F, -9F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[108].setRotationPoint(8F, -28F, -9F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[109].setRotationPoint(11F, -28F, -9F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[110].setRotationPoint(14F, -28F, -9F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[111].setRotationPoint(17F, -28F, -9F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[112].setRotationPoint(20F, -28F, -9F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[113].setRotationPoint(23F, -28F, -9F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[114].setRotationPoint(26F, -28F, -9F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[115].setRotationPoint(-1F, -28F, 8F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[116].setRotationPoint(29F, -28F, 8F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[117].setRotationPoint(2F, -28F, 8F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[118].setRotationPoint(5F, -28F, 8F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[119].setRotationPoint(8F, -28F, 8F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[120].setRotationPoint(11F, -28F, 8F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[121].setRotationPoint(14F, -28F, 8F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[122].setRotationPoint(17F, -28F, 8F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[123].setRotationPoint(20F, -28F, 8F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[124].setRotationPoint(23F, -28F, 8F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[125].setRotationPoint(26F, -28F, 8F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[126].setRotationPoint(-1F, -28F, 4.75F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[127].setRotationPoint(-1F, -28F, 1.5F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[128].setRotationPoint(-1F, -28F, -2.5F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[129].setRotationPoint(-1F, -28F, -5.75F);

		bodyModel[130].addBox(0F, 0F, 0F, 31, 1, 1, 0F); // Du loco part41
		bodyModel[130].setRotationPoint(-1F, -29F, -9F);

		bodyModel[131].addBox(0F, 0F, 0F, 31, 1, 1, 0F); // Du loco part41
		bodyModel[131].setRotationPoint(-1F, -29F, 8F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[132].setRotationPoint(-1F, -29F, -8F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[133].setRotationPoint(2F, -29F, -8F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[134].setRotationPoint(5F, -29F, -8F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[135].setRotationPoint(8F, -29F, -8F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[136].setRotationPoint(11F, -29F, -8F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[137].setRotationPoint(14F, -29F, -8F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[138].setRotationPoint(17F, -29F, -8F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[139].setRotationPoint(20F, -29F, -8F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[140].setRotationPoint(23F, -29F, -8F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[141].setRotationPoint(26F, -29F, -8F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[142].setRotationPoint(29F, -29F, -8F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[143].setRotationPoint(29F, -28F, 4.75F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[144].setRotationPoint(29F, -28F, 1.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[145].setRotationPoint(29F, -28F, -2.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[146].setRotationPoint(29F, -28F, -5.75F);

		bodyModel[147].addBox(0F, 0F, 0F, 29, 18, 16, 0F); // Du loco part41
		bodyModel[147].setRotationPoint(32F, -28F, -8F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[148].setRotationPoint(31F, -28F, -9F);

		bodyModel[149].addBox(0F, 0F, 0F, 31, 1, 18, 0F); // Du loco part41
		bodyModel[149].setRotationPoint(31F, -10F, -9F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[150].setRotationPoint(61F, -28F, -9F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[151].setRotationPoint(34F, -28F, -9F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[152].setRotationPoint(37F, -28F, -9F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[153].setRotationPoint(40F, -28F, -9F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[154].setRotationPoint(43F, -28F, -9F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[155].setRotationPoint(46F, -28F, -9F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[156].setRotationPoint(49F, -28F, -9F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[157].setRotationPoint(52F, -28F, -9F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[158].setRotationPoint(55F, -28F, -9F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[159].setRotationPoint(58F, -28F, -9F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[160].setRotationPoint(31F, -28F, 8F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[161].setRotationPoint(61F, -28F, 8F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[162].setRotationPoint(34F, -28F, 8F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[163].setRotationPoint(37F, -28F, 8F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[164].setRotationPoint(40F, -28F, 8F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[165].setRotationPoint(43F, -28F, 8F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[166].setRotationPoint(46F, -28F, 8F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[167].setRotationPoint(49F, -28F, 8F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[168].setRotationPoint(52F, -28F, 8F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[169].setRotationPoint(55F, -28F, 8F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[170].setRotationPoint(58F, -28F, 8F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[171].setRotationPoint(31F, -28F, 4.75F);

		bodyModel[172].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[172].setRotationPoint(31F, -28F, 1.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[173].setRotationPoint(31F, -28F, -2.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[174].setRotationPoint(31F, -28F, -5.75F);

		bodyModel[175].addBox(0F, 0F, 0F, 31, 1, 1, 0F); // Du loco part41
		bodyModel[175].setRotationPoint(31F, -29F, -9F);

		bodyModel[176].addBox(0F, 0F, 0F, 31, 1, 1, 0F); // Du loco part41
		bodyModel[176].setRotationPoint(31F, -29F, 8F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[177].setRotationPoint(31F, -29F, -8F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[178].setRotationPoint(34F, -29F, -8F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[179].setRotationPoint(37F, -29F, -8F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[180].setRotationPoint(40F, -29F, -8F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[181].setRotationPoint(43F, -29F, -8F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[182].setRotationPoint(46F, -29F, -8F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[183].setRotationPoint(49F, -29F, -8F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[184].setRotationPoint(52F, -29F, -8F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[185].setRotationPoint(55F, -29F, -8F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[186].setRotationPoint(58F, -29F, -8F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[187].setRotationPoint(61F, -29F, -8F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[188].setRotationPoint(61F, -28F, 4.75F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[189].setRotationPoint(61F, -28F, 1.5F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[190].setRotationPoint(61F, -28F, -2.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[191].setRotationPoint(61F, -28F, -5.75F);

		bodyModel[192].addBox(0F, 0F, 0F, 63, 1, 18, 0F); // Du loco part41
		bodyModel[192].setRotationPoint(-1F, -10F, -9F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[193].setRotationPoint(31F, -28F, -9F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[194].setRotationPoint(61F, -28F, -9F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[195].setRotationPoint(34F, -28F, -9F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[196].setRotationPoint(37F, -28F, -9F);

		bodyModel[197].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[197].setRotationPoint(40F, -28F, -9F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[198].setRotationPoint(43F, -28F, -9F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[199].setRotationPoint(46F, -28F, -9F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[200].setRotationPoint(49F, -28F, -9F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[201].setRotationPoint(52F, -28F, -9F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[202].setRotationPoint(55F, -28F, -9F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[203].setRotationPoint(58F, -28F, -9F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[204].setRotationPoint(31F, -28F, 8F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[205].setRotationPoint(61F, -28F, 8F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[206].setRotationPoint(34F, -28F, 8F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[207].setRotationPoint(37F, -28F, 8F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[208].setRotationPoint(40F, -28F, 8F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[209].setRotationPoint(43F, -28F, 8F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[210].setRotationPoint(46F, -28F, 8F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[211].setRotationPoint(49F, -28F, 8F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[212].setRotationPoint(52F, -28F, 8F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[213].setRotationPoint(55F, -28F, 8F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[214].setRotationPoint(58F, -28F, 8F);

		bodyModel[215].addBox(0F, 0F, 0F, 63, 1, 1, 0F); // Du loco part41
		bodyModel[215].setRotationPoint(-1F, -29F, -9F);

		bodyModel[216].addBox(0F, 0F, 0F, 63, 1, 1, 0F); // Du loco part41
		bodyModel[216].setRotationPoint(-1F, -29F, 8F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[217].setRotationPoint(31F, -29F, -8F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[218].setRotationPoint(34F, -29F, -8F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[219].setRotationPoint(37F, -29F, -8F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[220].setRotationPoint(40F, -29F, -8F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[221].setRotationPoint(43F, -29F, -8F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[222].setRotationPoint(46F, -29F, -8F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[223].setRotationPoint(49F, -29F, -8F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[224].setRotationPoint(52F, -29F, -8F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[225].setRotationPoint(55F, -29F, -8F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[226].setRotationPoint(58F, -29F, -8F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[227].setRotationPoint(61F, -29F, -8F);

		bodyModel[228].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[228].setRotationPoint(61F, -28F, 4.75F);

		bodyModel[229].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[229].setRotationPoint(61F, -28F, 1.5F);

		bodyModel[230].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[230].setRotationPoint(61F, -28F, -2.5F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[231].setRotationPoint(61F, -28F, -5.75F);

		bodyModel[232].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[232].setRotationPoint(-1F, -28F, -9F);

		bodyModel[233].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[233].setRotationPoint(29F, -28F, -9F);

		bodyModel[234].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[234].setRotationPoint(2F, -28F, -9F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[235].setRotationPoint(5F, -28F, -9F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[236].setRotationPoint(8F, -28F, -9F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[237].setRotationPoint(11F, -28F, -9F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[238].setRotationPoint(14F, -28F, -9F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[239].setRotationPoint(17F, -28F, -9F);

		bodyModel[240].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[240].setRotationPoint(20F, -28F, -9F);

		bodyModel[241].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[241].setRotationPoint(23F, -28F, -9F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[242].setRotationPoint(26F, -28F, -9F);

		bodyModel[243].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[243].setRotationPoint(-1F, -28F, 8F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[244].setRotationPoint(29F, -28F, 8F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[245].setRotationPoint(2F, -28F, 8F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[246].setRotationPoint(5F, -28F, 8F);

		bodyModel[247].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[247].setRotationPoint(8F, -28F, 8F);

		bodyModel[248].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[248].setRotationPoint(11F, -28F, 8F);

		bodyModel[249].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[249].setRotationPoint(14F, -28F, 8F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[250].setRotationPoint(17F, -28F, 8F);

		bodyModel[251].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[251].setRotationPoint(20F, -28F, 8F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[252].setRotationPoint(23F, -28F, 8F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[253].setRotationPoint(26F, -28F, 8F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[254].setRotationPoint(-1F, -28F, 4.75F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[255].setRotationPoint(-1F, -28F, 1.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[256].setRotationPoint(-1F, -28F, -2.5F);

		bodyModel[257].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Du loco part41
		bodyModel[257].setRotationPoint(-1F, -28F, -5.75F);

		bodyModel[258].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[258].setRotationPoint(-1F, -29F, -8F);

		bodyModel[259].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[259].setRotationPoint(2F, -29F, -8F);

		bodyModel[260].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[260].setRotationPoint(5F, -29F, -8F);

		bodyModel[261].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[261].setRotationPoint(8F, -29F, -8F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[262].setRotationPoint(11F, -29F, -8F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[263].setRotationPoint(14F, -29F, -8F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[264].setRotationPoint(17F, -29F, -8F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[265].setRotationPoint(20F, -29F, -8F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[266].setRotationPoint(23F, -29F, -8F);

		bodyModel[267].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[267].setRotationPoint(26F, -29F, -8F);

		bodyModel[268].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Du loco part41
		bodyModel[268].setRotationPoint(29F, -29F, -8F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[269].setRotationPoint(-4F, -9.25F, 4.43F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[270].setRotationPoint(-3.75F, -9F, 4.9F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[271].setRotationPoint(-6.5F, -8.75F, 5.15F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[272].setRotationPoint(-4F, -9.25F, -6.63F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[273].setRotationPoint(-6.5F, -8.75F, -5.88F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[274].setRotationPoint(-4F, -8.75F, 0F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[275].setRotationPoint(-4F, -8.75F, -1F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[276].setRotationPoint(-3.5F, -8.5F, -0.25F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[277].setRotationPoint(-5.5F, -7F, -0.25F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[278].setRotationPoint(-4.5F, -8.75F, -0.25F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[279].setRotationPoint(-5.5F, -8.5F, 0F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[280].setRotationPoint(-5.5F, -8.5F, -0.75F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[281].setRotationPoint(-4F, -8.75F, 0.25F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[282].setRotationPoint(-4F, -8.5F, -0.25F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[283].setRotationPoint(-4F, -9F, -0.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[284].setRotationPoint(-4F, -6F, -0.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[285].setRotationPoint(-4F, -8.75F, -1F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[286].setRotationPoint(-5.5F, -6F, -0.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[287].setRotationPoint(-5.5F, -5.25F, -0.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[288].setRotationPoint(-7.5F, -8.87F, 4.03F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[289].setRotationPoint(-7.5F, -9.87F, 4.03F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[290].setRotationPoint(-7.5F, -9.37F, 4.03F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[291].setRotationPoint(-7.5F, -7.87F, 4.03F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[292].setRotationPoint(-7.5F, -8.37F, 4.03F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[293].setRotationPoint(-7.5F, -8.87F, -7.03F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[294].setRotationPoint(-7.5F, -9.87F, -7.03F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[295].setRotationPoint(-7.5F, -9.37F, -7.03F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[296].setRotationPoint(-7.5F, -7.87F, -7.03F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[297].setRotationPoint(-7.5F, -8.37F, -7.03F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[298].setRotationPoint(-3.75F, -9.5F, 4.9F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[299].setRotationPoint(-3.75F, -8.25F, 4.9F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[300].setRotationPoint(-3.75F, -9F, -6.13F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[301].setRotationPoint(-3.75F, -9.5F, -6.13F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[302].setRotationPoint(-3.75F, -8.25F, -6.13F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[303].setRotationPoint(64F, -9.25F, 4.43F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[304].setRotationPoint(63.75F, -9F, 4.9F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[305].setRotationPoint(64.5F, -8.75F, 5.15F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[306].setRotationPoint(64F, -9.25F, -6.63F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[307].setRotationPoint(64.5F, -8.75F, -5.88F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[308].setRotationPoint(64F, -8.75F, 0F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[309].setRotationPoint(64F, -8.75F, -1F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[310].setRotationPoint(63.5F, -8.5F, -0.25F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[311].setRotationPoint(64.5F, -7F, -0.25F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[312].setRotationPoint(64.5F, -8.75F, -0.25F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[313].setRotationPoint(63.5F, -8.5F, 0F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[314].setRotationPoint(63.5F, -8.5F, -0.75F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[315].setRotationPoint(64F, -8.75F, 0.25F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[316].setRotationPoint(64F, -8.5F, -0.25F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[317].setRotationPoint(64F, -9F, -0.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[318].setRotationPoint(64F, -8.75F, -1F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[319].setRotationPoint(64.5F, -6F, -0.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[320].setRotationPoint(65.5F, -5.25F, -0.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[321].setRotationPoint(67.5F, -8.87F, 4.03F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[322].setRotationPoint(67.5F, -9.87F, 4.03F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[323].setRotationPoint(67.5F, -9.37F, 4.03F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[324].setRotationPoint(67.5F, -7.87F, 4.03F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[325].setRotationPoint(67.5F, -8.37F, 4.03F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[326].setRotationPoint(67.5F, -8.87F, -7.03F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[327].setRotationPoint(67.5F, -9.87F, -7.03F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[328].setRotationPoint(67.5F, -9.37F, -7.03F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[329].setRotationPoint(67.5F, -7.87F, -7.03F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[330].setRotationPoint(67.5F, -8.37F, -7.03F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[331].setRotationPoint(63.75F, -9.5F, 4.9F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[332].setRotationPoint(63.75F, -8.25F, 4.9F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[333].setRotationPoint(63.75F, -9F, -6.13F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[334].setRotationPoint(63.75F, -9.5F, -6.13F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[335].setRotationPoint(63.75F, -8.25F, -6.13F);
	}





}