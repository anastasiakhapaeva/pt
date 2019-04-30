package com.epam.park.movement;

import java.util.List;

public class Route {

    private List<TransportStop> stops;

    public Route() {
    }

    public Route(List<TransportStop> stops) {
        this.stops = stops;
    }

    public List<TransportStop> getStops() {
        return stops;
    }

    public void setStops(List<TransportStop> stops) {
        this.stops = stops;
    }

    public void addStop(TransportStop stop) {
        this.stops.add(stop);
    }

    public void removeStop(TransportStop stop) {
        this.stops.remove(stop);
    }
}
