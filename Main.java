package Student;
import java.util.*;
import Student.StudentInfo;
import Student.StudentPer;
public class Main {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter roll no:");
		int rollno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		System.out.println("Enter Class:");
		String cls = sc.nextLine();
		int [] marks = new int [6];
		System.out.println("Enter marks of 6 subjects:");
		for(int i=0; i<6; i++) {
			marks[i]= sc.nextInt();
		}
		StudentPer sp = new StudentPer();
		double per = sp.calculateper(marks);
		StudentInfo s = new StudentInfo(rollno,name,cls);
		s.displayInfo(per);
	}

}
