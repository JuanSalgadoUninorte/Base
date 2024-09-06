package starter;

import starter.practice.oop.Doctor;
import starter.practice.oop.Patient;

public class Main {
    public static void main(String[] args) {

        /*Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);

        circulo.imprimirInformacion();
        System.out.println("Área del círculo: " + circulo.calcularArea());

        rectangulo.imprimirInformacion();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());*/
        //Doctor Juan = new Doctor(1, "Optimus Prime Junior", "Madrazos");
        //Doctor Juan2 = new Doctor("Optimus Prime Junior", "Madrazos");

        /*Doctor Juan = new Doctor("Optimus Prime Junior", "Madrazos");
        Juan.showId();
        Juan.showName();
        Juan.showSpeciality();

        Doctor Goku = new Doctor("Goku", "Madrazos");
        Goku.showId();
        Goku.showName();
        Goku.showSpeciality();

        //UIMenu.showPatientMenu();

        //Patient patient = new Patient("Alejandra", "hola@test.com");


        Patient myPatient = new Patient("Mario Briceño Iragorri", "m@gmail.com");
        Patient myPatient2 = new Patient("Juan Daniel Galindo", "babyShark@gmail.com");

        System.out.println("--Before reassign--");

        System.out.println(myPatient.getName());
        System.out.println(myPatient2.getName());

        System.out.println("\n --After reassign--");


        myPatient2 = myPatient;


        System.out.println(myPatient.getName());
        System.out.println(myPatient2.getName());

        Animal cat = new Animal("Cat");
        cat.eat();

        Animal dog = new Animal("Dog");
        dog.eat();*/
        Doctor doc1 = new Doctor("Optimus Prime Junior", "Madrazos");
        Patient patient1 = new Patient("Mario Briceño Iragorri", "test@test.com");
        System.out.println(patient1.getName());

    }
}