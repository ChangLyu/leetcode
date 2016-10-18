package string;

public class Replace {
	public static void main(String[] args){
	String str="I am a good studnet";
	str=str.replaceAll("\\s+", "%60");
	System.out.println(str);
	}
}
