package string;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack stack=new Stack();
        for(char c: s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else if(c==')'){
                if((stack.size()!=0)&&(stack.peek().equals(new Character('(')))){
                    stack.pop();
                }else{
                	System.out.println(stack.size());
                	return false;}
            }else if(c==']'){
                if((stack.size()!= 0) &&stack.peek().equals(new Character('['))){
                    stack.pop();
                }else { return false;}
            } else if(c=='}'){
                if((stack.size()!= 0) &&stack.peek().equals(new Character('{'))){
                    stack.pop();
                }else return false;
            }
        }
        if (stack.size()==0) {return true;}
        else{
            return false;
        }
        
    }
    public static void main(String[] args){
    	String s="()";
    	System.out.println(isValid(s));
    }
}
