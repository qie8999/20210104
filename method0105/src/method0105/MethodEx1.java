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
		// 01 3���� ���ڸ� �Է¹޾Ƽ� ũ�Ⱑ ū �������
		// ����ϴ� ���α׷�
		Integer[] arr = makeArray();
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.printf("[%d]",arr);
		
	}

}
