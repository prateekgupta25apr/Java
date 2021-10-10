package CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Country {
    static Scanner scanner = new Scanner(System.in);
    static List<CountryObject> countries =new ArrayList<>();

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
        CountryObject object = new CountryObject();
        System.out.println("Enter name of the country");
        object.setName(scanner.nextLine());

        System.out.println("Enter population of the country (in Cr)");
        object.setPopulation(scanner.nextShort());

        // To clean up the buffer
        scanner.nextLine();

        System.out.println("Enter capital of the country");
        object.setCapital(scanner.nextLine());

        System.out.println("Enter name of the continent in which country is located");
        object.setContinent(scanner.nextLine());

        countries.add(object);
    }

    static void readData() {
        for (CountryObject object : countries)
            System.out.println("Name : " + object.getName() +
                    "\tPopulation : " + object.getPopulation() +
                    "\tCapital : " + object.getCapital() +
                    "\tContinent : " + object.getContinent()
            );
    }

    static void updateData() {
        System.out.println("Enter the name of the country to be updated");
        String country=scanner.nextLine();

        boolean found=false;

        for (CountryObject object:countries){
            if (object.getName().equalsIgnoreCase(country)){
                countries.remove(object);
                found=true;
                break;}
        }
        if (found)
        addData();
        else System.out.println("Country not found");
    }
}

class CountryObject {
    String name;
    short population;
    String capital;
    String continent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getPopulation() {
        return population;
    }

    public void setPopulation(short population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
