import java.util.*;

public class TheJourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double speed = sc.nextDouble();
		double time = sc.nextDouble();
		TheJourneyCalculator jc = new TheJourneyCalculator();
		double res = jc.calculateDistance(speed, time);
		System.out.printf("%.2f", res);
		sc.close();

	}

}
