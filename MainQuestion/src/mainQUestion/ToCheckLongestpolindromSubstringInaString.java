package mainQUestion;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ToCheckLongestpolindromSubstringInaString {
	public static void main(String[] args) {
		
		String str = "babad";
		String longest="";
		
        if(str.length()<2)
			System.out.println(str);;
		
		for(int left=0;left<str.length();left++) {
			for(int right=left+1;right<=str.length();right++) {
				String current=str.substring(left,right);
				if(polindrom(current) && current.length()>longest.length())
                     longest=new String(current);
				    
			}
		} 

       System.out.println(longest);
	}
	
	 private static boolean polindrom(String str1) {
			// TODO Auto-generated method stub
			int left =0,right=str1.length()-1;
			while(left<str1.length()) {
				if(str1.charAt(left++)!=str1.charAt(right--)) {
					return false;
				}
			}
			return true;
		}
	
}
