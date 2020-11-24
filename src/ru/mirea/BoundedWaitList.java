package ru.mirea;

public class BoundedWaitList<E> extends WaitList{
    private int capacity;


    public BoundedWaitList(int capacity)
    {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(Object element)  {
        if(content.size() < capacity) {
            content.add(element);
            return;
        }
        System.out.println("Очередь переполнена");;
    }


}
