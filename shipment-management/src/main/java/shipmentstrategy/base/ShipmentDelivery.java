package shipmentstrategy.base;

import model.constant.contract.ShipmentDeliveryRequest;
import model.constant.contract.ShipmentDeliveryResponse;

public interface ShipmentDelivery {
    ShipmentDeliveryResponse deliver(ShipmentDeliveryRequest request);
}
