package ua.com.glprocamp.airline.model.entities.aircraft;

import ua.com.glprocamp.airline.model.entities.IBuilder;
import ua.com.glprocamp.airline.model.entities.MethodOfLift;

public abstract class Aircraft {

    private MethodOfLift methodOfLift;
    private int flightRange;
    private int weightCapacity;


    public abstract int getCarryingCapacity();




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

    public int getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(int weightCapasity) {
        this.weightCapacity = weightCapacity;
    }


    @Override
    public String toString() {
        return "Aircraft{" +
                "methodOfLift=" + methodOfLift +
                ", flightRange=" + flightRange +
                ", weightCapacity=" + weightCapacity +
                '}';
    }
}
