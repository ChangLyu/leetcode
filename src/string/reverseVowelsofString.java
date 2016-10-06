package string;

import java.util.HashSet;
import java.util.Stack;

//Write a function that takes a string as input and reverse only the vowels of a string.
public class reverseVowelsofString {
    public static String reverseVowels(String s) {
    	 if(s == null || s.length()==0) return s;
	  char[] ca= s.toCharArray();
      String vowel="AEIOUaeiou";
      int begin=0;
      int end=s.length()-1;
      while(begin<end){
          while(begin<end&&!vowel.contains(ca[begin]+"")){
              begin++;
          }
          while(begin<end&&!vowel.contains(ca[end]+"")){
              end--;
          }
         char c=ca[begin];
         ca[begin]=ca[end];
         ca[end]=c;
         begin++;
         end--;
      }
       return new String(ca);
}
    public String reverseVowels2(String s) {
        if(s == null || s.length()==0){
            return s;
        }
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        // reverse the  vowels while popping up
        Stack<Character> vStack = new Stack<>();
        for(char c : s.toCharArray()){
            if(vowels.contains(c)){
                vStack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(vowels.contains(c)){
                sb.append(vStack.pop());
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
    	String s=reverseVowels("basdeiou");
    	System.out.println(s);
	}
}
