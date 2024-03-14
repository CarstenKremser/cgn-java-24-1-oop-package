package de.neuefische.cgnjava241.ooppackage;

import java.util.Arrays;

public class Library {
    Book[] books;

    @Override
    public String toString() {
        return "{Library books:" + Arrays.toString(books) + "}";
    }

}
