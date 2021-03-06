package com.learn.linkedlist;

import org.junit.Test;

public class SwapSingleLinkedListNodesInPairsTest extends BaseLinkedListTest {

    @Test
    public void swapPairsVal() {
        ListNode head = initLinkedList();
        printLinkedList(head);
        SwapSingleLinkedListNodesInPairs function = new SwapSingleLinkedListNodesInPairs();
        ListNode node = function.swapPairsVal(head);
        System.out.println();
        printLinkedList(node);
    }

    @Test
    public void swapPairsNode() {
        ListNode head = initLinkedList();
        printLinkedList(head);
        DetectCycleReturnCycleNode function = new DetectCycleReturnCycleNode();
        ListNode node = function.detectCycleWithSlowAndFast(head);
        System.out.println(node);
    }
}
