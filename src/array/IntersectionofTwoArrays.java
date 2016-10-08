package array;


import java.util.HashSet;
//Given two arrays, write a function to compute their intersection.
//Each element in the result must be unique.
public class IntersectionofTwoArrays {
	
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int i:nums1){
        		hs1.add(i);
        }
        for(int i:nums2){
        	if(hs1.contains(i)){
        		hs2.add(i);
        	}
        }
        int[] result=new int[hs2.size()];
        int i=0;
        for(Integer j:hs2){
            result[i]=j;
            i++;
        }
        return result;
    }
	public static void main(String[] args){
		Integer integer=new Integer(2);
		System.out.println(integer.hashCode());
	}
    

}
