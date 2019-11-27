package com.company;import com.company.StackInterface;import org.w3c.dom.Element;import org.w3c.dom.Node;import java.util.EmptyStackException;import java.util.MissingResourceException;import java.util.Stack;/** * A class of stacks whose entries are stored in a chain of nodes. *  * @author Frank M. Carrano * @author Timothy M. Henry * @version 5.0 */public final class LinkedStack<T> implements StackInterface<T> {	private Node topNode; // References the first node in the chain	public LinkedStack() {		topNode = null;	} 	public void push(T newEntry) {		Node newNode = new Node(newEntry, topNode);		topNode = newNode;		//    topNode = new Node(newEntry, topNode); // Alternate code	} 	public T peek() {		if (isEmpty())			throw new EmptyStackException();		else			return topNode.getData();	} // end peek	public T pop() {		T top = peek(); // Might throw EmptyStackException		topNode = topNode.getNextNode();		return top;	} 	public boolean isEmpty() {		return topNode == null;	} 	public void clear() {		topNode = null; 	} 	@Override	public String toString() {		String s = "";		Node current = topNode;		while (current != null) {			s = current.data + " " + s;			current = current.next;		}		return s;	}	public boolean priorityPush(T element) {			LinkedStack<T> newStack = new LinkedStack<>();			while (!isEmpty() && !peek().equals(element)) {				T currTop = pop();				newStack.push(currTop);			}			if (isEmpty()) {				while (!newStack.isEmpty()) {					T topEl = newStack.pop();					push(topEl);				}				push(element);			} else {				T foundEl = pop();				while (!newStack.isEmpty()) {					T currEl = newStack.pop();					push(currEl);				}				push(element);				return true;		}		return false;	}	public T peekNext() {		if (isEmpty() || topNode.next == null) {			return null;		}	    return topNode.next.data;	}		private class Node {		private T data; 		private Node next; 		private Node(T dataPortion) {			this(dataPortion, null);		} 		private Node(T dataPortion, Node linkPortion) {			data = dataPortion;			next = linkPortion;		}		private T getData() {			return data;		}		private void setData(T newData) {			data = newData;		}		private Node getNextNode() {			return next;		} 		private void setNextNode(Node nextNode) {			next = nextNode;		} 	} } 