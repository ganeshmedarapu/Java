import java.util.*;
public class HalveItApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double res = HalveIt.halveTheNumber(num);
		System.out.printf("%.2f",res);
		
		sc.close();

	}

}
