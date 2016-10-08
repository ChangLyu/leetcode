package string;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s.length()==0)return 0;
        int result=0;
        int[] array=new int[58];
        for(int i=0; i<s.length(); i++){
           if(array[s.charAt(i)-'A']==0){
              array[s.charAt(i)-'A']=1; 
           }else {
               array[s.charAt(i)-'A']=0;
               result+=2;
           }
        }
        if(s.length()!=result){
            result+=1;
        }
        return result;
    }
}
