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
					cnt ++;
					arr_check[i][j] = true;
					bfs(i,j);
					
				}
			}
		}
		
		
		
		
		
		
		/*
		Queue<String> que = new LinkedList<String>();
		// 값 추가
		que.add("1");
		que.add("2");
		que.add("3");
		que.add("4");
		que.add("6");
		que.add("5");
		que.add("6");
		que.poll(); // 맨 앞의 값 삭제
		System.out.print(que); // 결과 출력
		
		que.remove(); // 맨 앞의 값 삭제
		System.out.print(que); // 결과 출력
		
		que.remove("6"); // 해당하는 값 삭제
		System.out.print(que); // 결과 출력
		*/
	}
	public static void bfs(int x, int y) {
		System.out.println(N);
		System.out.println(M);
		
		Queue<Integer[]> que = new LinkedList<Integer[]>();
		//que.add(1,2);
		
		int[] xm = {1,0,-1,0};
		int[] ym = {0,1,0,-1};
		int remember_x = 0;
		int remember_y = 0;
		
		for(int i=0;i<4;i++) {
			remember_x = x + xm[i];
			remember_y = y + ym[i];
			if(x > 0 && y > 0 && x < N && y < M) {
				if(arr[remember_x][remember_y] == 1) {
					//que_x.add(remember_x);
					//que_y.add(remember_y);					
				}
			}
		}
		
		
		
		
	}

}
