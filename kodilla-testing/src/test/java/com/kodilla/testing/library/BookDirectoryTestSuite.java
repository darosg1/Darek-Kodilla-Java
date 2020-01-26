package com.kodilla.testing.library;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book>resultList = new ArrayList<Book>();
        for(int n=1; n<=booksQuantity; n++) {
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    public void testListBooksWithConditionReturnList(){
        //check if book list  comply with condition is returned properly
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book ("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book ("Secretaries and Direcotr", "Dilbert Michigan", 2012);
        Book book3 = new Book ("Secret lif of programmers","Steve Wolkowitz", 2016);
        Book book4 = new Book ("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        //when
        List<Book>theListOfBooks=bookLibrary.listBooksWithCondition("Secret");
        //then
        assertEquals(4, theListOfBooks.size());
    }
    @Test
    public void testListBooksWithConditionMoreThan20(){
        //check if method listBooksWithCondition(String titleFragment) acts properly, while number of titles are higher than 20.
        //if true return empty list
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
        //when
        List<Book>theListOfBooks0=bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book>theListOfBooks15=bookLibrary.listBooksWithCondition("AnyTitle");
        List<Book>theListOfBooks40=bookLibrary.listBooksWithCondition("FortyBooks");
        //then
        assertEquals(0,theListOfBooks0.size());
        assertEquals(15,theListOfBooks15.size());
        assertEquals(0,theListOfBooks40.size());
    }
    @Test
    public void testListBooksWithConditionFragmentShorterThan3(){
        //check if list of return books is empty in situation while searching fragment is shorter than 3 signs.
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book>resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);
        //when
        List<Book>theListOfBooks10=bookLibrary.listBooksWithCondition("An");

        //then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock,times(0)).listBooksWithCondition(anyString());
    }
    @Test
    public void testListBooksInHandsOfLibraryUserNoBooks(){
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser1 = new LibraryUser("Darek","Kozyra", "1234567890");
        List<Book>theListOfBooks0InUserHands = new ArrayList<Book>();
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(theListOfBooks0InUserHands);
        //when
        List<Book>theList = bookLibrary.listBooksInHandsOf(libraryUser1);
        //then
        assertEquals(0,theList.size());
    }
    @Test
    public void testListBooksInHandsOfLibraryUserOneBook(){
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser1 = new LibraryUser("Darek", "Kozyra", "1234567890");
        List<Book>theListOfBooks1InUserHands = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(theListOfBooks1InUserHands);
        //when
        List<Book>theList =bookLibrary.listBooksInHandsOf(libraryUser1);
        //then
        assertEquals(1,theList.size());
    }
    @Test
    public void testListBooksInHandsOfLibraryUserFiveBooks(){
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser1 = new LibraryUser("Darek", "Kozyra", "1234567890");
        List<Book>theListOfBooks5InUserHands = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(theListOfBooks5InUserHands);
        //when
        List<Book>theList=bookLibrary.listBooksInHandsOf(libraryUser1);
        //then
        assertEquals(5,theList.size());
        verify(libraryDatabaseMock,times(1)).listBooksInHandsOf(libraryUser1);
    }
}
