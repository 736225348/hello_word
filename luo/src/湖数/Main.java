package 湖数;

import java.util.Scanner;



public class Main {
	static char arr[][];
	static int n;
	static int m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			arr = new char[n+1][m+1];
			for (int i = 0; i < n; i++) {

				String str = sc.next();
				char ss[] = str.toCharArray();
				for (int k = 0; k < m; k++) {
					arr[i][k] = ss[k];
				}
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				for (int k = 0; k < m; k++) {
					if (arr[i][k] == 'W') {

						sum++;
						dfs(i, k);

					}

				}
			}

			System.out.println(sum);

		}
	}

	static void dfs(int i, int j) {// 当发现有w的时候进入
		// 设置出口
		
		
		arr[i][j] = '.';
		for (int dx = -1; dx <= 1; dx++) {
			for (int dy = -1; dy <= 1; dy++) {
				int nx = i + dx;
				int ny = j + dy;
				if (nx < n && nx >= 0 && ny < m && ny >= 0 && arr[nx][ny] == 'W') {
					
					dfs(nx, ny);

				}

			}
		}

	}
}
