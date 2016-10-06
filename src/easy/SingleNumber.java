package easy;

import java.util.HashMap;
import java.util.Set;

public class SingleNumber {
	//Given an array of integers, every element appears twice except for one. Find that single one.
    public int singleNumber(int[] nums) {
    	int result=0;
    	for (int i:nums){
    		result^=i;
    	}
    	return result;
    }
    public static int singleNumber1(int[] nums) {
/*        int result=0;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i: nums){
            if(hm.containsKey(i)){
                hm.put(i,2);
            }else{
                hm.put(i,1);
            }
        }
        for(int i:nums){
            if(hm.get(i)==1){
                result=i;
            };
        }
        return result;*/
        int result=0;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i: nums){
            if(hm.containsKey(i)){
                hm.remove(i);
            }else{
                hm.put(i,1);
            }
        }
       
        
        return (int) hm.keySet().toArray()[0];
    }
    //Given an array of integers, every element appears three times except for one. Find that single one.
    public int singlNumber2(int[] nums){
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int num:nums){
            if(!hm.containsKey(num)){
                hm.put(num,1);
            }else{
                hm.put(num,hm.get(num)+1);
            }
        }
       int result=0;
        for(int num:nums){
            if(hm.get(num)!=3){
                result=num;
            }
        }    
        return result;
    }
    //Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice.
    //Find the two elements that appear only once.
    public int[] singleNumber3(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            if(!hm.containsKey(num)){
                hm.put(num,1);
            }else{
                hm.put(num,hm.get(num)+1);
            }
        }
        int[] result=new int[2];
        int i=0;
        for(int num:nums){
            if(hm.get(num)==1){
                result[i++]=num;
            }
        }
        
        return result;
    }
    //another method: 
    public int[] singleNumber32(int[] nums) {
        // Pass 1 : 
        // Get the XOR of the two numbers we need to find
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        // Get its last set bit(the right first bit that is 1, two different number
        //get different on this bit)
        diff &= -diff;

        // Pass 2 :
        int[] rets = {0, 0}; // this array stores the two numbers we will return
        for (int num : nums)
        {
            if ((num & diff) == 0) // the bit is not set, the first part
            {
                rets[0] ^= num;
            }
            else // the bit is set
            {
                rets[1] ^= num;
            }
        }
        return rets;
    }
    
    public static void main(String[] args){
    	int[] intarray={1};
    	System.out.println(singleNumber1(intarray));
    }
    
}
