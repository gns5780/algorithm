package prefix_sum;

import java.util.Scanner;
public class Beakjoon_11659 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n+1];
		arr2[0] = 0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(i == 1) arr2[i] = arr[0];
			else if(i >= 2) arr2[i] = arr2[i-1] + arr[i-1];
		}
		arr2[n] = arr2[n-1] + arr[n-1];
		
		for(int i=0;i<m;i++) {
			int start_index = sc.nextInt();
			int end_index = sc.nextInt();
			
			System.out.println(arr2[end_index] - arr2[start_index-1]);
		}
	}

}
