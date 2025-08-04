package com.program.basics;

public class ClassA {

    private String P_NAME = "java is awesome";
    public String getP_NAME() {
        return P_NAME;
    }

    public void setP_NAME(String p_NAME) {
        P_NAME = "".concat("hello").concat(" ").concat(p_NAME);
    }

    //If this variable/property is declared as private, outside class cannot access the value directly.
    //Then in the case, we have to use public methods (getter and setter) . This is encapsulation.
    /*
      JVM first creates a memory for static area/ static block . so it executes 
      before main method.
     */
    ClassA (String input){
        System.out.println(input);
    }
     ClassA(){
         this("Spring boot"); // this is a constructor call.
         /*
           In Java, if we call another constructor from within a constructor using the this(...) keyword, that to which it should
           be the first statement in constructor to call upon a parameterized constructor from a default constructor, this is called constuctor call.
          */
         System.out.println("this is zero-param constructor.");//default constructor
     }
    // static block
     static{
         System.out.println("this is static method.."); 
     }

     //non static block
    {
        System.out.println("this is non static block");
    }
        public static void main(String[] args) {
            System.out.println("this is main method.");
            new ClassA(); // constructor initialize
        }

        /*
          Order of execution
          1. static
          2. main
          3. non-static
          4. constructor
         */
}
