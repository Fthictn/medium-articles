package service;

import model.constant.contract.ShipmentDeliveryRequest;
import model.constant.contract.ShipmentDeliveryResponse;
import model.entity.Shipment;
import shipmentstrategy.base.ShipmentDeliveryStrategy;
import shipmentstrategy.base.StrategyFactory;

import java.util.LinkedList;
import java.util.List;

public class ShipmentManagementService {

    private ShipmentDeliveryStrategy strategy;

    public ShipmentDeliveryResponse deliver(ShipmentDeliveryRequest request){
        //SOME ADDITIONAL LOGIC OR CONTROL
        ShipmentDeliveryResponse response = new ShipmentDeliveryResponse();
        List<Shipment> shipmentList = new LinkedList<>();
        request.getShipments().forEach(shipment -> {
            strategy = StrategyFactory.getStrategy(shipment.getDeliveryPoint());
            shipmentList.add(strategy.deliver(shipment));
        });

        response.setShipments(shipmentList);
        return response;
    }
}
