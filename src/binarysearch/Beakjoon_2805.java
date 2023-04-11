package binarysearch;
import java.util.Scanner;
import java.util.Arrays;
public class Beakjoon_2805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		
		int target_value = 0;
		int start_value = 0;
		int end_value = arr[arr.length-1];
		long sum = 0;
		int answer = 0;
		while(start_value <= end_value) {
			sum = 0;
			target_value = (start_value + end_value) /2;
			for(int i=0;i<n;i++) {
				if(arr[i] > target_value) sum += arr[i] - target_value;
			}
			if(sum >= m ) {
				if(target_value > answer) {
					answer = target_value;
				}
			}
			
			if(sum > m) start_value = target_value+1;
			else if(sum < m) end_value = target_value-1;
			else break;
		}
		
		System.out.println(answer);
	}
}


