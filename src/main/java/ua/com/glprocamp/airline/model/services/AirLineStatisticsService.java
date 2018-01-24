package ua.com.glprocamp.airline.model.services;


import ua.com.glprocamp.airline.model.calculations.CapasityCalculation;
import ua.com.glprocamp.airline.model.calculations.PassengerCapasityCalculation;
import ua.com.glprocamp.airline.model.entities.AirLine;

public class AirLineStatisticsService {


    public int calculateSeatingCapasity(AirLine airLine){

        return new PassengerCapasityCalculation().calculate(airLine);

    }

    public int calculateCarryingCapasity(AirLine airLine){

        return new CapasityCalculation().calculate(airLine);

    }





}
