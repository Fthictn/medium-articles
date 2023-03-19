package model.constant.contract;

import model.entity.Shipment;

import java.util.List;

public class ShipmentDeliveryResponse {
    private List<Shipment> shipments;
    private List<String> failureMessages;

    public ShipmentDeliveryResponse(List<Shipment> shipments) {
        this.shipments = shipments;
    }

    public ShipmentDeliveryResponse(){}

    public List<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(List<Shipment> shipments) {
        this.shipments = shipments;
    }

    public List<String> getFailureMessages() {
        return failureMessages;
    }

    public void setFailureMessages(List<String> failureMessages) {
        this.failureMessages = failureMessages;
    }

}
