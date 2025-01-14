package starter.practice.oop;

public class Patient {
    public String name;
    public String email;
    public String address;
    public String phoneNumber;
    public String birthday;
    public double weight;
    public double height;
    public String blood;

    public Patient(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getWeight() {
        return weight + " kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
