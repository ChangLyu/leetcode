package easy;

public class ReverseString {
	public static String reverseString1(String str){
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		return sb.toString();
	
	}
	public static String reverseString2(String str){
		char[] chr=str.toCharArray();
		int i=0;
		int j=str.length()-1;
		while(i<=j){
			char c=chr[i];
			chr[i]=chr[j];
			chr[j]=c;
			i++;
			j--;
		}
		return new String(chr);
	}
	
	public static void main(String args[]){
		System.out.println(reverseString1("abcd"));
		System.out.println(reverseString2("abcd"));
	}
}
