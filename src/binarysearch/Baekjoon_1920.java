package binarysearch;


import java.util.Arrays;
import java.util.Scanner;
public class Baekjoon_1920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int m = sc.nextInt();
		for(int i=0;i<m;i++) {
			boolean find = false;
			int target = sc.nextInt();
			int start = 0;
			int end = a.length-1;
			while(start <= end) {
				int mid_index = (start+end)/2;
				int mid_value = a[mid_index];
				if(mid_value > target ) {
					end = mid_index -1;
				}else if(mid_value < target) {
					start = mid_index + 1 ;
				}else {
					find = true;
					break;
				}
			}
			if(find) System.out.println("1");
			else System.out.println("0");
		}
		
		
	}

}
