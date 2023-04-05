package codingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class Beakjoon_11286 {

	public static void main(String[] args) throws Exception{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>((o1, o2)->{
			//절대값이 작은 데이터 우선
			//절대값이 같은 경우 음수 우선
			int frist_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			
			if(frist_abs == second_abs) {
				return o1 > o2 ? 1: -1;
			}
			return frist_abs - second_abs;
		});
		
		for(int i=0;i<n;i++) {
			int request = Integer.parseInt(br.readLine());
			int answer = 0;
			if(request == 0) {
				if(queue.size() != 0 ) {
					answer = queue.poll();
				}
				System.out.println(answer);
			}else {
				queue.add(request);
			}
			
			
		}
		
	}
}
