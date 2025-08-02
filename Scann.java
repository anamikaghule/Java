package student;
import java.util.Scanner;

public class Scann {
	public static void main(String[]args) {
		int l,b,perimeter,area;
		Scanner s = new Scanner(System.in);
		System.out.println("enter length of rectangle:");
		l = s.nextInt();
		System.out.println("enter the breadth of rectangle:");
		b = s.nextInt();
		perimeter = 2*(l+b);
		System.out.println("perimeter of rectangle:"+perimeter);
		area = l*b;
		System.out.println("area of rectangle:"+area);
		
	}

}
