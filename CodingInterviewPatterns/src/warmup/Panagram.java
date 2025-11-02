package warmup;

import java.util.HashSet;
import java.util.Set;

public class Panagram {
	
	public static boolean checkIfPangram(String sentence) {
	    char[] arr = sentence.toCharArray();
	    
	   Set<Character> seen = new HashSet<>();
	  
	    
	    for(int i = 0; i< arr.length; i++) {
	    	Character current = arr[i];
	    	if(isUpperCaseLetter(current) || isLowerCaseLetter(current)) {
	    		current = Character.toLowerCase(current);
	    		seen.add(current);
	    	}
	    }
	    //System.out.println(seen.size());
	    
	    return seen.size() == 26;
	  }
	
	 private static boolean isUpperCaseLetter(char ch) {
		 return Integer.valueOf(ch) >= 65 && Integer.valueOf(ch) <= 90;
	 }
	 
	 private static boolean isLowerCaseLetter(char ch) {
		 return Integer.valueOf(ch) >= 97 && Integer.valueOf(ch) <= 122;
	 }

	public static void main(String[] args) {
		String str = "This is not a pangram";
		System.out.println(checkIfPangram(str));
	}

}
