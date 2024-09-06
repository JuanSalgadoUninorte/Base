package starter.practice.oop;

public class Animal {
    String name;
    String weight;

    public Animal(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}