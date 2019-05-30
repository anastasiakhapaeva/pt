package com.epam.park.park;

import com.epam.park.transport.Trolleybus;

import java.util.List;

public class NorthTrolleyPark extends VehiclePark<Trolleybus>{

    public List<Trolleybus> getBuses() {
        return vehicles;
    }

    public void setBuses(List<Trolleybus> trolleybuses) {
        this.vehicles = trolleybuses;
    }

}
