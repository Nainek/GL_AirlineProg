package ua.com.glprocamp.airline.model.entities.aircraft;

import ua.com.glprocamp.airline.model.entities.IBuilder;
import ua.com.glprocamp.airline.model.entities.MethodOfLift;
import ua.com.glprocamp.airline.model.entities.crew.Crew;

public class PassengerAirliner extends Airliner {


    private int quantityOfSitsForPassenger;
    private int luggageCompartmentCapacity;


    public int getQuantityOfSits() {
        return getQuantityOfSitsForCrew() + getQuantityOfSitsForPassenger();
    }

    public static class Builder implements IBuilder<Airliner> {
        PassengerAirliner airliner = new PassengerAirliner();

        public Builder setQuantityOfSitsForPassenger(int quantityOfSitsForPassenger) {
            airliner.quantityOfSitsForPassenger = quantityOfSitsForPassenger;
            return this;
        }

        public Builder setLuggageCompartmentCapacity(int luggageCompartmentCapacity) {
            airliner.luggageCompartmentCapacity = luggageCompartmentCapacity;
            return this;
        }

        public Builder setCrew(Crew crew) {
            airliner.setCrew(crew);
            return this;
        }

        public Builder setFuelConsumption(int fuelConsumption) {
            airliner.setFuelConsumption(fuelConsumption);
            return this;
        }

        public Builder setQuantityOfSitsForCrew(int quantityOfSitsForCrew) {
            airliner.setQuantityOfSitsForCrew(quantityOfSitsForCrew);
            return this;
        }

        public Builder setMethodOfLift(MethodOfLift methodOfLift) {
            airliner.setMethodOfLift(methodOfLift);
            return this;
        }

        public Builder setFlightRange(int flightRange) {
            airliner.setFlightRange(flightRange);
            return this;
        }

        public Builder setWeightCapacity(int weightCapacity) {
            airliner.setWeightCapacity(weightCapacity);
            return this;
        }

        public Airliner build() {
            return airliner;
        }
    }

    public int getCarryingCapacity() {
        return luggageCompartmentCapacity;
    }

    public int getQuantityOfSitsForPassenger() {
        return quantityOfSitsForPassenger;
    }

    public void setQuantityOfSitsForPassenger(int quantityOfSitsForPassenger) {
        this.quantityOfSitsForPassenger = quantityOfSitsForPassenger;
    }

    public int getLuggageCompartmentCapacity() {
        return luggageCompartmentCapacity;
    }

    public void setLuggageCompartmentCapacity(int luggageCompartmentCapacity) {
        this.luggageCompartmentCapacity = luggageCompartmentCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "PassengerAirliner " +
                "quantityOfSitsForPassenger=" + quantityOfSitsForPassenger +
                ", luggageCompartmentCapacity=" + luggageCompartmentCapacity +
                "}\n";
    }

}
