package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultA = calculator.addAToB(3, 2);
        int resultS = calculator.subtractAFromB(5, 2);

        if (resultA == (3 + 2)) {
            System.out.println("Sum equals " + resultA + " - correct!");
        } else {
            System.out.println("Error");
        }
        if (resultS == (5 - 2)) {
            System.out.println("Subtraction result equals " + resultS + " - correct!");
        } else {
            System.out.println("Error");
        }
    }
}
