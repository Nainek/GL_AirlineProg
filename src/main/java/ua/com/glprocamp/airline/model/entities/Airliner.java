package ua.com.glprocamp.airline.model.entities;

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
}
