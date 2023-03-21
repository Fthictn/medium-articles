package main;

import model.constant.contract.ShipmentDeliveryRequest;
import model.constant.contract.ShipmentDeliveryResponse;
import model.entity.Shipment;
import service.ShipmentManagementService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShipmentManagementService service = new ShipmentManagementService();
        List<Shipment> shipments = createShipmentList();
        ShipmentDeliveryResponse deliveryResult = service.deliver(new ShipmentDeliveryRequest(shipments));
    }

    private static List<Shipment> createShipmentList(){
        //some shipments
        return null;
    }
}
