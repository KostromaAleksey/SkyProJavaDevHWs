package org.skypro.skyshop.search;

import java.util.Comparator;

public class SearchComparator implements Comparator<Searchable> {
    @Override
    public int compare(Searchable o1, Searchable o2) {
        int compareVal = Integer.compare(o2.getName().length(), o1.getName().length());
        if (compareVal == 0) {
            compareVal = o1.getName().compareTo(o2.getName());
        }
        return compareVal;
    }
}
