package sanika;
import java.util.Scanner;
class Patient{
	String PatientName;
	int Patientage;
	int PatientOxylevel;
	String PatientHrctReport;
	Patient(String PatientName,int Patientage,int PatientOxylevel,String PatientHrctReport){
		this.PatientName = PatientName;
		this.Patientage = Patientage;
		this.PatientOxylevel = PatientOxylevel;
	    this.PatientHrctReport = PatientHrctReport;
	}
	void displayInfo() {
		System.out.println("Patient Name:"+PatientName);
		System.out.println("Patient Age:"+Patientage);
		System.out.println("Patient Oxy level:"+PatientOxylevel);
		System.out.println("Patient HRCT Report:"+PatientHrctReport);
	}
}
class CovidException extends Exception{
	CovidException(String Message){
		super(Message);
	}
}

public class PatientCheck {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Patient Name:");
		String name = sc.nextLine();
		System.out.println("Patient Age:");
		int age = sc.nextInt();
		System.out.println("Patient Oxy level:");
		int oxylevel = sc.nextInt();
		sc.nextLine();
		System.out.println("Patient HRCT Report:");
		String HrctReport = sc.nextLine();
	

	
		Patient p1 = new Patient(name,age,oxylevel,HrctReport);
		try {
			if(p1.PatientOxylevel<95 && Integer.parseInt(p1.PatientHrctReport)>10) {
				throw new CovidException("Patient is covid +ve and need to hospitalized");
			}else {
				p1.displayInfo();
			}
			} catch(CovidException e) {
				System.out.println(e.getMessage());
			}
		}
	}


