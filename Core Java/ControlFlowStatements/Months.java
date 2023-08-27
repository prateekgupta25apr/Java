import java.util.Scanner;

class Months{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number from 1 to 12");
		byte b=scanner.nextByte();
		
		if (b==1)System.out.println("1st month is January");
		else if (b==2)System.out.println("2nd month is February");
		else if (b==3)System.out.println("3rd month is March");
		else if (b==4)System.out.println("4th month is April");
		else if (b==5)System.out.println("5th month is May");
		else if (b==6)System.out.println("6th month is June");
		else if (b==7)System.out.println("7th month is July");
		else if (b==8)System.out.println("8th month is August");
		else if (b==9)System.out.println("9th month is September");
		else if (b==10)System.out.println("10th month is October");
		else if (b==11)System.out.println("11th month is November");
		else if (b==12)System.out.println("12th month is December");
		else System.out.println("Enter a number from 1 to 12 only");
		
	}
}