package hw1;

	//算出256559秒為多少天、多少小時、多少分與多少秒

public class Hw1_3 {
	public static void main (String[] args) {
		int num1 =256559, 
			day = num1/(3600*24),
			hour = (num1 - (day * 3600 * 24))/3600,
			min = (num1 -(day * 3600 * 24)-(hour *3600))/60,
			sec = (num1 -(day * 3600 * 24)-(hour *3600)-(min *60));
		System.out.println("256559秒為"+ day + "天" + hour + "小時" + min + "分" + sec + "秒");
	}
}
