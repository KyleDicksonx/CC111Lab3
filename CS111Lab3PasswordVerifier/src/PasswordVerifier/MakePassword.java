/*
 * Kyle Dickson
 * 50116781
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone
 */

package PasswordVerifier;
import java.util.Scanner;

public class MakePassword{
	
   public static void main(String[] args){
	   
	  //creates scanner object to accept keyboard inputs
	  Scanner kb = new Scanner(System.in);
	  
	  //input for the password will be saved as this 
	  String userInput;
      
	  //grab the next line and set it to userInput
      System.out.print("Input Password: ");
      userInput = kb.nextLine();
      
      //runs the isValid method from PasswordVerfier passing userInput 
      //and returns the validity of the password
      if(PasswordVerifier.isValid(userInput)){ 
         System.out.println("VALID PASSWORD");
      }
      else{
         System.out.println("INVALID PASSWORD");
      }
      kb.close();
   }
}