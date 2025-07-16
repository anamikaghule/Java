package xyz;
import java.util.Scanner;

public class Sqr {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter value of a:");
	int a = sc.nextInt();
	System.out.println("the square is:"+(a*2));
	System.out.println("the cube is:"+(a*3));
	sc.close();
	
}
}
