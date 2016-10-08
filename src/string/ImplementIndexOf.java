package string;

public class ImplementIndexOf {

	 public int strStr(String haystack, String needle) {
	        for(int i=0; ;i++){
	            for(int j=0; ;j++){
	                if(j>=needle.length()) return i;
	                if(i+j>=haystack.length()) return -i;
	                if(haystack.charAt(i+j)!=needle.charAt(j)) break;
	                
	            }
	        }
	    }
}
