import java.util.*;

public class ThePlanetExplorerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		ThePlanetExplorer p = new ThePlanetExplorer();
		double res = p.calculateSurfaceArea(radius);
		System.out.printf("%.2f", res);

		sc.close();

	}

}
