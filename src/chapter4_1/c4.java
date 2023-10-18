package chapter4_1;

public class c4 {

	public static void main(String[] args) {
		double ans = calc(10.5, 2.35);
		System.out.println(ans);
	}
	public static double calc(double x1, double x2) {
		return Math.sqrt(x1+x2);
 }
}
