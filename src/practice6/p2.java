package practice6;

public class p2 {

	public static void main(String[] args) {
		p1 s = new p1();
        //  method1()は、privateなので、外部からはアクセスできない。
        //s.method1();
        //  method2呼び出し
        s.method2();
        //  method3呼び出し
        s.method3();
        //numは、privateフィールドなので、外部からはアクセスできない。
        //s.num = 1;
	}

}
