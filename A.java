// Inputs are Three points forming a triangle
// Output is where the triangle is a right-angled triangle or not
public class A {
	public static void main(String[] args) {
		int[] A = {5,-5};
		int[] B = {-1,7};
		int[] C = {15,15};
		double AC1 = length(A,C);
		double AC2 = Math.sqrt(Math.pow(length(A,B), 2)+Math.pow(length(B,C), 2));
		if(AC1 == AC2) {
			System.out.println("ABC is a right angled triangle");
		}else {
    	System.out.println("ABC is not a right angled triangle");
    }
	}
	public static double length(int[] x,int[] y) {
		return Math.sqrt(Math.pow(x[0]-y[0], 2)+Math.pow(x[1]-y[1],2));
	}
}
