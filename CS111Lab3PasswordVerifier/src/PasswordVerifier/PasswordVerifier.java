package PasswordVerifier;
public class PasswordVerifier{
   private byte minPasswordLength = 7;
   
   public static void main(String[] args){
	   
   }
   
   public static boolean isValid(String input){
      boolean length = false;
      boolean digit = false;
      boolean UC = false;
      boolean LC = false;

      if(input.length() >= 7){
         length = true;
      }
      else{
         System.out.println("The password must have at least 7 characters.");
      }
      
      if(hasDigit(input)){
         digit = true;
      }
      else{
         System.out.println("The password must contain a number.");
      }
      
      if(hasLowerCase(input)){
         UC = true;
      }
      else{
         System.out.println("The password must contain a lower case letter.");
      }
      
       if(hasUpperCase(input)){
         LC = true;
      }
       else{
         System.out.println("The password must contain a upper case letter.");
      }
      
      if(length && digit && UC && LC){
         return true;
      }
      else {
         return false;
      }
      
   }
   
   private static boolean hasDigit(String input){
      boolean hasDigit = false;
      for (int x = 0; x <= (input.length()-1); x++){
         if(Character.isDigit(input.charAt(x))){
            hasDigit = true;
         }
      }
      return hasDigit;
   }
   private static boolean hasUpperCase(String input){
      boolean hasUC = false;
      for (int x = 0; x <= (input.length()-1); x++){
         if(Character.isUpperCase(input.charAt(x))){
            hasUC  = true;
         }
      }
      return hasUC;
   }
   private static boolean hasLowerCase(String input){
      boolean hasLC = false;
      for (int x = 0; (x + 1)<= input.length(); x++){
         if(Character.isLowerCase(input.charAt(x))){
            hasLC  = true;
         }
      }
      return hasLC;
   }
}