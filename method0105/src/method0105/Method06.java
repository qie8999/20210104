package method0105;

import java.util.Random;

public class Method06 {
	
	public static int[] func() {
		int[] arr = new int[6];
		for(int i=0; i<6; i++) {
			Random rand=new Random();
			arr[i] = rand.nextInt(45);
	}
		return arr;
	}
	public static void main(String[] args) {
		// 간단한 로또 프로그램
		
		int[] arr = func();
		for (int i=0; i<6; i++){
			System.out.println(arr[i]);
		}
		}

	}


