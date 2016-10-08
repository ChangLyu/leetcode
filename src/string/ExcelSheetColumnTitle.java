package string;


public class ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        int b=0;
        String str="";
        while(n>26){
        b=n%26;
        if(b==0){
        	str='Z'+str;
        	n=(n-26)/26;
        }else{
        str=(char)(b-1+'A')+str;
        n=(n-b)/26;
        }
        
}
        str=(char)(n-1+'A')+str;
       return str;
    }
    
    public String convertToTitle2(int n) {
        String res = "";
        while(n != 0) {
            char ch = (char)((n - 1) % 26 + 65);
            n = (n - 1) / 26;
            res = ch + res;
        }
        return res;
    }
    
    public static void main(String[] args){
    	System.out.println(convertToTitle(52));
    }
}
