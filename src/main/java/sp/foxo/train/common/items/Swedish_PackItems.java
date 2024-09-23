package sp.foxo.train.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import sp.foxo.train.common.Swedish_Pack_Addon_TCCE;
import sp.foxo.train.common.library.Swedish_PackAddonInfo;
import sp.foxo.train.common.library.Swedish_PackItemIDs;
import train.common.items.ItemRollingStock;

public class Swedish_PackItems {

    public static void init() {
        loadItems();
        registerItems();
    }

    private static void loadItems() {
        for (Swedish_PackItemIDs items : Swedish_PackItemIDs.values()) {
            if (items.className != null) {
                if (items.className.equals("ItemRollingStock")) {
                    items.item = new ItemRollingStock(Swedish_PackAddonInfo.modID.toLowerCase() + ":trains/" + items.iconName, Swedish_Pack_Addon_TCCE.tcAddonTab);
                }
            }
        }
    }

    private static void registerItems() {
        for (Swedish_PackItemIDs itemId : Swedish_PackItemIDs.values()) {
            if (itemId.item != null) {
                itemId.item.setUnlocalizedName(Swedish_PackAddonInfo.modID + ":" + itemId.name());
                GameRegistry.registerItem(itemId.item, itemId.name());
            }
        }
    }
}
