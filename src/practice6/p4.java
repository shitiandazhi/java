package practice6;

public class p4 {

	public static void main(String[] args) {
	//  引数つきコンストラクタの呼び出し
        p3 s = new p3("HelloWorld.");
        //  SampleClass03 s = new SampleClass03();
        //  numberのセッターで、値を設定
        s.setNumber(100);
        //  ゲッターで値を呼び出し、内容を表示
        System.out.println(s.getNumber());
        System.out.println(s.getStr());
	}

}
