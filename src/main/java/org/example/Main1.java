package org.example;

public class Main1 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) res ^= num;
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}