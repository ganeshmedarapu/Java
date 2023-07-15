import java.util.*;
public class ThePowerOfSquaresApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//ThePowerOfSquares p = new ThePowerOfSquares();
		int res = ThePowerOfSquares.squareNumber(num);
		System.out.println(res);
		
		
		sc.close();
	}

}
