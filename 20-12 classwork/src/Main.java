import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        // Car 15 0.3
        Vehicle car;

        String[] firstTokens = firstInput.split("\\s+");
        checkAndCreateVehicle(firstTokens);

        //Truck 100 .09
        String[] secondTokens = scanner.nextLine().split("\\s+");
        checkAndCreateVehicle(secondTokens);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++)
        {
            String command = scanner.nextLine();
            //Drive Car 9
            String[] tokens = command.split("\\s+");
            String verb = tokens[0];
            String vehicle = tokens[1];

            if (verb.equals("Drive"))
            {
                // drive
            }
            else if (verb.equals("Refuel")) {
                // refuel
            }
            else {
                System.out.println("invalid input");
            }
        }
    }

    public static void checkAndCreateVehicle(String[] firstTokens) {
        if (firstTokens[0].equals("Car")) {
            Vehicle car = new Car(Double.parseDouble(firstTokens[1]),
                    Double.parseDouble(firstTokens[2]));
        }
        else if (firstTokens[0].equals("Truck")) {
            Vehicle truck = new Truck(Double.parseDouble(firstTokens[1]),
                    Double.parseDouble((firstTokens[2]))) {
            };
        }
        else {
            System.out.println("Invalid input");
        }
    }
}