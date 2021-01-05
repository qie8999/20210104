package method0105;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex01_11 {

	public static void main(String[] args) {
		// 01번
		Scanner s = new Scanner(System.in);
		Integer[] arr= new Integer[3];
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+". 숫자 입력: ");
			arr[i]=s.nextInt();
		}
		mySort(arr);

	}

	public static void mySort(Integer arr[]) {
		Arrays.sort(arr,Collections.reverseOrder());
		//내림차순
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
