package ua.com.glprocamp.airline.model.entities.aircraft;

public class PassengerAirliner extends Airliner {


    private int quantityOfSitsForPassanger;
    private int luggageCompartmentCapacity;


    public int getCarryingCapasity() {
        return luggageCompartmentCapacity;
    }

    public int getQuantityOfSitsForPassanger() {
        return quantityOfSitsForPassanger;
    }

    public void setQuantityOfSitsForPassanger(int quantityOfSitsForPassanger) {
        this.quantityOfSitsForPassanger = quantityOfSitsForPassanger;
    }

    public int getLuggageCompartmentCapacity() {
        return luggageCompartmentCapacity;
    }

    public void setLuggageCompartmentCapacity(int luggageCompartmentCapacity) {
        this.luggageCompartmentCapacity = this.luggageCompartmentCapacity;
    }

    public int getQuantityOfSits() {
        return getQuantityOfSitsForCrew() + getQuantityOfSitsForPassanger();
    }


}
