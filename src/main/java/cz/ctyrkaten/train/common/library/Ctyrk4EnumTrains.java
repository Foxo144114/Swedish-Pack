package cz.ctyrkaten.train.common.library;

import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import train.common.api.AbstractTrains;
import train.common.api.TrainRecord;
import train.common.core.util.TraincraftUtil;
import cz.ctyrkaten.train.common.entity.rollingStock.*;

import java.lang.reflect.InvocationTargetException;

public enum Ctyrk4EnumTrains implements TrainRecord {

	locoCD843("CD 843", Ctyrk4EntityLocoDieselCD843.class, Ctyrk4ItemIDs.minecartLocoCD843.item, "diesel", 816, 111, 1.4, 10,0,100,0.7,0.9,8000,TraincraftUtil.getBytesFromColors(new String[] {"Orange", "Green", "Grey", "LightBlue"}), 18, -4.25,Constants.TOOLTIP ),
	locoElectricCD127("Loco Electric CD 127", Ctyrk4EntityLocoElectricCD127.class, Ctyrk4ItemIDs.minecartCD127.item,"electric",2978,66,0,15,0,400,0.9,0.946,0,TraincraftUtil.getBytesFromColors(new String[] {"Red", "Lime"}),18,-1, Constants.TOOLTIP),
	CD127Motor("CD 127 Motor", Ctyrk4EntityCD127Motor.class, Ctyrk4ItemIDs.minecartCD127Motor.item, "freight", 0.5, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Lime"}), 0, 27, Constants.TOOLTIP),
	passengerCSDBP920("CSD Bp 920", Ctyrk4EntityPassengerCSDBP920.class, Ctyrk4ItemIDs.minecartCSDBP920.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, null, 10, 0, Constants.TOOLTIP),

	passengerCDBDMTEEO("CSD Bp 920", Ctyrk4EntityPassengerCDBDMTEEO.class, Ctyrk4ItemIDs.minecartCDBDMTEEO.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "LightBlue", "Blue"}), 10, 0, Constants.TOOLTIP),
	passengerCDA149("Passenger CD A149", Ctyrk4EntityPassengerCDA149.class, Ctyrk4ItemIDs.minecartCDA149.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue"}), 18, 0, Constants.TOOLTIP),
	passengerCDB249("Passenger CD B249", Ctyrk4EntityPassengerCDB249.class, Ctyrk4ItemIDs.minecartCDB249.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Green", "Lime"}), 18, 0, Constants.TOOLTIP),
	passengerCDBDS("Passenger CD BDs", Ctyrk4EntityPassengerCDBDS.class, Ctyrk4ItemIDs.minecartCDBDS.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue"}), 18, 0, Constants.TOOLTIP),
	passengerCDDS("Passenger CD Ds", Ctyrk4EntityFreightCDDS.class, Ctyrk4ItemIDs.minecartCDDS.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue"}), 18, 0, Constants.TOOLTIP),
	passengerCDWRMZ("Passenger CD WRMz", Ctyrk4EntityPassengerCDWRMZ.class, Ctyrk4ItemIDs.minecartCDWRMZ.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red"}), 18, 0, Constants.TOOLTIP),
	propagandaCzech("Propaganda Czech", Ctyrk4EntityPropagandaCzech.class, Ctyrk4ItemIDs.minecartPropagandaCzech.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red"}), 14, 0, Constants.TOOLTIP),
	passengerCDBDTN("CD Bdtn", Ctyrk4EntityPassengerCDBDTN.class, Ctyrk4ItemIDs.minecartCDBDTN.item, "passenger", 0, 0, 3,0 , 0, 0, 0,0,0,TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Brown", "Red"}),0, 0, Constants.TOOLTIP),
	propagandaCtyrk4("Propaganda Ctyrk4", Ctyrk4EntityPropaganda.class, Ctyrk4ItemIDs.minecartPropagandaCtyrk4.item, "decorative", 0, 0, 0.1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White"}), 14, 0, Constants.TOOLTIP),
	tenderCSD387("CSD 387 Tender", Ctyrk4EntityTenderCSD387.class, Ctyrk4ItemIDs.minecartCSD387Tender.item, "tender", 0,
			0, 0.5, 0, 0, 0, 0, 0, 14000, TraincraftUtil.getBytesFromColors(new String[] { "Black", "Green" }), 18, 0,
			Constants.TOOLTIP ),
	locoDieselGP40("Loco Diesel CD742", Ctyrk4EntityLocoDieselCD742.class,  Ctyrk4ItemIDs.minecartCD742.item, "diesel", 1200, 91,
			0, 50, 0, 250, 0.8, 0.966, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Yellow", "White", "Blue", "Orange", "LightBlue", "Green", "Lime", "Red" }), 15, -2.5, Constants.TOOLTIP),
	locoDieselCD751("Loco Diesel CD 751", Ctyrk4EntityLocoDieselCD751.class, Ctyrk4ItemIDs.minecartCD751.item, "diesel",
			1985, 101, 0, 40, 0, 100, 0.8, 0.97, 12000,TraincraftUtil.getBytesFromColors(new String[]{"Red"}), 10, -4.2, Constants.TOOLTIP),
	locoDieselCD754("Loco Diesel CD 754", Ctyrk4EntityLocoDieselCD754.class, Ctyrk4ItemIDs.minecartCD754.item, "diesel",
			1985, 101, 0, 40, 0, 100, 0.8, 0.97, 12000,TraincraftUtil.getBytesFromColors(new String[]{"Red", "Cyan", "Orange", "Green", "Yellow", "Lime", "Grey", "Blue"}), 10, -4.2, Constants.TOOLTIP),
	locoDieselCD720("Loco Diesel CD 720", Ctyrk4EntityLocoDieselCD720.class, Ctyrk4ItemIDs.minecartCD720.item, "diesel",
			750, 61, 0, 40, 0, 100, 0.8, 0.97, 12000,TraincraftUtil.getBytesFromColors(new String[]{"Red", "Green", "Blue"}), 10, -4.2, Constants.TOOLTIP),
	locoElectricCD151("Loco Electric CD151", Ctyrk4EntityLocoElectricCD151.class, Ctyrk4ItemIDs.minecartLocoCD151.item, "electric", 5438, 161, 0, 10, 0, 170, 0.7, 0.965, 6850, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "Red", "Green", "Cyan", "Brown", "Orange", "Purple", "White", "Magenta", "LightBlue"}), 18, -4, Constants.TOOLTIP),
	ARR845("Arriva 845", Ctyrk4EntityLocoDieselARR845.class, Ctyrk4ItemIDs.minecartARR845.item, "diesel", 286, 121, 0, 10, 0,100,0.85,0.7, 15000, TraincraftUtil.getBytesFromColors(new String[]{"Cyan", "LightBlue"}), 18, -4.5, Constants.TOOLTIP),
	locoElectricZSSK350("Loco Electric ZSSK 350", Ctyrk4EntityLocoElectricZSSK350.class, Ctyrk4ItemIDs.minecartLocoZSSK350.item, "electric", 5438, 161, 0, 10, 0, 170, 0.7, 0.965, 6850, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Blue", "Brown"}), 18, -4, Constants.TOOLTIP),
	locoElectricZSSK362("Loco Electric ZSSK362", Ctyrk4EntityLocoElectricZSSK362.class, Ctyrk4ItemIDs.minecartZSSK362.item, "electric", 4446, 141, 0, 10, 0, 170, 0.7, 0.965, 6850, TraincraftUtil.getBytesFromColors(new String[]{"Red"}), 18, -4, Constants.TOOLTIP),
	locoElectricZSSK363("Loco Electric ZSSK363", Ctyrk4EntityLocoElectricZSSK363.class, Ctyrk4ItemIDs.minecartZSSK363.item, "electric", 4446, 121, 0, 10, 0, 170, 0.7, 0.965, 6850, TraincraftUtil.getBytesFromColors(new String[]{"Blue"}), 18, -4, Constants.TOOLTIP),
	locoCD230("Loco Electric CD 230", Ctyrk4EntityLocoElectricCD230.class, Ctyrk4ItemIDs.minecartCD230.item,"electric",4188,111,0,38,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[] {"Red"}),15,-3.6, Constants.TOOLTIP),
	locoElectricCD362("Loco Electric CD362", Ctyrk4EntityLocoElectricCD362.class, Ctyrk4ItemIDs.minecartLocoCD362.item, "electric", 4446, 141, 0, 10, 0, 170, 0.7, 0.965, 6850, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Blue", "Yellow", "LightBlue", "Pink", "Brown"}), 18, -4, Constants.TOOLTIP),
	locoElectricCD363("Loco Electric CD363", Ctyrk4EntityLocoElectricCD363.class, Ctyrk4ItemIDs.minecartLocoCD363.item, "electric", 4446, 121, 0, 10, 0, 170, 0.7, 0.965, 6850, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "LightBlue"}), 18, -4, Constants.TOOLTIP),
	locoCD242("Loco Electric CD 242", Ctyrk4EntityLocoElectricCD242.class, Ctyrk4ItemIDs.locoCD242.item,"electric",4188,121,0,8,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Grey", "Brown", "Green", "Red", "LightBlue"}),15,-3.8, Constants.TOOLTIP),
	locoCD100("Loco Electric CD 100", Ctyrk4EntityLocoElectricCD100.class, Ctyrk4ItemIDs.locoCD100.item,"electric",4188,51,0,8,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[] {"Green"}),15,-3.8, Constants.TOOLTIP),
	locoCD140("Loco Electric CD 140", Ctyrk4EntityLocoElectricCD140.class, Ctyrk4ItemIDs.locoCD140.item,"electric",4188,121,0,8,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[] {"Green", "Blue", "LightBlue"}),15,-3.8, Constants.TOOLTIP),
	locoCD111("Loco Electric CD 111", Ctyrk4EntityLocoElectricCD111.class, Ctyrk4ItemIDs.locoCD111.item,"electric",1186,81,0,8,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[] {"Red"}),15,-2.35, Constants.TOOLTIP),
	//CD714("CD714", EntityLocoDieselCD714.class, Ctyrk4ItemIDs.minecartCD714.item, "diesel", 816, 81, 0, 45, 0, 200, 0.87, 0.93, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Test"}), 10, 2.5, Constants.TOOLTIP),
	locoRE420("Loco Electric RE 420", Ctyrk4EntityLocoElectricRE420.class, Ctyrk4ItemIDs.minecartRE420.item,"electric",6390,141,0,8,0,170,0.66,0.96,8000,TraincraftUtil.getBytesFromColors(new String[] {"Red"}),15,-3.8, Constants.TOOLTIP),
	locoZSSK131("Loco Electric ZSSK 131", Ctyrk4EntityLocoElectricZSSK131.class,  Ctyrk4ItemIDs.minecartZSSK131.item, "electric", 3046, 101, 0, 8, 0, 400, 1.1, 0.956, 0, TraincraftUtil.getBytesFromColors(new String[] {"Green"}), 14, -2.3, Constants.TOOLTIP),
	locoSteamCSD387("CSD 387", Ctyrk4EntityLocoSteamCSD387.class,  Ctyrk4ItemIDs.minecartCSD387.item,
			"steam", 2102, 111, 0, 60, 180, 160, 0.7, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String[] { "Black", "Green" }), 7, -5.66, Constants.TOOLTIP),
	locoSteamU57("Loco U57", Ctyrk4EntityLocoSteamU57.class, Ctyrk4ItemIDs.minecartLocoSteamU57.item,"steam",800,31,0,60,160,150,1,0.968,5000,null,15,-1.5, Constants.TOOLTIP),
	tenderU57("Tender U57", Ctyrk4EntityTenderU57.class, Ctyrk4ItemIDs.minecartTenderU57.item,"tender",0,0,0.5,0,0,0,0,0,10000,null,18,0,Constants.TOOLTIP),
	locoElectricM1Motor("Loco Electric M1 Motor", Ctyrk4EntityLocoElectricM1.class, Ctyrk4ItemIDs.minecartM1Loco.item, "electric", 770, 91, 0, 3, 0,230, 1.4, 0.98, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red"}), 10,  -3.1, Constants.TOOLTIP),
	passengerM1Coach("Passenger M1 Coach", Ctyrk4EntityPassengerM1Coach.class, Ctyrk4ItemIDs.minecartM1Coach.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red"}), 10, 0, Constants.TOOLTIP),
	cabooseM1Tail("Passenger M1 Tail", Ctyrk4EntityCabooseM1Tail.class, Ctyrk4ItemIDs.minecartM1Tail.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red"}), 10, 0, Constants.TOOLTIP),
	locoElectricRenfeCD471Motor("Loco Electric CD471 Motor", Ctyrk4EntityLocoElectricCD471Motor.class, Ctyrk4ItemIDs.minecartLocoCD471Motor.item, "electric", 2719, 141, 0, 3, 0,230, 1.4, 0.98, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "Blue", "Grey"}), 10,  -3.6, Constants.TOOLTIP),
	passengerCD471Coach("Passenger CD471 Coach", Ctyrk4EntityPassengerCD471Coach.class, Ctyrk4ItemIDs.minecartPassengerCD471Coach.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "Blue", "Grey"}), 10, 0, Constants.TOOLTIP),
	cabooseCD471Tail("Passenger CD471 Tail", Ctyrk4EntityCabooseCD471Tail.class, Ctyrk4ItemIDs.minecartCabooseCD471Tail.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "Blue", "Grey"}), 10, 0, Constants.TOOLTIP),

	locoElectricCD470Motor("Loco Electric CD470 Motor", Ctyrk4EntityLocoElectricCD470Motor.class, Ctyrk4ItemIDs.minecartLocoCD470Motor.item, "electric", 2654, 121, 0, 3, 0,230, 1.4, 0.98, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Blue"}), 10,  -3.6, Constants.TOOLTIP),
	passengerCD470Coach("Passenger CD470 Coach", Ctyrk4EntityPassengerCD470Coach.class, Ctyrk4ItemIDs.minecartPassengerCD470Coach.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Blue"}), 10, 0, Constants.TOOLTIP),
	locoCD451("CD 451", Ctyrk4EntityLocoElectricCD451Motor.class, Ctyrk4ItemIDs.minecartCD451.item, "electric", 1795, 101, 0, 3, 0,200, 1.5, 0.98, 0, null, 10,  -3.6, Constants.TOOLTIP),
	passengerCD451Coach("CD 451 Coach", Ctyrk4EntityPassengerCD451Coach.class, Ctyrk4ItemIDs.minecartCD451Coach.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, null, 10, 0, Constants.TOOLTIP),
	locoCD812("CD812 Driving Motor", Ctyrk4EntityLocoDieselCD812.class, Ctyrk4ItemIDs.minecartCD812.item, "diesel", 329, 81, 0, 60, 0, 200, 0.8, 0.97, 6000, null, 10, -2.4, Constants.TOOLTIP),
	locoCD854("CD854 Driving Motor", Ctyrk4EntityLocoDieselCD854.class, Ctyrk4ItemIDs.minecartCD854.item, "diesel", 810, 121, 0, 60, 0, 200, 0.8, 0.97, 6000, null, 10, -6.1, Constants.TOOLTIP),
	locoCD460("Loco 460", Ctyrk4EntityLocoElectricCD460.class, Ctyrk4ItemIDs.minecartCD460.item, "electric", 2719, 111, 0, 35, 0,230, 1.4, 0.98, 0, TraincraftUtil.getBytesFromColors(new String[]{"Purple", "Green"}), 10,  -3.6, Constants.TOOLTIP),
	passengerCD460("Passenger 060", Ctyrk4EntityPassengerCD460Coach.class, Ctyrk4ItemIDs.minecartCD060.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Lime"}), 10, 0, Constants.TOOLTIP),
	loco8171M("Loco 8171M Front", Ctyrk4EntityLocoElectric8171MLoco.class, Ctyrk4ItemIDs.minecart8171Loco.item, "electric", 598, 81, 0, 35, 0,230, 1.4, 0.98, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "Red"}), 10,  -3.6, Constants.TOOLTIP),
	passenger8171Mid("Passenger 8171M Mid", Ctyrk4EntityPassenger8171MMid.class, Ctyrk4ItemIDs.minecart8171M_Middle.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "Red"}), 10, 0, Constants.TOOLTIP),
	passenger8171Rear("Passenger 8171M Rear", Ctyrk4EntityPassenger8171Tail.class, Ctyrk4ItemIDs.minecart8171MTail.item, "passenger", 0, 0, 2, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"White", "Red"}), 10, 0, Constants.TOOLTIP),
	CD383("CD383", Ctyrk4EntityLocoElectricCD383.class, Ctyrk4ItemIDs.minecartCD383.item, "electric", 7885, 201, 0, 10, 0, 0, 0.9, 0.79, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red", "Orange", "Yellow", "Magenta", "Blue", "White", "Grey"}), 10, -3.7, Constants.TOOLTIP),
	ZSSK383("CD383", Ctyrk4EntityLocoElectricZSSK383.class, Ctyrk4ItemIDs.minecartZSSK383.item, "electric", 7885, 201, 0, 10, 0, 0, 0.9, 0.79, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red"}), 10, -3.7, Constants.TOOLTIP),
	locoCD814("CD814 Driving Motor", Ctyrk4EntityLocoDieselCD814.class, Ctyrk4ItemIDs.minecartCD814.item, "diesel", 329, 81, 0, 10, 0, 200, 0.8, 0.97, 6000, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "Pink", "Orange"}), 10, -2.0, Constants.TOOLTIP),
	passengerCD014("CD014 Trailer", Ctyrk4EntityPassengerCD014.class, Ctyrk4ItemIDs.minecartCD014.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "Pink"}), 10, 0, Constants.TOOLTIP),
	passengerCD914("CD914 Driving Trailer", Ctyrk4EntityPassengerCD914.class, Ctyrk4ItemIDs.minecartCD914.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "Pink", "Orange"}), 10, 0, Constants.TOOLTIP),
	locoCD810("CD810 Driving Motor", Ctyrk4EntityLocoDieselCD810.class, Ctyrk4ItemIDs.minecartCD810.item, "diesel", 210, 81, 0, 60, 0, 200, 0.8, 0.97, 6000, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Yellow", "Green", "Pink", "White", "Orange", "Grey", "Magenta", "LightGrey", "LightBlue", "Lime"}), 10, -2.0, Constants.TOOLTIP),
	passengerCD010("CD010 Trailer", Ctyrk4EntityPassengerCD010.class, Ctyrk4ItemIDs.minecartCD010.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Red", "Yellow", "Green", "Pink", "White", "Grey", "Orange"}), 10, 0, Constants.TOOLTIP),
	CD770("CD770", Ctyrk4EntityLocoDieselCD770.class, Ctyrk4ItemIDs.minecartCD770.item, "diesel", 1350, 91, 0, 45, 0, 200, 0.87, 0.93, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Lime"}), 10, -3.35, Constants.TOOLTIP),
	CD704("CD704", Ctyrk4EntityLocoDieselCD704.class, Ctyrk4ItemIDs.minecartCD704.item, "diesel", 340, 61, 0, 45, 0, 200, 0.87, 0.93, 16000, TraincraftUtil.getBytesFromColors(new String[] {"Red", "Blue", "Yellow"}), 10, -1.15, Constants.TOOLTIP),
	passengerCDBBDGMEE236("CDBBDGMEE 236", Ctyrk4EntityPassengerCDBBDGMEE236.class, Ctyrk4ItemIDs.minecartCDBBDGMEE236.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue"}), 10, 0, Constants.TOOLTIP),
	passengerMVZSV2("SZDC MVZSv2", Ctyrk4EntityPassengerMVZSV2.class, Ctyrk4ItemIDs.minecartPassengerMVZSV2.item, "work", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Yellow"}), 18, 0, Constants.TOOLTIP),
	CDEAS11("CD EAs 11", Ctyrk4EntityFreightCDEAS11.class, Ctyrk4ItemIDs.minecartCDEAS11.item, "freight", 3.5, TraincraftUtil.getBytesFromColors(new String[]{"Brown"}), 18, 36,Constants.TOOLTIP),
	passengerCDAB349("CD AB349", Ctyrk4EntityPassengerCDAB349.class, Ctyrk4ItemIDs.minecartCDAB349.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue"}), 10, 0, Constants.TOOLTIP),
	passengerZSSK012("ZSSK 012", Ctyrk4EntityPassengerZSSK012.class, Ctyrk4ItemIDs.minecartZSSK012.item, "passenger", 0, 0, 1, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Red"}), 10, 0, Constants.TOOLTIP),
	CD650Loco("CD 650 Loco", Ctyrk4EntityLocoElectricCD650Loco.class, Ctyrk4ItemIDs.minecartCD650Loco.item, "electric", 1849, 161, 0, 10, 0,0,0.9,0.9,0,TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "Red"}),10,-2.75, Constants.TOOLTIP),
	CD650Tail("CD 650 Tail", Ctyrk4EntityPassengerCD650Tail.class, Ctyrk4ItemIDs.minecartCD650Tail.item, "passenger", 0, 0, 1.5, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "Yellow", "Red"}), 0, 0, Constants.TOOLTIP ),
	locoZSSK812("ZSSK812 Driving Motor", Ctyrk4EntityLocoDieselZSSK812.class, Ctyrk4ItemIDs.minecartZSSK812.item, "diesel", 349, 81, 0, 60, 0, 200, 0.8, 0.97, 6000, TraincraftUtil.getBytesFromColors(new String[]{"Red"}), 10, -2.0, Constants.TOOLTIP),
	CDBFHPVEE295("CDBFHPVEE295", Ctyrk4EntityElectricCDBFHPVEE295.class, Ctyrk4ItemIDs.minecartCDBFHPVEE295.item, "electric", 4446, 141, 0,60, 0, 100, 0.7, 0.7, 1000, TraincraftUtil.getBytesFromColors(new String[] {"Blue"}), 18, -4,Constants.TOOLTIP),
	CDBDMTEE("CDBDMTEE", Ctyrk4EntityPassengerCDBDMTEE.class, Ctyrk4ItemIDs.minecartCDBDMTEE.item, "passenger", 0, 0, 3,0 , 0, 0, 0,0,0,TraincraftUtil.getBytesFromColors(new String[] {"Blue", "Green"}),0,0),
	locoElectricCD680("CD680 Loco", Ctyrk4EntityLocoElectricCD680.class, Ctyrk4ItemIDs.minecartCD680Loco.item, "electric", 6840, 260, 0,60, 0, 100, 0.7, 0.8, 1000, TraincraftUtil.getBytesFromColors(new String[] {"Blue"}), 18, -5.1,Constants.TOOLTIP),
	passengerCD680Coach("CD680 Coach", Ctyrk4EntityPassengerCD680Coach.class, Ctyrk4ItemIDs.minecartCD680Coach.item, "passenger", 0, 0, 4, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue"}), 0, 0, Constants.TOOLTIP),
	cabooseCD680Tail("CD680 Tail", Ctyrk4EntityPassengerCD680Tail.class, Ctyrk4ItemIDs.minecartCD680Tail.item, "passenger", 0, 0, 4, 0, 0, 0, 0, 0, 0, TraincraftUtil.getBytesFromColors(new String[]{"Blue"}), 0, 0, Constants.TOOLTIP),
	CD715("CD 715", Ctyrk4EntityLocoDieselCD715.class, Ctyrk4ItemIDs.minecartCD715.item,"diesel",1058,60,0,60,0,170,0.66,0.96,8000,null,15,-1.5, Constants.TOOLTIP),
	CDZAS30("Zas 30", Ctyrk4EntityCDZAS30.class, Ctyrk4ItemIDs.minecartCDZAS30.item, "tank", 0, 0, 6, 0, 0, 0, 0, 0, 50000, TraincraftUtil.getBytesFromColors(new String[]{"Blue", "White"}), 18, 0, Constants.TOOLTIP),
	CDNP("CD NP", Ctyrk4EntityCDNP.class, Ctyrk4ItemIDs.minecartCDNP.item, "freight", 5, TraincraftUtil.getBytesFromColors(new String[]{"Brown"}), 18, 36, Constants.TOOLTIP),
	CDKNS("CD KNS", Ctyrk4EntityCDKNS.class, Ctyrk4ItemIDs.minecartCDKNS.item, "freight", 4, TraincraftUtil.getBytesFromColors(new String[]{"Red"}), 18, 45, Constants.TOOLTIP),
	CDES11("CD ES11", Ctyrk4EntityCDES11.class, Ctyrk4ItemIDs.minecartCDES11.item, "freight", 3.5, TraincraftUtil.getBytesFromColors(new String[]{"Brown"}), 18, 45, Constants.TOOLTIP),
	CSD464("Loco Steam C11", Ctyrk4EntityCSD464.class, Ctyrk4ItemIDs.minecartCSD464.item,"steam", 1030, 97, 0, 80, 100, 200, 0.35, 0.975, 16000, TraincraftUtil.getBytesFromColors(new String[]{"Red"}), 10, -3.0, Constants.TOOLTIP),
	T4("T4", Ctyrk4EntityElectricT4.class, Ctyrk4ItemIDs.minecartT4.item, "electric", 200, 70, 0,20, 0, 100, 0.7, 0.8, 1000, TraincraftUtil.getBytesFromColors(new String[] {"Red","Orange"}), 18, -2, Constants.TOOLTIP),
	locoCD954("CD854 Driving Motor", Ctyrk4EntityLocoDieselCD954.class, Ctyrk4ItemIDs.minecartCD954.item, "diesel", 810, 121, 0, 60, 0, 200, 0.8, 0.97, 6000, null, 10, -6.1, Constants.TOOLTIP),
	ClassA16("A16", Ctyrk4EntityLocoSteamA16.class,  Ctyrk4ItemIDs.minecartA16Loco.item,
			"steam", 2102, 111, 0, 60, 180, 160, 0.7, 0.97, 10000, TraincraftUtil.getBytesFromColors(new String[] {"Black", "Brown", "Cyan", "Green", "Grey", "LightBlue", "Lime", "Magenta", "Pink", "Red", "White", "Skin16", "Skin17", "Skin18"}), 7, -8, Constants.TOOLTIP),
	ClassA16tender("A16 tender", Ctyrk4EntityTenderA16.class, Ctyrk4ItemIDs.minecartA16Tender.item, "tender", 0,
			0, 0.5, 0, 0, 0, 0, 0, 14000, TraincraftUtil.getBytesFromColors(new String[] { "Black" }), 18, 0,
			Constants.TOOLTIP ),
	FlBox("FreeLance Box Cart", Ctyrk4EntityFreightFLBox.class, Ctyrk4ItemIDs.minecartFLBox.item, "freight", 3.5, TraincraftUtil.getBytesFromColors(new String[]{"Brown"}), 18, 45, Constants.TOOLTIP),
	;

	private String internalName;
	private Class entityClass;
	private Item item;
	private String trainType;
	private int MHP;
	private int maxSpeed;
	private double mass;
	private int fuelConsumption;
	private int waterConsumption;
	private int heatingTime;
	private double accelerationRate;
	private double brakeRate;
	private int tankCapacity;
	private int[] colors;
	private int guiRenderScale;
	private double bogieLocoPosition;
	private String additionalTooltip;
	private int cargoCapacity;
	
	/**
	 * Constructor for standard train.
	 *
	 * @param internalName : Only used by EntityRegistry
	 * @param entityClass
	 * @param item
	 * @param trainType: "steam", "diesel", "freight", "passenger", "special", "flat", "electric"
	 * @param MHP: power of the locomotive
	 * @param maxSpeed
	 * @param mass (will be multiplied by 10 internally. That means putting 0.1 here will create a mass of 1 Ton in game)
	 * @param fuelConsumption: 1 unit is consumed every x ticks
	 * @param waterConsumption: 1 unit is consumed every x ticks
	 * @param heatingTime
	 * @param accelerationRate: generally around 0.45
	 * @param brakeRate: generally around 0.98
	 * @param tankCapacity
	 * @param colors: an array with all possible colors. Index 0 is used as default color when train is first spawned. leave null if no color available
	 * @param guiRenderScale: scale at which the entity will be rendered inside the GUI (crafting GUI)
	 */
	private Ctyrk4EnumTrains(String internalName, Class entityClass, Item item, String trainType, int MHP, int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPosition){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.MHP=MHP;
		this.maxSpeed=maxSpeed;
		this.mass=mass;
		this.fuelConsumption=fuelConsumption;
		this.waterConsumption=waterConsumption;
		this.heatingTime=heatingTime;
		this.accelerationRate=accelerationRate;
		this.brakeRate=brakeRate;
		this.tankCapacity=tankCapacity;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.bogieLocoPosition = bogieLocoPosition;
	}
	
	/**
	 * Constructor for additional tooltips on the item
	 *
	 * @param internalName
	 * @param entityClass
	 * @param item
	 * @param trainType
	 * @param MHP
	 * @param maxSpeed
	 * @param mass
	 * @param fuelConsumption
	 * @param waterConsumption
	 * @param heatingTime
	 * @param accelerationRate
	 * @param brakeRate
	 * @param tankCapacity
	 * @param colors
	 * @param guiRenderScale
	 * @param bogieLocoPositions
	 * @param additionalTooltip
	 */
	private Ctyrk4EnumTrains(String internalName, Class entityClass, Item item, String trainType, int MHP, int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, int[] colors, int guiRenderScale, double bogieLocoPositions, String additionalTooltip){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.MHP=MHP;
		this.maxSpeed=maxSpeed;
		this.mass=mass;
		this.fuelConsumption=fuelConsumption;
		this.waterConsumption=waterConsumption;
		this.heatingTime=heatingTime;
		this.accelerationRate=accelerationRate;
		this.brakeRate=brakeRate;
		this.tankCapacity=tankCapacity;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.bogieLocoPosition = bogieLocoPositions;
		this.additionalTooltip = additionalTooltip;
	}
	
	/**
	 * Constructor for freight carts
	 *
	 * @param internalName
	 * @param entityClass
	 * @param item
	 * @param trainType
	 * @param mass
	 * @param colors
	 * @param guiRenderScale
	 * @param cargoCapacity
	 * @param additionalTooltip
	 */
	private Ctyrk4EnumTrains(String internalName, Class entityClass, Item item, String trainType, double mass, int[] colors, int guiRenderScale, int cargoCapacity, String additionalTooltip){
		this.internalName = internalName;
		this.entityClass = entityClass;
		this.item = item;
		this.trainType=trainType;
		this.mass=mass;
		this.colors=colors;
		this.guiRenderScale = guiRenderScale;
		this.additionalTooltip =additionalTooltip;
		this.cargoCapacity = cargoCapacity;
	}
	
    @Override
	public String getName(){
		return name();
	}
	
    @Override
	public String getInternalName(){
		return this.internalName;
	}
	
    @Override
	public Item getItem(){
		return this.item;
	}

    @Override
	public String getTrainType(){
		return this.trainType;
	}
	
    @Override
	public int getMHP(){
		return this.MHP;
	}
	
    @Override
	public int getMaxSpeed(){
		return this.maxSpeed;
	}
	
    @Override
	public double getMass(){
		return this.mass;
	}
	
    @Override
	public int getFuelConsumption(){
		return this.fuelConsumption;
	}
	
    @Override
	public int getWaterConsumption(){
		return this.waterConsumption;
	}
	
    @Override
	public int getHeatingTime(){
		return this.heatingTime;
	}
	
    @Override
	public double getAccelerationRate(){
		return this.accelerationRate;
	}
	
    @Override
	public double getBrakeRate(){
		return this.brakeRate;
	}
	
    @Override
	public int getTankCapacity(){
		return this.tankCapacity;
	}
	
    @Override
	public int[] getColors(){
		return this.colors;
	}
	
    @Override
	public double getBogieLocoPosition(){
		return this.bogieLocoPosition;
	}

    @Override
	public Class getEntityClass() {
		return this.entityClass;
	}
	
    @Override
	public int getGuiRenderScale(){
		return this.guiRenderScale;
	}
	
    @Override
	public String getAdditionnalTooltip(){
		return this.additionalTooltip;
	}
	
    @Override
	public int getCargoCapacity(){
		return cargoCapacity;
	}

    @Override
	public AbstractTrains getEntity(World world){
		try {
			return (AbstractTrains) entityClass.getConstructor(World.class).newInstance(world);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
	
    @Override
	public AbstractTrains getEntity(World world, double x, double y, double z){
		try {
			if(world.isRemote){
				entityClass.getConstructor(World.class).newInstance(world);
			} else {
				return (AbstractTrains) entityClass.getConstructor(World.class, double.class, double.class, double.class).newInstance(world, x, y, z);
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static class Constants {
		public static final String TOOLTIP = "Pack: " + EnumChatFormatting.YELLOW + "Ctyrk4 Pack"  + EnumChatFormatting.GOLD + EnumChatFormatting.BOLD + "  -Petsox";
	}
}
