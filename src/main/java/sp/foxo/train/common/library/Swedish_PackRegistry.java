package sp.foxo.train.common.library;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import sp.foxo.train.client.render.Swedish_PackRenderEnum;
import train.common.api.TrainRecord;
import train.common.api.TrainRenderRecord;
import train.common.api.TrainSoundRecord;
import train.common.Traincraft;

public class Swedish_PackRegistry {

    public void registerTrainRecords() {
        for (Swedish_PackEnumTrains train : Swedish_PackEnumTrains.values()) {
            TrainRecord trainRecord = TrainRecord.makeEntry(train.getTrainId(), train.getInternalName(), train.getEntityClass(), train.getItem(), train.getTrainType(),
                    train.getMHP(), train.getMaxSpeed(), train.getMass(), train.getFuelConsumption(), train.getWaterConsumption(), train.getHeatingTime(), train.getAccelerationRate(), train.getBrakeRate(), train.getTankCapacity(),
                    train.getLiveries(), train.getGuiRenderScale(), train.getBogieLocoPosition(), train.getAdditionnalTooltip());
            Traincraft.instance.traincraftRegistry.registerTrainRecord(trainRecord);
        }
    }

    public void registerRenderRecords() {
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT) {
            for (TrainRenderRecord render : Swedish_PackRenderEnum.values()) {
                Traincraft.instance.traincraftRegistry.registerTrainRenderRecord(render);
            }
        }
    }

    public void registerSoundRecords() {
        for (TrainSoundRecord sound : Swedish_PackEnumSounds.values()) {
            Traincraft.instance.traincraftRegistry.registerTrainSoundRecord(sound);
        }
    }
}
