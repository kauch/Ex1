package com.netcracker.sorter.generics;
import java.util.Comparator;

public interface IMySortableT<T> {
    void sort(T[] mas, Comparator<T> comparator, int counter);
}
