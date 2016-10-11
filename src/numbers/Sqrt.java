package numbers;

import com.sun.media.jfxmedia.events.NewFrameEvent;

public class Sqrt {

public static int floorSqrt(int x)
{
    // Base Cases
    if (x == 0 || x == 1)
        return x;

    // Do Binary Search for floor(sqrt(x))
    int start = 1, end = x, ans=0;
    while (start <= end)
    {
        int mid = (start + end) / 2;

        // If x is a perfect square
        if (mid*mid == x)
            return mid;

        // Since we need floor, we update answer when mid*mid is
        // smaller than x, and move closer to sqrt(x)
        if (mid*mid < x)
        {
            start = mid + 1;
            ans = mid;
        }
        else   // If mid*mid is greater than x
            end = mid - 1;
    }
    return ans;
}
public double sqrt(double x){
	if(x<0)return -1;
	if (x == 0||x==1)return 0;
	double left = 0;
	double right = x;
	double mid=0;
	double precision=0.001;
	if(x<1){right=1;}
	while(right-left>precision){
		mid=left+(right-left)/2;
		if(mid*mid>x){
			right=mid;
		}else if(mid*mid<x){
			left=mid;
		}else{
			return mid;
		}
	}
	return mid;

}
public static void main(String[] args){
	Sqrt sqrt=new Sqrt();

	System.out.println(sqrt.floorSqrt(10));
	System.out.println(sqrt.sqrt(10));
}
}
