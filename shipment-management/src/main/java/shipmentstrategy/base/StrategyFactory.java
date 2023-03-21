package shipmentstrategy.base;

import model.constant.DeliveryPoint;
import shipmentstrategy.CargoCenterDeliveryStrategy;
import shipmentstrategy.DealershipCenterDeliveryStrategy;
import shipmentstrategy.DispensingCenterDeliveryStrategy;

import javax.naming.OperationNotSupportedException;

public class StrategyFactory {

    public static ShipmentDeliveryStrategy getStrategy(DeliveryPoint deliveryPoint) {
        switch (deliveryPoint) {
            case CARGO_CENTER -> {
                return new ShipmentDeliveryStrategy(new CargoCenterDeliveryStrategy());
            }
            case DEALERSHIP_CENTER -> {
                return new ShipmentDeliveryStrategy(new DealershipCenterDeliveryStrategy());
            }
            case DISPENSING_CENTER -> {
                return new ShipmentDeliveryStrategy(new DispensingCenterDeliveryStrategy());
            }
            default -> {
                try {
                    throw new OperationNotSupportedException("Operation not supported");
                } catch (OperationNotSupportedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
