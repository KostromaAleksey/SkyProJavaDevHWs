package org.skypro.skyshop.exception;

public class BestResultNotFound extends Exception {

    private final String search;

    public BestResultNotFound(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "Для поискового запроса [" + search + "] не нашлось подходящей статьи!";
    }
}
