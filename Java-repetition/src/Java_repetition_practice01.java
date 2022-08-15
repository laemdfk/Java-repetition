//prob4-1.(難易度：★)
//１から10までの乱数を発生させ、その数を表示した後、forループを用いて、
//その数だけ■マークを表示するプログラムを作りなさい。

import java.util.Random;

public class Java_repetition_practice01 {
	public static void main(String arms[]) {

		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		System.out.println(n);

		for(int i = 1; i <= n; i++) {
		System.out.println("■");
		}

	}
}
