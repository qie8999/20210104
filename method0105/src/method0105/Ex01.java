package method0105;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 01번
		Scanner s = new Scanner(System.in);
		System.out.print("1번째 숫자 입력: ");
		int num1 = s.nextInt();
		System.out.print("2번째 숫자 입력: ");
		int num2 = s.nextInt();
		System.out.print("3번째 숫자 입력: ");
		int num3 = s.nextInt();
		mySort(num1,num2,num3);

	}

	public static void mySort(int a, int b, int c) {
		if (a > b && b > c) {
			System.out.printf("%d-%d-%d", a, b, c);
		} else if (a > c && c > b) {
			System.out.printf("%d-%d-%d", a, c, b);
		} else if (b > c && c > a) {
			System.out.printf("%d-%d-%d", b, c, a);
		} else if (b > a && a > c) {
			System.out.printf("%d-%d-%d", b, a, c);
		} else if (c > b && b > a) {
			System.out.printf("%d-%d-%d", c, b, a);
		} else if (c > a && a > b) {
			System.out.printf("%d-%d-%d", c, a, b);
		}
	}
}
