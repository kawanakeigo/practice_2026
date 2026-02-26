package practice_2026.SpringFramework.learnBasicJava.Calculation;

public class SubCalc implements Calculattor{
	@Override
	public Integer calc(Integer x, Integer y) {
		return x - y;
	}
}
