package ua.com.glprocamp.airline.controllers;

import ua.com.glprocamp.airline.model.entities.AirLine;
import ua.com.glprocamp.airline.model.services.AirlineService;

public class AirLineController {

    AirLine getAirline(){
        return new AirlineService().getAirlineCompany();
    }



}
