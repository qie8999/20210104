package method0105;

public class Method3 {//3������
	public static int[] makeArray() {
		int arr[]=new int[3];
		//����ִ� 3���� ����� ����
		for(int i=0; i<arr.length; i++) {
			arr[i] = 100+i;
		}
		return arr;
		//�迭�� �ּҰ�(�迭���� ������)
	}

	public static void main(String[] args) {
		int arr[]=makeArray();
		//(=���� arr�� ����)
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
