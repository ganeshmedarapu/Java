import java.util.*;
public class SemesterMarksAveragerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		int s5 = sc.nextInt();
		int s6 = sc.nextInt();
		int s7 = sc.nextInt();
		int s8 = sc.nextInt();
		SemesterMarksAverage s = new SemesterMarksAverage();
		double res = s.calculateAverage(s1, s2, s3, s4, s5, s6, s7, s8);
		System.out.printf("%.2f",res);
		sc.close();
	}

}
