package cz.ctyrkaten.train.common.library;

import net.minecraft.item.Item;
import net.minecraft.util.EnumChatFormatting;
import cz.ctyrkaten.train.common.entity.rollingStock.*;

public enum Ctyrk4EnumTrains {

    //LOCO_CD843("locoCD843", "CD 843", Ctyrk4EntityLocoDieselCD843.class, Ctyrk4ItemIDs.minecartLocoCD843.item, "diesel", 816, 111, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"Blue"}, 18, -4.25, Constants.TOOLTIP),
    LOCO_SJLittDa("locoSJLittDa", "SJ Litterera Da", Ctyrk4EntityLocoElectricSJLittDa.class, Ctyrk4ItemIDs.minecartSJLittDa.item, "electric", 2470, 101, 1.4, 10, 0, 100, 0.7, 0.9, 8000, new String[]{"Red"}, 18, -4.25, Constants.TOOLTIP),

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
    private Ctyrk4EnumTrains(String trainId, String internalName, Class entityClass, Item item, String trainType, int MHP, int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] liveries, int guiRenderScale, double bogieLocoPosition) {
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
    private Ctyrk4EnumTrains(String trainId, String internalName, Class entityClass, Item item, String trainType, int MHP, int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] liveries, int guiRenderScale, double bogieLocoPositions, String additionalTooltip) {
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
    private Ctyrk4EnumTrains(String trainId, String internalName, Class entityClass, Item item, String trainType, double mass, String[] liveries, int guiRenderScale, int cargoCapacity, String additionalTooltip) {
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

        public static final String TOOLTIP = "Pack: " + EnumChatFormatting.YELLOW + "Ctyrk4 Pack" + EnumChatFormatting.GOLD + EnumChatFormatting.BOLD + "  -Petsox";
    }
}
