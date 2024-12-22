package sp.foxo.train.common.library;

import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;
import sp.foxo.train.common.entity.rollingStock.*;

import javax.swing.*;


public enum Swedish_PackEnumTrains {

    //LOCO_CD843("locoCD843", "CD 843", Ctyrk4EntityLocoDieselCD843.class, Ctyrk4ItemIDs.minecartLocoCD843.item, "diesel", 816, 111, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"Blue"}, 18, -4.25, Constants.TOOLTIP),
    LOCO_SJLittDa("locoSJLittDa", "SJ Litt Da", Swedish_PackEntityLocoElectricSJLittDa.class, Swedish_PackItemIDs.minecartSJLittDa.item, "electric", 2470, 101, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"Red_South_AllDown", "Red_South_Back_Up", "Red_South_Front_Up","Red_North_AllDown", "Red_North_Back_Up", "Red_North_Front_Up","Red_60s_AllDown", "Red_60s_Back_Up", "Red_60s_Front_Up","Red_60snorth_AllDown", "Red_60snorth_Back_Up", "Red_60snorth_Front_Up","Green_AllDown", "Green_Back_Up", "Green_Front_Up", "TFSouth_AllDown", "TFSouth_Back_Up", "TFSouth_Front_Up","TFNorth_AllDown", "TFNorth_Back_Up", "TFNorth_Front_Up","Chris_South_AllDown", "Chris_South_Back_Up", "Chris_South_Front_Up","Chris_North_AllDown", "Chris_North_Back_Up", "Chris_North_Front_Up","Chris_60s_AllDown", "Chris_60s_Back_Up", "Chris_60s_Front_Up","Chris_60snorth_AllDown", "Chris_60snorth_Back_Up", "Chris_60snorth_Front_Up",}, 18, -4.25, Constants.TOOLTIP),
    LOCO_SJLittDmA("locoSJLittDmA", "SJ Litt Dm A", Swedish_PackEntityLocoElectricSJLittDmA.class, Swedish_PackItemIDs.minecartSJLittDmA.item, "electric", 6400, 76, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"60snorth_Down", "60snorth_Up", "60ssouth_Down", "60ssouth_Up", "70snorth_Down", "70snorth_Up", "70ssouth_Down", "70ssouth_Up", "LKAB_Down", "LKAB_Up"}, 18, -4.55, Constants.TOOLTIP),
    LOCO_SJLittD("locoSJLittD", "SJ Litt D", Swedish_PackEntityLocoElectricSJLittD.class, Swedish_PackItemIDs.minecartSJLittD.item, "electric", 1640, 101, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"NoBrygg_AllDown","NoBrygg_BackUp","NoBrygg_FrontUp","StorBrygg_AllDown","StorBrygg_BackUp","StorBrygg_FrontUp","StalParantes_AllDown","StalParantes_BackUp","StalParantes_FrontUp"}, 18, -4.15, Constants.TOOLTIP),
    LOCO_SJLittDu2("locoSJLittDu2", "SJ Litt Du2", Swedish_PackEntityLocoElectricSJLittDu2.class, Swedish_PackItemIDs.minecartSJLittDu2.item, "electric", 2470, 101, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"LitBrygg_AllDown","LitBrygg_BackUp","LitBrygg_FrontUp","NoBrygg_AllDown","NoBrygg_BackUp","NoBrygg_FrontUp","VitF_StorBrygg_AllDown","VitF_StorBrygg_BackUp","VitF_StorBrygg_FrontUp"}, 18, -4.15, Constants.TOOLTIP),
    LOCO_SJLittRc("locoSJLittRc", "SJ Litt Rc", Swedish_PackEntityLocoElectricSJLittRc.class, Swedish_PackItemIDs.minecartSJLittRc.item, "electric", 4800, 161, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"black", "blue", "BlueGreen", "blueSP", "GreenCargo", "grey", "orange", "Trafikverket", "white"}, 18, -4.25, Constants.TOOLTIP),
    LOCO_SJLittDg2("locoSJLittDg2", "SJ Litt Dg2", Swedish_PackEntityLocoElectricSJLittDg2.class, Swedish_PackItemIDs.minecartSJLittDg2.item, "electric", 2502, 76, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"AllDown","BackUp","FrontUp"}, 18, -5.1, Constants.TOOLTIP),
    LOCO_BJLittDs("locoBJLittDs", "BJ Litt Ds", Swedish_PackEntityLocoElectricBJLittDs.class, Swedish_PackItemIDs.minecartBJLittDs.item, "electric", 2470, 91, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"BJ_AllDown","BJ_BackUp","BJ_FrontUp","AllDown","BackUp","FrontUp"}, 18, -4.15, Constants.TOOLTIP),
    LOCO_GBJLittBs("locoGBJLittBs", "GBJ Litt Bs", Swedish_PackEntityLocoElectricGBJLittBs.class, Swedish_PackItemIDs.minecartGBJLittBs.item, "electric", 1600, 101, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"AllDown","BackUp","FrontUp"}, 18, -2.1, Constants.TOOLTIP),
    LOCO_BJLittBk("locoBJLittBk", "BJ Litt Bk", Swedish_PackEntityLocoElectricBJLittBk.class, Swedish_PackItemIDs.minecartBJLittBk.item, "electric", 2470, 81, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"BJ_AllDown","BJ_BackUp","BJ_FrontUp","AllDown","BackUp","FrontUp"}, 18, -4.15, Constants.TOOLTIP),
    LOCO_SJLittOaA("locoSJLittOaA", "SJ Litt Oa A", Swedish_PackEntityLocoElectricSJLittOaA.class, Swedish_PackItemIDs.minecartSJLittOaA.item, "electric", 1632, 61, 1.4, 10, 0, 100, 0.4, 0.6, 8000, new String[]{"NP_Down","NP_Up","WP_Down","WP_Up"}, 18, -3.25, Constants.TOOLTIP),
    LOCO_SJLittObA("locoSJLittObA", "SJ Litt Ob A", Swedish_PackEntityLocoElectricSJLittObA.class, Swedish_PackItemIDs.minecartSJLittObA.item, "electric", 1632, 61, 1.4, 10, 0, 100, 0.5, 0.7, 8000, new String[]{"NP_Down","NP_Up","WP_Down","WP_Up"}, 18, -3.25, Constants.TOOLTIP),
    LOCO_SJLittOc("locoSJLittOc", "SJ Litt Oc", Swedish_PackEntityLocoElectricSJLittOc.class, Swedish_PackItemIDs.minecartSJLittOc.item, "electric", 1000, 61, 1.4, 10, 0, 100, 0.5, 0.7, 8000, new String[]{"20NP_AllDown","20NP_BackUp","20NP_FrontUp","20WP_AllDown","20WP_BackUp","20WP_FrontUp"}, 18, -3.00, Constants.TOOLTIP),
    LOCO_SJLittOd("locoSJLittOd", "SJ Litt Od", Swedish_PackEntityLocoElectricSJLittOd.class, Swedish_PackItemIDs.minecartSJLittOd.item, "electric", 1129, 61, 1.4, 10, 0, 100, 0.5, 0.6, 8000, new String[]{"NP_AllDown","NP_BackUp","NP_FrontUp","WP_AllDown","WP_BackUp","WP_FrontUp"}, 18, -3.6, Constants.TOOLTIP),
    LOCO_SJLittOeA("locoSJLittOeA", "SJ Litt Oe A", Swedish_PackEntityLocoElectricSJLittOeA.class, Swedish_PackItemIDs.minecartSJLittOeA.item, "electric", 2883, 61, 1.4, 10, 0, 100, 0.4, 0.6, 8000, new String[]{"NP_Down","NP_Up","WP_Down","WP_Up"}, 18, -3.70, Constants.TOOLTIP),
    LOCO_SJLittOfA("locoSJLittOfA", "SJ Litt Of A", Swedish_PackEntityLocoElectricSJLittOfA.class, Swedish_PackItemIDs.minecartSJLittOfA.item, "electric", 2801, 61, 1.4, 10, 0, 100, 0.4, 0.6, 8000, new String[]{"NP_Down","NP_Up","WP_Down","WP_Up"}, 18, -3.70, Constants.TOOLTIP),
    LOCO_SJLittOfAs("locoSJLittOfAs", "SJ Litt Of As", Swedish_PackEntityLocoElectricSJLittOfAs.class, Swedish_PackItemIDs.minecartSJLittOfAs.item, "electric", 2801, 61, 1.4, 10, 0, 100, 0.4, 0.6, 8000, new String[]{"NP_Down","NP_Up","WP_Down","WP_Up"}, 18, -3.80, Constants.TOOLTIP),
    LOCO_SJLittT21("locoSJLittT21", "SJ Litt T21", Swedish_PackEntityLocoDieselSJLittT21.class, Swedish_PackItemIDs.minecartSJLittT21.item, "diesel", 790, 81, 1.4, 10, 0, 100, 0.5, 0.6, 8000, new String[]{"S_NP","O_NP","S_WP","O_WP"}, 18, -2.2, Constants.TOOLTIP),
    LOCO_FTRLittPVV8("locoFTRLittPVV8", "FTR Litt PVV8", Swedish_PackEntityLocoDieselFTRLittPVV8.class, Swedish_PackItemIDs.minecartFTRLittPVV8.item, "diesel", 3000, 300, 1.4, 10, 0, 100, 2.5, 0.6, 8000, new String[]{"Speed"}, 18, -1.2, Constants.TOOLTIP),
    LOCO_SJLittT23("locoSJLittT23", "SJ Litt T23", Swedish_PackEntityLocoDieselSJLittT23.class, Swedish_PackItemIDs.minecartSJLittT23.item, "diesel", 790, 81, 1.4, 10, 0, 100, 0.5, 0.6, 8000, new String[]{"S_NP","O_NP","S_WP","O_WP","S_NP_ES","O_NP_ES","S_WP_ES","O_WP_ES","S_NP_ESG","O_NP_ESG","S_WP_ESG","O_WP_ESG","S_NP_GBBJ","O_NP_GBBJ","S_WP_GBBJ","O_WP_GBBJ","S_NP_Gf","O_NP_Gf","S_WP_Gf","O_WP_Gf"}, 18, -2.7, Constants.TOOLTIP),
    LOCO_FTRLittET41A("locoFTRLittET41A", "FTR Litt ET41A", Swedish_PackEntityLocoElectricFTRLittET41A.class, Swedish_PackItemIDs.minecartFTRLittET41A.item, "electric", 2700, 125, 1.4, 10, 0, 100, 0.4, 0.6, 8000, new String[]{"V2"}, 18, -3.15, Constants.TOOLTIP),
    LOCO_SJLittB1919("locoSJLittB1919", "SJ Litt B 1919", Swedish_PackEntityLocoSteamSJLittB1919.class, Swedish_PackItemIDs.minecartSJLittB1919.item, "steam", 1000, 91, 1.4, 10, 10, 100, 0.4, 0.6, 8000, new String[]{"S_V_S","S_V_M","S_M_S","S_M_M","B_V_S","B_V_M"}, 18, -3.45, Constants.TOOLTIP),
    LOCO_SJLittB1909("locoSJLittB1909", "SJ Litt B 1909", Swedish_PackEntityLocoSteamSJLittB1909.class, Swedish_PackItemIDs.minecartSJLittB1909.item, "steam", 1000, 91, 1.4, 10, 10, 100, 0.4, 0.6, 8000, new String[]{"B_V_S","B_V_M","S_V_S","S_V_M","B_L_S","B_L_M"}, 18, -3.65, Constants.TOOLTIP),
    LOCO_SJLittT31("locoSJLittT31", "SJ Litt T31", Swedish_PackEntityLocoDieselSJLittT31.class, Swedish_PackItemIDs.minecartSJLittT31.item, "diesel", 790, 81, 1.4, 10, 0, 100, 0.5, 0.6, 8000, new String[]{"S_NP","O_NP","S_WP","O_WP"}, 18, -2.225, Constants.TOOLTIP),
    LOCO_SJLittX16("locoSJLittX16", "SJ Litt X16", Swedish_PackEntityLocoElectricSJLittX16.class, Swedish_PackItemIDs.minecartSJLittX16.item, "electric", 800, 111, 1.4, 10, 0, 100, 0.5, 0.6, 8000, new String[]{"South_Down","South_Up","North_Down","North_Up","SouthSF_Down","SouthSF_Up","NorthSF_Down","NorthSF_Up"}, 18, -4.3, Constants.TOOLTIP),
    LOCO_SJLittY6("locoSJLittY6", "SJ Litt Y6", Swedish_PackEntityLocoDieselSJLittY6.class, Swedish_PackItemIDs.minecartSJLittY6.item, "diesel", 800, 116, 1.4, 10, 0, 100, 0.5, 0.6, 8000, new String[]{"South","North"}, 18, -4.3, Constants.TOOLTIP),
    LOCO_SJLittFel("locoSJLittFel", "SJ Litt F el", Swedish_PackEntityLocoElectricSJLittFel.class, Swedish_PackItemIDs.minecartSJLittFel.item, "electric", 3459, 136, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"Modern_AllDown","Modern_Back_Up","Modern_Front_Up","PreSJ_AllDown","PreSJ_Back_Up","PreSJ_Front_Up"}, 18, -4.325, Constants.TOOLTIP),



    Passanger_SJLittUb("passangerSJLittUb", "SJ Litt Ub", Swedish_PackEntityPassengerSJLittUb.class, Swedish_PackItemIDs.minecartSJLittUb.item, "Passanger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"South","North"}, 10, 0, Constants.TOOLTIP),
    Passanger_SJLittUBF6Y("passangerSJLittUBF6Y", "SJ Litt UBF6Y", Swedish_PackEntityPassengerSJLittUBF6Y.class, Swedish_PackItemIDs.minecartSJLittUBF6Y.item, "Passanger", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"South","North"}, 10, 0, Constants.TOOLTIP),


    TENDER_SJLittAtender("tenderSJLittAtender", "SJ_Litt_A_Tender", Swedish_PackEntityTenderSJLittA.class, Swedish_PackItemIDs.minecartSJLittATender.item, "tender", 0,
            0, 0.5, 0, 0, 0, 0, 0, 14000, new String[]{"CC", "OC", "CCMK"}, 18, 0,
            Constants.TOOLTIP),
    TENDER_SJLittCtender("tenderSJLittCtender", "SJ_Litt_C_Tender", Swedish_PackEntityTenderSJLittC.class, Swedish_PackItemIDs.minecartSJLittCTender.item, "tender", 0,
            0, 0.5, 0, 0, 0, 0, 0, 14000, new String[]{"CC", "OC", "CCMK"}, 18, 0,
            Constants.TOOLTIP),
    FREIGHT_SJLittM1("SJLittM1", "SJ_Litt_M1", Swedish_PackEntityFreightSJLittM1.class, Swedish_PackItemIDs.minecartSJLittM1.item, "freight", 3.5, new String[]{"Closed", "Open"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_SJLittM21902("SJLittM21902", "SJ_Litt_M21902", Swedish_PackEntityFreightSJLittM21902.class, Swedish_PackItemIDs.minecartSJLittM21902.item, "freight", 3.5, new String[]{"Closed", "Open"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_SJLittM21908("SJLittM21908", "SJ_Litt_M21908", Swedish_PackEntityFreightSJLittM21908.class, Swedish_PackItemIDs.minecartSJLittM21908.item, "freight", 3.5, new String[]{"Closed", "Open"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_SJLittM21908Extended("SJLittM21908Extended", "SJ_Litt_M21908Extended", Swedish_PackEntityFreightSJLittM21908Extended.class, Swedish_PackItemIDs.minecartSJLittM21908Extended.item, "freight", 3.5, new String[]{"Closed", "Open"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_SJLittMAS("SJLittMAS", "SJ_Litt_MAS", Swedish_PackEntityFreightSJLittMAS.class, Swedish_PackItemIDs.minecartSJLittMAS.item, "freight", 3.5, new String[]{"Closed", "Open"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_SJLittO("SJLittO", "SJ_Litt_O", Swedish_PackEntityFreightSJLittO.class, Swedish_PackItemIDs.minecartSJLittO.item, "freight", 3.5, new String[]{"WithSides", "WithoutSides", "WithSides_Modern", "WithoutSides_Modern"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_SJLittOs("SJLittOs", "SJ_Litt_Os", Swedish_PackEntityFreightSJLittOs.class, Swedish_PackItemIDs.minecartSJLittOs.item, "freight", 3.5, new String[]{"WithSides", "WithoutSides"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_SJLittOs_w("SJLittOs_w", "SJ_Litt_Os_w", Swedish_PackEntityFreightSJLittOs_w.class, Swedish_PackItemIDs.minecartSJLittOs_w.item, "freight", 3.5, new String[]{"WithSides", "WithoutSides"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_SJLittLgs("SJLittLgs", "SJ_Litt_Lgs", Swedish_PackEntityFreightSJLittLgs.class, Swedish_PackItemIDs.minecartSJLittLgs.item, "freight", 3.5, new String[]{"B40", "EG40", "Empty", "ESEA20", "FTR20", "FTR40", "FTRB20", "FTRB40", "G40", "GO20", "MR40", "O40", "OM20", "ON40", "PN20", "PN40", "R40", "SP20", "SP40", "WB20", "YR20"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_SJLittG("SJLittG", "SJ_Litt_G", Swedish_PackEntityFreightSJLittG.class, Swedish_PackItemIDs.minecartSJLittG.item, "freight", 3.5, new String[]{"allclosed","allopen" ,"rightopen","Leftopen","RVMGT_allopen", "RVMGT_allclosed","RVMGT_rightopen","RVMGT_Leftopen","RVJGT_allopen", "RVJGT_allclosed","RVJGT_rightopen","RVJGT_Leftopen"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_SJLittUDFo20("SJLittUDFo20", "SJ_Litt_UDFo20", Swedish_PackEntityFreightSJLittUDFo20.class, Swedish_PackItemIDs.minecartSJLittUDFo20.item, "freight", 3.5, new String[]{"South"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_SJLittUFV("SJLittUFV", "SJ_Litt_UFV", Swedish_PackEntityFreightSJLittUFV.class, Swedish_PackItemIDs.minecartSJLittUFV.item, "freight", 3.5, new String[]{"South"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_SJLittElos("SJLittElos", "SJ_Litt_Elos", Swedish_PackEntityFreightSJLittElos.class, Swedish_PackItemIDs.minecartSJLittElos.item, "freight", 3.5, new String[]{"NS", "NS_1", "NS_2", "NS_3", "WS", "WS_1", "WS_2", "WS_3"}, 18, 36, Constants.TOOLTIP),
    FREIGHT_SJLittOaVagn("SJLittOaVagn", "SJ_Litt_OaVagn", Swedish_PackEntityFreightSJLittOaVagn.class, Swedish_PackItemIDs.minecartSJLittOaVagn.item, "freight", 3.5, new String[]{"Empty"}, 18, 36, Constants.TOOLTIP),

    TANK_SJLittQ12("SJLittQ12", "SJ_Litt_Q12", Swedish_PackEntityEntityWagonSJLittQ12.class, Swedish_PackItemIDs.minecartSJLittQ12.item, "tank", 3.5, new String[]{"Silver_New","Silver_Old"}, 18, 0, Constants.TOOLTIP),



    FREIGHT_SJLittDm3("SJLittDm3", "SJ_Litt_Dm3", Swedish_PackEntityFreightSJLittDm3.class, Swedish_PackItemIDs.minecartSJLittDm3.item, "freight", 3.5, new String[]{"60s", "70s","LKAB"}, 18, 36, Constants.TOOLTIP),
    CABOOSE_SJLittOaB("cabooseSJLittOaB", "SJ_Litt_Oa_B", Swedish_PackEntityCabooseSJLittOaB.class, Swedish_PackItemIDs.minecartSJLittOaB.item, "caboose", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"NP_Down","NP_Up","WP_Down","WP_Up"}, 10, 0, Constants.TOOLTIP),
    CABOOSE_SJLittObB("cabooseSJLittObB", "SJ Litt Ob B", Swedish_PackEntityCabooseSJLittObB.class, Swedish_PackItemIDs.minecartSJLittObB.item, "caboose", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"NP_Down","NP_Up","WP_Down","WP_Up"}, 10, 0, Constants.TOOLTIP),
    CABOOSE_SJLittDmB("cabooseSJLittDmB", "SJ Litt Dm B", Swedish_PackEntityCabooseSJLittDmB.class, Swedish_PackItemIDs.minecartSJLittDmB.item, "caboose", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"60snorth_Down", "60snorth_Up", "60ssouth_Down", "60ssouth_Up", "70snorth_Down", "70snorth_Up", "70ssouth_Down", "70ssouth_Up", "LKAB_Down", "LKAB_Up"}, 10, 0, Constants.TOOLTIP),
    CABOOSE_SJLittOeB("cabooseSJLittOeB", "SJ Litt Oe B", Swedish_PackEntityCabooseSJLittOeB.class, Swedish_PackItemIDs.minecartSJLittOeB.item, "caboose", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"NP_Down","NP_Up","WP_Down","WP_Up"}, 10, 0, Constants.TOOLTIP),
    CABOOSE_SJLittOfB("cabooseSJLittOfB", "SJ Litt Of B", Swedish_PackEntityCabooseSJLittOfB.class, Swedish_PackItemIDs.minecartSJLittOfB.item, "caboose", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"NP_Down","NP_Up","WP_Down","WP_Up", "Middle"}, 10, 0, Constants.TOOLTIP),
    CABOOSE_FTRLittET41B("cabooseFTRLittET41B", "FTR Litt ET41 B", Swedish_PackEntityCabooseFTRLittET41B.class, Swedish_PackItemIDs.minecartFTRLittET41B.item, "caboose", 0, 0, 1, 0, 0, 0, 0, 0, 0, new String[]{"V2"}, 10, 0, Constants.TOOLTIP),


    ;

    private String trainId;
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
    private String[] liveries;
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
     * @param trainType: "steam", "diesel", "freight", "passenger", "special",
     * "flat", "electric"
     * @param MHP: power of the locomotive
     * @param maxSpeed
     * @param mass (will be multiplied by 10 internally. That means putting 0.1
     * here will create a mass of 1 Ton in game)
     * @param fuelConsumption: 1 unit is consumed every x ticks
     * @param waterConsumption: 1 unit is consumed every x ticks
     * @param heatingTime
     * @param accelerationRate: generally around 0.45
     * @param brakeRate: generally around 0.98
     * @param tankCapacity
     * @param liveries: an array with all possible colors / variants. Index 0 is
     * used as default color when train is first spawned. leave null if no color
     * available
     * @param guiRenderScale: scale at which the entity will be rendered inside
     * the GUI (crafting GUI)
     */
    private Swedish_PackEnumTrains(String trainId, String internalName, Class entityClass, Item item, String trainType, int MHP, int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] liveries, int guiRenderScale, double bogieLocoPosition) {
        this.trainId = trainId;
        this.internalName = internalName;
        this.entityClass = entityClass;
        this.item = item;
        this.trainType = trainType;
        this.MHP = MHP;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.fuelConsumption = fuelConsumption;
        this.waterConsumption = waterConsumption;
        this.heatingTime = heatingTime;
        this.accelerationRate = accelerationRate;
        this.brakeRate = brakeRate;
        this.tankCapacity = tankCapacity;
        this.liveries = liveries;
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
     * @param liveries
     * @param guiRenderScale
     * @param bogieLocoPositions
     * @param additionalTooltip
     */
    private Swedish_PackEnumTrains(String trainId, String internalName, Class entityClass, Item item, String trainType, int MHP, int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] liveries, int guiRenderScale, double bogieLocoPositions, String additionalTooltip) {
        this.trainId = trainId;
        this.internalName = internalName;
        this.entityClass = entityClass;
        this.item = item;
        this.trainType = trainType;
        this.MHP = MHP;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.fuelConsumption = fuelConsumption;
        this.waterConsumption = waterConsumption;
        this.heatingTime = heatingTime;
        this.accelerationRate = accelerationRate;
        this.brakeRate = brakeRate;
        this.tankCapacity = tankCapacity;
        this.liveries = liveries;
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
     * @param liveries
     * @param guiRenderScale
     * @param cargoCapacity
     * @param additionalTooltip
     */
    private Swedish_PackEnumTrains(String trainId, String internalName, Class entityClass, Item item, String trainType, double mass, String[] liveries, int guiRenderScale, int cargoCapacity, String additionalTooltip) {
        this.trainId = trainId;
        this.internalName = internalName;
        this.entityClass = entityClass;
        this.item = item;
        this.trainType = trainType;
        this.mass = mass;
        this.liveries = liveries;
        this.guiRenderScale = guiRenderScale;
        this.additionalTooltip = additionalTooltip;
        this.cargoCapacity = cargoCapacity;
    }

    public String getTrainId() {
        return trainId;
    }

    public String getInternalName() {
        return this.internalName;
    }

    public Item getItem() {
        return this.item;
    }

    public String getTrainType() {
        return this.trainType;
    }

    public int getMHP() {
        return this.MHP;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double getMass() {
        return this.mass;
    }

    public int getFuelConsumption() {
        return this.fuelConsumption;
    }

    public int getWaterConsumption() {
        return this.waterConsumption;
    }

    public int getHeatingTime() {
        return this.heatingTime;
    }

    public double getAccelerationRate() {
        return this.accelerationRate;
    }

    public double getBrakeRate() {
        return this.brakeRate;
    }

    public int getTankCapacity() {
        return this.tankCapacity;
    }

    public String[] getLiveries() {
        return this.liveries;
    }

    public double getBogieLocoPosition() {
        return this.bogieLocoPosition;
    }

    public Class getEntityClass() {
        return this.entityClass;
    }

    public int getGuiRenderScale() {
        return this.guiRenderScale;
    }

    public String getAdditionnalTooltip() {
        return this.additionalTooltip;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    private static class Constants {

        public static final String TOOLTIP = "Pack: " + EnumChatFormatting.YELLOW + "Swedish Pack" + EnumChatFormatting.GOLD + EnumChatFormatting.BOLD + "  -Foxo";
    }
}
