package ExceptionHandling;

import java.util.Scanner;

public class CommonException {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        byte userChoice;
        char userWish;
        do {
            System.out.println("""
                    **Welcome to Exception Testing**
                    Enter
                    1.StackoverflowException
                    2.ArrayIndexOutOfBoundsException
                    3.StringIndexOutOfBoundsException
                    4.InputMismatchException
                    5.NullPointerException
                    6.ArithmeticException
                    7.NumberFormatException
                    """);
            userChoice = scanner.nextByte();

            // To clean up the buffer
            scanner.nextLine();

            switch (userChoice) {
                case 1 -> produceStackoverflowException(1);
                case 2 -> produceArrayIndexOutOfBoundsException();
                case 3 -> produceStringIndexOutOfBoundsException();
                case 4 -> produceInputMismatchException();
                case 5 -> produceNullPointerException();
                case 6 -> produceArithmeticException();
                case 7 -> produceNumberFormatException();
            }
            System.out.println("Enter Y/y to continue or any other character to exit");
            userWish = scanner.nextLine().charAt(0);
        } while (userWish == 'Y' || userWish == 'y');
    }

    static void produceStackoverflowException(int i) {
        produceStackoverflowException(++i);
    }

    static void produceArrayIndexOutOfBoundsException() {
        int[] a = {1};
        for (int i = 0; i <= a.length; i++)
            System.out.println(a[i]);
    }

    static void produceStringIndexOutOfBoundsException() {
        String s = "prateek";
        System.out.println(s.charAt(25));

    }

    static void produceInputMismatchException() {
        System.out.println("Enter your name");
        int i = scanner.nextInt();

    }

    static void produceNullPointerException() {
        String s = null;
        System.out.println(s.charAt(0));

    }

    static void produceArithmeticException() {
        int i = 25 / 0;

    }

    static void produceNumberFormatException() {
        int i = Integer.parseInt("prateek");
    }
}
