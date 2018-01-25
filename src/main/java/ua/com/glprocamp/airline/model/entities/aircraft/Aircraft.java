package ua.com.glprocamp.airline.model.entities.aircraft;

import ua.com.glprocamp.airline.model.entities.IBuilder;
import ua.com.glprocamp.airline.model.entities.MethodOfLift;

public abstract class Aircraft {

    private MethodOfLift methodOfLift;
    private int flightRange;
    private int weightCapasity;
    private int cargoCapasity;


    public abstract int getCarryingCapasity();




    public MethodOfLift getMethodOfLift() {
        return methodOfLift;
    }

    public void setMethodOfLift(MethodOfLift methodOfLift) {
        this.methodOfLift = methodOfLift;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public int getWeightCapasity() {
        return weightCapasity;
    }

    public void setWeightCapasity(int weightCapasity) {
        this.weightCapasity = weightCapasity;
    }

    public int getCargoCapasity() {
        return cargoCapasity;
    }

    public void setCargoCapasity(int cargoCapasity) {
        this.cargoCapasity = cargoCapasity;
    }
}
