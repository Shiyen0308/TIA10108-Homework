package hw2;

public class Hw2_7 {
	public static void main(String[] args) {
		int initi_alpha = (int)'A';
		for(int i = 0; i < 5 ; i++ ) {
			for(int j = 0 ; j <= i ; j++)
				System.out.print((char)(initi_alpha+i));
		System.out.println();
		}
			
	}
}
