package com.mycompany.app;

import java.util.HashMap;
import java.util.Map;

// 实现 Solver 接口
public class TwoSumSolver implements Solver {
    @Override
    public String solve() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);
        return "工厂模式运行：找到索引 " + result[0] + ", " + result[1];
    }

    private int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}