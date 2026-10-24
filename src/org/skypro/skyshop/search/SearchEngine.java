package org.skypro.skyshop.search;

import org.skypro.skyshop.exception.BestResultNotFound;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class SearchEngine {

    private final LinkedList<Searchable> searchables = new LinkedList<>();

    public Map<String, Searchable> search(String search) {
        Map<String, Searchable> searched = new TreeMap<>();
        for (Searchable searchable : searchables) {
            if (searchable != null && searchable.getSearchTerm().contains(search)) {
                searched.put(searchable.getName(), searchable);
            }
        }
        return searched;
    }

    private int matchCount(String searchTerm, String search) {
        int count = 0;
        int index = 0;
        int indexSubstring = searchTerm.indexOf(search, index);

        while (indexSubstring != -1) {
            count++;
            index = indexSubstring + search.length();
            indexSubstring = searchTerm.indexOf(search, index);
        }

        return count;
    }

    public Searchable searchSingle(String search) throws BestResultNotFound {
        int maxMatchCount = 0;
        Searchable searched = null;
        for (Searchable searchable : searchables) {
            if (searchable == null) {
                continue;
            }
            int matchCount = matchCount(searchable.getSearchTerm(), search);
            if (matchCount > maxMatchCount) {
                searched = searchable;
                maxMatchCount = matchCount;
            }
        }
        if (searched == null) {
            throw new BestResultNotFound(search);
        }
        return searched;
    }

    public void add(Searchable searchable) {
        searchables.add(searchable);
    }
}
