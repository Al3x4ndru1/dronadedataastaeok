package comanda;

import java.util.Random;

public class utilizator {
	utilizator() {
		main();
	}

	public static int Randomut() {
		Random u = new Random();
		return u.nextInt(100);
	}

	public static void main() {
		int n = Randomut();
		int cate;
		System.out.println(n);
		for (int i = 0; i < n; i++) {
			cate = Randomut();
		}

	}
}