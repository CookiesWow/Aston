package New_package;

import java.util.Objects;
import java.util.Scanner;

public class String_in {

	public static void main(String[] args) {
		 Scanner x = new Scanner(System.in);
		 System.out.print("Введите строчку a: ");
	      String a = x.nextLine();
	      System.out.print("Введите строчку b: ");
	     String b = x.nextLine();
	      if (Objects.equals(a, b)) {
	    	  System.out.print("\nСтроки идентичны"); }
	    	  else {
	    		  System.out.print("\nСтроки неидентичны"); }
	    	 
	      
	}

}
