package ua.com.glprocamp.airline.model.services;

import ua.com.glprocamp.airline.model.entities.MethodOfLift;
import ua.com.glprocamp.airline.model.entities.aircraft.Airliner;
import ua.com.glprocamp.airline.model.entities.aircraft.CargoAirliner;
import ua.com.glprocamp.airline.model.entities.aircraft.PassengerAirliner;
import ua.com.glprocamp.airline.model.entities.airline.AirLine;
import ua.com.glprocamp.airline.model.entities.crew.Crew;

import java.util.Arrays;
import java.util.List;

public class CreationService {

    AirLine airLine;
    List<Airliner> airlinerList;


    public void createAirLineCompanyWithAirliners(){
        createAircraftsForAirline();
        airLine = new AirLine.Builder()
                .setAirliners(airlinerList)
                .build();

    }

    public void createAircraftsForAirline(){
        Crew crew = new Crew.Builder()
                .setPersonal(Arrays.asList("First Stewardess", "Second Stewardess"))
                .setPilot("Best Pilot").build();

        Airliner airliner1 = new PassengerAirliner.Builder()
                .setFlightRange(100)
                .setFuelConsumption(500)
                .setLuggageCompartmentCapacity(5)
                .setMethodOfLift(MethodOfLift.FIXEDWING)
                .setQuantityOfSitsForCrew(5)
                .setQuantityOfSitsForPassenger(102)
                .setWeightCapacity(130000)
                .setCrew(crew)
                .build();

        Airliner airliner2 = new PassengerAirliner.Builder()
                .setFlightRange(120)
                .setFuelConsumption(400)
                .setLuggageCompartmentCapacity(10)
                .setMethodOfLift(MethodOfLift.FIXEDWING)
                .setQuantityOfSitsForCrew(6)
                .setQuantityOfSitsForPassenger(70)
                .setWeightCapacity(100000)
                .setCrew(crew)
                .build();

        Airliner airliner3 = new CargoAirliner.Builder()
                .setFlightRange(110)
                .setFuelConsumption(700)
                .setMethodOfLift(MethodOfLift.FIXEDWING)
                .setQuantityOfSitsForCrew(3)
                .setCargoHoldCapacity(160000)
                .setWeightCapacity(190000)
                .setCrew(crew)
                .build();

        airlinerList.addAll(Arrays.asList(airliner1,airliner2,airliner3));
    }




    public void setAirLine(AirLine airLine) {
        this.airLine = airLine;
    }

    public AirLine getAirLineCompany(){
        return airLine;
    }

}
