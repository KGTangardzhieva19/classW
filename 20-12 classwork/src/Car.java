public class Car implements Vehicle {
    private double fuelQuantity;
    private double consumption;
    private static final double AIR_CONDITIONING_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double consumption) {
        this.fuelQuantity = fuelQuantity;
        this.consumption = consumption + AIR_CONDITIONING_ADDITIONAL_CONSUMPTION;
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = distance * this.consumption;
        if(fuelNeeded < this.fuelQuantity) {
            //can drive
            fuelQuantity = fuelQuantity - fuelNeeded;
            //fuelQuantity -= fuelNeeded;
            System.out.printf("Car travelled %.2f km%n", distance);
        } else {
            //can't drive
            System.out.println("Car needs refueling");
        }
    }

    @Override
    public void refuel(double fuel) {
        fuelQuantity = fuelQuantity + fuel;
        //fuelQuantity += fuel;
    }
}