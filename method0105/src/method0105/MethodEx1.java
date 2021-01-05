package method0105;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MethodEx1 {
	public static Integer[] makeArray() {
		Scanner s = new Scanner(System.in);
		int num = 0;
		Integer[] arr = new Integer[3];
		for (int i = 0; i < arr.length; i++) {
			num = s.nextInt();

		}
		return arr;
	}

	public static void main(String[] args) {
		// 01 3개의 숫자를 입력받아서 크기가 큰 순서대로
		// 출력하는 프로그램
		Integer[] arr = makeArray();
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.printf("[%d]",arr);
		
	}

}
