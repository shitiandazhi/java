package chapter4_2;

public class c1 {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30};
		calc(numbers);
	}
	
	public static void calc(int[] num) {
		for(int n : num) {
			System.out.println(n + " ");
		}
	}
}
