package shipmentstrategy.base;

import model.constant.contract.ShipmentDeliveryRequest;
import model.constant.contract.ShipmentDeliveryResponse;
import model.entity.Shipment;

public interface ShipmentDelivery {
    Shipment deliver(Shipment shipment);
}
