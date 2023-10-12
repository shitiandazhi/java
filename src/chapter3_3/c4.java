package chapter3_3;

import java.util.List;
import chapter3_1.Population;
public class c4 {

	public static void main(String[] args) {
		var list = List.of(
				new Population("北海道", 5250, -6.8),
				new Population("東京都", 13921, 7.1),
				new Population("大阪府", 8809, -0.4),
				new Population("福岡県", 5104, -0.7),
				new Population("沖縄県", 1453, 3.9));
		
		int total=0;
		for(Population p : list) {
			total += p.population();
		}
			System.out.println("人口の合計=" + total);
		}
	}

