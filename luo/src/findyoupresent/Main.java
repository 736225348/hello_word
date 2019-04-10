package findyoupresent;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			int arr[] = new int[n];
			int sum = -0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				
			}

			System.out.println(sum);

		}
	}

}
