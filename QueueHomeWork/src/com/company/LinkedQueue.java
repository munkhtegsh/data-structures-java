package com.company;import com.company.QueueInterface;import org.w3c.dom.Node;/** * A class that implements a queue of objects by using a chain of linked nodes * that has both head and tail references. * * @author Frank M. Carrano * @author Timothy M. Henry * @version 5.0 */public final class LinkedQueue<T> implements QueueInterface<T> {    public Node firstNode; // References node at front of queue    public Node lastNode; // References node at back of queue    public LinkedQueue() {        firstNode = null;        lastNode = null;    } // end default constructor    public void enqueue(T newEntry) {        Node newNode = new Node(newEntry, null);        if (isEmpty())            firstNode = newNode;        else            lastNode.setNextNode(newNode);        lastNode = newNode;    } // end enqueue    public T getFront() {        if (isEmpty())            throw new EmptyQueueException();        else            return firstNode.getData();    } // end getFront    public T getSecond() {        if (firstNode.next == null) {            throw new EmptyQueueException();        }        return firstNode.next.getData();    }    public T dequeue() {        T front = getFront(); // Might throw EmptyQueueException        // Assertion: firstNode != null        firstNode.setData(null);        firstNode = firstNode.getNextNode();        if (firstNode == null)            lastNode = null;        return front;    } // end dequeue    public boolean isEmpty() {        return (firstNode == null) && (lastNode == null);    } // end isEmpty    public void clear() {        firstNode = null;        lastNode = null;    } // end clear    public void display() {        Node current = firstNode;        while (current != null) {            System.out.print(current.data + " ");            current = current.next;        }        System.out.println();    }    public void splice(LinkedQueue<T> anotherQueue) {        LinkedQueue copy = new LinkedQueue();        Node otherHead = anotherQueue.firstNode;        // if another queue not not null then duplicate        if (otherHead != null) {            copy.firstNode = new Node(otherHead.data);            Node copyHead = copy.firstNode;            while (otherHead.next != null) {   // Duplicating node list Very important to draw it first                copy.lastNode = new Node(otherHead.next.data);                copyHead.next = copy.lastNode;                copyHead = copyHead.next;                otherHead = otherHead.next;            }            if (firstNode != null) {                lastNode.next = copy.firstNode;                lastNode = copy.lastNode;            } else {                firstNode = copy.firstNode;                lastNode = copy.lastNode;            }        }    }    public class Node {        public T data; // Entry in queue        public Node next; // Link to next node        private Node(T dataPortion) {            data = dataPortion;            next = null;        } // end constructor        private Node(T dataPortion, Node linkPortion) {            data = dataPortion;            next = linkPortion;        } // end constructor        private T getData() {            return data;        } // end getData        private void setData(T newData) {            data = newData;        } // end setData        private Node getNextNode() {            return next;        } // end getNextNode        private void setNextNode(Node nextNode) {            next = nextNode;        } // end setNextNode    } // end Node} // end Linkedqueue	