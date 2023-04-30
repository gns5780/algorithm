package dfs;

import java.util.Scanner;

public class Beakjoon_1012 {
	static boolean[][] visited;
	static int[][] arr;
	static int result;
	static int n;
	static int m;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			n = sc.nextInt();
			m = sc.nextInt();
			int k = sc.nextInt();
			visited = new boolean[n][m];
			arr = new int[n][m];
			for(int j=0;j<k;j++) {
				arr[sc.nextInt()][sc.nextInt()] = 1;
			}
			
			for(int q=0;q<n;q++) {
				for(int w=0;w<m;w++) {
					if(visited[q][w] == false && arr[q][w] == 1) {
						dfs(q,w);
						result++;
					}
				}
			}
			System.out.println(result);
			result = 0;
			
		}
		
	}
	static void dfs(int x, int y) {
		visited[x][y] = true;
		int[] xm = {0,-1,0,1};
		int[] ym = {1,0,-1,0};
		for(int i=0;i<4;i++) {
			if(x+xm[i] >=0 && y+ym[i] >=0 && x+xm[i] <n && y+ym[i] <m) {
				if(visited[x+xm[i]][y+ym[i]] == false && arr[x+xm[i]][y+ym[i]] == 1 ) {
					visited[x+xm[i]][y+ym[i]] = true;
					dfs(x+xm[i],y+ym[i]);
				}
			}
						
		}
		
		
	}
}
