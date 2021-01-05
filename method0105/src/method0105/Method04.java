package method0105;

import java.util.Scanner;

public class Method04 {

	public static void func(int guk, int yeong, int su) {
		int sum = guk + yeong + su;
		int ave = sum / 3;
		System.out.println("합계 : "+sum);
		System.out.println("총점 : "+ave);
	}

	public static void main(String[] args) {
		// 04 국영수 점수를 입력받아서 총점,
		// 평균값을 구하는 프로그램
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("국어 점수 : ");
		int guk = s.nextInt();
		if(guk<0 || guk>100) {
			System.exit(0);
		}
		System.out.println("영어 점수 : ");
		int yeong = s.nextInt();
		if(yeong<0 || guk>100) {
			System.exit(0);
		}
		
		System.out.println("수학 점수 : ");
		int su = s.nextInt();
		if(su<0 || su>100) {
			System.exit(0);
		}
		func(guk, yeong, su);
		}
		

	}


