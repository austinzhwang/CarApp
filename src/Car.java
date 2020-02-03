public class Car extends Vehicle {

    public Car() {
        super();
    }

    public Car(String make, String color) {
        super(make, color);
    }

    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    public String getSpeed() {
        return toString() + super.getSpeed() + "";
    }

    public String start() {
        return toString() + super.start();
    }

    public String accelerate() {
        return toString() + super.accelerate();
    }

    public String stop() {
        return toString() + super.stop();
    }

    public String pass(Car c) {
        return toString() + super.pass(c);
    }

    public String toString() {
        return "The " + super.getColor() + " " + super.getMake() + " ";
    }

    public String getDescription() {
        return "Make: " + super.getMake() + " Color: " + super.getColor();
    }

    public String drivenBy(Driver driver) {
        return toString() + " is being driven by " + driver.getName();
    }


}
