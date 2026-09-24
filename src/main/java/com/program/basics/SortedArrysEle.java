package com.program.basics;

import java.util.Arrays;

public class SortedArrysEle
{

    public static void main(String[] args) {
        int[] arr = {42, 7, 91, 15, 63, 28, 84, 3, 56, 19};
        doBubbleSort(arr);
    }

    static void doBubbleSort(int arr[]){
       int len = arr.length;
       Boolean toSwap = null;
        for(int i=0; i<len; i++){
            toSwap = false;
            for(int j=0; j<len-1-i; j++){
                if(arr[j] > arr[j+1]){
                    toSwap = true;
                    SortedArrysEle.SwapEle inner= new SortedArrysEle().new SwapEle();
                    arr = inner.swapElementsBet2(arr,j,j+1);
                }
            }
                if(!toSwap){ break;}
        }

        for(int n : arr){
            System.out.print(n + " ");
        }
    }

    //Inner class
     class SwapEle{
        public int[] swapElementsBet2(int[] arr, int x, int y){
               try {
                   var e1 = arr[x]; //2
                   var e2 = arr[y];//3
                   var e3 = e2; //using third variable //3
                   arr[y] = e1;//2
                   arr[x] = e3;//3
                   return arr;
               } catch(ArrayIndexOutOfBoundsException e){
                   System.out.println(e.getMessage());
                   return new int[] {};
               }
        }
    }
}

/*
  Time complexity: O(n^2) --average time complexity
  Space Complexity: O(1): A third variable is required to swap values.

 */