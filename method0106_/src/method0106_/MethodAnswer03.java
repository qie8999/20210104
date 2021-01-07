package method0106_;

import java.util.Random;

public class MethodAnswer03 {

	public static void main(String[] args) {
		//03 번 선생님과 풀기
		
		int arr[] = new int[10]; //조건1)
		//int a =10;
		//int arr[] = new int[a]; 이렇게도 가능
		Random rand = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i]=rand.nextInt(100);
			//System.out.println(arr[i]);
		}
		evenOdd(arr);//evenOdd로 arr전달
	}
	public static void evenOdd(int arr[] ) {
		for(int i : arr) {
			if(i % 2 != 0) {
				System.out.println(i+"= 홀수");
			}else {
				System.out.println(i+"= 짝수");
			}
		}
	}

}
