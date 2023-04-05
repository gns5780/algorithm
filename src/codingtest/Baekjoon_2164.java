package codingtest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//카드 2
		Queue<Integer> queue = new LinkedList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		
		int cnt = 1;
		while(true) {
			if(queue.size() <= 1) break;
			if(cnt%2==1) queue.remove();
			else queue.add(queue.poll());
			cnt++;
		}
		
		System.out.println(queue.poll());
		
		
	}

}
