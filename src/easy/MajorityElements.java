package easy;

import java.util.Arrays;

public class MajorityElements {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}
