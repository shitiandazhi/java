package chapter4_1;

public class c5 {

	public static void main(String[] args) {
		double ans1 = menseki(5.5);
		double ans2 = menseki(12, 2.5);
		
		System.out.printf("円の面積 = %.2f%n" ,ans1);
		System.out.printf("四角形の面積 = %.2f" ,ans2);
	}
	public static double menseki(double hankei) {
		double s = Math.pow(hankei, 2) * Math.PI;
		return s;
	}
	
	public static double menseki(double height, double width) {
		double s = height * width;
		return s;
	}
}
