package hw1;
	
	/*某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，
	用程式計算10年後，本金加利息共有多少錢
	 */

public class Hw1_5 {
	public static void main(String[] args) {
		int origin = 1500000;
		System.out.printf("十年後,總共有%d or %.2f" , (int)calculate(origin),calculate(origin));
	}
	
	public static double calculate (int x) {
		return x*Math.pow(1+0.02, 10);
	}
}
