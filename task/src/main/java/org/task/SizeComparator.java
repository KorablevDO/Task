package org.task;

import java.util.Comparator;

/**
 * Created by do.korablev on 15.02.2019.
 */
public class SizeComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if(o1.length() < o2.length()){
            return 1;
        } else if(o1.length() > o2.length()){
            return -1;
        }
        return 0;
    }
}
