package com.kodilla.testing.library;
import java.util.List;

public interface LibraryDatabase {
    //list of book having title beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    //list of books borrowed by library user
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //try to rent a book for libraryUser
    //returns true when success
    //and return false when book in unavailable to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    //return all books borrowed by libraryUser to the library
    //return number of books return back
    int returnBooks(LibraryUser libraryUser);
}