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
    // method that returns the answer 
    public static String produceAnswer(String input){
    	String underScore = "_";
    	String slash = "/";
    	String wholeNum1 = "0";
    	String wholeNum2 = "0";
    	String wholeNum3 = "0";
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
    	int answerTop = 0;//numerator and denominator
    	int answerBot = 0;
    	
  
    	
    	// finding operator sign
	    int space1 = input.indexOf(" ");
	    String operator = input.substring(space1 + 1, space1 + 2);
	   
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
	    		numerator1 = frac1.substring(mark1 + 1 ,slash1);
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
	    
	    int wholeNum10 = Integer.parseInt(wholeNum1);
	    int wholeNum20 = Integer.parseInt(wholeNum2);
	    int numerator10 = Integer.parseInt(numerator1);
	    int numerator20 = Integer.parseInt(numerator2);
	    int denominator10 = Integer.parseInt(denominator1);
	    int denominator20 = Integer.parseInt(denominator2);
	    
	    //solving for the whole numbers
	    if (wholeNum10 > 0) {
	    	int wholeTimesDeno1 = wholeNum10 * denominator10;
	    	numerator10 = wholeTimesDeno1 + numerator10;
	    }
	    else if(wholeNum10 < 0) {
	    	int wholeTimesDeno1 = Math.abs(wholeNum10 * denominator10);
	    	numerator10 = (wholeTimesDeno1 + numerator10) * -1;
	    }
	    if (wholeNum20 > 0) {
	    	int wholeTimesDeno2 = wholeNum20 * denominator20;
	    	numerator20 = wholeTimesDeno2 + numerator20;
	    }
	    else if(wholeNum20 < 0) {
	    	int wholeTimesDeno2 = Math.abs(wholeNum20 * denominator20);
	    	numerator20 = (wholeTimesDeno2 + numerator20) * -1;
	    }
	    
	    //equalizing the denominator and numerator
	    int denominator101 = denominator10 * denominator20;
	    int denominator202 = denominator10 * denominator20;
	    int numerator101 = numerator10 * denominator20;
	    int numerator202 = numerator20 * denominator10;
	    denominator10 = denominator101;
	    denominator20 = denominator202;
	    numerator10 = numerator101;
	    numerator20 = numerator202;
	    //putting them together
	    if(operator.equals("+")) {
	    	answerTop = numerator10 + numerator20;
	    	answerBot = denominator10;
	    	
	    }else if(operator.equals("-")){
	    	answerTop = numerator10 - numerator20;
	    	answerBot = denominator10;
	    	
	    }else if(operator.equals("*")){
	    	answerTop = numerator10 * numerator20;
	    	answerBot = denominator10 * denominator20;
	    	
	    }else if(operator.equals("/")){
	    	answerTop = numerator10 * denominator20;
	    	answerBot = denominator10 * numerator20;
	    }
        	    
	    

        return(answerTop + "/" + answerBot);
    }
}
