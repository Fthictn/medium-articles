package model.entity;

import model.constant.DeliveryPoint;
import model.constant.ShipmentType;
import model.constant.State;

import java.util.List;

public class Shipment {
    private State state;
    private String barcode;
    private Long weight;
    private DeliveryPoint deliveryPoint;
    private ShipmentType type;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public DeliveryPoint getDeliveryPoint() {
        return deliveryPoint;
    }

    public void setDeliveryPoint(DeliveryPoint deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public ShipmentType getType() {
        return type;
    }

    public void setType(ShipmentType type) {
        this.type = type;
    }

}
