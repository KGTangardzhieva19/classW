import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog(10, 12.5, "German Sheppard");

        List<Animal> animals = new ArrayList<>();

        animals.add(cat);
        animals.add(dog);

        cat.test();
    }
}