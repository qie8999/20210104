package method0106_;

import java.util.Random;

public class MethodAnswer03 {

	public static void main(String[] args) {
		//03 �� �����԰� Ǯ��
		
		int arr[] = new int[10]; //����1)
		//int a =10;
		//int arr[] = new int[a]; �̷��Ե� ����
		Random rand = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i]=rand.nextInt(100);
			//System.out.println(arr[i]);
		}
		evenOdd(arr);//evenOdd�� arr����
	}
	public static void evenOdd(int arr[] ) {
		for(int i : arr) {
			if(i % 2 != 0) {
				System.out.println(i+"= Ȧ��");
			}else {
				System.out.println(i+"= ¦��");
			}
		}
	}

}
