package advancedJava;

import java.lang.reflect.Array;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;



public class IntegerArray {
	static Integer[] iArray={3,4,5,2,5,3};
	
	public Integer[] createNewIntegerArray(Integer[] s) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Integer[] i=null;

			System.out.println(s.getClass().getName());
			i=(Integer[]) Array.newInstance(Integer.class ,5);

	
		return i;
	}
	public boolean isExist(Integer[] s){
		return s!=null;
	}
	
	public List<Integer> convertToList(){
		List<Integer> integerList=new ArrayList();
		for(int j=0; j<iArray.length;j++){
			System.out.println(iArray[j]);
			integerList.add(iArray[j]);
		}
		return integerList;
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		IntegerArray i=new IntegerArray();
		Integer[] newS=i.createNewIntegerArray(iArray);
		System.out.println(i.isExist(newS));
		i.convertToList();
		
		
	}

}
