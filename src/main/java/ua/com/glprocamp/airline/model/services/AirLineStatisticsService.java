package ua.com.glprocamp.airline.model.services;


import ua.com.glprocamp.airline.model.calculations.CapasityCalculation;
import ua.com.glprocamp.airline.model.calculations.PassengerCapasityCalculation;
import ua.com.glprocamp.airline.model.entities.airline.AirLine;

public class AirLineStatisticsService {


    public Integer calculateSeatingCapasity(AirLine airLine){

        return new PassengerCapasityCalculation().calculate(airLine);

    }

    public Integer calculateCarryingCapacity(AirLine airLine){

        return new CapasityCalculation().calculate(airLine);

    }





}
