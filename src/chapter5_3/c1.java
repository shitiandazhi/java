package chapter5_3;

import jp.kwebs.lib.Input;

public class c1 {

	public static void main(String[] args) {
		int s = Input.getInt();
		switch ( s ) {
			case	100			-> System.out.println("正常終了");
			case	200, 201	-> System.out.println("ページが存在していない");
			default				-> System.out.println("内部エラー");
		}
	}

}
