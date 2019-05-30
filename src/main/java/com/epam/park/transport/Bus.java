package com.epam.park.transport;

public class Bus extends Vehicle implements Car {

    private BusType type;

    public BusType getType() {
        return type;
    }

    public Bus setType(BusType type) {
        this.type = type;
        return this;
    }

    private enum BusType {
        EXPRESS, ELECTRO, USUAL
    }

}
