package com.program.basics;

public class StarPattern {
    public static void main(String[] args) {
                /*
                Output:  (spaces are counted)
                  *
                * * *
              * * * * *
            * * * * * * *
                 */
        int n =8;
        int spaces = 0;
        for(int i=1; i<n; i++) {
         if(i % 2 != 0) {
             spaces = (n - i) / 2;
             for (int j = 0; j <= spaces; j++) {
                 System.out.print("  ");
             }
             for(int x=0; x<i; x++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
        }
    }
}