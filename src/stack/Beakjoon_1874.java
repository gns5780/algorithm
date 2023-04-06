package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Beakjoon_1874 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] request = new int[n];
		int value = 1;
		StringBuffer respon = new StringBuffer();
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i=0; i<n; i++) {
			request[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<n;i++) {
			
			if(request[i] >= value) {
				while(request[i] >= value) {
					st.push(value++);
					respon.append("+\n");
				}
				st.pop();
				respon.append("-\n");
			}else {
				if(st.peek() > request[i]) {
					System.out.println("NO");
					respon.delete(0, respon.length());
					break;
				}else {
					st.pop();
					respon.append("-\n");
				}
			}
		}
		
		
		System.out.println(respon.toString());
	}
}
