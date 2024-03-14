package de.neuefische.cgnjava241.ooppackage;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        Book[] newBooks = Arrays.copyOf(books,books.length+1);
        newBooks[newBooks.length-1] = book;
        books = newBooks;
    }

    public void removeBookAtIndex(int index) {
        for (int i = index; i < books.length-1; i++) {
            books[i] = books[i+1];
        }
        Book[] newBooks = Arrays.copyOf(books,books.length-1);
        books = newBooks;
    }

    @Override
    public String toString() {
        return "{Library books:" + Arrays.toString(books) + "}";
    }

}
