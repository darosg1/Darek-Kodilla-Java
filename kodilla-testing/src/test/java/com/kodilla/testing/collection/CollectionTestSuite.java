package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Odd Numbers Exterminator: begin");
    }
    @After
    public void after(){
        System.out.println("Test Odd Numbers Exterminator: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(numbers.size()-1);
        numbers.remove(numbers.size()-1);
        ArrayList<Integer> result = exterminator.exterminate(numbers);

        Assert.assertEquals(result, numbers);
        }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        OddNumbersExterminator exterminator= new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        //when
        ArrayList<Integer> result = exterminator.exterminate(numbers);
        //then
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(4);
        expected.add(6);

        Assert.assertEquals (result, expected);
        System.out.println(result);
        System.out.println(expected);
    }
}
