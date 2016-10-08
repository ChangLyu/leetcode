package string;

public class ExcelSheetColumNumber {
    public int titleToNumber(String s) {
        int i=s.length()-1;
        int sum=0;
        for(char c: s.toCharArray()){
           sum+=Math.pow(26,i--)*(c-'A'+1);
        }
        return sum;
    }
//2016-10-07
    public int titleToNumber2(String s) {
        int result=0;
        for(int i=0; i<s.length();i++){
            result=result*26+s.charAt(i)-'A'+1;
        }
        return result;
    }
}
