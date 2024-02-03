package hw1;

	//定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長

public class Hw1_4 {
	public static void main(String[] args) {
		final double PI = 3.1415;
		System.out.printf("圓面積為 %.4f%n" +"圓周長為 %.4f" ,PI * Math.pow(5,2), PI * 2 * 5);
	}
}
