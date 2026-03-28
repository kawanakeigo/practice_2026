package practice_2026.SpringFramework.learnBasicJava.Calculation;

public class Call {
	public static void main(String[] args) {
		Calculattor calulator = new AddCalc();
		
		Integer result = calulator.calc(10,5);
		
		System.out.println("計算結果は" +result+ "です");
	}
}
