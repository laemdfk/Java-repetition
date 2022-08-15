/*
 prob4-6(難易度：★)
while文を用いて、整数型変数 a を、以下のように変更し、
表示するプログラムを作りなさい。

期待される実行結果
a = 3
a = 2
a = 1
a = 0
*/

import java.util.Random;

public class Java_repetition_practice06 {
	public static void main(String arms[]) {

		Random rand = new Random();
		int a = rand.nextInt(10) + 1;
		System.out.println(a);

		int i = 1;
		while(i > a) {
		i--;
		 System.out.println("a = " + i);
		}
	}

}
