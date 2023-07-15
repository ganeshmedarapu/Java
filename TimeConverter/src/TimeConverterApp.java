import java.util.*;

public class TimeConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mint = sc.nextInt();
		TimeConverter t = new TimeConverter();
		double res = t.convertToHours(mint);
		System.out.println(res);

		sc.close();

	}

}
