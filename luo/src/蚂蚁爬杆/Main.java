package ��������;
/*
 * 2019��4��10�� 
 * ����˼�� �ǿɽ��������߽����������ɿ��Դ��� 
 * 
 * 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			for (int q = 0; q < a; q++) {

				int L = sc.nextInt();// ���ӵĳ���
				int s = sc.nextInt();// ����ֻ����
				int arr[] = new int[s];// ����Ϣ��������
				for (int i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				int min = 0;
				int max = -1;
				for (int i = 0; i < arr.length; i++) {
					if (min < Math.min(arr[i], L - arr[i])) {
						min = Math.min(arr[i], L - arr[i]);
					}

					if (max < Math.max(arr[i], L - arr[i])) {
						max = Math.max(arr[i], L - arr[i]);
					}

				}
				System.out.println(min + " " + max);

			}
		}
	}

}
