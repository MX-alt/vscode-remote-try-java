package com.mycompany.app;

public class BinarySearchSolver implements Solver {
    @Override
    public void solve() {
        int[] nums = {-1, 0, 3, 5, 9, 12}; // 必须是有序的
        int target = 9;
        int result = search(nums, target);
        System.out.println("目标值 " + target + " 的索引位置是: " + result);
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // 防止溢出的写法：mid = left + (right - left) / 2
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // 没找到
    }
}