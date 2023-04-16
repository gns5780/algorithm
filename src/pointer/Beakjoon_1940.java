package pointer;

import java.util.Arrays;
import java.util.Scanner;

public class Beakjoon_1940 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int count = 0;
		int i=0;
		int j=n-1;
		while(i<j) {
			if(arr[i]+arr[j] < m) {
				i++;
			}else if(arr[i]+arr[j] > m) {
				j--;
			}else {
				count++;
				i++;j--;
				
			}
		}
		
		System.out.println(count);
		
	}

}
