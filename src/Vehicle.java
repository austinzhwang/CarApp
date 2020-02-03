public abstract class Vehicle {

    private String make;
    private String color;
    private int speed;

    public Vehicle() {

    }

    public Vehicle(String make, String color) {
        this.make = make;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeed() {
        return "is going " + speed + " mph";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String start() {
        return "is starting";
    }

    public String accelerate() {
        return "is accelerating";
    }

    public String stop() {
        return "is stopped";
    }

    public String pass(Vehicle v) {
        return "just passed the " + v.getColor() + " " + v.getMake();
    }
}
