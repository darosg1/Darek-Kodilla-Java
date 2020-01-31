package com.kodilla.stream.sand;

import org.junit.Test;
import java.math.BigDecimal;
import org.junit.Assert;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

import java.util.ArrayList;
import java.util.List;


public class SandStorageTestSuite {
    @Test
    public void testGetSandBeansQuantity(){
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());
        //When
        BigDecimal totalSand = BigDecimal.ZERO;
        // BigDecimal totalSand = new BigDecimal("0);
        for(SandStorage continent:continents){
            totalSand=totalSand.add(continent.getSandBeansQuantity());
        }
        //Then
        BigDecimal expectedSand = new BigDecimal("17638137081237092740");
        Assert.assertEquals(expectedSand, totalSand);
    }
    @Test
    public void testGetSandBeansQuantityWithReduce(){
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());
        //When
        BigDecimal totalSand = continents.stream()
                .map(SandStorage::getSandBeansQuantity)
                .reduce(BigDecimal.ZERO, (sum,current)->sum=sum.add(current));
        //Then
        BigDecimal expectedSand = new BigDecimal("17638137081237092740");
        Assert.assertEquals(expectedSand, totalSand);
    }
}
