package shipmentstrategy;

import model.constant.State;
import model.constant.contract.ShipmentDeliveryRequest;
import model.constant.contract.ShipmentDeliveryResponse;
import model.entity.Shipment;
import shipmentstrategy.base.ShipmentDelivery;

import java.util.List;
import java.util.function.Predicate;

public class DistributionCenterDeliveryStrategy implements ShipmentDelivery {

    private final long MIN_WEIGHT_LIMIT = 100;
    private final long MAX_WEIGHT_LIMIT = 5000;
    @Override
    public ShipmentDeliveryResponse deliver(ShipmentDeliveryRequest request) {
        ShipmentDeliveryResponse response = new ShipmentDeliveryResponse();
        List<Shipment> shipments = request.getShipments();
        Predicate<Shipment> isUnderWeightLimit = shipment -> shipment.getWeight() <= MAX_WEIGHT_LIMIT;
        Predicate<Shipment> isOverOfWeightLimit = shipment -> shipment.getWeight() <= MIN_WEIGHT_LIMIT;
        Predicate<Shipment> isInCreatedState = shipment -> shipment.getState() == State.CREATED;
        shipments.stream()
                .filter(isInCreatedState)
                .filter(isOverOfWeightLimit)
                .filter(isUnderWeightLimit)
                .forEach(shipment -> shipment.setState(State.LOADED));

        response.setShipments(shipments);
        return response;
    }
}
