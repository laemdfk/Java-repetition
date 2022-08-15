//prob4-3.(難易度：★)
//prob4-1と同じ処理を、do～while文を用いたループで行いなさい。

import java.util.Random;

public class Java_repetition_practice03 {
	public static void main (String arms[]) {

		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		System.out.println(n);

		int i = 1;   //do-whileやwhileでは、先に変数を定義しておく(forは全て後ろに書くので事前準備なし)

	    do {
	    	 System.out.println("■");
	           i++;
		   } while(i <= n);
	}

}


/*
 do{
   処理
  }whlie(条件式）; ← whileの後にセミコロンがついている。
*/