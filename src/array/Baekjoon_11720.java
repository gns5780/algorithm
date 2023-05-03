package array;

import java.util.Scanner;
public class Baekjoon_11720 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char[] arr = new char[n];
		String request = sc.next();
		arr = request.toCharArray();
		int sum = 0;
		
		for(int i=0;i<arr.length; i++) {
			sum += arr[i] - '0';
		}
		System.out.println(sum);
	}
}
