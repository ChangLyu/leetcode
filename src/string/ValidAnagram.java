package string;

import java.util.Arrays;
import java.util.HashMap;
//s = "anagram", t = "nagaram", return true.
//s = "rat", t = "car", return false.
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c1:s.toCharArray()){
            if(!hm.containsKey(c1)) hm.put(c1,1);
            else { hm.put(c1,hm.get(c1)+1);}
        }
        for(char c2:t.toCharArray()){
            if(hm.get(c2)!=null&&hm.get(c2)>0){
                hm.put(c2,hm.get(c2)-1);
                if(hm.get(c2)==0) hm.remove(c2);
            }else  if(hm.get(c2)==null){
                return false;
            }else if(hm.get(c2)==0){
                hm.remove(c2);
                return false;
            }
        }
          if(hm.isEmpty())  return true;
          else{ return false; }
    }
    //2016/10/07
    public boolean isAnagram2(String s, String t) {
        int[] array=new int[26];

        for(int i=0; i<s.length();i++){
            array[s.charAt(i)-'a']+=1;
        }
        for(int i=0; i<t.length();i++){
            array[t.charAt(i)-'a']-=1;
            if(array[t.charAt(i)-'a']<0){
                return false;
            }
        }
        if(s.length()==t.length()){
            return true;
        }else {return false;}
        
       
    }
}
