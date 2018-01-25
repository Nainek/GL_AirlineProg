package ua.com.glprocamp.airline.model.entities.aircraft;

import ua.com.glprocamp.airline.model.entities.IBuilder;
import ua.com.glprocamp.airline.model.entities.MethodOfLift;
import ua.com.glprocamp.airline.model.entities.crew.Crew;

public class PassengerAirliner extends Airliner {


    private int quantityOfSitsForPassanger;
    private int luggageCompartmentCapacity;


    public int getQuantityOfSits() {
        return getQuantityOfSitsForCrew() + getQuantityOfSitsForPassanger();
    }


    public static class Builder implements IBuilder<Airliner> {
        PassengerAirliner airliner = new PassengerAirliner();

        public Builder setQuantityOfSitsForPassanger(int quantityOfSitsForPassanger) {
            airliner.quantityOfSitsForPassanger = quantityOfSitsForPassanger;
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

        public Builder setWeightCapasity(int weightCapasity) {
            airliner.setWeightCapasity(weightCapasity);
            return this;
        }

        public Builder setCargoCapasity(int cargoCapasity) {
            airliner.setCargoCapasity(cargoCapasity);
            return this;
        }

        public Airliner build() {
            return airliner;
        }
    }

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
        this.luggageCompartmentCapacity = luggageCompartmentCapacity;
    }



}
