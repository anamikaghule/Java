//Convert Temperature Between Celsius and Fahrenheit
//Use switch-case to select the conversion type.
package abc;
import java.util.Scanner;
public class Temp {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("celsius to fahrenheit:");
		System.out.println("fahrenheit to celsius:");
		System.out.println("select the conversion type:");
		int num=sc.nextInt();
		switch(num) {
		case 1:System.out.println("enter the value of celsius");
		float celsi=sc.nextFloat();
		float fahrenheit=(celsi*9/5)+32;
		System.out.println("conversion of celsius to fahrenheit is:"+fahrenheit);
		break;
		case 2: System.out.println("enter the value of fahrenheit:");
		float fahrenheit2=sc.nextFloat();
		float celsius=(fahrenheit2-32)*5/9;
		System.out.println("conversion of fahrenheit to celsius is:"+celsius);
		break;
		}
		sc.close();
	}

}
