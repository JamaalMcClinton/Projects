// Jamaal McClinton

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        Pet pet2 = new Pet("Buster", "Dog", 11);
        System.out.println(pet2.toString());

        Pet pet3 = new Pet();

        System.out.println("Enter animal type:");
        pet3.setType(scnr.nextLine());

        System.out.println("Enter animal name:");
        pet3.setName(scnr.nextLine());

        System.out.println("Enter animal age:");
        pet3.setAge(scnr.nextInt());

        System.out.println(pet3.toString());
    }
}