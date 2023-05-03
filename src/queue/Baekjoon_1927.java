package queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Baekjoon_1927 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<n;i++) {
			int request = Integer.parseInt(br.readLine());
			if(request == 0) {
				if(queue.isEmpty()) System.out.println(0);
				else System.out.println(queue.poll());
			}else {
				queue.add(request);
			}
		}
		
		
	}

}
