package shipmentstrategy.base;

import model.constant.contract.ShipmentDeliveryRequest;
import model.constant.contract.ShipmentDeliveryResponse;

public class ShipmentDeliveryStrategy {

    private final ShipmentDelivery shipmentDelivery;

    public ShipmentDeliveryStrategy(ShipmentDelivery shipmentDelivery){
        this.shipmentDelivery = shipmentDelivery;
    }

    public ShipmentDeliveryResponse deliver(ShipmentDeliveryRequest request){
        return shipmentDelivery.deliver(request);
    }
}
