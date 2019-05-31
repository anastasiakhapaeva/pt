package com.epam.park.park;

import com.epam.park.transport.Vehicle;
import com.epam.park.util.VehicleParamType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public abstract class VehiclePark<T extends Vehicle> {

    protected List<T> vehicles = new ArrayList<>();

    public abstract List<T> getVehicles();

    public T getVehicleByModel(String model) {
        return vehicles.stream().filter(vehicle -> vehicle.getModel().equals(model)).findFirst().get();
    }

    public T getVehicleByVehicleNumber(String vehicleNumber) {
        return vehicles.stream().filter(vehicle -> vehicle.getVehicleNumber().equals(vehicleNumber)).findFirst().get();
    }

    public T getVehicleByRouteNumber(String routeNumber) {
        return vehicles.stream().filter(vehicle -> vehicle.getRouteNumber().equals(routeNumber)).findFirst().get();
    }

    public T getVehicleByCapacity(int capacity) {
        return vehicles.stream().filter(vehicle -> vehicle.getCapacity() == capacity).findFirst().get();
    }

    public T getVehicleBySeatsCount(int seatsCount) {
        return vehicles.stream().filter(vehicle -> vehicle.getSeatsCount() == seatsCount).findFirst().get();
    }

    public T getVehicleByTicketPrice(int ticketPrice) {
        return vehicles.stream().filter(vehicle -> vehicle.getTicketPrice() == ticketPrice).findFirst().get();
    }

    public T getVehicleByVehiclePrice(int vehiclePrice) {
        return vehicles.stream().filter(vehicle -> vehicle.getVehiclePrice() == vehiclePrice).findFirst().get();
    }

    public T getVehicleByFuelConsumption(int fuelConsumption) {
        return vehicles.stream().filter(vehicle -> vehicle.getFuelConsumption() == fuelConsumption).findFirst().get();
    }

    public T getVehicleByParam(HashMap<VehicleParamType, Object> parameters) {
        Stream<T> vehiclesStream = vehicles.stream();
        for (Map.Entry parameter : parameters.entrySet()) {
            VehicleParamType param = (VehicleParamType) parameter.getKey();
            switch (param) {
                case MODEL:
                    vehiclesStream = vehiclesStream
                            .filter(vehicle -> vehicle.getModel().equals(parameter.getValue().toString()));
                case VEHICLE_NUMBER:
                    vehiclesStream = vehiclesStream
                            .filter(vehicle -> vehicle.getVehicleNumber().equals(parameter.getValue().toString()));
                case CAPACITY:
                    vehiclesStream = vehiclesStream
                            .filter(vehicle -> vehicle.getCapacity() == (Integer) parameter.getValue());
                case SEATS_COUNT:
                    vehiclesStream = vehiclesStream
                            .filter(vehicle -> vehicle.getSeatsCount() == (Integer) parameter.getValue());
                case TICKET_PRICE:
                    vehiclesStream = vehiclesStream
                            .filter(vehicle -> vehicle.getTicketPrice() == (Integer) parameter.getValue());
                case FUEL_CONSUMPTION:
                    vehiclesStream = vehiclesStream
                            .filter(vehicle -> vehicle.getFuelConsumption() == (Integer) parameter.getValue());
                case ROUTE_NUMBER:
                    vehiclesStream = vehiclesStream
                            .filter(vehicle -> vehicle.getRouteNumber().equals(parameter.getValue().toString()));
            }
        }
        return vehiclesStream.findFirst().get();
    }
}
