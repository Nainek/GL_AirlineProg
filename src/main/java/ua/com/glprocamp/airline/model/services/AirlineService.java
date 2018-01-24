package ua.com.glprocamp.airline.model.services;

import ua.com.glprocamp.airline.model.entities.AirLine;

public class AirlineService {


    public AirLine getAirlineCompany(){

        return new CreationService().getAirLineCompany();

    }
}
