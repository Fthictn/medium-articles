package shipmentstrategy;

import model.constant.contract.ShipmentDeliveryRequest;
import model.constant.contract.ShipmentDeliveryResponse;
import shipmentstrategy.base.ShipmentDelivery;

public class TransferCenterDeliveryStrategy implements ShipmentDelivery {
    @Override
    public ShipmentDeliveryResponse deliver(ShipmentDeliveryRequest request) {
        return null;
    }
}
