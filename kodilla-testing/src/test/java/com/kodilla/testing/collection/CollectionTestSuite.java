package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){ System.out.println("Test Odd Numbers Exterminator: begin");
    }
    @After
    public void after(){
        System.out.println("Test Odd Numbers Exterminator: end");
    }
   @Test
        public void testOddNumbersExterminatorEmptyList()
        {
            OddNumbersExterminator numbers1= new OddNumbersExterminator();
        ArrayList<Integer> numbers123 = new ArrayList<Integer>();
        numbers1.exterminate(numbers123);
        Assert.assertEquals(numbers1.exterminate(numbers123), numbers123);
        System.out.println(numbers1.exterminate(numbers123)+ ""+numbers123);
        }
    @Test
    public void testOddNumbersExterminatorNormalList()
    {   //given
        OddNumbersExterminator numbers1= new OddNumbersExterminator();
        ArrayList<Integer> numbers123 = new ArrayList<Integer>();
        numbers123.add(1);
        numbers123.add(2);
        numbers123.add(3);
        numbers123.add(4);
        numbers123.add(5);
        numbers123.add(6);
        numbers123.add(7);
        numbers123.add(8);
        numbers123.add(9);
        numbers123.add(10);
        numbers123.add(11);
        numbers123.add(12);
        //when
        numbers1.exterminate(numbers123);
        //then
        Assert.assertNotEquals(numbers1.exterminate(numbers123), numbers123);
        System.out.println(numbers1.exterminate(numbers123)+ ""+numbers123);
    }
}
