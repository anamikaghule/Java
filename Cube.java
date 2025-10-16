package sanika;
interface CubeInterface{
	int findCube(int n);
}
public class Cube {
	public static void main(String[] args) {
		CubeInterface c= (n)->n*n*n;
		int num = 5;
		System.out.println("Cube of:"+num +"is:" +c.findCube(num));
	}
	

}
