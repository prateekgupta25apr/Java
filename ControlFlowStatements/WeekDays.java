import java.util.Scanner;

class WeekDays{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number from 1 to 7");
		byte b=scanner.nextByte();
		
		if (b==1)System.out.println("1st day of a week is Sunday");
		else if (b==2)System.out.println("2nd day of a week is Monday");
		else if (b==3)System.out.println("2nd day of a week is Tuesday");
		else if (b==4)System.out.println("3rd day of a week is Wednesday");
		else if (b==5)System.out.println("4th day of a week is Thursday");
		else if (b==6)System.out.println("5th day of a week is Friday");
		else if (b==7)System.out.println("7th day of a week is Saturday");
		else System.out.println("Enter a number from 1 to 7 only");
	}
}
		