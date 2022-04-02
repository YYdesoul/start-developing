package com.soul.DataStructure;


public class ListNode {
    int val;
    ListNode next;

    public ListNode(){

    }

    public ListNode(int val){
        this.val = val;
    }
}

class TestListNode {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        System.out.println(listNode1.next);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(listNode1.val);
        System.out.println(listNode1.next.val);
        System.out.println(listNode1.next.next.val);
        System.out.println(listNode1.next.next.next);
    }
}