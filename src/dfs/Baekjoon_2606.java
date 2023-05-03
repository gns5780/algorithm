package dfs;

import java.util.Scanner;

public class Baekjoon_2606 {
	static boolean[][] graph;
	static boolean[] checked;
	static int n;
	static int m;
	static int answer;
	
	public static void dfs(int index) {
		answer++;
		checked[index] = true;
		for(int i=1;i<=n;i++) {
			if(!checked[i] && graph[index][i]) dfs(i);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        graph = new boolean[n + 1][n + 1];
        checked = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = graph[y][x] = true;
        }

        dfs(1);

        System.out.println(answer - 1);
        sc.close();
	}
	
}
