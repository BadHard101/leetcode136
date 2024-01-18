package org.example;

import java.util.Arrays;

public class Main {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        while (i < nums.length) {
            if (nums[i-1] != nums[i]) return nums[i-1];
            i += 2;
        }
        return nums[nums.length-1];
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}