package easy;

public class ExcelSheetColumNumber {
    public int titleToNumber(String s) {
        int i=s.length()-1;
        int sum=0;
        for(char c: s.toCharArray()){
           sum+=Math.pow(26,i--)*(c-'A'+1);
        }
        return sum;
    }

}
