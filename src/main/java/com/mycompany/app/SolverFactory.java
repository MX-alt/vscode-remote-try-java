package com.mycompany.app;

public class SolverFactory {
    // 静态工厂方法
    public static Solver getSolver(String type) {
        if ("TwoSum".equalsIgnoreCase(type)) {
            return new TwoSumSolver();
        } else if ("ValidParentheses".equalsIgnoreCase(type)) {
            return new ValidParenthesesSolver();
        }
        // 可以添加更多的求解器类型
        return null;
    }
}
