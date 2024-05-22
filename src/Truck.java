public class Truck extends Vehicle{
    double milesDriven;
    double fuelConsumed;
    double cargoWeight;

    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateEfficiency() {
        return milesDriven / (fuelConsumed + cargoWeight * 0.5);
    }
}