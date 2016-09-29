package com.offer;

import java.util.ArrayList;

/**
 * Created by csu118 on 2016/9/15.
 */
public class PrintLink_Demo {
    ArrayList<Integer> arrayList=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x ){
        val=x;
        next = null;
    }
}