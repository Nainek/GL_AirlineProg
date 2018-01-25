package ua.com.glprocamp.airline.model.entities.aircraft;

import ua.com.glprocamp.airline.model.entities.crew.Crew;

public abstract class Airliner extends Aircraft {

    private int quantityOfSitsForCrew;
    private Crew crew;
    private int fuelConsumption;

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getQuantityOfSitsForCrew() {
        return quantityOfSitsForCrew;
    }

    public void setQuantityOfSitsForCrew(int quantityOfSitsForCrew) {
        this.quantityOfSitsForCrew = quantityOfSitsForCrew;
    }

    public int getQuantityOfSits() {
        return quantityOfSitsForCrew;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Airliner " +
                "quantityOfSitsForCrew=" + quantityOfSitsForCrew +
                ", crew=" + crew +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
