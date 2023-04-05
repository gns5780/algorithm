package codingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = 7;
		int[] scoville = {1,2,5,3,9,10,12};
		
		int result = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=0;i<scoville.length;i++) {
			queue.add(scoville[i]);
		}
		
		while(queue.peek() < K && scoville.length > 1) {
			queue.add(queue.poll() + (queue.poll()*2));
			result ++;
		}
		
		if(queue.peek() < K) System.out.println("-1");
		else System.out.println(result);
	}
	
}
