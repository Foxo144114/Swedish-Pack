package sp.foxo.train.common.library;

import net.minecraft.item.Item;

public enum Swedish_PackItemIDs {
	//minecartCD742("ItemRollingStock", "CD_742", 10),

	minecartSJLittD("ItemRollingStock", "D-Icon", 10),
	minecartSJLittDu2("ItemRollingStock", "Du2-Icon", 15),
	minecartSJLittDg2("ItemRollingStock", "Dg2-icon", 17),
	minecartBJLittDs("ItemRollingStock", "BJDs-icon", 14),
	minecartBJLittBk("ItemRollingStock", "BJBk-icon", 14),
	minecartSJLittOaA("ItemRollingStock", "Oa_A-icon", 14),
	minecartSJLittOaB("ItemRollingStock", "Oa_B-icon", 14),
	minecartSJLittObB("ItemRollingStock", "Ob_B-icon", 14),
	minecartSJLittObA("ItemRollingStock", "Ob_A-icon", 14),
	minecartSJLittOc("ItemRollingStock", "Oc-icon", 14),
	minecartSJLittOd("ItemRollingStock", "Od-icon", 14),
	minecartSJLittOeB("ItemRollingStock", "OeB-icon", 14),
	minecartSJLittOeA("ItemRollingStock", "OeA-icon", 14),
	minecartSJLittOfB("ItemRollingStock", "OfB-icon", 14),
	minecartSJLittOfA("ItemRollingStock", "OfA-icon", 14),
	minecartSJLittOfAs("ItemRollingStock", "OfA-icon", 14),
	minecartSJLittT21("ItemRollingStock", "T21-icon", 14),
	minecartFTRLittPVV8("ItemRollingStock", "PVV8-icon", 1),
	minecartSJLittT23("ItemRollingStock", "T23-icon", 14),
	minecartSJLittT31("ItemRollingStock", "T21-icon", 14),
	minecartFTRLittET41A("ItemRollingStock", "ET41A-icon", 9),
	minecartFTRLittET41B("ItemRollingStock", "ET41B-icon", 9),
	minecartGBJLittBs("ItemRollingStock", "GBJBs-icon", 13),
	minecartSJLittDa("ItemRollingStock", "Da-Icon", 20),
	minecartSJLittDmA("ItemRollingStock", "DmA-Icon", 30),
	minecartSJLittDm3("ItemRollingStock", "Dm3-Icon", 35),
	minecartSJLittDmB("ItemRollingStock", "DmB-Icon", 30),
	minecartSJLittRc("ItemRollingStock", "Rc-Icon", 20),
	minecartSJLittM1("ItemRollingStock", "M1-Icon", 5),
	minecartSJLittM21902("ItemRollingStock", "M21902-Icon", 7),
	minecartSJLittM21908("ItemRollingStock", "M21908-Icon", 8),
	minecartSJLittM21908Extended("ItemRollingStock", "M21908Extended-Icon", 9),
	minecartSJLittMAS("ItemRollingStock", "MAS-Icon", 13),
	minecartSJLittO("ItemRollingStock", "O-Icon", 5),
	minecartSJLittOs("ItemRollingStock", "Os-Icon", 4),
	minecartSJLittOs_w("ItemRollingStock", "Os_w-Icon", 6),
	minecartSJLittLgs("ItemRollingStock", "Lgs-Icon", 9),
	minecartSJLittG("ItemRollingStock", "G-Icon", 5),
	minecartSJLittB1919("ItemRollingStock", "B1919-Icon", 5),
	minecartSJLittATender("ItemRollingStock", "Atender-Icon", 5),
	minecartSJLittB1909("ItemRollingStock", "B1909-Icon", 5),
	minecartSJLittCTender("ItemRollingStock", "Ctender-Icon", 5),
	minecartSJLittX16("ItemRollingStock", "X16-icon", 5),
	minecartSJLittY6("ItemRollingStock", "Y6-icon", 5),
	minecartSJLittUb("ItemRollingStock", "Ub-icon", 5),
	minecartSJLittUBF6Y("ItemRollingStock", "UBF6Y-icon", 5),
	minecartSJLittUDFo20("ItemRollingStock", "UDFo20-icon", 5),
	minecartSJLittUFV("ItemRollingStock", "UFV-icon", 5),
	minecartSJLittElos("ItemRollingStock", "Elos-_Icon", 5),
	minecartSJLittOaVagn("ItemRollingStock", "Oa-Icon", 5),
	minecartSJLittQ12("ItemRollingStock", "Q12-Icon", 5),
	minecartSJLittFel("ItemRollingStock", "Fel-icon", 5),

	//minecartOreWagonBase("ItemRollingStock", "OreWagonBase-Icon", 13),


	;

	public Item item;
	public String className;
	public String iconName;

	/**
	 * Amount for one emerald. For ItemRollingStock, it is the price for one train.
	 */
	public int amountForEmerald;

	/**
	 * @param classMethodName
	 * @param iconName
	 * @param amountForEmerald for one emerald. For ItemRollingStock, it is the price for one train
	 */
	Swedish_PackItemIDs(String classMethodName, String iconName, int amountForEmerald) {
		this.className = classMethodName;
		this.iconName = iconName;
		this.amountForEmerald = amountForEmerald;
	}

}