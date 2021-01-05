package method0105;

public class Method07_2 {
	public static int func1(int sum1) {
		int arr1[]=new int[50];
		for(int i=1; i<=100; i++) {
			if(i % 2 != 0) {
			sum1 = sum1 + i;
			}
		}
		return sum1;
	}
	public static int func2(int sum2) {
		int arr1[]=new int[50];
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
			sum2 = sum2 + i;
			}
		}
		return sum2;
	}

	public static void main(String[] args) {
		// 01~100까지의 합을 구하는 프로그램
		int sum1 = 0, sum2 = 0;
		sum1 = func1(0);
		sum2 = func2(0);
		System.out.println("1~100 홀수의 합 : " + sum1);
		System.out.println("1~100 짝수의 합 : " + sum2);

	}

}
