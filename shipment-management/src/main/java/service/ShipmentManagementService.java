package service;

import model.constant.contract.ShipmentDeliveryRequest;
import model.constant.contract.ShipmentDeliveryResponse;
import shipmentstrategy.base.ShipmentDeliveryStrategy;

public class ShipmentManagementService {

    private ShipmentDeliveryStrategy strategy;
    public ShipmentManagementService(ShipmentDeliveryStrategy strategy){
        this.strategy = strategy;
    }
    public ShipmentDeliveryResponse deliver(ShipmentDeliveryRequest request){
        //SOME ADDITIONAL LOGIC OR CONTROL
        return strategy.deliver(request);
    }
}
