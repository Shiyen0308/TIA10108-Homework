package hw2;

	//設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100

public class Hw2_4 {
	public static void main(String[] args) {
		int sum = 0;
		outer:
			for(int i = 1; ;i+=2) {
				sum += i;
				if (sum > 100)
					break outer;
				else
					System.out.print(sum + " ");
			}
		
	}
}
