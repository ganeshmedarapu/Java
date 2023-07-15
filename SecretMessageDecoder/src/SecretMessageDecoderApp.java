import java.util.*;

public class SecretMessageDecoderApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		SecretMessageDecoder s = new SecretMessageDecoder();
		int res = s.decodeCharacter(ch);
		System.out.println(res);

		sc.close();

	}

}
