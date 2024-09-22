package cz.ctyrkaten.train.common.library;

import net.minecraft.item.Item;

public enum Ctyrk4ItemIDs {
	//minecartCD742("ItemRollingStock", "CD_742", 10),
	minecartSJLittDa("ItemRollingStock", "Da-Icon", 15),
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
	Ctyrk4ItemIDs(String classMethodName, String iconName, int amountForEmerald) {
		this.className = classMethodName;
		this.iconName = iconName;
		this.amountForEmerald = amountForEmerald;
	}

}