package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //given
        Country poland = new Country("Poland", new BigDecimal(38000000));
        Country germany = new Country("Germany", new BigDecimal(81000000));
        Country france = new Country("France", new BigDecimal(64000000));

        Country egypt = new Country("Egypt", new BigDecimal(97500000));
        Country tunisia = new Country("Tunisia", new BigDecimal (10600000));
        Country libya = new Country("Libya", new BigDecimal(6500000));

        Country usa = new Country("USA", new BigDecimal (326000000));
        Country canada = new Country("Canada", new BigDecimal (36000000));
        Country mexico = new Country ("Mexico", new BigDecimal (126500000));

        //when
        Continent europe = new Continent ("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        Continent africa = new Continent ("Africa");
        africa.addCountry(egypt);
        africa.addCountry(tunisia);
        africa.addCountry(libya);

        Continent northAmerica = new Continent ("North America");
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(northAmerica);

        BigDecimal peopleQuantity2020= world.getPeopleQuantity();
        BigDecimal peopleQuantityExpected = new BigDecimal("786100000");
        // then
        Assert.assertEquals(peopleQuantityExpected, peopleQuantity2020);
    }
}
