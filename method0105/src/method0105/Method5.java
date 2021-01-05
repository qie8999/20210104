package method0105;

import java.util.Scanner;

public class Method5 {
	public static void func(int num) {
		for(int i=1; i<=9; i++) {
			int result=num*i;
			System.out.printf("%dx%d=%d\n",num,i,result);
		}
		
	}

	public static void main(String[] args) {
		// 05 1개의 숫자를 입력받아서 구구단 출력
		Scanner s= new Scanner(System.in);
		int num =s.nextInt();
		func(num);

	}

}
