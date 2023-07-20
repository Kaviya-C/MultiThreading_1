package string.string_new_methods.and.thread_concept_1;

import java.lang.invoke.MethodHandles;

public class NewStringMethod_java_11_12_15 {

	public static void main(String...args)
	{
		//isBlank()
		
		System.out.println("".isBlank());
		System.out.println("\t\t".isBlank());
		System.out.println(" k\n".isBlank());
		
		//lines()--return stream of lines
		System.out.println("\n\n".lines().count());
		System.out.println("abc \n xyz".lines().count() );
		
		//repeat ---it repeats n times
		
		System.out.println("k".repeat(3));
		System.out.println("1".concat("3".repeat(5)));
		
		/*strip()--leading trailing zeros are removes
	      trim()--early version of java itself there
		 * strip() --remove ASCII Code whitespaces,
		 * multi white spaces,Non-breaking space\u00A0
		 * Zero width space\u200B
		 */
		
		System.out.println("  1 \nHello \nthis is\nkaviya\u00A0 \u200B   ".strip());
	     //StripLeading
		System.out.println(" ka . ".stripLeading());
		System.out.println("   java  ".stripLeading());
		
		System.out.println("   kaviya    ".stripTrailing());
	    System.out.println("_____________"); 
	//-----java 12 new string methods
		
		//indent()
		System.out.println("kaviya\njava\ndeveloper".indent(5));
	
	   //transform()--- we have to apply Function to the string
		
		System.out.println("KAVIYA".transform(String::toLowerCase));
	    System.out.println("java hello this".transform(eachLetter->eachLetter.toUpperCase()));
	    System.out.println("Software ".transform(string->string.concat(" Developer"))
	    		                        .transform(eachLetter->eachLetter.toUpperCase()));
	
	/*java -12 string implements two more interfaces
	           constable and constatntDesc
	    from these two interface string class inherits two methods
	    
	    describeConstable()     from constable interface
	    resolveConstantDesc()  from   constantDesc()
	*/ 
	    
	    System.out.println("Input".resolveConstantDesc(MethodHandles.lookup()));
	    System.out.println("output".describeConstable().get());
	
	
	
	 // from java 15  formatted()
	    System.out.println("1)%s\n2)%s\n3)%s".formatted("java","SQL","Sring"));
	     System.out.println("*%s\n*%s\n*%d".formatted("Software Developer","Java",89));
	
	//stripIndent()
	     System.out.print("   hello   ".stripIndent()+" ");
	     System.out.print("  java  ");
	     System.out.print("   world   ");
	     System.out.println();
	     System.out.println("____________");
	   String s="this\t is\n java\t world\'single\"double";
	   System.out.println(s.translateEscapes());
	
	
	}
}
