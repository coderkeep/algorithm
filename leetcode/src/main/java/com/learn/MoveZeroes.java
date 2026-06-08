package com.learn;

/**
 * 283
 * https://leetcode.cn/problems/move-zeroes/
 */
public class MoveZeroes {

    // 1. 直接强制赋值 0
    public void moveZeroes_1(int[] nums) {
        int notZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // 直接赋值
                nums[notZeroIndex] = nums[i];
                notZeroIndex++;
            }
        }
        // notZeroIndex 指向下一个非 0 的位置
        for (int i = notZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // 2. 快慢双指针模式,本质是移动非 0 数的位置
    public void moveZeroes_2(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                swapNums(nums, slow, fast);
                slow++;
            }
        }
    }

    // 3. 滚雪球的模式，本质是移动 0 的位置
    public void moveZeroes(int[] nums) {
        int ballSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ballSize++;
            } else {
                swapNums(nums, i, i - ballSize);
            }
        }
    }

    private void swapNums(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
