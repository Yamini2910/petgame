import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Owner owner = new Owner();
        Pet pet = null;
        System.out.println("Choose a Pet to interact with:");
        System.out.println("1- Fish");
        System.out.println("2- Bird");
        int choice = scanner.nextInt();
        if (choice == 1) {
            pet = new Fish(Color.BLUE);
        } else if (choice == 2) {
            pet = new Bird(Color.YELLOW);
        } else {
            System.out.println("Invalid choice");
            return;
        }
        while (true) {
            System.out.println("Choose from the following:");
            System.out.println("1- play");
            System.out.println("2- feed");
            System.out.println("3- make sound");
            System.out.println("4- view color");
            System.out.println("5- view hunger value");
            System.out.println("6- view happiness value");
            System.out.println("7- Exit");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    pet.play();
                    break;
                case 2:
                    pet.feed();
                    break;
                case 3:
                    pet.makeSound();
                    break;
                case 4:
                    System.out.println("Color: " + pet.getColor());
                    break;
                case 5:
                    System.out.println("Hunger level = " + owner.getHungerLevel(pet.getHungerValue()));
                    break;
                case 6:
                    System.out.println("Happiness level = " + owner.getHappinessLevel(pet.getHappinessValue()));
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

