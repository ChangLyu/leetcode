package string;



public class AllPermutations {
   void permute(String str){
	   boolean[] used=new boolean[str.length()];
	   StringBuilder sb=new StringBuilder();
	   doPermute(str.toCharArray(),sb,used,str.length(),0);
   }
   void doPermute(char[]c,StringBuilder sb,boolean[] used, int length, int level){
	   if(level==length){
		   System.out.println(sb.toString());
		   return;
	   }
	   for(int i=0; i<length;i++){
		   if(used[i]) continue;
		   sb.append(c[i]);
		   used[i]=true;
		   doPermute(c,sb,used,length,level+1);
		   used[i]=false;
		   sb.setLength(sb.length()-1);
	   }
   }
   
   
   public static void permutation2(String str) { 
	    permutation2("", str); 
	}

	private static void permutation2(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation2(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	public static void main(String[] args){
		String str="aabc";
		permutation2(str);
	}
}
