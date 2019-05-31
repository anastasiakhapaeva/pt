package com.epam.park.park;

import com.epam.park.transport.Bus;
import com.epam.park.transport.Tram;
import com.epam.park.transport.Trolleybus;
import com.epam.park.transport.Vehicle;

import java.util.List;

public class CentralBusPark extends VehiclePark<Bus> {

    public CentralBusPark(List<Bus> trolleybuses) {
        vehicles = trolleybuses;
    }

    @Override
    public List<Bus> getVehicles() {
        return vehicles;
    }

    public void setBuses(List<Bus> buses) {
        vehicles = buses;
    }

    public Bus findByBusNumber(String busNumber) {
        return vehicles.stream().filter(vehicle -> vehicle.getVehicleNumber().equals(busNumber)).findFirst().get();
    }

}
