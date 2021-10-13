package CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPL {
    static Scanner scanner = new Scanner(System.in);
    static List<IPLObject> teams = new ArrayList<>();

    public static void main(String[] args) {
        byte userChoice;
        char userWish;
        do {
            System.out.println("Enter\n1 : To add data\n2 : To read data\n3 : To update\n");
            userChoice = scanner.nextByte();
            // To clean up buffer
            scanner.nextLine();
            switch (userChoice) {
                case 1 -> addData();
                case 2 -> readData();
                case 3 -> updateData();
                default -> System.out.println("Please enter a valid choice");
            }
            System.out.println("Enter Y/y to continue or enter any other character to exit");
            userWish = scanner.nextLine().charAt(0);
        } while (userWish == 'Y' || userWish == 'y');
    }

    static void addData() {
        IPLObject object = new IPLObject();

        System.out.println("Enter name of the team");
        object.setName(scanner.nextLine());

        System.out.println("Enter number of batsman");
        object.setNumberOfBatsman(scanner.nextByte());

        System.out.println("Enter number of bowlers");
        object.setNumberOfBowlers(scanner.nextByte());

        // To clean up the buffer
        scanner.nextLine();

        System.out.println("Enter name of the captain");
        object.setNameOfCaptain(scanner.nextLine());

        teams.add(object);
    }

    static void readData() {
        for (IPLObject object : teams)
            System.out.println("Name : " + object.getName() +
                    "\tNumber of batsman : " + object.getNumberOfBatsman() +
                    "\tNumber of Bowlers : " + object.getNumberOfBowlers() +
                    "\tName of the Captain : " + object.getNameOfCaptain()
            );
    }

    static void updateData() {
        System.out.println("Enter name of the team to be updated");
        String team = scanner.nextLine();

        boolean found = false;

        for (IPLObject object : teams) {
            if (object.getName().equalsIgnoreCase(team)) {
                teams.remove(object);
                found = true;
                break;
            }
        }
        if (found)
            addData();
        else System.out.println("Team not found");
    }


}

class IPLObject {
    String name;
    byte numberOfBatsman;
    byte numberOfBowlers;
    String nameOfCaptain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getNumberOfBatsman() {
        return numberOfBatsman;
    }

    public void setNumberOfBatsman(byte numberOfBatsman) {
        this.numberOfBatsman = numberOfBatsman;
    }

    public byte getNumberOfBowlers() {
        return numberOfBowlers;
    }

    public void setNumberOfBowlers(byte numberOfBowlers) {
        this.numberOfBowlers = numberOfBowlers;
    }

    public String getNameOfCaptain() {
        return nameOfCaptain;
    }

    public void setNameOfCaptain(String nameOfCaptain) {
        this.nameOfCaptain = nameOfCaptain;
    }
}
