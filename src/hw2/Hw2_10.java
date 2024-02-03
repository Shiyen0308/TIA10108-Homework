package hw2;

	// 九九乘法表while迴圈 + do while迴圈

public class Hw2_10 {
	public static void main(String[] args) {
		int i = 1;
		while(i++ <9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}while(j++ < 9);
			System.out.println();
		}
	}
}
