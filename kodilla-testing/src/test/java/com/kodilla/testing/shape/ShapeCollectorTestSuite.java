package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }
    @Test
    public void addFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        boolean result = shapeCollector.addFigure(circle);
        Assert.assertTrue(result);
        System.out.println(result);
    }
   @Test
    public void removeFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        boolean result = shapeCollector.removeFigure(circle);
        Assert.assertTrue(result);
       System.out.println(result);
    }
    @Test
    public void getFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();

        shapeCollector.getFigure(1);
        Assert.assertEquals(1, circle);
    }
    /*@Test
    public void showFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();

        shapeCollector.showFigure();

        Assert.assertEquals(circle, shapeCollector.showFigure());
    }*/
}
