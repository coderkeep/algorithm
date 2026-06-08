package com.learn;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * leetcode 146 LRU Cache
 */
public class LRUCache {

    private Integer capacity;

    /**
     * 在 Map 结构中存储链表中的元素，达到O(1)的时间复杂度
     */
    private Map<Object, Integer> dataMap = new HashMap<>();

    private LinkedList<Object> cacheOrder = new LinkedList<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer obj = dataMap.get(key);
        if (obj != null) {
            cacheOrder.remove(Integer.valueOf(key));
            cacheOrder.addFirst(key);
            return obj;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (dataMap.containsKey(key)) {
            dataMap.put(key, value);
            cacheOrder.remove(Integer.valueOf(key));
            cacheOrder.addFirst(key);
        } else {
            // 添加元素
            dataMap.put(key, value);
            cacheOrder.addFirst(key);
            // 判断是否超出容量，超出容量，删除最后一个元素
            // 需要判断当前元素是否已经存在
            if (cacheOrder.size() > capacity) {
                Object lastObj = cacheOrder.removeLast();
                dataMap.remove(lastObj);
            }
        }
    }
}


