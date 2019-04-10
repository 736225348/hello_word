package 畅通工程;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();// 一共有n个城镇

			if (n == 0) {
				break;
			}

			int m = sc.nextInt();// 有 m 个 通道
			int arr[] = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				arr[i] = i;
			}

			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				arr[bing(a, arr)] = arr[bing(b, arr)];
			}
			int sum = 0;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] == i) {
					sum++;
				}

			}
			System.out.println(sum - 1);

		}
	}

	static int bing(int a, int arr[]) {
		if (arr[a] == a) {
			return a;

		} else {
			return bing(arr[a], arr);

		}

	}

}
