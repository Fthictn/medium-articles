package shipmentstrategy.base;

import model.constant.State;
import model.constant.contract.ShipmentDeliveryRequest;
import model.constant.contract.ShipmentDeliveryResponse;

import java.util.HashMap;
import java.util.Map;

public class ShipmentDeliveryStrategy {

    private final ShipmentDelivery shipmentDelivery;

    public ShipmentDeliveryStrategy(ShipmentDelivery shipmentDelivery){
        this.shipmentDelivery = shipmentDelivery;
    }

    public ShipmentDeliveryResponse deliver(ShipmentDeliveryRequest request){

        ShipmentDeliveryResponse response = shipmentDelivery.deliver(request);
        Map<String,String> failureMessages = new HashMap<>();

        response.getShipments().forEach(shipment -> {
            if(shipment.getState().equals(State.LOADED_INTO_BAG))
                failureMessages.put(shipment.getBarcode(),"This shipment is in a bag!");
            else if(shipment.getState().equals(State.LOADED))
                failureMessages.put(shipment.getBarcode(),"This shipment is already loaded!");
            else if(shipment.getState().equals(State.UNLOADED))
                failureMessages.put(shipment.getBarcode(),"This shipment is already delivered!");
        });

        response.setFailureMessages(failureMessages);
        return response;
    }
}
