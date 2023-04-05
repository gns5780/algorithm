package queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Beakjoon_1715 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long answer = 0;
		PriorityQueue<Long> queue = new PriorityQueue<>();
		
		for(int i=0;i<n;i++) {
			queue.add(Long.parseLong(br.readLine()));
		}
		if( n <= 1) {
			answer = 0;
		}
		else {
			while(queue.size() >= 2) {
				long frist_value = queue.poll();
				long second_value = queue.poll();
				
				queue.add(frist_value + second_value);
				answer += frist_value + second_value;
			}
		}
		
		
		
		System.out.println(answer);
	}

}
