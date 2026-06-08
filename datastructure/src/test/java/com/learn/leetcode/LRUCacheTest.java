package com.learn.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class LRUCacheTest extends TestCase {


    @Test
    public void testLRUCacheCase_1() {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 0);
        cache.put(2, 2);
        assertEquals(cache.get(1), 0);
        cache.put(3, 3);
        assertEquals(cache.get(2), -1);
    }

    @Test
    public void testLRUCacheCase_2() {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(cache.get(1), 1);
        cache.put(3, 3);
        assertEquals(cache.get(2), -1);
        cache.put(4, 4);
        assertEquals(cache.get(1), -1);
        assertEquals(cache.get(3), 3);
    }

    public void testLRUCacheCase_3() {
        LRUCache cache = new LRUCache(2);

        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);
        assertEquals(cache.get(1), -1);
        assertEquals(cache.get(2), 3);
    }

}
