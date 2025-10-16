package sanika;

public class Sphere {
	double r;
	Sphere(double r){this.r = r;}
	void calculate() {
		double area = 4*3.14*r*r;
		double volume = (4.0/3)*3.14*r*r*r;
		System.out.println("volume:"+volume);
		
	}
	public static void main(String [] args) {
		Sphere s = new Sphere(6);
		s.calculate();
	}

}
