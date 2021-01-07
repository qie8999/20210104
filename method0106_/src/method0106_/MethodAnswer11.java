package method0106_;

import java.util.Random;

public class MethodAnswer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap = 0;
		int avg = 0;
		int arr[][] = getScore();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				hap+=arr[i][j];
			}
			System.out.print(" 총점:"+hap);
			avg = hap/3;
			System.out.print(" 평균:"+avg);
			if(avg<=100 && avg>=90) {
				System.out.println(" A학점");
			}else if(avg<=89 && avg>=80) {
				System.out.println(" B학점");
			}else if(avg<=79 && avg>=70) {
				System.out.println(" C학점");
			}else if(avg<=69 && avg>=60) {
				System.out.println(" D학점");
			}
			hap =avg =0;
			System.out.println();
		}

	}
	public static int[][] getScore(){
		//이차원 배열을 넣을 메소드
		Random r = new Random();
		int arr[][]= new int [5][3];
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] =r.nextInt(91)+10;
//				System.out.print(arr[i][j] + " ");
			}
//			System.out.println();
		}
		return arr;
		
	}
}
