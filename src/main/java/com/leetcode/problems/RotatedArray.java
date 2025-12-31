package com.leetcode.problems;

/* Rotate an array of n elements to the right by k steps. For example , with n =7 and k=3
*  the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].*/

public class RotatedArray
{
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6,7};
      int k =5;
        //Solution-1 Normal Approach array
       // rotateArrayNoramlWay(arr, k);


        //Solution-1 intermediate array
          rotateArrayBubbleWay(arr, k);


    }

    private static void rotateArrayNoramlWay(int[] arr, int k) {
        if(k >= arr.length){
            throw new IllegalArgumentException("Kth Value cannot be greater than give array...");
        }
        int front = arr.length - k; //7 -4 =3;
        int back = k;//4

        int new_arr[] = new int[arr.length];

        for(int i=front, j=0; i<arr.length; i++,j++){
            new_arr[j] = arr[i];
        }

        for(int y =0; y<front; y++){
            int ele = arr[y];
            new_arr[new_arr.length - front +y] = ele;
        }
        for(int a: new_arr){
            System.out.print(a +" ");
        }
        System.out.println();
        //time complexity : O(n)
        //space complexity : O(n)
    }

    private static void rotateArrayBubbleWay(int arr[], int k) {
       if(arr == null || k <0){
           throw new IllegalArgumentException("Illegal Argument....");
       }
        if(k >= arr.length){
            throw new IllegalArgumentException("Kth Value cannot be greater than give array...");
        }
        for (int i =0; i<k; i++){
            for(int j =arr.length -1; j>0; j--){
                int temp = arr[j];
                arr[j] = arr[j -1];
                arr[j-1] = temp;
            }
        }
            for(int a : arr){
                System.out.print(a + " ");
            }
    }
}
