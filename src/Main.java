import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Car> cars = new ArrayList<>();

        String make, color, q;

        Car c1 = new Car();
        Driver d1 = new Driver();
        d1.setName("Driver 1");
        c1.setColor("white");
        c1.setMake("BMW");

        c1.setSpeed(70);
        Car c2 = new Car("Audi", "black");
        c2.setSpeed(40);

        System.out.println(c1.drivenBy(d1));
        System.out.println(c1.start());
        System.out.println(c1.accelerate());
        System.out.println(c1.getSpeed());

        System.out.println(c2.start());
        System.out.println(c2.accelerate());
        System.out.println(c2.getSpeed());

        System.out.println(c2.stop());
        System.out.println(c1.pass(c2));

        System.out.println();
        while (true) {
            System.out.print("Enter a make: ");
            make = in.nextLine();
            System.out.print("Enter a color: ");
            color = in.nextLine();
            cars.add(new Car(make, color));
            System.out.print("Would you like to add another car? (Y/N): ");
            q = in.nextLine();
            if (!q.equalsIgnoreCase("y")) {
                break;
            }
        }

        for (Car car : cars) {
            System.out.println(car.getDescription());
        }

        in.close();
    }
}
