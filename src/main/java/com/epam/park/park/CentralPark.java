package com.epam.park.park;

import com.epam.park.transport.Bus;
import com.epam.park.transport.Tram;
import com.epam.park.transport.Trolleybus;

import java.util.List;

public class CentralPark {

    private List<Bus> buses;
    private List<Trolleybus> trolleybuses;
    private List<Tram> trams;

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    public List<Trolleybus> getTrolleybuses() {
        return trolleybuses;
    }

    public void setTrolleybuses(List<Trolleybus> trolleybuses) {
        this.trolleybuses = trolleybuses;
    }

    public List<Tram> getTrams() {
        return trams;
    }

    public void setTrams(List<Tram> trams) {
        this.trams = trams;
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public void removeBus(Bus bus) {
        buses.remove(bus);
    }

    public void addTrolleybus(Trolleybus trolleybus) {
        trolleybuses.add(trolleybus);
    }

    public void removeTrolleybus(Trolleybus trolleybus) {
        trolleybuses.remove(trolleybus);
    }

    public void addTram(Tram tram) {
        trams.add(tram);
    }

    public void removeTram(Tram tram) {
        trams.remove(tram);
    }

}
