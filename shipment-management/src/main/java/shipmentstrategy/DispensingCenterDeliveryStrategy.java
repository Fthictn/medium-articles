package shipmentstrategy;

import model.constant.State;
import model.entity.Shipment;
import shipmentstrategy.base.ShipmentDelivery;

public class DispensingCenterDeliveryStrategy implements ShipmentDelivery {

    @Override
    public Shipment deliver(Shipment shipment) {
        long MIN_WEIGHT_LIMIT = 100;
        long MAX_WEIGHT_LIMIT = 5000;
        if (shipment.getWeight() > MIN_WEIGHT_LIMIT && shipment.getWeight() < MAX_WEIGHT_LIMIT) {
            if (shipment.getState().equals(State.CREATED)) {
                shipment.setState(State.LOADED);
            }
        }
        return shipment;
    }
}
