package binarysearch;

import java.util.Arrays;
import java.util.Scanner;
public class Baekjoon_10816_re_miwansung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int request = 0;
		Arrays.sort(arr);
		
		for(int i=0;i<m;i++) {
			int st = 0;
			int en = 0;
			int result = 0;
			request = sc.nextInt();
			int start_index = 0;
			int end_index = arr.length-1;
			int mid_index = 0;
			while(start_index <= end_index) {
				mid_index = (start_index+end_index)/2;
				if(request > arr[mid_index]) start_index = mid_index+1;
				else if(request < arr[mid_index]) end_index = mid_index-1; 
				else break;
			}
			
			if(arr[mid_index] == request) {
				for(int j=mid_index;j>=0;j--) {
					if(arr[j] < request) break;
					st = j;
				}
				for(int j = st; j<n;j++) {
					result++;
					if(request > arr[j]) break;
				}
				System.out.print(result + " ");
			}
			else {
				System.out.print("0 ");
			}
			System.out.println(mid_index);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			//System.out.println(mid_index);
			//System.out.print("en : " + en);
			//System.out.println("st : " + st);
			//System.out.print(result + " ");
			//System.out.println();
			
		}
		
		
	}

}
/*
-10
-10
2
3
3
6
7
10
10
10
*/
