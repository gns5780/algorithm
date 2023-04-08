package sort;

import java.util.Scanner;
public class Beakjoon_1427 {

	public static void main(String[] args) {
		// selection sort
		Scanner sc = new Scanner(System.in);
		
		String request = sc.next();
		int[] arr = new int[request.length()];
		
		for(int i=0;i<request.length();i++) {
			arr[i] = Integer.parseInt(request.substring(i,i+1));
		}
		
		
		int remember_index;
		for(int i=0;i<arr.length;i++) {
			remember_index = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] > arr[remember_index]) {
					remember_index = j;
				}
			}
			
			if(remember_index != i ) {
				int temp = arr[i];
				arr[i] = arr[remember_index];
				arr[remember_index] = temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		
		
	}

}
