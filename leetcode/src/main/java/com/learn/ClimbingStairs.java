package com.learn;

import java.util.HashMap;

/**
 * 70
 * https://leetcode.cn/problems/climbing-stairs/description/
 */
public class ClimbingStairs {

    // 1. 找最近重复子问题
    // f(n) = f(n-1) + f(n-2) ..... f(1) = 1 ,f(2) = 2

    // 2. 递归的解法
    public int climbStairs(int n) {
        int r = 0;
        int a = 0;
        int b = 1;
        // 可以通过额外定义一个数组，记录每次调用的结果
        for (int i = 1; i <= n; i++) {
            r = a + b;
            a = b;
            b = r;
        }
        return r;
    }

    public int climbStairs_Case2(int n) {
        HashMap<Integer, Integer> result = new HashMap<>();
        return f(n, result);
    }

    // 递归，可以粗略认为时间复杂度是 O(2^n)，空间复杂度是展开的函数栈的个数
    // 通过记录中间结果，减少递归的执行次数
    private int f(int n, HashMap<Integer, Integer> result) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (!result.containsKey(n)) {
            result.put(n - 1, f(n - 1, result));
            result.put(n - 2, f(n - 2, result));
            result.put(n, result.get(n - 1) + result.get(n - 2));
        }
        return result.get(n);
    }

}


