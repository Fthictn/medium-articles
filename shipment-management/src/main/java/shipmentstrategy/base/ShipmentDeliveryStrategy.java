package shipmentstrategy.base;

import model.entity.Shipment;

public class ShipmentDeliveryStrategy {
    private final ShipmentDelivery shipmentDelivery;

    public ShipmentDeliveryStrategy(ShipmentDelivery shipmentDelivery){
        this.shipmentDelivery = shipmentDelivery;
    }

    public Shipment deliver(Shipment shipment){
        return shipmentDelivery.deliver(shipment);
    }
}
