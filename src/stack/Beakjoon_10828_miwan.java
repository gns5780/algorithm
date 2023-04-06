package stack;
import java.util.Scanner;
import java.util.Stack;

public class Beakjoon_10828_miwan {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<n;i++) {
			String request = sc.next();
			
			if(request.indexOf("push") >= 0) {
				
				stack.push(sc.nextInt());
				
			}
			else if(request.indexOf("pop") >= 0) {
				
				if(!stack.isEmpty()) System.out.println(stack.pop());
				else System.out.println("-1");
				
			}
			else if(request.indexOf("size") >= 0) {
				
				System.out.println(stack.size());
			}
			else if(request.indexOf("empty") >= 0) {
				
				if(stack.isEmpty()) System.out.println("1");
				else System.out.println("0");
				
			}
			else if(request.indexOf("top") >= 0) {
				
				if(!stack.isEmpty()) System.out.println("");
				else System.out.println("-1");
				
			}
		}
		sc.close();
	}

}
