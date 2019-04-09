package 最长连续子序列和;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int luo = 0;
			for (int q = 0; q < n; q++) {
				int a = sc.nextInt(); // 定义数组的长度
				int arr[] = new int[a];
				// 创建 一个数组
				for (int i = 0; i < arr.length; i++) {// 赋值
					arr[i] = sc.nextInt();
				}
				if (abc(arr) == 0) {
					int ji = abc2(arr);
					Arrays.sort(arr);
					luo++;
					System.out.println("Case " + luo + ":");
					System.out.println(arr[arr.length - 1] + " " + (ji + 1) + " " + (ji + 1));

				} else {

					int big1 = 0;
					int end1 = 0;
					int big2 = 0;
					int sum = 0;
					int max = 0;
					for (int i = 0; i < arr.length; i++) {

						if (sum < 0) {
							sum = 0;
							big2 = i;// 设置新的游走指针

						}
						sum = sum + arr[i];
						if (sum > max) {
							big1 = big2;
							end1 = i;
							max = sum;
						}

					}
					luo++;

					System.out.println("Case " + luo + ":");
					System.out.println(max + " " + (big1 + 1) + " " + (end1 + 1));

				}
				if (q != n - 1) {
					System.out.println();
				}
			}

		}
	}

	static int abc(int arr[]) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				sum = 1;
				break;
			}
		}

		return sum;

	}

	static int abc2(int arr[]) {

		int max = -10000;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				sum = i;
			}

		}

		return sum;

	}

}
