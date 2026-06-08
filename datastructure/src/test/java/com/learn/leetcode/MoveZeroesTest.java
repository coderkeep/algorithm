package com.learn.leetcode;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest extends TestCase {

    @Test
    public void testMoveZeroesCase_1() {
        int[] nums = {0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(nums);
        Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

}