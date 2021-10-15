package Collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FunPark implements Comparable<FunPark> {
    int id;
    String name;
    String city;
    byte numberOfWaterRides;
    byte numberOfDryRides;
    byte ageRestriction;

    static Scanner scanner = new Scanner(System.in);
    static TreeSet<FunPark> funParks = new TreeSet<>();

    public static void main(String[] args) {
        byte userChoice;
        char userWish;

        do {
            System.out.println("""
                    Enter
                    1 : To add details of a fun park
                    2 : To display details of all the fun parks
                    3 : To get details of a fun park by city
                    4 : To get details of a fun park by number of dry rides
                    5 : To get details of a fun park by number of water rides
                    6 : To update number of water rides in a fun park
                    7 : To update number of dry rides in a fun park
                    8 : To delete details of a fun park
                    """);

            userChoice = scanner.nextByte();

            // To clean up the buffer
            scanner.nextLine();

            switch (userChoice) {
                case 1 -> {
                    System.out.println("Details of how many fun parks you want to enter??");
                    byte n = scanner.nextByte();
                    scanner.nextLine();

                    if (n == 1) {
                        FunPark funPark = new FunPark();

                        System.out.println("Enter id for this fun park");
                        funPark.id = scanner.nextByte();
                        scanner.nextLine();


                        System.out.println("Enter name of the fun park");
                        funPark.name = scanner.nextLine();

                        System.out.println(
                                "Enter name of the city in which this " +
                                        "fun park is located");
                        funPark.city = scanner.nextLine();

                        System.out.println(
                                "Enter number of water rides present in this fun parks");
                        funPark.numberOfWaterRides = scanner.nextByte();
                        scanner.nextLine();

                        System.out.println(
                                "Enter the number of dry rides present in this fun park");
                        funPark.numberOfDryRides = scanner.nextByte();
                        scanner.nextLine();

                        System.out.println("Enter the age restrictions for this fun park");
                        funPark.ageRestriction = scanner.nextByte();
                        scanner.nextLine();

                        save(funPark);
                    } else {
                        Set<FunPark> set = new TreeSet<>();
                        for (int i = 0; i < n; i++) {
                            FunPark funPark = new FunPark();
                            System.out.println("Enter details for fun park " + (i + 1));
                            System.out.println("Enter id for this fun park");
                            funPark.id = scanner.nextByte();
                            scanner.nextLine();


                            System.out.println("Enter name of the fun park");
                            funPark.name = scanner.nextLine();

                            System.out.println("Enter name of the city in which " +
                                    "this fun park is located");
                            funPark.city = scanner.nextLine();

                            System.out.println(
                                    "Enter number of water rides present in " +
                                            "this fun parks");
                            funPark.numberOfWaterRides = scanner.nextByte();
                            scanner.nextLine();

                            System.out.println("Enter the number of dry rides " +
                                    "present in this fun park");
                            funPark.numberOfDryRides = scanner.nextByte();
                            scanner.nextLine();

                            System.out.println("Enter the age restrictions for " +
                                    "this fun park");
                            funPark.ageRestriction = scanner.nextByte();
                            scanner.nextLine();

                            set.add(funPark);
                        }
                        saveAll(set);
                    }
                }

                case 2 -> getAll();
                case 3 -> {
                    System.out.println("Enter city");
                    getFunParkByCity(scanner.nextLine());
                }
                case 4 -> {
                    System.out.println("Enter number of water rides you want");
                    getFunParkByNumberOfWaterRides(scanner.nextByte());
                    scanner.nextLine();
                }
                case 5 -> {
                    System.out.println("Enter number of dry rides you want");
                    getFunParkByNumberOfDryRides(scanner.nextByte());
                    scanner.nextLine();
                }
                case 6 -> {
                    System.out.println("Enter name of the park");
                    updateNumberOfWaterRides(scanner.nextLine());
                }
                case 7 -> {
                    System.out.println("Enter name of the park");
                    updateNumberOfDryRides(scanner.nextLine());
                }
                case 8 -> {
                    System.out.println("Enter name of the park");
                    deleteFunPark(scanner.nextLine());
                }

            }
            System.out.println("Enter Y/y to continue or any other character to exit");
            userWish = scanner.nextLine().charAt(0);
        } while (userWish == 'Y' || userWish == 'y');
    }

    static void save(FunPark funPark) {
        funParks.add(funPark);
    }

    static void saveAll(Set<FunPark> allFunPark) {
        funParks.addAll(allFunPark);
    }

    static void getAll() {
        funParks.forEach(funPark -> System.out.println("Id : " + funPark.id
                + "\tName : " + funPark.name
                + "\tCity : " + funPark.city
                + "\tNumber of water rides : " + funPark.numberOfWaterRides
                + "\tNumber of dry rides : " + funPark.numberOfDryRides
                + "\tAge restrictions : " + funPark.ageRestriction
        ));
    }

    static void getFunParkByCity(String city) {
        FunPark funPark = new FunPark();
        for (FunPark funPark1 : funParks) {
            if (funPark1.city.equalsIgnoreCase(city)) {
                funPark = funPark1;
                break;
            }
        }
        System.out.println("Id : " + funPark.id
                + "\tName : " + funPark.name
                + "\tCity : " + funPark.city
                + "\tNumber of water rides : " + funPark.numberOfWaterRides
                + "\tNumber of dry rides : " + funPark.numberOfDryRides
                + "\tAge restrictions : " + funPark.ageRestriction
        );

    }

    static void getFunParkByNumberOfWaterRides(byte numberOfWaterRides) {
        FunPark funPark = new FunPark();
        for (FunPark funPark1 : funParks) {
            if (funPark1.numberOfWaterRides == numberOfWaterRides) {
                funPark = funPark1;
                break;
            }
        }
        System.out.println("Id : " + funPark.id
                + "\tName : " + funPark.name
                + "\tCity : " + funPark.city
                + "\tNumber of water rides : " + funPark.numberOfWaterRides
                + "\tNumber of dry rides : " + funPark.numberOfDryRides
                + "\tAge restrictions : " + funPark.ageRestriction
        );
    }

    static void getFunParkByNumberOfDryRides(byte numberOfDryRides) {
        FunPark funPark = new FunPark();
        for (FunPark funPark1 : funParks) {
            if (funPark1.numberOfDryRides == numberOfDryRides) {
                funPark = funPark1;
                break;
            }
        }
        System.out.println("Id : " + funPark.id
                + "\tName : " + funPark.name
                + "\tCity : " + funPark.city
                + "\tNumber of water rides : " + funPark.numberOfWaterRides
                + "\tNumber of dry rides : " + funPark.numberOfDryRides
                + "\tAge restrictions : " + funPark.ageRestriction
        );
    }

    static void updateNumberOfDryRides(String name) {
        FunPark funPark = new FunPark();
        for (FunPark funPark1 : funParks) {
            if (funPark1.name.equalsIgnoreCase(name)) {
                funPark = funPark1;
                break;
            }
        }

        System.out.println("Enter update number of dry rides");
        funPark.numberOfDryRides = scanner.nextByte();
        scanner.nextLine();
    }

    static void updateNumberOfWaterRides(String name) {
        FunPark funPark = new FunPark();
        for (FunPark funPark1 : funParks) {
            if (funPark1.name.equalsIgnoreCase(name)) {
                funPark = funPark1;
                break;
            }
        }

        System.out.println("Enter update number of water rides");
        funPark.numberOfWaterRides = scanner.nextByte();
        scanner.nextLine();
    }

    static void deleteFunPark(String name) {
        FunPark funPark = new FunPark();
        for (FunPark funPark1 : funParks) {
            if (funPark1.name.equalsIgnoreCase(name)) {
                funPark = funPark1;
                break;
            }
        }
        funParks.remove(funPark);
        System.out.println("Details of the park deleted");

    }


    @Override
    public int compareTo(FunPark funPark) {
        return Integer.compare(id, funPark.id);
    }
}
