package starter.practice.oop;

public class Doctor {
    // Attributes
    static int id = 0;  // Autoincrement
    public String name;
    public String speciality;


    public Doctor(String name, String speciality) {
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    // Constructor method
    public Doctor() {
        System.out.println("Constructing Doctor Object");
        id++;
    }

    // Behaviours
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }

    public void showSpeciality() {
        System.out.println("Doctor speciality: " + speciality);
    }
}
    /*public int id;
    public String name;
    public String speciality;

    public Doctor() {
    }

    public Doctor(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }

    public void showName(){
        System.out.println("Nombre: "+name);
    }

    public void showId(){
        System.out.println("Su id es: "+id);
    }

    public void showSpeciality(){
        System.out.println("Su especialidad es: "+speciality);
    }
}
*/