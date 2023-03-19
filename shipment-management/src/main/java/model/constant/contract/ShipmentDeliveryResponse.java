package model.constant.contract;

import model.entity.Shipment;

import java.util.List;
import java.util.Map;

public class ShipmentDeliveryResponse {
    private List<Shipment> shipments;
    private Map<String, String > failureMessages;

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

    public Map<String, String > getFailureMessages() {
        return failureMessages;
    }

    public void setFailureMessages(Map<String, String > failureMessages) {
        this.failureMessages = failureMessages;
    }

}
