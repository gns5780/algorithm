package codingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon_11286_re {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>((o1,o2)->{
			int frist_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			
			if(frist_abs == second_abs) {
				return o1 > o2 ? 1: -1;
			}
			return frist_abs - second_abs; //절대값이 작을때
		});
		
		
		for(int i=0; i<n ;i++) {
			int request = Integer.parseInt(br.readLine());
			
			if(request == 0) {
				if(!queue.isEmpty()) System.out.println(queue.poll());
				else System.out.println("0");
			}else {
				queue.add(request);
			}
			
		}
	}

}
