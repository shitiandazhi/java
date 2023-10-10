package chapter2_9;

import jp.kwebs.lib.Input;

public class c1 {

	public static void main(String[] args) {

		String name = Input.getString("お名前");
		
		System.out.println("長さ=" + name.length());
		System.out.println("先頭文字=" + name.charAt(0));
				
	}

}
