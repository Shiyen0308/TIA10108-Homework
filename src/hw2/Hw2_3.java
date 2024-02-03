package hw2;

// 設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)

public class Hw2_3 {
	public static void main(String[] args) {
		int sum = 1, i = 0;
		while(++i <= 10)
			sum*=i;
		System.out.println(sum);
	}

}
