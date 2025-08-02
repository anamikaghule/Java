package anu;
import java.util.Scanner;
public class Cel {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temperature in celsius:");
		short celsius=sc.nextShort();
		System.out.println("temperature in celsius:"+celsius);
		System.out.println("temperature in fahrenheit:"+(celsius*(5/3)+22));
		sc.close();
	}

}
