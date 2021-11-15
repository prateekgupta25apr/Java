package Arrays;


class DaysAndMonths {
    public static void main(String[] args) {
        String[] days = {
                "Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday",};
        byte daysIndex = 7;
        String[] months = {
                "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "November", "December",};
        byte monthsIndex = 4;
        System.out.println(days[daysIndex - 1]);
        System.out.println(months[monthsIndex - 1]);
    }
}