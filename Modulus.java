package pqr;

class Mod 
{
	 static int a ;
	static int b ;
	static int Remainder;
	 static void calculation(int a,int b)
	{
      Remainder = a%b;
		System.out.println("the remainder is:" + Remainder);	
	}
}



public class Modulus {
public static void main(String[]args) {
		
		Mod.calculation(2,3);
		
}
}