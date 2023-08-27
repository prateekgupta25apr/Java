package Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DTO {
    static List<Scientist> scientists = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        byte userChoice;
        char userWish;

        do {
            System.out.println("""
                    Enter
                    1 : To add details for a scientist
                    2 : To read details of all the scientists
                    3 : To search for a scientist
                    4 : To update the role of a scientist
                    5 : To delete a details of a scientist
                    """);
            userChoice = scanner.nextByte();
            // To clean the buffer
            scanner.nextLine();
            switch (userChoice) {
                case 1 -> {
                    Address address = new Address();
                    Scientist scientist = new Scientist();

                    System.out.println("Enter name of the scientist");
                    scientist.setName(scanner.nextLine());

                    System.out.println("Enter experience of the scientist in years");
                    scientist.setYearOfExperience(scanner.nextByte());

                    // To clean the buffer
                    scanner.nextLine();

                    System.out.println("Enter role of the scientist");
                    scientist.setRole(scanner.nextLine());

                    System.out.println("Enter type of the scientist");
                    scientist.setType(scanner.nextLine());

                    System.out.println("Enter scientist's address");
                    System.out.println("Enter house no.");
                    address.setHouseNo(scanner.nextShort());

                    // To clean up the buffer
                    scanner.nextLine();

                    System.out.println("Enter area");
                    address.setArea(scanner.nextLine());

                    System.out.println("Enter city");
                    address.setCity(scanner.nextLine());

                    System.out.println("Enter state");
                    address.setState(scanner.nextLine());

                    System.out.println("Enter country");
                    address.setCountry(scanner.nextLine());

                    System.out.println("Enter pin code");
                    address.setPinCode(scanner.nextInt());

                    // To clean up the buffer
                    scanner.nextLine();

                    scientist.setAddress(address);

                    if (save(scientist))
                        System.out.println("Details of the Scientist added successfully");
                    else System.out.println("Adding details of the scientist failed");

                }
                case 2 -> getAll();
                case 3 -> {
                    System.out.println("Enter the name of scientist");
                    Scientist scientist = getByName(scanner.nextLine());

                    System.out.println("Name : " + scientist.getName() +
                            "\tYear of Experience : " + scientist.getYearOfExperience() +
                            "\tRole : " + scientist.getRole() +
                            "\tType : " + scientist.getType() +
                            "\nAddress : " +
                            "\nHouse No. : " + scientist.getAddress().getHouseNo() +
                            "\nArea : " + scientist.getAddress().getArea() +
                            "\nCity : " + scientist.getAddress().getCity() +
                            "\nState : " + scientist.getAddress().getState() +
                            "\nCountry : " + scientist.getAddress().getCountry() +
                            "\nPin code : " + scientist.getAddress().getPinCode());
                }
                case 4 -> {
                    System.out.println(
                            "Enter the name of the scientist whose role is to be updated");
                    if (updateRoleByName(scanner.nextLine()))
                        System.out.println("Role updated");
                    else {
                        System.out.println("Role update failed");
                    }
                }
                case 5 -> {
                    System.out.println(
                            "Enter the name of the scientist whose details os to be deleted");
                    if (deleteByName(scanner.nextLine()))
                        System.out.println("Details of Scientist deleted successfully");
                    else {
                        System.out.println("Deletion of scientist's details failed");
                    }
                }

            }

            System.out.println("Enter Y/y to continue or any other character to exit");
            userWish = scanner.nextLine().charAt(0);

        } while (userWish == 'Y' || userWish == 'y');
    }

    static boolean save(Scientist scientist) {
        scientists.add(scientist);
        return true;
    }

    static void getAll() {
        for (Scientist scientist : scientists) {
            System.out.println("Name : " + scientist.getName() +
                    "\tYear of Experience : " + scientist.getYearOfExperience() +
                    "\tRole : " + scientist.getRole() +
                    "\tType : " + scientist.getType() +
                    "\nAddress" +
                    "\nHouse No. : " + scientist.getAddress().getHouseNo() +
                    "\nArea : " + scientist.getAddress().getArea() +
                    "\nCity : " + scientist.getAddress().getCity() +
                    "\nState : " + scientist.getAddress().getState() +
                    "\nCountry : " + scientist.getAddress().getCountry() +
                    "\nPin code : " + scientist.getAddress().getPinCode());
        }
    }

    static Scientist getByName(String name) {
        Scientist scientist = null;

        for (Scientist scientist1 : scientists) {
            if (scientist1.getName().equalsIgnoreCase(name)) {
                scientist = scientist1;
                break;
            }
        }

        return scientist;
    }

    static boolean updateRoleByName(String name) {
        Scientist scientist = null;

        for (Scientist scientist1 : scientists) {
            if (scientist1.getName().equalsIgnoreCase(name)) {
                scientist = scientist1;
                break;
            }
        }

        if (scientist != null) {
            System.out.println("Enter new role for the scientist");
            scientist.setRole(scanner.nextLine());
            return true;
        }
        return false;
    }

    static boolean deleteByName(String name) {
        Scientist scientist = null;

        for (Scientist scientist1 : scientists) {
            if (scientist1.getName().equalsIgnoreCase(name)) {
                scientist = scientist1;
                break;
            }
        }

        if (scientist != null) {
            scientists.remove(scientist);
            return true;
        }
        return false;
    }
}

class Scientist {
    String name;
    byte yearOfExperience;
    String role;
    String type;
    Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(byte yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

class Address {
    short houseNo;
    String area;
    String city;
    String state;
    String country;
    int pinCode;

    public short getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(short houseNo) {
        this.houseNo = houseNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}