package practice_2026;

public class practice1_10 {
	public static void main(String[] args) {
		String[] countoryCode = {"JP","UK","USA"};
		int num =1;
		for (String code:countoryCode) {
			hello(num,code);
			num ++;
		}
		
		int result =sumNumber(3,4);
		System.out.println(result);
		
		int targetNumber = 2;
		
		if(isEven(targetNumber)) {
			System.out.println("偶数である");
		}else {
			System.out.println("奇数である");
		}
		
	}
	
	public static void hello(int num, String code) {
		System.out.println("No."+ num + ": Hello," + code);
	}
	
	public static int sumNumber(int a,int b) {
		int sum = a+b;
		return sum;
		
	}
	
	public static boolean isEven(int num) {
		return num % 2==0;
	}
}
