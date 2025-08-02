package abc;
import java.util.Scanner;
public class Constants {
	public static void main(String[] args) {
		final float pi = 3.14f;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the radius of the circle");
		float radius = sc.nextFloat();
		float area = pi*radius*radius;
		System.out.println("enter the area of circle:"+area);
		sc.close();
	}

}
