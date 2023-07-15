import java.util.*;

public class TheTemparatureConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f = sc.nextDouble();
		TheTemparatureConverter tc = new TheTemparatureConverter();
		double res = tc.convertFahrenheitToCelsius(f);
		System.out.printf("%.2f",res);

		sc.close();
	}

}
