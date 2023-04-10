package codingtest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Beakjoon_1926_miwan {

	static int N; //그림 가로길이
	static int M; //그림 세로길이
	static boolean[][] arr_check; //방문 여부
	static int[][] arr;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		M = in.nextInt();
		int rs = 0;
		int cnt = 0;
		arr_check = new boolean[N][M];
		
		arr = new int[N][M];		// 배열
		
		for(int i = 0; i < N; i++) {
			for(int j =0; j<M; j++) {
				arr[i][j] = in.nextInt();				
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(arr[i][j] == 1 && arr_check[i][j] != true){
					cnt++;
					arr_check[i][j] = true;
					bfs(i,j);
					
				}
			}
		}
		System.out.println(cnt);
		
	}
	public static void bfs(int x, int y) {
		
		Queue<int[]> queue = new LinkedList<>();
		//que.add(1,2);
		
		int[] xm = {1,0,-1,0};
		int[] ym = {0,1,0,-1};
		int remember_x = 0;
		int remember_y = 0;
		while(!queue.isEmpty()) {
			x = queue.peek()[0];
			y = queue.peek()[1];
			queue.poll();
			for(int i=0;i<4;i++) {
				remember_x = x + xm[i];
				remember_y = y + ym[i];
				if(x > 0 && y > 0 && x < N && y < M) {
					if(arr[remember_x][remember_y] == 1 && arr_check[remember_x][remember_y] == false) {
						arr_check[remember_x][remember_y] = true;
						queue.add(new int[] {remember_x,remember_y});
					}
				}
			}			
		}
		
		
		
		
		
	}

}
