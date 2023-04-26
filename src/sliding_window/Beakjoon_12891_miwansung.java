package sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon_12891_miwansung {
	
	static int myarr[];
	static int checkarr[];
	static int checksecret;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		int result = 0;
		checkarr = new int[4];
		myarr = new int[4];
		char a[] = new char[s];
		checksecret = 0;
		
		a = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<4;i++){
			checkarr[i] = Integer.parseInt(st.nextToken());
			if(checkarr[i] == 0){
				checksecret++;
			}
		}
		
		for(int i=0;i<p;i++) {
			ADD(a[i]);
			
			
		}
		if(checksecret == 4 ) result++;
		
		for(int i=p; i<s; i++) {
			int j = i-p;
			ADD(a[i]);
			Remove(a[j]);
			if(checksecret == 4) result++;
		}
		
		System.out.println(result);
	}
	
	private static void Remove(char c) {
		switch(c) {
		case 'A':
			if(myarr[0] == checkarr[0]) checksecret--;
			myarr[0]--;
		case 'C':
			if(myarr[1] == checkarr[1]) checksecret--;
			myarr[1]--;
		case 'G':
			if(myarr[2] == checkarr[2]) checksecret--;
			myarr[2]--;
		case 'T':
			if(myarr[3] == checkarr[3]) checksecret--;
			myarr[3]--;
		}
	}

	private static void ADD(char c) {
		switch(c) {
			case 'A':
				myarr[0]++;
				if(myarr[0] == checkarr[0]) checksecret++;
			case 'C':
				myarr[1]++;
				if(myarr[1] == checkarr[1]) checksecret++;
			case 'G':
				myarr[2]++;
				if(myarr[2] == checkarr[2]) checksecret++;
			case 'T':
				myarr[3]++;
				if(myarr[3] == checkarr[3]) checksecret++;
		}
	}
	
}
