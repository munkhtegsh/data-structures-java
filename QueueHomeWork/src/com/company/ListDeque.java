package com.company;

import java.util.LinkedList;
import java.util.List;

public class ListDeque<T> implements DequeInterface<T> {
    private List<T> list;

    public ListDeque(List<T> list) {
        this();
        this.list = list;
    }

    public ListDeque() {
        this.list = new LinkedList();
    }

    @Override
    public void addToFront(T newEntry) {
        list.add(0, newEntry);
    }

    @Override
    public void addToBack(T newEntry) {
        list.add(newEntry);
    }

    @Override
    public T removeFront() {
        if (isEmpty()) {
            return null;
        }

        T front = list.remove(0);
        return front;
    }

    @Override
    public T removeBack() {
        if (isEmpty()) {
            return null;
        }

        T back = list.remove(list.size() - 1);
        return back;
    }

    @Override
    public T getFront() {
        if (isEmpty()) {
            return null;
        }

        return list.get(0);
    }

    @Override
    public T getBack() {
        if (isEmpty()) {
            return null;
        }

        return list.get(list.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }
}
