package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class testGetListUsingIntStream {
    @Test
    public void testGetListUsingIntStream() {
        //given
        BookDirectory bookDirectory = new BookDirectory();
        //when
        List<Book> books = bookDirectory.getList();
        //then
        int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .map(n -> 1)
                .sum();
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
}
