package com.company;

public class NodePlayground {
    public int data;
    public NodePlayground next;

    public NodePlayground(int data) {
       this(data, null);
    }

    public NodePlayground(int data, NodePlayground next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodePlayground{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
