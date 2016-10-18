package sortalgorithm;

import sun.print.resources.serviceui;
import sun.reflect.generics.tree.VoidDescriptor;

public class SortAlgorithm {
	//time complexity is big o of (n^2)
	public static int[] bubbleAsc(int[] array){
		int l=array.length-1;
		int p=0;
		while(l>=1){
		for(int i=0; i<l;i++){
			if(array[i]>array[i+1]){
			   p=array[i];
			   array[i]=array[i+1];
			   array[i+1]=p;
			}
		}
		l--;
		}
		return array;
	}
	// big o of(n logn), worst is n^2
	public static int[] quickSort(int[] array){
		int l=array.length;
		 quick(array,0,l-1);
		 return array;
		
	}
	public static void quick(int[] a, int start, int end){
		if(start<end){
		int left=start;
		int right=end-1;
		int pivot=end;
		while(left<=right){
			while(a[left]<a[pivot]){left++; }
			while(a[right]>a[pivot]){right--;}
			if(left<=right){
				int p=a[left];
				a[left]=a[right];
				a[right]=p;
				left++;
				right--;
			}
		}
		//swap pivot with left
		int p=a[left];
		a[left]=a[pivot];
		a[pivot]=p;
		
		quick(a, start, right);
		quick(a,left,pivot);
		}
	}
	
	public static int[] merge(int[] a){
          divide(a,0, a.length-1);
          return a;
	}
	public static void divide(int[] a, int begin,int end){
            if(begin<end){
            	int mid=begin+(end-begin)/2;
    	    	divide(a, begin, mid);
    	    	divide(a, mid+1,end);
            	mergesort(a,begin, mid,end);
            }
		
	}
	public static void mergesort(int[] a, int begin, int mid, int end){
		int[] result=new int[a.length];
		for(int i=0; i<a.length;i++){
			result[i]=a[i];
		}
		int i=begin;
		int j=mid+1;
		for(int p=begin; p<=end;p++){
			if(a[i]<a[j]){
				result[p]=a[i];
				i++;
			}else{
				result[p]=a[j];
				j++;
			}
		}
		
	}
	
	public static void print(int[] a){
		for(int i:a){
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args){
		int[] a={3,2,5,11,0,9,7};

		print(bubbleAsc(a));
		print(quickSort(a));
		print(merge(a));
	}
		
}
