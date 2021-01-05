package method0105;

public class Method2 {//4번 형태
	public static int plus(int num1,int num2) {
		int result =0;
		result = num1 + num2;
		return result;
		//더하기 해서 result반환
		//int여야함
	}

	public static void main(String[] args) {
		int hap = plus(100,200);
		System.out.println("hap: " + hap);
		System.out.println("hap: " + plus(200,300));

	}

}
