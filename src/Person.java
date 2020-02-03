public abstract class Person {

    private String name;

    public Person() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Driver extends Person {

    public Driver() {

    }

    public void setName(String driver) {
        super.setName(driver);
    }

    public String getName() {
        return super.getName();
    }
}

