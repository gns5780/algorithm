package pointer;

import java.util.Scanner;

public class Beakjoon_2018 {
	
	public static void main(String[] args) throws Exception{
		//투포인터
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while(end_index != n) {
			if(sum == n) {
				count++;
				end_index++;
				sum = sum + end_index;
			}else if(sum > n) {
				sum = sum - start_index;
				start_index++;
			}else {
				end_index++;
				sum = sum + end_index;
			}
			
		}
		
		System.out.println(count);
		 
	}
}
