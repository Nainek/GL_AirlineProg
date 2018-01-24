package ua.com.glprocamp.airline.model.entities;

public class PassengerAirliner extends Airliner {

    private int quantityOfSitsForPassanger;

    public int getQuantityOfSitsForPassanger() {
        return quantityOfSitsForPassanger;
    }

    public void suantityOfSitsForPassanger(int quantityOfSitsForPassanger) {
        this.quantityOfSitsForPassanger = quantityOfSitsForPassanger;
    }
}
