package �ϲ�����;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int arr[] = { 6, 5, 4, 3, 2, 1 };// ���ȶ���һ������
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	static void sort(int arr[], int big, int end) {
		int mid = (big + end) / 2;
		if (big < end) {

			sort(arr, big, mid);// �ָ�����
			sort(arr, mid + 1, end);// �ָ��Ұ��
			he(arr, big, mid, end);
		}
	}

	static void he(int arr[], int big, int mid, int end) {
		int brr[] = new int[end - big + 1];
		int i = big;
		int j = mid + 1;
		int k = 0;// ����ָ��
		while (i <= mid && j <= end) {
			if (arr[i] > arr[j]) {
				brr[k++] = arr[j++];
			} else {
				brr[k++] = arr[i++];

			}
		} // �������������
			// ֮��������
		while (i <= mid) {
			brr[k++] = arr[i++];
		}

		while (j <= end) {
			brr[k++] = arr[j++];
		} // ������

		for (int q = 0; q < brr.length; q++) {
			arr[q + big] = brr[q];
		}

	}
}
