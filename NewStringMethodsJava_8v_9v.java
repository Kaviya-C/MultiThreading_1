package string.string_new_methods.and.thread_concept_1;

import java.util.Arrays;
import java.util.List;
public class NewStringMethodsJava_8v_9v 
{
	public static void main(String...args)
	{
		//from java -8 version 
		// join()-- method
		
		String language=String.join("-","java","JSP","servlet","JDBC");
		System.out.println(language);
		
		//join()---one with delimiter and string as arguments
		//join() --- another one with delimiter and iterable as arguments
		//iterable mean list of string or set of strings simply says collections
	
	    List<String> list=Arrays.asList("java","is","my","favourite");
	    String result= String.join("_", list);
	    System.out.println(result);
	    
	    
	    //java-9 string new methods
	    //chars()       //codePoints() 
	    //--return IntStream
	    
	    /*
	     * chars()-----16 bit unicode points 
	     * eg if our string contain any emoji meant this chars() return two seperate integer value 
	     * bcoz it is 16 bit unicode points
	     * 
	     * where as codePoints()
	     * returns that emoji as single unicode value
	     * bcoz codePoints() --- 32 bit unicode points
	     * 
	     */
	    "Kaviya\u00A0".chars().forEach(System.out::println);
	    System.out.println("____________");
	    "Kaviya\u00A0".codePoints().forEach(System.out::println);
 	}

}
