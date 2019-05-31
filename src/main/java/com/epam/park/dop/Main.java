package com.epam.park.dop;

import com.epam.park.park.CentralBusPark;
import com.epam.park.util.ParkService;

public class Main {

    public static void main(String[] args) {
        ParkService.calculateParkCost(new CentralBusPark(null));
    }

}
