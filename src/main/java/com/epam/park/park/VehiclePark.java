package com.epam.park.park;

import com.epam.park.transport.Vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class VehiclePark<T extends Vehicle> {

    protected List<T> vehicles = new ArrayList<>();

}
