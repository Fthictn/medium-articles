package shipmentstrategy;

import model.constant.ShipmentType;
import model.constant.State;
import model.constant.contract.ShipmentDeliveryRequest;
import model.constant.contract.ShipmentDeliveryResponse;
import model.entity.Shipment;
import shipmentstrategy.base.ShipmentDelivery;

import java.util.List;
import java.util.function.Predicate;

public class BranchDeliveryStrategy implements ShipmentDelivery {

    private final long WEIGHT_LIMIT = 100;
    @Override
    public ShipmentDeliveryResponse deliver(ShipmentDeliveryRequest request) {
        ShipmentDeliveryResponse response = new ShipmentDeliveryResponse();
        List<Shipment> shipments = request.getShipments();
        Predicate<Shipment> isPackage = shipment -> ShipmentType.PACKAGE.equals(shipment.getType());
        Predicate<Shipment> isUnderWeightLimit = shipment -> shipment.getWeight() <= WEIGHT_LIMIT;
        Predicate<Shipment> isInCreatedState = shipment -> shipment.getState() == State.CREATED;
        shipments.stream()
                .filter(isInCreatedState)
                .filter(isPackage)
                .filter(isUnderWeightLimit)
                .forEach(shipment -> shipment.setState(State.LOADED));

        response.setShipments(shipments);
        return response;
    }

}
