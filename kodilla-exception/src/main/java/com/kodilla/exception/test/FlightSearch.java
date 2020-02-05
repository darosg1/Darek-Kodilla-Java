package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public boolean findFlight (Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportList = new HashMap<>();
        airportList.put("Warsaw International Airport EPWA", Boolean.TRUE);
        airportList.put("Paris Charles de Gaulle LFPG", Boolean.TRUE);
        airportList.put("Amsterdam Schiphol EHAM", Boolean.FALSE);
        airportList.put("London Heathrow EGLL", Boolean.TRUE);

        if (airportList.containsKey(flight.getArrivalAirport())){
            return airportList.get(flight.getArrivalAirport());
        }else{
            throw new RouteNotFoundException();
        }
    }
}
