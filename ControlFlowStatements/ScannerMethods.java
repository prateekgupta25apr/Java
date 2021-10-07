import java.util.Scanner;

class ScannerMethods{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a String number");
		String str=scanner.nextLine();
		
		System.out.println("Enter a byte number");
		byte b=scanner.nextByte();
		
		System.out.println("Enter a Short number");
		short s=scanner.nextShort();
		
		System.out.println("Enter a int number");
		int i=scanner.nextInt();
		
		System.out.println("Enter a float number");
		float f=scanner.nextFloat();
		
		System.out.println("Enter a double");
		double d=scanner.nextDouble();
		
		System.out.println("Enter a boolean");
		boolean boo=scanner.nextBoolean();
		
		System.out.println("Enter a char number");
		char c=scanner.next().charAt(0);
		
		
		
		
		
		System.out.println("Your entered data");
		System.out.println("byte : "+b);
		System.out.println("short : "+s);
		System.out.println("int : "+i);
		System.out.println("float : "+f);
		System.out.println("double : "+d);
		System.out.println("boolean : "+boo);
		System.out.println("string : "+str);
		System.out.println("char : "+c);
	}
}