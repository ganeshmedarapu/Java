import java.util.*;
public class TheStringJoiner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String res = joinStrings(a, b);
		System.out.println(res);
		sc.close();

	}
	public static String joinStrings(String a,String b)
	{
		return a+b;
	}

}
