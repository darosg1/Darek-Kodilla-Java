package com.kodilla.testing.weather.stub;
import java.util.HashMap;

public class TemperatureStub implements Temperatures {
    @Override
    public HashMap<Integer, Double> getTemperatures(){
        HashMap<Integer, Double> stubResult = new HashMap<Integer, Double>();
        //dummy data
        stubResult.put(0,20.0);
        stubResult.put(1, 21.2);
        stubResult.put(2, 22.4);
        stubResult.put(3, 25.2);
        stubResult.put(4, 23.2);

        return stubResult;
    }
}
