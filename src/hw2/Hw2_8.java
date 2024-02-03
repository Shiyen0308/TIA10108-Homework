package hw2;

	//九九乘法表for迴圈 + while迴圈

public class Hw2_8 {
	public static void main(String[] args) {
		int i  ; 
		for(i = 1; i <= 9 ; i++) {
			int j = 1;
			while(j++ <9 ) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
