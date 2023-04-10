package bfs;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Beakjoon_2178_re {
	
	static int n;
	static int m;
	static boolean[][] visited;
	static int[][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		visited = new boolean[n][m];
		arr = new int[n][m];
		
		for(int i=0;i<n;i++) {
			String request = sc.next();
			for(int j=0;j<m;j++) {
				arr[i][j] = Integer.parseInt(request.substring(j,j+1));
			}
		}
		
		BFS();
		System.out.println(arr[n-1][m-1]);
	}
	public static void BFS() {
		Queue<int[]> queue = new LinkedList<>();
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		int[] now = new int[2];
		
		queue.add(new int[] {0,0});
		
		while(!queue.isEmpty()) {
			now = queue.poll();
			for(int i=0;i<4;i++) {
				int x = now[0]+ dx[i];
				int y = now[1]+ dy[i];
				
				if(x >= 0 && y >= 0 && x < n && y < m) {
					if(arr[x][y] != 0 && visited[x][y] != true) {
						visited[x][y] = true;
						queue.add(new int[] {x,y});
						arr[x][y] = arr[now[0]][now[1]] + 1;
					}
				}
			}
		}
		
	}
}
