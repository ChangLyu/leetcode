package LinkedList;

public class DecompressRunLenghtENcodedList {
	public int[] decompressRLElist(int[] nums) {
        int sum=0;
         for(int i=0; i < nums.length/2 ; i++){
             sum += nums[2*i];
        }
        int[] result = new int[sum];
        int index =0; 
        for(int i=0; i < nums.length/2 ; i++){
            for(int j=0; j< nums[2*i]; j++ ){
                result[index++]= nums[2*i+1];  
            }
        }
        return result;
    }
}
