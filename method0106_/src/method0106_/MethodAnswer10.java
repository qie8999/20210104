package method0106_;

import java.util.Scanner;

public class MethodAnswer10 {

	public static void main(String[] args) {
		// 10번 문제 선생님과
		Scanner s = new Scanner(System.in);
		System.out.print("팩토리얼 수 입력: ");
		int n =s.nextInt();
		
		int result =factorial(n);
		System.out.println(n+"!="+result);

	}//팩토리얼은 자기 자신을 호출
	public static int factorial(int n) {
		if(n == 1) {
		return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
}
