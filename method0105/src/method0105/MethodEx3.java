package method0105;

import java.util.Random;

public class MethodEx3 {
	public static void func(int num) {
		
		if (num % 2 == 0) {
			System.out.println(num);
			System.out.println("짝수입니다");
		} else {
			System.out.println(num);
			System.out.println("홀수입니다");
		}
	}

	public static void main(String[] args) {
		// 03 10개의 숫자를 입력받아서 동작하는 간단한 계산기 프로그램
		int num[] = new int[10];
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			num[i] = rand.nextInt(100);
//			System.out.println(num[i]);
			func(num[i]);
			
		}
	
	}

}
