package com.leetcode.problems;

/*
L-27:  Given with array nums[] and a integer val. We have to remove all occurence of val integer in
       nums array. And nums array should return the index of the new created array elements .
       Input: [3,2,2,3]
       val: 3
       Ouput: [2,2,-,-]
       array elements can be stored in any manner. order doesnot matter here...
 */
public class RemoveElement {
    public static void main(String[] args) {
       int nums[] = {3,2,7,3};
       int val = 3;
       int index =  new RemoveElement().removeElement(nums,val);
       for(int f: nums)
           System.out.print(f + " ");
        System.out.println();
        System.out.println("index '"+index);
    }

    private int removeElement(int nums[], int val) {
       int index = 0;
       for(int i=0; i<nums.length; i++){
        if(nums[i] == val){
            nums[i] = 0;
        }
        else{
           int temp =  nums[i];
           nums[i] =0;
           nums[index] = temp;
           index++;
        }
       }
       return index;
    }
}
