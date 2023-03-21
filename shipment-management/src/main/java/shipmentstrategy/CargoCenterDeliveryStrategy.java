package shipmentstrategy;

import model.constant.ShipmentType;
import model.constant.State;
import model.entity.Shipment;
import shipmentstrategy.base.ShipmentDelivery;

public class CargoCenterDeliveryStrategy implements ShipmentDelivery {

    @Override
    public Shipment deliver(Shipment shipment) {
        if(shipment.getType().equals(ShipmentType.BOX)){
            long WEIGHT_LIMIT = 100;
            if(shipment.getWeight() > WEIGHT_LIMIT){
                if (shipment.getState().equals(State.CREATED)){
                    shipment.setState(State.LOADED);
                }
            }
        }
        return shipment;
    }
}
