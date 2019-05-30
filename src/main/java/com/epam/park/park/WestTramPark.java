package com.epam.park.park;

import com.epam.park.transport.Tram;

import java.util.List;

public class WestTramPark extends VehiclePark<Tram>{

    public List<Tram> getBuses() {
        return vehicles;
    }

    public void setBuses(List<Tram> trams) {
        this.vehicles = trams;
    }

}
