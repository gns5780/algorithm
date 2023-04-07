package sort;

import java.util.Scanner;
public class Beakjoon_2750 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		arr = bubble_sort(arr);
		
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static int[] bubble_sort(int[] arr) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int remember_value = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = remember_value;
				}
			}
		}
		
		return arr;
	}

}
