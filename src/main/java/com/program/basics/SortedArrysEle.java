package com.program.basics;

import java.util.Arrays;
import java.util.Comparator;

public class SortedArrysEle
{

    public static void main(String[] args) {
        int[] arr = {42, 7, 91, 15, 63, 28, 84, 3, 56, 19};

        /*
            Bubble sort is all about swaping of 2 adjacent elements if first element is greater than the second element
         */
//        doBubbleSort(arr);
        /*
          Insertion sort is all about inserting the element to LEFT side if first element is greater than the second element.
          it is right shifted array
         */
        doInsertionSort(arr);
    }

    static void doInsertionSort(int arr[]){
        int len = arr.length;
        int j, tmp;
        for(int i=1; i<len; i++){
             j = i-1;
             tmp = arr[i];
             while(j>=0 && tmp <=arr[j]){
                 arr[j+1] = arr[j];
                 j = j-1;
             }
             arr[j+1] = tmp;
        }

        //After Sorting
        for(int b : arr){
            System.out.print(b + " ");
        }

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
    //After Sorting
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