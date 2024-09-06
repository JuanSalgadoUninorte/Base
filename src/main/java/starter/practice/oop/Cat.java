package starter.practice.oop;

public class Cat extends Animal {
    public Cat(String name, String weight) {
        super(name, weight);
    }

    public void meow() {
        System.out.println(name + " says meow");
    }
}
