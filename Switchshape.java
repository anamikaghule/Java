//Find the Area of Different Shapes
//Choose from circle, rectangle, triangle, and find the area.
//area of triangle= 1/2*b*h.
//area of rectangle=length*width.
package abc;
import java.util.Scanner;
public class Switchshape 
{
	public static void main(String[]args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the shape:");
		String shape=sc.next();
		switch(shape)
		{
		case "Circle":System.out.println("enter the radius:");
		float radius=sc.nextFloat();
		float pi=3.14f;
		float areaofcircle=pi*radius*radius;
		System.out.println("the area of the circle is:"+areaofcircle);
		
		break;
		case "Triangle":System.out.println("enter the breadth:");
		float breadth=sc.nextFloat();
		System.out.println("enter the height:");
		float height=sc.nextFloat();
		double areaoftriangle=(0.5*breadth*height);
		System.out.println("the area of triangle is:"+areaoftriangle);
		
		break;
		case "Rectangle": System.out.println("enter the length:");
		float length=sc.nextFloat();
		System.out.println("enter the width:");
		float width=sc.nextFloat();
		float areaofrectangle=length*width;
		System.out.println("the area of rectangle is:"+areaofrectangle);
		sc.close();
		}
	}

}
