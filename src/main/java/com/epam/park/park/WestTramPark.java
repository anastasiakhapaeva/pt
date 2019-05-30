package com.epam.park.park;

import com.epam.park.transport.Tram;

import java.util.List;

public class WestTramPark extends VehiclePark<Tram>{

    public WestTramPark(List<Tram> trolleybuses) {
        vehicles = trolleybuses;
    }

    @Override
    public List<Tram> getVehicles() {
        return vehicles;
    }

    public void setBuses(List<Tram> trams) {
        this.vehicles = trams;
    }

}
