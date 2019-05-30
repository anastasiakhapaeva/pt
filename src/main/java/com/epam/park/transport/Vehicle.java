package com.epam.park.transport;

import java.math.BigDecimal;

public abstract class Vehicle {

    private String model;
    private String vehicleNumber;
    private int capacity;
    private int seatsCount;
    private double ticketPrice;
    private BigDecimal busPrice;
    private int fuelConsumption;
    private String routeNumber;

    public String getModel() {
        return model;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public BigDecimal getVehiclePrice() {
        return busPrice;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    public Vehicle setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public Vehicle setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public Vehicle setSeatsCount(int seatsCount) {
        Vehicle.this.seatsCount = seatsCount;
        return this;
    }

    public Vehicle setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
        return this;
    }

    public Vehicle setBusPrice(BigDecimal busPrice) {
        this.busPrice = busPrice;
        return this;
    }

    public Vehicle setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public Vehicle setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
        return this;
    }

}
