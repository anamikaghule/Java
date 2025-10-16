package sanika;
import java.util.Scanner;
public class Diagonalsum {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of rows:");
		int rows = sc.nextInt();
		System.out.println("enter number of columns:");
		int cols = sc.nextInt();
		if(rows!= cols) {
			System.out.println("Matrix must be square to calculate diagonalsum:");
			return;
		}
		int [] [] arr = new int[rows][cols];
		System.out.println("enter elements of matrix:");
		for(int i=0; i<rows; i++)
			for(int j=0; j<cols; j++)
				arr[i][j]=sc.nextInt();
		int sum= 0;
		for(int i=0; i<rows; i++)
			sum+= arr[i][i];
		System.out.println("Sum of diagonal elements:"+sum);
			
		}
	}


