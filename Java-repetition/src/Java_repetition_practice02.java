//prob4-2.(難易度：★)
//prob4-1と同じ処理を、while文で作ったループで行いなさい。

import java.util.Random;

public class Java_repetition_practice02 {
	public static void main(String arms[]) {
		
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		System.out.println(n);
		
		int i = 1;
		while(i <= n) {
			System.out.println("■");
			i++;
		}
		
	}

}


 /*
  whlie(条件式）{
    処理
  } 
*/
 