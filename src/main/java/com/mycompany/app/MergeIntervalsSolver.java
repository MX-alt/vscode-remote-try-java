package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsSolver implements Solver {
    @Override
    public String solve() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);
        
        System.out.println("合并后的区间为：");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
        return "Merge Intervals 问题已解决！";
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // 1. 按照开始时间排序 (Lambda 表达式)
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for (int[] nextInterval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];

            if (currentEnd >= nextStart) {
                // 重叠了，更新当前区间的结束时间
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // 不重叠，换下一个区间进行对比
                currentInterval = nextInterval;
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}