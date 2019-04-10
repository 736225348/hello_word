package 合并排序;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int arr[] = { 6, 5, 4, 3, 2, 1 };// 首先定义一个数组
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	static void sort(int arr[], int big, int end) {
		int mid = (big + end) / 2;
		if (big < end) {

			sort(arr, big, mid);// 分割左半边
			sort(arr, mid + 1, end);// 分割右半边
			he(arr, big, mid, end);
		}
	}

	static void he(int arr[], int big, int mid, int end) {
		int brr[] = new int[end - big + 1];
		int i = big;
		int j = mid + 1;
		int k = 0;// 浮动指针
		while (i <= mid && j <= end) {
			if (arr[i] > arr[j]) {
				brr[k++] = arr[j++];
			} else {
				brr[k++] = arr[i++];

			}
		} // 先往数组里插入
			// 之后在排序
		while (i <= mid) {
			brr[k++] = arr[i++];
		}

		while (j <= end) {
			brr[k++] = arr[j++];
		} // 盗回来

		for (int q = 0; q < brr.length; q++) {
			arr[q + big] = brr[q];
		}

	}
}
