package practice_2026;

public class practice1_6 {
	public static void main(String[] args) {
		int number =20;
		System.out.println("更新前");
		if (number >15) {
			System.out.println("15以上です");
		}
		
		number = 14;
		System.out.println("更新後");
		if(number >=15) {
			System.out .println("十五以上です");
			
		}else{
			System.out.println("15以下です");
		}
		
		System.out.println("完了");
		
		int dayOfWeek =2;
		
		switch(dayOfWeek) {
		case 1:
			System.out.println("月曜");
			break;
		
		case 2:
			System.out.println("火曜日");
			break;
		
		default:
			System.out.println("そのほかの曜日");
			break;
		}
		
	}
	
	
}
