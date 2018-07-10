package generics;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		String a="creative";
		String b="reactive";
		boolean status=true;
		if(a.length()!=b.length()){
			status=false;
		}
		else{
			char a1[]=a.toLowerCase().toCharArray();
			char b1[]=b.toLowerCase().toCharArray();
			Arrays.sort(a1);
			Arrays.sort(b1);
			if(Arrays.equals(a1, b1)){
				System.out.println("the two arrays are anagram");
			}
			else{
				System.out.println("the two arrays arent anagram");
			}
			
		}
		
		
		
	}

}
