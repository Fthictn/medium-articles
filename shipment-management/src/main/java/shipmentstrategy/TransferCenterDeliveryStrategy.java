package shipmentstrategy;

import model.constant.ShipmentType;
import model.constant.State;
import model.constant.contract.ShipmentDeliveryRequest;
import model.constant.contract.ShipmentDeliveryResponse;
import model.entity.Shipment;
import shipmentstrategy.base.ShipmentDelivery;

import java.util.*;
import java.util.function.Predicate;

public class TransferCenterDeliveryStrategy implements ShipmentDelivery {

    private final long WEIGHT_LIMIT = 100;
    @Override
    public ShipmentDeliveryResponse deliver(ShipmentDeliveryRequest request) {
        ShipmentDeliveryResponse response = new ShipmentDeliveryResponse();
        List<Shipment> shipments = request.getShipments();
        Predicate<Shipment> isBag = shipment -> ShipmentType.BAG.equals(shipment.getType());
        Predicate<Shipment> isOverWeightLimit = shipment -> shipment.getWeight() > WEIGHT_LIMIT;
        Predicate<Shipment> isInCreatedState = shipment -> shipment.getState() == State.CREATED;
        shipments.stream()
                .filter(isInCreatedState)
                .filter(isBag)
                .filter(isOverWeightLimit)
                .forEach(shipment -> shipment.setState(State.LOADED));

        response.setShipments(shipments);
        return response;
    }
}
