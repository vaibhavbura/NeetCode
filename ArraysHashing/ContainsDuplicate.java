// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

// Example 1:

// Input: nums = [1,2,3,1]

// Output: true

// Explanation:

// The element 1 occurs at the indices 0 and 3.

import java.util.*;
public class ContainsDuplicate {

    public static boolean containsDup(int nums[]){
        Set<Integer> neew = new HashSet<>();
        for(int num:nums){
            if(neew.contains(num)){
                return true; //contains duplicate
            }
            neew.add(num);
        }
        return false; //all elements are unique
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,1};
        boolean x = containsDup(nums);
        System.out.println(x);

    }
}
