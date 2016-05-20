package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {
	 public List<Integer> topKFrequent(int[] nums, int k) {
	        HashMap<Integer,Integer> hm=new HashMap<>();
	        for(int num:nums){
	            if(!hm.containsKey(num)){
	                hm.put(num,1);
	            }else{
	                hm.put(num,hm.get(num)+1);
	            }
	        }
	        ArrayList<Integer>[] bucket=new ArrayList[nums.length+1];
	        
	        for(int key:hm.keySet()){
	            int frequence=hm.get(key);
	            if(bucket[frequence]==null){
	                bucket[frequence]=new ArrayList<>();
	            }
	            bucket[frequence].add(key);
	            }
	        
	        List<Integer> result=new ArrayList<>();
	        for(int end=bucket.length-1;end>=0&&result.size()<k;end--){
	            if(bucket[end]!=null){
	                result.addAll(bucket[end]);
	            }
	        }
	        
	        return result;
	    }

}
