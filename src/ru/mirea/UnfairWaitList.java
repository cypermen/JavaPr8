package ru.mirea;

public class UnfairWaitList<E> extends WaitList{
    UnfairWaitList(){
        super();
    }

    public void remove(E element)
    {
                content.remove(element);
    }

    public void moveToBack()
    {
        content.add(content.remove());
    }


}
