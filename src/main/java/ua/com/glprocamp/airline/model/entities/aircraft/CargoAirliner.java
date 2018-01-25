package ua.com.glprocamp.airline.model.entities.aircraft;

import ua.com.glprocamp.airline.model.entities.IBuilder;
import ua.com.glprocamp.airline.model.entities.MethodOfLift;
import ua.com.glprocamp.airline.model.entities.crew.Crew;

public class CargoAirliner extends Airliner {

    private int cargoHoldCapasity;


    public static class Builder implements IBuilder<Airliner> {
        CargoAirliner airliner = new CargoAirliner();

        public Builder setQuantityOfSitsForPassanger(int cargoHoldCapasity) {
            airliner.cargoHoldCapasity = cargoHoldCapasity;
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


        public Airliner build() {
            return airliner;
        }
    }

    private CargoAirliner(){

    }


    public int getCargoHoldCapasity() {
        return cargoHoldCapasity;
    }

    public void setCargoHoldCapasity(int cargoHoldCapasity) {
        this.cargoHoldCapasity = cargoHoldCapasity;
    }

    public int getCarryingCapasity() {
        return cargoHoldCapasity;
    }
}
