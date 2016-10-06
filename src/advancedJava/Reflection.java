package advancedJava;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection {

	public Reflection(){

	}
}

class ReflectionWithAug{
	String name;
	
	public ReflectionWithAug(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
}

class Test{


	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		Reflection ref=new Reflection();
		ReflectionWithAug reflectionWithAug=new ReflectionWithAug("Hello");
		
		//using an instance to create an instance
		Class c1=ref.getClass();
		//using a full path name to create instance
		Class c2=Class.forName("advancedJava.Reflection");
		
		Class c3=Reflection.class;
		
		
		Class c4=Class.forName("advancedJava.ReflectionWithAug");
		
		Class c5=ReflectionWithAug.class;
		
		Class c6=reflectionWithAug.getClass();

		Reflection r1=(Reflection)c1.newInstance();
		Reflection r2=(Reflection)c2.newInstance();
		Reflection r3=(Reflection)c3.newInstance();
		//
		Constructor constructor4=c4.getConstructor(String.class);
		ReflectionWithAug r4=(ReflectionWithAug) constructor4.newInstance("hello");

		
		//
		Constructor constructor5=c5.getConstructor(String.class);
		ReflectionWithAug r5=(ReflectionWithAug) constructor5.newInstance("hello");
		
		Constructor constructor6=c6.getConstructor(String.class);
		ReflectionWithAug r6=(ReflectionWithAug) constructor5.newInstance("hello");
		
		if(r1 instanceof Reflection){
			System.out.println("we create instance from getClass successfully");
		}
		if(r2 instanceof Reflection){
			System.out.println("we create instance from forName successfully");
			
		}
		if(r3 instanceof Reflection){
			System.out.println("we create instance from Reflection.Class successfully");
		}	
		if(r4 instanceof ReflectionWithAug){
			System.out.println("we create instance from getClass with auguments constructor successfully");
		}
		if(r5 instanceof ReflectionWithAug){
			System.out.println("we create instance from forName with augements constructor successfully");
		}
		if(r6 instanceof ReflectionWithAug){
			System.out.println("we create instance from ReflectionWithAug with augements constructor successfully");
		}
	}
}
