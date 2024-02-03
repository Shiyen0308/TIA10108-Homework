package hw1;

public class Hw1_6 {
	public static void main(String[] args) {
		/* 因為兩者皆為int datatype,
		   所以可以直接相加, 輸出為10 
		*/
		System.out.println(5 + 5);
		/* char'5' 以Unicode 編碼為0035;
		   0035換成十進位制為 0053
		   5 加上 53 為 58, 所以輸出為58
		*/
		System.out.println(5 + '5');
		/* int 和 String 相加, 會直接串接,
		   所以會輸出 55
		*/
		System.out.println(5 + "5");
	}
}
