package method0105;

import java.util.Scanner;

public class Method04 {

	public static void func(int guk, int yeong, int su) {
		int sum = guk + yeong + su;
		int ave = sum / 3;
		System.out.println("�հ� : "+sum);
		System.out.println("���� : "+ave);
	}

	public static void main(String[] args) {
		// 04 ������ ������ �Է¹޾Ƽ� ����,
		// ��հ��� ���ϴ� ���α׷�
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� ���� : ");
		int guk = s.nextInt();
		if(guk<0 || guk>100) {
			System.exit(0);
		}
		System.out.println("���� ���� : ");
		int yeong = s.nextInt();
		if(yeong<0 || guk>100) {
			System.exit(0);
		}
		
		System.out.println("���� ���� : ");
		int su = s.nextInt();
		if(su<0 || su>100) {
			System.exit(0);
		}
		func(guk, yeong, su);
		}
		

	}


