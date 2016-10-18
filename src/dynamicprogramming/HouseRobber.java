package dynamicprogramming;

public class HouseRobber {
    public static int rob(int[] nums) {
        int a=0;
        int b=1;
    return robMax(nums,a)>robMax(nums,b)?robMax(nums,a):robMax(nums,b);

    }
    
    public static int robMax(int[] nums, int i){
        if(i>=nums.length){
            return 0;
        }
       return robMax(nums,i+2)>robMax(nums,i+3)?nums[i]+robMax(nums,i+2):nums[i]+robMax(nums,i+3);
    }
    public static void main(String[] args){
    	int[] num={2,1,1,2,4,1};
    	System.out.println(rob(num));
    }
    
    
    public int rob2(int[] nums) {
    int prob=0;
    int pnrob=0;
    int cnrob=0;
    int crob=0;
    for(int i=0; i<nums.length;i++){
        crob=pnrob+nums[i];
        cnrob=Math.max(prob,pnrob);
        prob=crob;
        pnrob=cnrob;
    }
    return Math.max(crob,cnrob);
    }
}
