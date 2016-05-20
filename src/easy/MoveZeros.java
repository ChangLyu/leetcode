package easy;
//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
public class MoveZeros {
	public void moveZeroes(int[] nums) {
	 if(nums==null||nums.length==0){
         return;
     }
     int i=0;
     for(int num:nums){
         if(num!=0){
             nums[i++]=num;
         }
     }
     for( ;i<nums.length;i++){
         nums[i]=0;
     }
}
}
