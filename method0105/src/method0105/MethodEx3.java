package method0105;

import java.util.Random;

public class MethodEx3 {
	public static void func(int num) {
		
		if (num % 2 == 0) {
			System.out.println(num);
			System.out.println("¦���Դϴ�");
		} else {
			System.out.println(num);
			System.out.println("Ȧ���Դϴ�");
		}
	}

	public static void main(String[] args) {
		// 03 10���� ���ڸ� �Է¹޾Ƽ� �����ϴ� ������ ���� ���α׷�
		int num[] = new int[10];
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			num[i] = rand.nextInt(100);
//			System.out.println(num[i]);
			func(num[i]);
			
		}
	
	}

}
