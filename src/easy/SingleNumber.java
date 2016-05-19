package easy;

public class SingleNumber {
	//Given an array of integers, every element appears twice except for one. Find that single one.
    public int singleNumber(int[] nums) {
    	int result=0;
    	for (int i:nums){
    		result^=i;
    	}
    	return result;
    }
    //Given an array of integers, every element appears three times except for one. Find that single one.
    public int singlNumber2(int[] nums){
    	int result=0;
    	for(int i:nums){
    		
    		
    	}
    	return result;
    }
}
