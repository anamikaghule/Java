package pqr;

class Cal{
	int a = 5;
	int b = 4;
	void calculation()
	{
		System.out.println("the addition is:"+a+b);
		System.out.println("the subtraction is:"+(a-b));
		System.out.println("the division is:"+a/b);
		System.out.println("the multiplication is:"+a*b);	
	}
}
public class Arithmatic {
	public static void main(String[]args) {
	Cal c1 = new Cal();
	c1.calculation();
	
	
	
	}
}
