package chapter3_1;
//合計と平均
public class c2 {

	public static void main(String[] args) {
		
		int[] number = {5, 12, 8, 21, 9};
		int total = 0;
		
		for(int n : number) {
			total += n;
		}
		
		System.out.println("合計=" + total);
		System.out.println("平均=" + total/number.length);
	
	}

}
