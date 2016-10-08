package array;

public class MoveZeros {
	//move all zeros to back and keep non zero value in order
	 public void moveZeroes(int[] nums) {
         int i=0;
         for(; i<nums.length;i++){
             if(nums[i]==0){
                 break;
             }
         }
        for(int j=i;j<nums.length ;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
        }
        for( ; i<nums.length;i++){
            nums[i]=0;
        }
 
    }
}
