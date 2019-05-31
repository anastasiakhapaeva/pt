package com.epam.park.util;

import com.epam.park.park.VehiclePark;
import com.epam.park.transport.Vehicle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ParkService {

    public static int calculateParkCost(VehiclePark<? extends Vehicle> vehiclePark) {
        return vehiclePark.getVehicles().stream().mapToInt(Vehicle::getVehiclePrice).sum();
    }

    public static List<Vehicle> sortByFuelConsumption(VehiclePark<? extends Vehicle> vehiclePark) {
        return vehiclePark.getVehicles().stream().sorted(Comparator.comparingInt(Vehicle::getFuelConsumption))
                .collect(Collectors.toList());
    }

}
