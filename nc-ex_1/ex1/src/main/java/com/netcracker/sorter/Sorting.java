package com.netcracker.sorter;

import com.netcracker.annotation.AutoInjectable;
import com.netcracker.comparator.IPersonComparator;
import com.netcracker.entities.Person;
import com.netcracker.sorter.IMySortable;

public class Sorting {

    @AutoInjectable
    private IMySortable sorter;

    public void sort(Person[] object, IPersonComparator comp, int counter ){
         sorter.sort(object, comp, counter);
    }

}
