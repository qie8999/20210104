package method0105;

public class Method08 {
	public static int func() {	
		int result =0;
		for(int i=2; i<=9; i++) {
			for(int j=3; j<=9; j++) {
				if (j %2==0) {
					continue;
				}else if(j %2!=0){
					result=j*i;
					System.out.printf("%dx%d=%d \t",j,i,result);
				}
				
			}
			System.out.println();
		}
		return result;				
	}

	public static void main(String[] args) {
		int gugu = func();
	}
}
