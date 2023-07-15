import java.util.*;

public class TheCubeMysteryApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = TheCubeMystery.cubeNumber(n);
		System.out.println(res);

		sc.close();
	}

}
