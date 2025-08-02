//Check if a Given Number is Odd or Even Using Switch
//Use modulo operation inside switch-case.

package abc;
import java.util.Scanner;
public class Switchoddeven {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number 1:");
		int num1= sc.nextInt();
		int remainder= num1 % 2;
		System.out.println("Remainder is:"+remainder);
		switch(remainder)
		{
		case 0:System.out.println("number is even:");
		break;
		case 1:System.out.println("number is odd:");
		break;
		default:System.out.println("number not found:");
		}
		sc.close();
	}

}
