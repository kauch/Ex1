package com.netcracker.sorter;


import com.netcracker.comparator.IPersonComparator;
import com.netcracker.entities.Person;

public interface IMySortable {
    /**
     * Сортирока списка
     * @param mas список
     * @param comp параметр сортировки
     * @param counter количество элементов в массиве
     */
    void sort(Person[] mas, IPersonComparator comp, int counter);
}
