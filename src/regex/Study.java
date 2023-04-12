package regex;

public class Study {

	public static void main(String[] args) {
		//검증 사이트
		//https://regexr.com/5mhou
		
		//기본 문법
		//https://fred16157.github.io/etc/regular-expression/
		
		
		String a = "10+20-30+40-50";
		String[] arr = a.split("\\+|-\\b");
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
