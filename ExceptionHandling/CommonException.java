package ExceptionHandling;

import java.util.InputMismatchException;
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
        try {
            produceStackoverflowException(++i);
        } catch (StackOverflowError stackOverflowError) {
            System.err.println(stackOverflowError.getMessage());
        }
    }

    static void produceArrayIndexOutOfBoundsException() {
        int[] a = {1};
        try {
            for (int i = 0; i <= a.length; i++)
                System.out.println(a[i]);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println(arrayIndexOutOfBoundsException.getMessage());
        }

    }

    static void produceStringIndexOutOfBoundsException() {
        String s="prateek";
        try {
            System.out.println(s.charAt(25));
        }catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException){
            System.out.println(stringIndexOutOfBoundsException.getMessage());
        }
    }

    static void produceInputMismatchException() {
        System.out.println("Enter any number");
        try {
            String s=scanner.nextInt();
        }catch (InputMismatchException inputMismatchException){
            System.out.println(inputMismatchException.getMessage());
        }
    }

    static void produceNullPointerException() {
        String s=null;
        try {
            System.out.println(s.charAt(0));
        }catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException.getMessage());
        }
    }

    static void produceArithmeticException() {
        try {
            int i=25/0;
        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }
    }

    static void produceNumberFormatException() {
        try {
            int i="25";
        }catch (NumberFormatException numberFormatException){
            System.out.println(numberFormatException.getMessage());
        }
    }
}
