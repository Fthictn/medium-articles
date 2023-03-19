package model.constant.contract;

import model.entity.Shipment;

import java.util.List;

public class ShipmentDeliveryRequest {
    private List<Shipment> shipments;

    public ShipmentDeliveryRequest(List<Shipment> shipments) {
        this.shipments = shipments;
    }

    public ShipmentDeliveryRequest(){}

    public List<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(List<Shipment> shipments) {
        this.shipments = shipments;
    }
}
