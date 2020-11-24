package ru.mirea;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

class WaitList<E> implements IWaitList {
    protected ConcurrentLinkedQueue<E> content;


    public WaitList()
    {
        content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> c)
    {
        content = new ConcurrentLinkedQueue<>();
        for (E element:c) {
            content.add(element);
        }
    }
    @Override
    public void add(Object element){
            content.add((E)element);
    }

    @Override
    public Object remove() {
        return content.remove();
    }

    @Override
    public boolean contains(Object element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        String s = "";
        for (E element:content) {
            if(element != content.toArray()[content.toArray().length - 1])
                s += element + ", ";
            else
                s+= element;
        }
        return s;
    }
}
