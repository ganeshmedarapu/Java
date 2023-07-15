import java.util.Scanner;

public class TheDoubleTrouble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = doubleTheNumber(num);
		System.out.println(res);
		sc.close();

	}

	public static int doubleTheNumber(int n) {
		return n * 2;
	}

}
