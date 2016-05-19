package medium;

public class CountingBits {
    public static int[] countBits(int num) {
        int[] intArray=new int[num+1];
        for(int i=1; i<=num; i++){
            intArray[i]=intArray[i>>1]+(i&1);
        }
        return intArray;
    }

    	public static void main(String args[]){
    		int[] result=countBits(4);
    		for(int i=0; i<=4; i++){
    		System.out.println(result[i]);
    		}
    	}
}
