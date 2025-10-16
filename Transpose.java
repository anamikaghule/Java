package sanika;
import java.util.Scanner;
public class Transpose {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns:");
		int cols = sc.nextInt();
		int [] [] arr= new int[rows][cols];
		System.out.println("Enter elements of array:");
		for(int i=0; i<rows; i++) 
			for(int j=0; j<cols; j++) 
				arr[i][j]=sc.nextInt();
				int [] [] transpose = new int [cols][rows];
				for(int i=0; i<rows; i++) 
					for(int j=0; j<cols; j++) 
						transpose[j][i]= arr[i][j];
				System.out.println("Transpose Array:");
				for(int i=0; i<cols; i++) {
					for(int j=0; j<rows; j++) 
						System.out.println(transpose[i][j]+"");
					System.out.println();
						
					
					}
				
			}
		
	}


