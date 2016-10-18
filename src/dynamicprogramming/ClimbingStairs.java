package dynamicprogramming;

public class ClimbingStairs {
//You are climbing a stair case. It takes n steps to reach to the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    public int climbStairs(int n) {
        if(n==1||n==2) return n;
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public static long possForStep(int n) {
        // current and last value, initially for n = 0 and n = 1
        long cur = 1, last = 1;
        for (int i = 1; i < n; i++) {
            // for each step, add the last two values and update cur and last
            long tmp = cur;
            cur = cur + last;
            last = tmp;
        }
        return cur;
    }
}
