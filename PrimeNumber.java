package sanika;
	import java.util.Scanner;
	public class PrimeNumber{
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of elements in the array:");
			int n = sc.nextInt();
			int [] arr = new int[n];
			System.out.println("enter elements of the array:");
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
				
			}
			System.out.println("prime numbers in the array:");
			for(int num:arr) {
				if(isPrime(num)) {
					System.out.println(num+"");
					
				}
			}
		}
		public static boolean isPrime(int num) {
			if(num<=1) {
				return false;
				
			}
			if(num<=3) {
				return true;
			}
			if(num%2==0|| num%3==0) {
				return false;
			}
			for(int i=5; i*i<=num; i+=6) {
				if(num%i==0|| num%(i+2)==0) {
					return false;
				}
			}
			return true;
		}
	}
