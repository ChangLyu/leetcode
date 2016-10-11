package array;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElements {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
    public int majorityElement2(int[] nums) {
        if(nums.length==1) return nums[0];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i: nums){
            if(hm.get(i)==null){
                hm.put(i,1);
            }else{
            int num=hm.get(i);
            if(++num>nums.length/2) return i;
            hm.put(i,num);
            }
        }
        return 0;       
    }
    public int majorityElement3(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
            
        }
        return major;
    }
}
