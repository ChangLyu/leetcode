package numbers;

public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if(num<=0) return false;
        int a=num;
        while(a%4==0){
             a=a/4;
        }
        if(a==1){
            return true;
        } else {return false;}
    }
}
