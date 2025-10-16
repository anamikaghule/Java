package sanika;
import java.util.Scanner;
public class Login {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Username:");
	String username = sc.nextLine();
	System.out.println("Enter Password:");
	String password = sc.nextLine();
	if(username.equals(password)) {
	System.out.println("Login Successful!");
}else {
	throw new RuntimeException("Invalid password");
}		
}
}
