package imp;
import java.util.Scanner;

public class Scn {
	

	
	public static void main(String[]args)
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("the value of a is:");
			int a = sc.nextInt();
			System.out.println("the value of b is:");
			short b= sc.nextShort();
			System.out.println("the addition is:"+a+b);
			System.out.println("the substraction is:"+(a-b));
			System.out.println("the division is:"+a/b);
			System.out.println("the multiplication is:"+a*b);
			System.out.println("the module is:"+a%b);
			sc.close();
			}
	}

