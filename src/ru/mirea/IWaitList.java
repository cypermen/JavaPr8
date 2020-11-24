package ru.mirea;

import java.util.Collection;

public interface IWaitList<E> {
     void add(E element) throws Exception;
     E remove();
     boolean contains(E element);
     boolean containsAll(Collection<E> с);
     boolean isEmpty();
}
