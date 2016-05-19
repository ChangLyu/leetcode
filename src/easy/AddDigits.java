package easy;

import org.omg.CORBA.PUBLIC_MEMBER;

public class AddDigits {
	
//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.	
	// the sum of all digits are the num%9, except 0, 9
	public int addDigits(int n){
		return n==0?0:(n%9==0?9:(n%9));
	}
	
//Write an algorithm to determine if a number is "happy".
//A happy number is a number defined by the following process: Starting with any positive integer, 
//replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or 
//it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
	public static boolean isHappy(int n) {

	int x = n;
    int y = n;
    while(x>1){
        x = cal(x) ;
        if(x==1) return true ;
        y = cal(cal(y));
        if(y==1) return true ;

        if(x==y) return false;
    }
    return true ;
}
public static int cal(int n){
    int sum=0;
    while(n>0){
       sum+=Math.pow(n%10,2);
       n=n/10;
    }
    return sum;
}

    public static void main(String args[]){
    System.out.println(isHappy(2)); 
    }
    }
