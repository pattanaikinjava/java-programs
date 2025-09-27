package com.leetcode.problems;

/*
  L-88: Given there are 2 integer arrays nums1[] of length m and nums2[] of length n. The final array should
  not be returned by function, instead it should be stored in nums1 array of m elements. And final array nums1
  have length of m+n elements that should be merged in a sorted order.
  If elements are set to 0, it must be ignored.

  Input: nums1 = [1,2,3,0,0,0] - m
         nums2 = [2,5,6] - n
  Ouput: [1,2,2,3,5,6] - m+ n ( 0 is ignored)

  Input: nums1 =[1] - m
         nums2 =[] - n
  Ouput: [1]       - m+n
 */


public class MerginSortedArray
{
    public static void main(String[] args) {
          int nums1[] = {1,2,3,0,0,0};
          int nums2[] = {2,5,6};
          int m = 3; //0 is ignored...
          int n = nums2.length;
          new MerginSortedArray().mergeArrays(nums1,nums2,m,n);
    }
  private void mergeArrays(int nums1[], int nums2[],int m, int n){
        int i = m -1;
        int j = n -1;
        int k = m + n -1;
        while(j >= 0 ) {
            if(i>=0 & nums1[i] > nums2[j]){ // checking and adding last element of nums1[]
                nums1[k] = nums1[i];
                i--;
                j--;
            }
            else{
                nums1[k] = nums2[j]; // checking and adding last element of nums2[]
                k--;
                j--;
            }
        }
          //printing array
      for(int a : nums1){
          System.out.print(a  + " ");
      }
  }
}
