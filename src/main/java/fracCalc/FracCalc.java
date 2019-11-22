/**
 * @author Mr. Rasmussen
 */

package fracCalc;
import java.util.Scanner;
public class FracCalc {

    public static void main(String[] args){
    	Scanner userInput = new Scanner(System.in);
    	
    	System.out.println("Welcome to Fraction Calculator!");
    	System.out.println("What fraction equation would you like solved?");

        String input = "";
        input = userInput.nextLine();
		while (!input.equals("quit")) {
	        String num = produceAnswer(input);
	       	System.out.println(num);
	       	System.out.println("Type \"quit\" to end");
	       	input = userInput.nextLine();
        }
     
    
    }

    public static String produceAnswer(String input){
    	String underScore = "_";
    	String slash = "/";
    	String wholeNum1 = "0";
    	String wholeNum2 = "0";
    	String fraction1 = "0";
    	String fraction2 = "0";
    	String numerator1 = "0";
    	String numerator2 = "0";
    	String denominator1 = "1";
    	String denominator2 = "1";
    	int mark1 = 0;
    	int mark2 = 0;
    	int length1 = 0;
    	int length2 = 0;
    	
  
    	
    	// finding operator sign
	    int space1 = input.indexOf(" ");
	    char operator1 = input.charAt(space1 + 1);
	    
	    // dividing equation into two fractions
	    String frac1 = input.substring(0,space1);
	    String frac2 = input.substring(space1 + 3);
	    
	    //finding where _ is in the equation
	    mark1 = frac1.indexOf(underScore);
	    mark2 = frac2.indexOf(underScore);
	    //finding where / is in the equation
	    int slash1 = frac1.indexOf(slash);
	    int slash2 = frac2.indexOf(slash);
	    
	    // finding whole numbers for each frac1
		if(mark1 !=  -1) {
	    	wholeNum1 = frac1.substring(0, mark1);
	    	length1 = 1;
	    // finding whole number when there is no fraction
	    }else if(frac1.indexOf(slash) ==  -1) {
 	    	wholeNum1 = frac1;
 	    	length1 = 2;
	    }
		
		// finding whole numbers for frac2
	    if(mark2 !=  -1) {
	    	wholeNum2 = frac2.substring(0, mark2);
	    	length2 = 1;
	    // finding whole number when there is no fraction
	    }else if(frac2.indexOf(slash) ==  -1) {
 	    	wholeNum2 = frac2;
 	    	length2 = 2;
	    }
	    
	    // finding the fraction parts of the equation
	    if (length1 == 1) {
	    	fraction1 = frac1.substring(mark1+1);
	    }else if (length1 == 2) {
	    	fraction1 = "";
	    }else {
	    	fraction1 = frac1.substring(0);
	    }
    
	    if (length2 == 1) {
	    	fraction2 = frac2.substring(mark1+1);
	    }else if (length2 == 2) {
	    	fraction2 = "";
	    }else {
	    	fraction2 = frac2.substring(0);
	    }
	    
	    //finding the numerator and denominator
	    if (fraction1 != "") {
	    	if (frac1.indexOf(underScore) != -1) {
	    		numerator1 = frac1.substring(mark1,slash1);
	    	}else {
	    		numerator1 = frac1.substring(0,slash1);
	    	}
	    	denominator1 = frac1.substring(slash1 + 1);
	    }
	    
	    if (fraction2 != "") {
	    	if (frac2.indexOf(underScore) != -1) {
	    		numerator2 = frac2.substring(mark2 + 1,slash2);
	    	}else {
	    		numerator2 = frac2.substring(0,slash2);
	    	}
	    	denominator2 = frac2.substring(slash2 + 1);
	    }
	   /* int frac10 = Integer.parseInt(frac1);
	    int frac20 = Integer.parseInt(frac2);
	    int wholeNum10 = Integer.parseInt(wholeNum1);
	    int wholeNum20 = Integer.parseInt(wholeNum2);
	    int fraction10 = Integer.parseInt(fraction1);
	    int fraction20 = Integer.parseInt(fraction2);
	    int numerator10 = Integer.parseInt(numerator1);
	    int numerator20 = Integer.parseInt(numerator2);
	    int denominator10 = Integer.parseInt(denominator1);
	    int denominator20 = Integer.parseInt(denominator2);
    		    
	    //Solving the equations
	    if (wholeNum10 != 0) {
	    	h
	    }
	    */
	    
	   	String yoYoDeleteThisSoon = "whole:" + wholeNum2 + " numerator:" + 
	   	        numerator2 + " denominator:" + denominator2;
        

        return(yoYoDeleteThisSoon);
    }
}
