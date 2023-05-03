package dfs;
import java.util.Scanner;

public class Baekjoon_10026 {
	
	static int n;
	static boolean[][] visited;
	static boolean[][] visited_rg;
	static String[][] arr;
	static String[][] arr_rg;
	static int answer = 0;
	static int answer_rg = 0;
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		n = Integer.parseInt(sc.nextLine());
		arr = new String[n][n];
		arr_rg = new String[n][n];
		visited = new boolean[n][n];
		visited_rg = new boolean[n][n];
		
		for(int i=0;i<n;i++) {
			String request = sc.nextLine();
			for(int j=0;j<n;j++) {
				arr[i][j] = request.substring(j,j+1);
				
				arr_rg[i][j] = request.substring(j,j+1);
				if(arr_rg[i][j].equals("G")) arr_rg[i][j] = "R";
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(visited[i][j] == false) {
					bfs(i,j,arr[i][j]);
					visited[i][j] = true;
					answer++;
				}
				if(visited_rg[i][j] == false) {
					bfs_rg(i,j,arr_rg[i][j]);
					visited_rg[i][j] = true;
					answer_rg++;
				}
			}
		}
		
		System.out.println(answer);
		System.out.println(answer_rg);
		
		sc.close();
	}
	
	public static void bfs(int x, int y, String color) {
		int[] xm = {0,-1,0,1};
		int[] ym = {1,0,-1,0};
		
		for(int i=0;i<4;i++) {
			int fx = x+xm[i];
			int fy = y+ym[i];
			
			if(fx >= 0 && fx < n && fy >= 0 && fy < n) {
				if(visited[fx][fy] == false && arr[fx][fy].equals(color)) {
					visited[fx][fy] = true;
					bfs(fx,fy,arr[fx][fy]);
				}
			}
		}
	}
	public static void bfs_rg(int x, int y, String color) {
		int[] xm = {0,-1,0,1};
		int[] ym = {1,0,-1,0};
		
		for(int i=0;i<4;i++) {
			int fx = x+xm[i];
			int fy = y+ym[i];
			
			if(fx >= 0 && fx < n && fy >= 0 && fy < n) {
				if(visited_rg[fx][fy] == false && arr_rg[fx][fy].equals(color)) {
					visited_rg[fx][fy] = true;
					bfs_rg(fx,fy,arr_rg[fx][fy]);
				}
			}
		}
	}
	
}
