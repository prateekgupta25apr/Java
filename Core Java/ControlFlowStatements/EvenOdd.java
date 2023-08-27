import java.util.Scanner;

class EvenOdd{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number");
		byte b=scanner.nextByte();
		
		if (b%2==0)System.out.println(b+" is an even number");
		else System.out.println(b+" is an odd number");

	}
}