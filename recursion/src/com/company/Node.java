package com.company;

public class Node<T> {
	
	// public for testing purposes only!!
	public T data; // element in the list
	public Node<T> next; // link to next node

	public Node(T dataPortion) {
		this(dataPortion, null);
	} 

	public Node(T dataPortion, Node<T> nextNode) {
		data = dataPortion;
		next = nextNode;
	} 

	public T getData() {
		return data;
	} 

	public void setData(T newData) {
		data = newData;
	}

	@Override
	public String toString() {
		return "Node{" +
				"data=" + data +
				", next=" + next +
				'}';
	}

	public Node<T> getNextNode() {
		return next;
	} 

	public void setNextNode(Node<T> nextNode) {
		next = nextNode;
	} 
} 