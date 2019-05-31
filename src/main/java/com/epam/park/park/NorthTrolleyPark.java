package com.epam.park.park;

import com.epam.park.transport.Bus;
import com.epam.park.transport.Trolleybus;

import java.util.List;

public class NorthTrolleyPark extends VehiclePark<Trolleybus>{

    public NorthTrolleyPark(List<Trolleybus> trolleybuses) {
        vehicles = trolleybuses;
    }

    @Override
    public List<Trolleybus> getVehicles() {
        return vehicles;
    }

    public void setBuses(List<Trolleybus> trolleybuses) {
        vehicles = trolleybuses;
    }

}
