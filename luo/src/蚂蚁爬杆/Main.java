package 蚂蚁爬杆;
/*
 * 2019年4月10日 
 * 本体思想 是可将蚂蚁行走交叉可以想象成可以穿过 
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

				int L = sc.nextInt();// 杆子的长度
				int s = sc.nextInt();// 有三只蚂蚁
				int arr[] = new int[s];// 将信息传入数组
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
