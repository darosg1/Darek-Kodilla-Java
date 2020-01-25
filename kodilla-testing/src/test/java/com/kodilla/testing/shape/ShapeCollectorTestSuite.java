package com.kodilla.testing.shape;
import org.junit.*;

    public class ShapeCollectorTestSuite {

        @BeforeClass
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests");
        }
        @AfterClass
        public static void afterAllTests(){
            System.out.println("All tests are finished");
        }
        @Test
        public void testAddFigure(){
            //given
            Triangle theTriangle = new Triangle();
            ShapeCollector collector = new ShapeCollector();
            //when
            collector.addFigure(theTriangle);
            //then
            Assert.assertEquals(theTriangle, collector.getFigure(0));
        }
        @Test
        public void testRemoveFigure(){
            //given
            Circle theCircle = new Circle();
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(theCircle);
            //when
            boolean result = collector.removeFigure(theCircle);
            //then
            Assert.assertTrue(result);
        }
        @Test
        public void testGetFigure(){
            //given
            Square theSquare = new Square();
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(theSquare);
            //when
            Shape retrievedShape = collector.getFigure(0);
            //then
            Assert.assertEquals(theSquare, retrievedShape);
        }

}
