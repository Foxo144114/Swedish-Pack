package sp.foxo.train.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sp.foxo.train.common.items.Swedish_PackItems;

import sp.foxo.train.common.library.Swedish_PackAddonInfo;

import sp.foxo.train.common.core.Swedish_PackCreativeTabTraincraftTrains;
import sp.foxo.train.common.library.Swedish_PackEnumTrains;
import sp.foxo.train.common.library.Swedish_PackRegistry;

@Mod(modid = Swedish_PackAddonInfo.modID, name = Swedish_PackAddonInfo.modName, version = Swedish_PackAddonInfo.modVersion)
public class Swedish_Pack_Addon_TCCE {

	/* Mod instance */
	@Instance(Swedish_PackAddonInfo.modID)
	public static Swedish_Pack_Addon_TCCE instance;

	/* TrainCraft Logger */
	public static Logger tcLog = LogManager.getLogger(Swedish_PackAddonInfo.modName);

//	public static File configDirectory;

	/* Creative tab for Addon */
	public static CreativeTabs tcAddonTab;

    private Swedish_PackRegistry registry;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		tcLog.info("Starting Ctyrk4 Traincraft Addon " + Swedish_PackAddonInfo.modVersion + "!");

        /* Config handler */
//		configDirectory= event.getModConfigurationDirectory();

		/* Register Items, Blocks, ... */
		tcLog.info("Initialize Blocks, Items, ...");

        tcAddonTab = new Swedish_PackCreativeTabTraincraftTrains(CreativeTabs.getNextID(), "Ctyrk4 Addon for TrainCraft");

        Swedish_PackItems.init();
        registerEntityHandlers();

		/* Other Proxy init */
		tcLog.info("Initialize Renderer and Events");

        registry = new Swedish_PackRegistry();
        registry.registerTrainRecords();
        registry.registerRenderRecords();
        registry.registerSoundRecords();

        tcLog.info("Finished PreInitialization");
	}

	@SuppressWarnings("unchecked")
    private void registerEntityHandlers() {
		int trainID = 1;
		for(Swedish_PackEnumTrains train : Swedish_PackEnumTrains.values()){
			EntityRegistry.registerModEntity(train.getEntityClass(), train.getInternalName(), trainID, Swedish_Pack_Addon_TCCE.instance, 512, 1, true);
			trainID++;
		}
    } 

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
	}

	@EventHandler
	public void serverStop(FMLServerStoppedEvent event) {
	}
}