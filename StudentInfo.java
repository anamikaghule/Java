package Student;

public class StudentInfo {
int rollno;
String name;
String cls;
double per;
public StudentInfo(int rollno,String name,String cls) {
	this.rollno=rollno;
	this.name=name;
	this.cls=cls;
}
public void displayInfo(double per) {
	System.out.println("Roll No:"+rollno);
	System.out.println("Name:"+name);
	System.out.println("Class:"+cls);
	System.out.println("Percentage"+per+"%");
}
}
