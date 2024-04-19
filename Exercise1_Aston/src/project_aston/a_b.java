package project_aston;

import java.util.Scanner;

public class a_b {


	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		char d;
	      Scanner x = new Scanner(System.in);
	      System.out.print("Введите число a: ");
	      a = x.nextDouble();
	      System.out.print("Введите число b: ");
	      b = x.nextDouble();
	      
	      System.out.print("Выберите оператор (+, -, *, /): ");
	      
	      switch(d= x.next().charAt(0)) {
	         case '+': c = a + b;
	            break;
	         case '-': c = a - b;
	            break;
	         case '*': c = a * b;
	            break;
	         case '/': c = a / b;
	            break;
	         default:  System.out.printf("\nВыберите другой оператр");
	           return;
	        		 
	      }
	            
	      while (b == 0 & d == '/' ) {
	    	  System.out.print("\nРезульта не определён");
	    	  return;
	      }
	     
	      
	      System.out.printf( a + " " + d + " " + b + " = " + c);
	      if (a > b) {
	    	  System.out.print("\na > b"); }
	    	  else if (a == b) {
	    		  System.out.print("\na = b"); }
	    	  else if (a < b) {
	    		  System.out.print("\na < b"); }
	      
	    	  }
	       }
	