package org.skypro.skyshop.search;

public class SearchEngine {

    private final Searchable[] searchables;

    public SearchEngine(int size) {
        searchables = new Searchable[size];
    }

    public Searchable[] search(String searchString) {
        int index = 0;
        Searchable[] searched = new Searchable[5];
        for (Searchable searchable : searchables) {
            if (index >= 5) {
                break;
            }
            if (searchable != null && searchable.getSearchTerm().contains(searchString)) {
                searched[index] = searchable;
                index++;
            }
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
