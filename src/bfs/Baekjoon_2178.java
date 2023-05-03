package bfs;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjoon_2178 {
	
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};

	static boolean[][] visited;
	static int[][] arr;
	static int n;
	static int m;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0;i<n;i++) {
			String request = sc.next();
			for(int j=0;j<m;j++) {
				arr[i][j] = Integer.parseInt(request.substring(j,j+1));
			}
		}
		BFS(0,0);
		
		System.out.println(arr[n-1][m-1]);
	}
	public static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i,j});
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			visited[i][j] = true;
			for(int k=0; k<4;k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if(x >= 0 && y>= 0 && x < n && y < m) {
					if(arr[x][y] != 0 && visited[x][y] == false) {
						visited[x][y] = true;
						arr[x][y] = arr[now[0]][now[1]] + 1;
						queue.add(new int[] {x,y});
						
					}
				}
				
			}
		}
	}

}
