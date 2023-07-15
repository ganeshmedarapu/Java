import java.util.*;

public class TheHeightConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inches = sc.nextDouble();
		TheHeightConverter h = new TheHeightConverter();
		double res = h.convertInchesToFeet(inches);
		System.out.printf("%.2f", res);

		sc.close();

	}

}
