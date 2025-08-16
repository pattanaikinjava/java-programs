package com.program.basics;

public class IsPrimeNumber{

    public static final Integer GIVEN_NUMBER = 23;

    //method-1
    public int checkPrimeByMeth1(int flag){
        if (GIVEN_NUMBER <= 1){
            flag = 1;
        }
        else{
            for(int i=2; i<GIVEN_NUMBER; i++){
                if(GIVEN_NUMBER % i == 0){
                    //divisible, not a prime number
                    flag =1;
                    break;
                }
            }
        }
        return flag;
    }

    // method-2
    public int checkPrimeByMeth2(int flag){
        if(GIVEN_NUMBER <=1) {
            flag = 1;
        }
        else{
            for(int i=2; i<Math.sqrt(GIVEN_NUMBER); i++){
                if(GIVEN_NUMBER % i == 0){
                    flag =1;
                }
            }
        }
            return flag;
    }

    public static void main(String[] args) {
        int flag = 0; // 0 is assumed as prime here until proven otherwise
//      flag =  new CheckPrime().checkPrimeByMeth1(flag);
        flag = new IsPrimeNumber().checkPrimeByMeth2(flag);

        if(flag == 0)
            System.out.println(GIVEN_NUMBER +" is prime number");
        else
            System.out.println(GIVEN_NUMBER+ " is not a prime number");
    }
}
