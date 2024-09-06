package starter.practice.oop;

import java.util.Scanner;

public class UIMenu {
    public static void showMenu() {

        System.out.println("Welcome to My Appointments");
        System.out.println("Select an option");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    System.out.println("Patient");
                    break;
                case 0:
                    System.out.println("Thanks for your visit");
                    break;
                default:
                    System.out.println("Select a valid option");
            }
        } while (response != 0);
    }

    public static void showPatientMenu() {

        int response = 0;
        do {
            System.out.println("\n");
            System.out.println("Patient");
            System.out.println("1. Reserve an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Turn back");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Reserve an appointment");
                    break;
                case 2:
                    System.out.println("My appointments");
                    break;
                case 0:
                    showMenu();
                default:
                    System.out.println("Select a valid option");

            }
        } while (response != 0);

    }
}