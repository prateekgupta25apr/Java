package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gun {
    String name;
    String metalOfBarrel;
    String gunPowder;
    String model;
    String manufacturer;
    long serialNumber;

    static Scanner scanner = new Scanner(System.in);
    static LinkedList<Gun> guns = new LinkedList<>();

    public static void main(String[] args) {
        byte userChoice;
        char userWish;
        do {
            System.out.println("""
                    Enter
                    1 : To add details of a gun
                    2 : To display details of all guns
                    3 : To get details of a gun by manufacturer
                    4 : To get details of a gun by gun powder
                    5 : To get details of a gun by metal of barrel
                    6 : To update gun powder of a gun
                    7 : To update metal of barrel of a gun
                    8 : To delete details of a gun
                    """);
            userChoice = scanner.nextByte();

            // To clean up the buffer
            scanner.nextLine();

            switch (userChoice) {
                case 1-> {
                    System.out.println("Details of how many guns you want to enter??");
                    byte n = scanner.nextByte();
                    scanner.nextLine();
                    if (n == 1) {
                        Gun gun = new Gun();
                        System.out.println("Enter name of the gun");
                        gun.name = scanner.nextLine();

                        System.out.println("Enter model of the gun");
                        gun.model = scanner.nextLine();

                        System.out.println("Enter manufacturer of the gun");
                        gun.manufacturer = scanner.nextLine();

                        System.out.println("Enter metal of barrel of the gun");
                        gun.metalOfBarrel = scanner.nextLine();

                        System.out.println("Enter gun powder used in gun");
                        gun.gunPowder = scanner.nextLine();

                        System.out.println("Enter serial number of the gun");
                        gun.serialNumber = scanner.nextLong();
                        scanner.nextLine();
                        save(gun);
                    } else {
                        List<Gun> guns = new ArrayList<>();
                        for (int i = 0; i < n; i++) {
                            Gun gun = new Gun();
                            System.out.println("Enter details of gun " + (i + 1));
                            System.out.println("Enter name of the gun");
                            gun.name = scanner.nextLine();

                            System.out.println("Enter model of the gun");
                            gun.model = scanner.nextLine();

                            System.out.println("Enter manufacturer of the gun");
                            gun.manufacturer = scanner.nextLine();

                            System.out.println("Enter metal of barrel of the gun");
                            gun.metalOfBarrel = scanner.nextLine();

                            System.out.println("Enter gun powder used in gun");
                            gun.gunPowder = scanner.nextLine();

                            System.out.println("Enter serial number of the gun");
                            gun.serialNumber = scanner.nextLong();
                            scanner.nextLine();

                            guns.add(gun);
                        }

                        saveAll(guns);
                    }
                }
                case 2->
                    getAll();
                case 3-> {
                    System.out.println("Enter manufacturer name");
                    getGunByManufacturer(scanner.nextLine());
                }
                case 4-> {
                    System.out.println("Enter gun powder name");
                    getGunByGunPowder(scanner.nextLine());
                }
                case 5-> {
                    System.out.println("Enter metal name for barrel");
                    getGUnByMetalOfBarrel(scanner.nextLine());
                }
                case 6-> {
                    System.out.println("Enter name of the gun");
                    updateGunPowder(scanner.nextLine());
                }
                case 7-> {
                    System.out.println("Enter name of the gun");
                    updateMetalOfBarrel(scanner.nextLine());
                }
                case 8-> {
                    System.out.println("Enter name of the gun");
                    deleteGun(scanner.nextLine());
                }
            }

            System.out.println("Enter Y/y to continue or any other character to exit");
            userWish = scanner.nextLine().charAt(0);
        } while (userWish == 'Y' || userWish == 'y');
    }

    static void save(Gun gun) {
        guns.add(gun);
    }

    static void saveAll(List<Gun> allGuns) {
        guns.addAll(allGuns);
    }

    static void getAll() {
        guns.forEach(gun -> System.out.println("Name : " + gun.name
                + "\tModel : " + gun.model
                + "\tManufacturer : " + gun.manufacturer
                + "\tMetal of barrel : " + gun.metalOfBarrel
                + "\tGun powder : " + gun.gunPowder
                + "\tSerial number : " + gun.serialNumber
        ));
    }

    static void getGunByManufacturer(String manufacturer) {
        Gun gun = new Gun();
        for (Gun gun1 : guns) {
            if (gun1.manufacturer.equalsIgnoreCase(manufacturer)) {
                gun = gun1;
                break;
            }
        }
        System.out.println("Name : " + gun.name
                + "\tModel : " + gun.model
                + "\tManufacturer : " + gun.manufacturer
                + "\tMetal of barrel : " + gun.metalOfBarrel
                + "\tGun powder : " + gun.gunPowder
                + "\tSerial number : " + gun.serialNumber
        );
    }

    static void getGunByGunPowder(String gunPowder) {
        Gun gun = new Gun();
        for (Gun gun1 : guns) {
            if (gun1.gunPowder.equalsIgnoreCase(gunPowder)) {
                gun = gun1;
                break;
            }
        }
        System.out.println("Name : " + gun.name
                + "\tModel : " + gun.model
                + "\tManufacturer : " + gun.manufacturer
                + "\tMetal of barrel : " + gun.metalOfBarrel
                + "\tGun powder : " + gun.gunPowder
                + "\tSerial number : " + gun.serialNumber
        );
    }

    static void getGUnByMetalOfBarrel(String metalOfBarrel) {
        Gun gun = new Gun();
        for (Gun gun1 : guns) {
            if (gun1.metalOfBarrel.equalsIgnoreCase(metalOfBarrel)) {
                gun = gun1;
                break;
            }
        }
        System.out.println("Name : " + gun.name
                + "\tModel : " + gun.model
                + "\tManufacturer : " + gun.manufacturer
                + "\tMetal of barrel : " + gun.metalOfBarrel
                + "\tGun powder : " + gun.gunPowder
                + "\tSerial number : " + gun.serialNumber
        );
    }

    static void deleteGun(String name) {
        Gun gun = new Gun();
        for (Gun gun1 : guns) {
            if (gun1.name.equalsIgnoreCase(name)) {
                gun = gun1;
                break;
            }
        }
        guns.remove(gun);
    }

    static void updateGunPowder(String name) {
        Gun gun = new Gun();
        for (Gun gun1 : guns) {
            if (gun1.name.equalsIgnoreCase(name)) {
                gun = gun1;
                break;
            }
        }

        System.out.println("Enter name of updated gun powder");
        gun.gunPowder = scanner.nextLine();
    }

    static void updateMetalOfBarrel(String name) {
        Gun gun = new Gun();
        for (Gun gun1 : guns) {
            if (gun1.name.equalsIgnoreCase(name)) {
                gun = gun1;
                break;
            }
        }

        System.out.println("Enter name of updated metal of barrel");
        gun.metalOfBarrel = scanner.nextLine();
    }
}
