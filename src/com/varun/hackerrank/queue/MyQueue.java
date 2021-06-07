package com.varun.hackerrank.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Creating a FIFO queue using 2 stacks
 */
public class MyQueue<E> {

    private Stack s1 = new Stack();
    private Stack s2 = new Stack();


    public MyQueue() {
    }

    public <T> void enqueue(T obj){
        s1.push(obj);
    }

    public <T> Object dequeue() throws NoSuchElementException{
        if(s1.isEmpty() && s2.isEmpty()){
            throw new NoSuchElementException();
        }
        if(!s1.isEmpty() && s2.isEmpty()){
            while(s1.size()!=0) {
                s2.push(s1.pop());
            }

        }
        return s2.pop();
    }

    public <T> Object peek() throws NoSuchElementException{
        if(s1.isEmpty() && s2.isEmpty()){
            throw new NoSuchElementException();
        }
        if(!s1.isEmpty() && s2.isEmpty()){
            while(s1.size()!=0) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("4");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
        List<Integer> lst = new ArrayList<>();
    }

}
