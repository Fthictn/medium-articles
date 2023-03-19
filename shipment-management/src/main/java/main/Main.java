package main;

import model.constant.contract.ShipmentDeliveryRequest;
import model.constant.contract.ShipmentDeliveryResponse;
import service.ShipmentManagementService;
import shipmentstrategy.DistributionCenterDeliveryStrategy;
import shipmentstrategy.base.ShipmentDeliveryStrategy;

public class Main {
    public static void main(String[] args) {

        ShipmentDeliveryStrategy strategy = new ShipmentDeliveryStrategy(new DistributionCenterDeliveryStrategy());
        ShipmentManagementService service = new ShipmentManagementService(strategy);
        ShipmentDeliveryResponse deliveryResult = service.deliver(new ShipmentDeliveryRequest());

    }
}
