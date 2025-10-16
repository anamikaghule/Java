package sanika;
import java.util.Scanner;
import java.util.Arrays;
public class SortCities{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of cities:");
		int n = sc.nextInt();
		String[] cities= new String[n];
		System.out.println("Enter name of city:");
		for(int i=0; i<n; i++) {
			cities[i] = sc.next();
		}
		Arrays.sort(cities);
		System.out.println("cities in ascending order:");
		for(String xyz:cities) {
			System.out.println(xyz);
		}
	}
}