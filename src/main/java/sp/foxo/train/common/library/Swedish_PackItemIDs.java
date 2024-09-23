package sp.foxo.train.common.library;

import net.minecraft.item.Item;

public enum Swedish_PackItemIDs {
	//minecartCD742("ItemRollingStock", "CD_742", 10),

	minecartSJLittD("ItemRollingStock", "D-Icon", 10),
	minecartSJLittDu2("ItemRollingStock", "Du2-Icon", 15),
	minecartSJLittDa("ItemRollingStock", "Da-Icon", 20),
	minecartSJLittDmA("ItemRollingStock", "DmA-Icon", 30),
	minecartSJLittDm3("ItemRollingStock", "Dm3-Icon", 35),
	minecartSJLittDmB("ItemRollingStock", "DmB-Icon", 30),
	minecartSJLittRc("ItemRollingStock", "Rc-Icon", 20),


//minecartSJLittB1919("ItemRollingStock", "B1919-Icon", 12),
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