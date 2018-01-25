package ua.com.glprocamp.airline.model.services;

import ua.com.glprocamp.airline.model.comparators.*;
import ua.com.glprocamp.airline.model.entities.aircraft.Aircraft;
import ua.com.glprocamp.airline.model.entities.aircraft.Airliner;
import ua.com.glprocamp.airline.model.entities.airline.AirLine;
import ua.com.glprocamp.airline.model.search.*;

import java.util.Collections;
import java.util.List;

public class AirlineService {

    AirLineStatisticsService airLineStatisticsService = new AirLineStatisticsService();
    AircraftComparator aircraftComparator = new ComparatorByFlightRange();
    SearchAircraftsStrategy searchAircraftsStrategy = new SearchAirlinersInTheSpecifiedFuelConsumptionRange();

    public AirLine getAirlineCompany(){

        return new CreationService().getAirLineCompany();

    }

    public List<Aircraft> sortAirlinersByFlightRange(List<Aircraft> aircrafts){

        Collections.sort(aircrafts, new ComparatorByFlightRange());
        return aircrafts;

    }


    public int calculateCapacity(AirLine airLine) {
        return airLineStatisticsService.calculateCarryingCapacity(airLine);
    }

    public int calculatePassengerCapacity(AirLine airLine){
        return airLineStatisticsService.calculateSeatingCapasity(airLine);
    }

    public List<Airliner> findAircraftInTheSpecifiedRange(AirLine airLine, int startRange, int endRange){
        return searchAircraftsStrategy.findAircraftInTheSpecifiedRange(airLine.getAirliners(),startRange, endRange);
    }
}
