package com.epam.park.transport;

public class Tram extends Vehicle implements Car {

    private TramType type;

    public TramType getType() {
        return type;
    }

    public Tram setType(TramType type) {
        this.type = type;
        return this;
    }

    private enum TramType {
        CARGO, USUAL
    }

}
