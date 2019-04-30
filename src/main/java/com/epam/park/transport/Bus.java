package com.epam.park.transport;

public class Bus extends Vehicle implements Car {

    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
