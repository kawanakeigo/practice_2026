package practice_2026;

public class practice1_10 {
	public static void main(String[] args) {
		String[] countoryCode = {"JP","UK","USA"};
		int num =1;
		for (String code:countoryCode) {
			hello(num,code);
			num ++;
		}
		
	}
	
	public static void hello(int num, String code) {
		System.out.println("No."+ num + ": Hello," + code);
	}
}
