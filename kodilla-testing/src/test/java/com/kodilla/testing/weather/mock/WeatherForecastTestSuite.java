package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithMock() {
        //given
        Temperatures temperaturesMock = mock(Temperatures.class);
        HashMap<Integer,Double>temperaturesMap = new HashMap<Integer,Double>();
        temperaturesMap.put(0, 1.0);
        temperaturesMap.put(1, 1.2);
        temperaturesMap.put(2, 1.1);
        temperaturesMap.put(3, 1.05);
        temperaturesMap.put(4, 0.9);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //when
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //then
        Assert.assertEquals(5, quantityOfSensors);
    }
}
