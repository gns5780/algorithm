package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_1546 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String score = br.readLine();
		int[] score_arr = new int[n];
		int top_score = 0;
		double respons = 0;
		
		for(int i=0; i<n; i++) {
			int value = Integer.parseInt(score.split(" ")[i]);
			
			score_arr[i] = value;
			if(value > top_score) top_score = value;
		}
		
		for(int i=0; i<n; i++) {
			int value = Integer.parseInt(score.split(" ")[i]);
			double request = 0;
			request = (double)value/top_score*100;
			respons += request;
		}
		
		System.out.println(respons/n);
		
	}

}
