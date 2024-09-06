package starter.practice.oop;

public class Duck extends Animal {
    int wings;

    public Duck(String name, String weight, int wings) {
        super(name, weight);
        this.wings = wings;
    }

    public Duck(String name, int wings) {
        super(name);
        this.wings = wings;
    }

    public Duck(String name) {
        super(name);
    }
}
