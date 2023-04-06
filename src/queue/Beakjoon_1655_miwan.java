package queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Beakjoon_1655_miwan {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> min_queue = new PriorityQueue<Integer>();
		PriorityQueue<Integer> max_queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i=0;i<n;i++) {
			int request = Integer.parseInt(br.readLine());
			if(i == 0) min_queue.add(request);
			else {
				max_queue.add(request);
			}
			
			System.out.println(min_queue.peek());
		}
	}
}
