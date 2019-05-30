package com.epam.park.park;

import com.epam.park.transport.Bus;
import com.epam.park.transport.Tram;
import com.epam.park.transport.Trolleybus;

import java.util.List;

public class CentralBusPark extends VehiclePark<Bus> {

    public List<Bus> getBuses() {
        return vehicles;
    }

    public void setBuses(List<Bus> buses) {
        this.vehicles = buses;
    }

    public Bus findByBusNumber(String busNumber) {
        return vehicles.stream().filter(vehicle -> vehicle.getVehicleNumber().equals(busNumber)).findFirst().get();
    }

}
