package starter.user;

public class Doctor extends User{
    // Attributes
    private String speciality;

    //Constructor method
    Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del doctor asignado es: "+name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void showSpeciality(){

    }
}
