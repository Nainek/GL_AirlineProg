package ua.com.glprocamp.airline.model.entities;

public class PassengerAirliner extends Airliner {


    private int quantityOfSitsForPassanger;
    private int luggageСompartmentCapasity;


    public int getCarryingCapasity() {
        return luggageСompartmentCapasity;
    }

    public int getQuantityOfSitsForPassanger() {
        return quantityOfSitsForPassanger;
    }

    public void setQuantityOfSitsForPassanger(int quantityOfSitsForPassanger) {
        this.quantityOfSitsForPassanger = quantityOfSitsForPassanger;
    }

    public int getLuggageСompartmentCapasity() {
        return luggageСompartmentCapasity;
    }

    public void setLuggageСompartmentCapasity(int luggageСompartmentCapasity) {
        this.luggageСompartmentCapasity = luggageСompartmentCapasity;
    }

    public int getQuantityOfSits() {
        return getQuantityOfSitsForCrew() + getQuantityOfSitsForPassanger();
    }


}
