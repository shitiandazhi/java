package chapter4_2;

public class c2 {

	public static void main(String[] args) {
		calc(10, 20, 30);
		calc(10, 20, 30, 40);
	}
	
	public static void calc(int... numbers) {
		for(int n : numbers) {
			System.out.print(n + " ");
		}
	}
}
