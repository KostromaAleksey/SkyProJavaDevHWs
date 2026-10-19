package org.skypro.skyshop.search;

import org.skypro.skyshop.exception.BestResultNotFound;

public class SearchEngine {

    private final Searchable[] searchables;

    public SearchEngine(int size) {
        searchables = new Searchable[size];
    }

    public Searchable[] search(String search) {
        int index = 0;
        Searchable[] searched = new Searchable[5];
        for (Searchable searchable : searchables) {
            if (index >= 5) {
                break;
            }
            if (searchable != null && searchable.getSearchTerm().contains(search)) {
                searched[index] = searchable;
                index++;
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
        for (int i = 0; i < searchables.length; i++) {
            if (searchables[i] == null) {
                searchables[i] = searchable;
                break;
            }
        }
    }
}
