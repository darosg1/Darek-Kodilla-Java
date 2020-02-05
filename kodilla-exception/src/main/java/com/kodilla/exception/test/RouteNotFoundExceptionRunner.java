package com.kodilla.exception.test;

import java.nio.file.Watchable;

public class RouteNotFoundExceptionRunner {

    public static void main(String [] args){
        FlightSearch flightSearch = new FlightSearch();
        try {
            Flight flightRoute = new Flight("Warsaw International Airport EPWA", "Madrid Barajas LEMD");
            boolean flight1 = flightSearch.findFlight(flightRoute);
            System.out.println("Flight: "+ flight1);
        }catch (RouteNotFoundException e) {
            System.out.println("Route is not available, try another destination!");
        }finally{
            System.out.println("Fly with us!");
        }

    }
}
