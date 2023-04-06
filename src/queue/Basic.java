package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> que = new LinkedList<String>();
		// 값 추가
		que.add("1");
		que.add("2");
		que.add("3");
		que.add("4");
		que.add("6");
		que.add("5");
		que.add("6");
		que.poll(); // 맨 앞의 값 삭제
		System.out.print(que); // 결과 출력
		
		que.remove(); // 맨 앞의 값 삭제
		System.out.print(que); // 결과 출력
		
		que.remove("6"); // 해당하는 값 삭제
		System.out.print(que); // 결과 출력
	}

}
