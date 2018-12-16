package com.netcracker.sorter;

import com.netcracker.annotation.AutoInjectable;
import com.netcracker.sorter.IMySortable;

import java.util.Comparator;

public class Sorting {

    @AutoInjectable
    private IMySortable sorter;

    public void sort(Object[] object, Comparator comp, int counter ){
         sorter.sort(object, comp, counter);
    }

}
