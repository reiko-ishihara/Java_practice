package jp.learningjavatext_sukkiri1.javastudy;

public class Chapter17_Person {
	
	int age;
	
	public void setAge(int age) {
		if (age < 0) {		// ここで引数をチェック
			throw new IllegalArgumentException("年齢は0以上の数を指定すべきです。指定値=" + age);
		}
		this.age = age;		// 問題ないならフィールドに値をセット
	}

}
