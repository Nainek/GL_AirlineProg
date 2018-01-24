package ua.com.glprocamp.airline.model.entities;

public abstract class Aircraft {

    private MethodOfLift methodOfLift;
    private int flightRange;

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
}
