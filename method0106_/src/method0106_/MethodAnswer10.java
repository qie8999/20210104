package method0106_;

import java.util.Scanner;

public class MethodAnswer10 {

	public static void main(String[] args) {
		// 10�� ���� �����԰�
		Scanner s = new Scanner(System.in);
		System.out.print("���丮�� �� �Է�: ");
		int n =s.nextInt();
		
		int result =factorial(n);
		System.out.println(n+"!="+result);

	}//���丮���� �ڱ� �ڽ��� ȣ��
	public static int factorial(int n) {
		if(n == 1) {
		return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
}
