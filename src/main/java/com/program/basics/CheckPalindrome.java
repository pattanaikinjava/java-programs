package com.program.basics;

public class CheckPalindrome
{
    public static void main(String[] args) {
        String string = "abcba";
        CheckPalindrome aobj = new CheckPalindrome();
//        aobj.checkPalindromeByMeth2(string);
        aobj.checkPalindromeByMeth1(string);
    }

    public void checkPalindromeByMeth1(String string) {
        String temp = string;
        String reversed = new String();
//     int index =0;
//     while(temp.length() != 0){
//      reversed = reversed.concat(temp.substring(temp.length() -1 -index));
//      temp = temp.substring(0, temp.length() -1 -index);
//      ++index;
//     }
//        System.out.println("The reversed String "+ reversed);
//
    }
      public void  checkPalindromeByMeth2(String string) {
          String temp = string;
          String reversed = new String();
          for(int i= temp.length() -1; i>=0; i--){
           reversed =  reversed.concat(String.valueOf(temp.charAt(i)));
        }
        if(reversed.equals( string)){
           System.out.println("Given string is  Palindrome");
         }
        else{
            System.out.println("Not palindrome");
        }
    }
}
