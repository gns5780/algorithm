package dfs;

import java.util.Scanner;

public class Baekjoon_2638 {
	static int n;
	static int m;
	static int[][] arr;
	static boolean[][] clean;
	static int air_count;
	static int air_count2;
	static boolean[][] visited;
	static int[] xm = {0,-1,0,1};
	static int[] ym = {1,0,-1,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean break_check = false;
		int answer = 0;
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];
		clean = new boolean[n][m];
		visited = new boolean[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		while(true) {
			break_check = true;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(arr[i][j] == 1) {
						air_count2=0;
						break_check=false;
						for(int k=0;k<4;k++) {
							if(arr[i+xm[k]][j+ym[k]] == 0) {
								air_count = 0;
								if(dfs(i+xm[k],j+ym[k]) == 1) air_count2++;
								visited_reset();
							}
						}
						
						if(air_count2>=2) clean[i][j]=true;
						
					}
				}
			}
			
			if(break_check) break;
			answer++;
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(clean[i][j] == true) {
						arr[i][j]=0;
						clean[i][j]=false;
					}
				}
			}
			
		}
		
		System.out.println(answer);
		
	}
	static int dfs(int x,int y) {
		
		visited[x][y] = true;
		
		for(int i=0;i<4;i++) {
			int fx = x+xm[i];
			int fy = y+ym[i];
			if(fx>=0 && fx<n && fy>=0 && fy<m) {
				if((fx==0 || fx==n || fy==0 || fy==m) && arr[fx][fy] == 0) {
					air_count++;
					break;
				}else if(arr[fx][fy] == 0 && visited[fx][fy] == false){
					dfs(fx,fy);
				}
			}
		}
		
		if(air_count>=1) return 1;
		return 0;
	}
	
	static void visited_reset() {
		for(int k=0;k<n;k++) {
			for(int l=0;l<m;l++) {
				visited[k][l] = false;
			}
		}
	}
}
