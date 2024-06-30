package src;

import java.util.Arrays;

public class Dates {
    public int year;
    /**
     * Jan will be 1
     */
    public int month;
    public int dayOfMonth;


    public Dates(int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public Dates addDays(Integer noOfDays){
        while ((Arrays.asList(1,3,5,7,8,10,12).contains(this.month)&&noOfDays>31) ||
                (Arrays.asList(4,6,9,11).contains(this.month)&&noOfDays>30) ||
                (this.month==2&&noOfDays>28)){

        }
        /*int day=0;
        boolean recurrsive=false;
        switch (this.month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                day=this.dayOfMonth+noOfDays;
                if (day>31){
                    this.dayOfMonth=day-31;
                    this.month+=1;
                }
                else {
                    this.dayOfMonth=day;
                }
                if (this.dayOfMonth>31)
                    recurrsive=true;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day=this.dayOfMonth+noOfDays;
                if (day>30){
                    this.dayOfMonth=day-30;
                    this.month+=1;
                }
                else {
                    this.dayOfMonth=day;
                }
                if (this.dayOfMonth>30)
                    recurrsive=true;
                break;

            case 2:
                day=this.dayOfMonth+noOfDays;
                if (day>28){
                    this.dayOfMonth=day-28;
                    this.month+=1;
                }
                else {
                    this.dayOfMonth=day;
                }
                if (this.dayOfMonth>28)
                    recurrsive=true;
                break;

            case 12:
                day=this.dayOfMonth+noOfDays;
            if (day>31){
                this.dayOfMonth=day-31;
                this.month+=1;
                this.year+=1;
            }
            else {
                this.dayOfMonth=day;
            }
                if (this.dayOfMonth>31)
                    recurrsive=true;
            break;
        }*/



        return this;
    }

    @Override
    public String toString() {
        return "Dates{" +
                "year=" + year +
                ", month=" + month +
                ", dayOfMonth=" + dayOfMonth +
                '}';
    }

    public static void main(String[] args) {
//        Dates date=new Dates(2024,6,28);
//        date.addDays(500);
//        System.out.println(date);

    }
}
