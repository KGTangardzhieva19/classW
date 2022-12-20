import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your lamp's wattage");
        int input = scanner.nextInt();
        Lamp lamp = new Lamp(input);
        String command = scanner.nextLine();
        lamp.switchLampOnOrOff();
    }
}