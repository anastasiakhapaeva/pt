package com.epam.park.movement;

import com.epam.park.transport.Vehicle;

import java.util.List;

public class TransportStop<T extends Vehicle> {

    private String stopName;
    private List<T> vehiclesStoppingHere;

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public List<T> getVehiclesStoppingHere() {
        return vehiclesStoppingHere;
    }

    public void setVehiclesStoppingHere(List<T> vehicles) {
        this.vehiclesStoppingHere = vehicles;
    }

    public void addVehicle(T vehicle) {
        this.vehiclesStoppingHere.add(vehicle);
    }

    public void removeVehicle(T vehicle) {
        this.vehiclesStoppingHere.remove(vehicle);
    }
}
