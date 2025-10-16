package Student;

public class StudentPer {
public double calculateper(int marks []) {
	int total=0;
	for(int m:marks)
		total+=m;
	return total/6.0;
}
}
