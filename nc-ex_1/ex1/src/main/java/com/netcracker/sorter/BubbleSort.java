package com.netcracker.sorter;

import java.util.Comparator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSort implements IMySortable {
	
	private static Logger log = LogManager.getLogger(BubbleSort.class);
    /**
     * сортировка пузырьком
     * @param mas  - массив, который сортируем
     * @param comparator - компаратор
     * @return отсортированный массив
     */
    public void sort(Object[] mas, Comparator comparator, int counter) {
    	log.info("Sort type: bubble");
        Object temp;
        for(int i=0; i<counter-1; i++) {
            for (int j = counter - 1; j > i; j--) {
                if (comparator.compare(mas[j - 1], mas[j]) >= 1) {
                    temp = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = temp;
                }
            }
        }
    }
}
