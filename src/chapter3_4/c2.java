package chapter3_4;

import java.util.ArrayList;

public class c2 {

	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("banana");
		list.add("pineapple");
		list.add("grape");
		list.add("apple");
		System.out.println(list);
		
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.contains("apple"));
		
		System.out.println(list.remove(2));
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		
	}

}
