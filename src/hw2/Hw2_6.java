package hw2;


public class Hw2_6 {
	public static void main(String[] args) {
		for(int i = 0;i < 10; i++) {
			for(int j = 1;j <= 10-i; j++)
				System.out.print(j + " ");
			System.out.print("\n");
		}
	}
}
