package ExceptionHandling;

import java.util.Scanner;

/**
 * Creating custom exceptions based on exams
 */
public class CustomExceptions {
    public static void main(String[] args) {
        CustomExceptions customExceptions = new CustomExceptions();
        Scanner scanner = new Scanner(System.in);
        boolean b;
        char input;

        System.out.println(
                "Answer following questions in either yes(Y) or no(N)\n\n");
        System.out.println("Student found using mobile in exam hall??");
        input = scanner.nextLine().charAt(0);
        b = input == 'Y' || input == 'y';
        if (b) System.err.println(customExceptions.mobileFound(true));
        else System.out.println(customExceptions.mobileFound(false));

        System.out.println("Student keeping chits in exam hall??");
        input = scanner.nextLine().charAt(0);
        b = input == 'Y' || input == 'y';
        if (b) System.err.println(customExceptions.chitsFound(true));
        else System.out.println(customExceptions.chitsFound(false));

        System.out.println("Is student having attendance shortage??");
        input = scanner.nextLine().charAt(0);
        b = input == 'Y' || input == 'y';
        if (b) System.err.println(customExceptions.attendanceShortage(true));
        else System.out.println(customExceptions.attendanceShortage(false));

        System.out.println("Student don't have hall ticket??");
        input = scanner.nextLine().charAt(0);
        b = input == 'Y' || input == 'y';
        if (b) System.err.println(customExceptions.noHallTicket(true));
        else System.out.println(customExceptions.noHallTicket(false));

        System.out.println("Is student having smart watch??");
        input = scanner.nextLine().charAt(0);
        b = input == 'Y' || input == 'y';
        if (b) System.err.println(customExceptions.smartWatchFound(true));
        else System.out.println(customExceptions.smartWatchFound(false));

        System.out.println("Did student came late??");
        input = scanner.nextLine().charAt(0);
        b = input == 'Y' || input == 'y';
        if (b) System.err.println(customExceptions.comingLate(true));
        else System.out.println(customExceptions.comingLate(false));

        System.out.println("Is student is wearing a jacket or a sweater??");
        input = scanner.nextLine().charAt(0);
        b = input == 'Y' || input == 'y';
        if (b) System.err.println(customExceptions.jacketOrSweaterFound(true));
        else System.out.println(customExceptions.jacketOrSweaterFound(false));

        System.out.println("Is student is requesting to use washroom");
        input = scanner.nextLine().charAt(0);
        b = input == 'Y' || input == 'y';
        if (b) System.err.println(customExceptions.usingWashroom(true));
        else System.out.println(customExceptions.usingWashroom(false));

    }


    String mobileFound(boolean b) {
        if (b) {
            try {
                throw new MobileFoundException();
            } catch (MobileFoundException mobileFoundException) {
                return mobileFoundException.getMessage();
            }
        } else return "All good";
    }

    String chitsFound(boolean b) {
        if (b) {
            try {
                throw new ChitsFoundException();
            } catch (ChitsFoundException chitsFoundException) {
                return chitsFoundException.getMessage();
            }
        } else return "All good";
    }

    String attendanceShortage(boolean b) {
        if (b) {
            try {
                throw new AttendanceShortageException();
            } catch (AttendanceShortageException attendanceShortageException) {
                return attendanceShortageException.getMessage();
            }
        } else return "All good";
    }

    String noHallTicket(boolean b) {
        if (b) {
            try {
                throw new NoHallTicketException();
            } catch (NoHallTicketException noHallTicketException) {
                return noHallTicketException.getMessage();
            }
        } else return "All good";
    }

    String smartWatchFound(boolean b) {
        if (b) {
            try {
                throw new SmartWatchFoundException();
            } catch (SmartWatchFoundException smartWatchFoundException) {
                return smartWatchFoundException.getMessage();
            }
        } else return "All good";
    }

    String comingLate(boolean b) {
        if (b) {
            try {
                throw new ComingLateException();
            } catch (ComingLateException comingLateException) {
                return comingLateException.getMessage();
            }
        } else return "All good";
    }

    String jacketOrSweaterFound(boolean b) {
        if (b) {
            try {
                throw new JacketOrSweaterFoundException();
            } catch (JacketOrSweaterFoundException jacketOrSweaterFoundException) {
                return jacketOrSweaterFoundException.getMessage();
            }
        } else return "All good";
    }

    String usingWashroom(boolean b) {
        if (b) {
            try {
                throw new UsingWashroomException();
            } catch (UsingWashroomException usingWashroomException) {
                return usingWashroomException.getMessage();
            }
        } else return "All good";
    }
}

class MobileFoundException extends Exception {
    @Override
    public String getMessage() {
        return "Mobiles are not allowed in the exam hall";
    }
}

class ChitsFoundException extends Exception {
    @Override
    public String getMessage() {
        return "Chits are not allowed in the exam hall";
    }
}

class AttendanceShortageException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Student is not eligible to write exam due to attendance shortage";
    }
}

class NoHallTicketException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Students are not allowed to write exam without hall ticket";
    }
}

class ComingLateException extends Exception {
    @Override
    public String getMessage() {
        return "Students coming late to exam hall are not allowed to write exam";
    }
}

class SmartWatchFoundException extends Exception {
    @Override
    public String getMessage() {
        return "Smart watches are not allowed in the exam hall";
    }
}

class JacketOrSweaterFoundException extends Exception {
    @Override
    public String getMessage() {
        return "Jacket or sweaters are not allowed in the exam hall";
    }
}

class UsingWashroomException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Students are not allowed to use washroom while exam is going on";
    }
}