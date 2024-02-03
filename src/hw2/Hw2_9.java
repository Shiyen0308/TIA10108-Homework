package hw2;

	//九九乘法表for迴圈 + do while迴圈

public class Hw2_9 {
	public static void main(String[] args) {
		for (int i = 1 ; i<=9 ; i++) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}while(j++ < 9);
			System.out.println();
		}
	}
}
