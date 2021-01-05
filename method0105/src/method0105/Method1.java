package method0105;

public class Method1 {
	static int func() {
		System.out.println("값을 리턴하는 메소드");
		return 100;
		//아무 역할 없이 100을 돌려 줌 
		//int 값을 돌려줌
	}

	public static void main(String[] args) {
		int num = func(); //func값을 num에 되돌려준다
		System.out.println("num: "+ num);
		System.out.println("num: "+func());
		//매개변수를 전달하는값으로 변수, 메소드 호출가능
		

	}

}
