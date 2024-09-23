package sp.foxo.train.common.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import sp.foxo.train.common.library.Swedish_PackItemIDs;

public class Swedish_PackCreativeTabTraincraftTrains extends CreativeTabs {

	public Swedish_PackCreativeTabTraincraftTrains(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(Swedish_PackItemIDs.minecartSJLittDa.item);
	}

	@Override
	public String getTranslatedTabLabel() {
		return super.getTabLabel();
	}

	@Override
	public Item getTabIconItem(){return Swedish_PackItemIDs.minecartSJLittDa.item;}
}
