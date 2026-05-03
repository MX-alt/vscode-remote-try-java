package com.mycompany.app;

public class SolverFactory {
    // 静态工厂方法
    public static Solver getSolver(String type) {
        if ("TwoSum".equalsIgnoreCase(type)) {
            return new TwoSumSolver();
        } else if ("ValidParentheses".equalsIgnoreCase(type)) {
            return new ValidParenthesesSolver();
        } else if ("MergeIntervals".equalsIgnoreCase(type)) {
            return new MergeIntervalsSolver();
        } else if ("BinarySearch".equalsIgnoreCase(type)) {
            return new BinarySearchSolver();
        }
        return null;
    }
}
