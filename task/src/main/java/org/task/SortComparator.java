package org.task;

import java.util.Comparator;

/**
 * Created by do.korablev on 15.02.2019.
 */
public class SortComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
