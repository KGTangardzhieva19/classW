public class Car {
    String brand;
    String model;

    void start(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
        System.out.println("The brand of the car is " + brand + " and the model is " + model);
    }
}
