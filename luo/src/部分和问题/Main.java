package ���ֺ�����;

import java.util.Scanner;

public class Main {
	static int k;
	static int arr[];
	static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextInt();// ׼�������ĸ���
			arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			k = sc.nextInt();// k����ô�ܵ� k
			System.out.println(fact(0,0));
		}
	}

	static boolean fact(int sum, int i) {
		if (i == n) {
			return sum == k;

		} else {
			if (fact(sum,i + 1)) {

				return 1 == 1;
			}
			
			if (fact( sum+arr[i],i+1)) {

				return 1 == 1;
			}
			return 1==2;

		}

	}

}
