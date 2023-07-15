import java.util.*;

public class TheFinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principal = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		TheFinanceCalculator c = new TheFinanceCalculator();
		double res = c.calculateSimpleInterest(principal, rate, time);
		System.out.printf("%.2f",res);
		sc.close();

	}

}
