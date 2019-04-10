package µÝ¹é½×³Ë;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(fact(n));

		}
	}

	static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		
		return fact(n-1)*n;
	}

}
