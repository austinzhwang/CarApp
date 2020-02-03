public class Main {

    public static void main (String[] args) {
        Car c1 = new Car();
        c1.setColor("white");
        c1.setMake("BMW");

        c1.setSpeed(70);
        Car c2 = new Car("Audi", "black");
        c2.setSpeed(40);

        System.out.println(c1.start());
        System.out.println(c1.accelerate());
        System.out.println(c1.getSpeed());

        System.out.println(c2.start());
        System.out.println(c2.accelerate());
        System.out.println(c2.getSpeed());

        System.out.println(c2.stop());
        System.out.println(c1.pass(c2));

    }
}
