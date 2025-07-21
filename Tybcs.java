package student;
import java.util.Scanner;

class Myname {
	String name;

	void getname() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter User name:");
		name = s.next();
	}

	void display() {
		System.out.print("You have enter  name:--->" + name);
	}

}

public class Tybcs{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myname ram = new Myname();
		ram.getname();
		ram.display();
	}

}

