/* prob4-5(難易度：★)
prob4-4と同じ処理を、for文を用いて作りなさい。*/

import java.util.Random;

public class Java_repetition_practice05 {
	public static void main(String arms[]) {
		
		Random rand = new Random();
		int n = rand.nextInt(10) +1 ;
		System.out.println(n);
		
		for (int i = 0; i <= n ; i++ ) {
			System.out.println("a = " + i);
		}
	}
}

/*
 for文の書式
for ( 初期化処理 ; 条件式 ; 増分処理 ){
    処理
} 
*/