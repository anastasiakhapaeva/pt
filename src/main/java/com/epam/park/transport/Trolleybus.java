package com.epam.park.transport;

public class Trolleybus extends Vehicle implements Car {


    private TrolleybusType type;

    public TrolleybusType getType() {
        return type;
    }

    public Trolleybus setType(TrolleybusType type) {
        this.type = type;
        return this;
    }

    private enum TrolleybusType {
        CARGO, DUOBUS, USUAL
    }

}
