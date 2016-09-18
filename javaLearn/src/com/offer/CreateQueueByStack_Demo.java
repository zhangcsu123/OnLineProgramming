package com.offer;

import java.util.Stack;

/**
 * Created by zhang on 2016/9/18.
 */
public class CreateQueueByStack_Demo {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(new Integer(node));
    }

    public int pop() {
        if(stack2.empty()) {
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }

        if(stack2.empty())
            System.out.println("stack1 is empty");

        return stack2.pop().intValue();
    }

}
