package com.learn;

/**
 * 11
 * https://leetcode.cn/problems/container-with-most-water/
 */
public class ContainerWithMostWater {

    // 两次 for 循环求解，时间复杂度 O(n^2)
    public int maxArea_case1(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    // 通过首位指针，每次移动小的指针，时间复杂度 O(n)
    // 推动小的指针，有可能找到更大的高度，构造更大的面积
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int curArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(curArea, maxArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

}
