package test;
public class Test {

	public static void main(String[] args) throws Exception{
		int input = 101110;
		  int di = 1;
		  int remain, sum = 0;

		  while (input > 0) {
		    remain = input % 2;
		    sum = sum + (remain * di);
		    di = di * 2;
		    input = input / 10;
		  }

		  System.out.println(sum);

	}

}