package codingtest;

import java.util.Stack;

public class Stack_training {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>(); //int형 스택 선언
		stack.push(1);     // stack에 값 1 추가
		stack.push(2);     // stack에 값 2 추가
		stack.push(3);     // stack에 값 3 추가
		stack.push(4);     // stack에 값 3 추가
		stack.push(5);     // stack에 값 3 추가
		stack.peek();     // stack의 가장 상단의 값 출력
		stack.pop();
		stack.peek();     // stack의 가장 상단의 값 출력
		stack.pop();
		stack.peek();     // stack의 가장 상단의 값 출력
		stack.pop();
		System.out.println(stack);
		
	}
}
