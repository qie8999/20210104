package method0105;

public class Method3 {//3번형태
	public static int[] makeArray() {
		int arr[]=new int[3];
		//비어있는 3개의 빈공간 만듦
		for(int i=0; i<arr.length; i++) {
			arr[i] = 100+i;
		}
		return arr;
		//배열의 주소값(배열정보 던져줌)
	}

	public static void main(String[] args) {
		int arr[]=makeArray();
		//(=위의 arr과 같다)
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
