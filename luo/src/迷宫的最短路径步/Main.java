package 迷宫的最短路径步;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static int n;
	static int m;
	static char arr[][];
	static int zou[][];
	static LinkedList<Node> linkedList = new LinkedList<Node>();
	static int x;
	static int y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			n = sc.nextInt();// 定义宽

			m = sc.nextInt();// 定义长
			arr = new char[n][m];
			zou = new int[n][m];
			for (int i = 0; i < n; i++) {
				String str = sc.next();
				char brr[] = str.toCharArray();
				for (int k = 0; k < m; k++) {
					arr[i][k] = brr[k];
					if (arr[i][k] == 'G') {
						x = i;
						y = k;
					}
				}
			}

			// 到这将图完成的读入了
			// 接下来就是递归了
			// x y 是坐标 G的 坐标
			Node node = new Node(x, y);
			linkedList.add(node);
			bfs();
			for (int i = 0; i < n; i++) {

				for (int k = 0; k < m; k++) {
					System.out.print(zou[i][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
	
		}
	}

	static void bfs() {
		int sum = 1;
		while (linkedList.isEmpty() == false) {		
			int dx = linkedList.peek().getX();// 得到当前的点
			int dy = linkedList.peek().getY();
			arr[dx][dy] = '#';
			
			
		
			if (dx  + 1< n && arr[dx + 1][dy] != '#') {
				linkedList.add(new Node(dx + 1, dy));
				zou[dx + 1][dy]=zou[dx][dy]+1;
			
			}
			if (dy + 1 < m && arr[dx][dy + 1] != '#') {
				linkedList.add(new Node(dx, dy + 1));
				zou[dx][dy+1]=zou[dx][dy]+1;
			}
			if (dx - 1 >= 0 && arr[dx - 1][dy] != '#') {
				linkedList.add(new Node(dx - 1, dy));
				zou[dx-1][dy]=zou[dx][dy]+1;
			
			}
			if (dy - 1 >= 0 && arr[dx][dy - 1] != '#') {
				linkedList.add(new Node(dx, dy - 1));
				zou[dx][dy-1]=zou[dx][dy]+1;
			}
			linkedList.pop();
			
//			for (int i = 0; i < n; i++) {
//
//				for (int k = 0; k < m; k++) {
//					System.out.print(arr[i][k] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
			for (int i = 0; i < n; i++) {

				for (int k = 0; k < m; k++) {
					System.out.print(zou[i][k] + " ");
				}
				System.out.println();
			}
			System.out.println();

		}

	}

}

class Node {// 定义了一个节点

	int x;
	int y;
	int sum;

	Node(int x, int y) {
		this.x = x;
		this.y = y;

	}

	void setsum(int sum) {
		this.sum = sum;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
