package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge challenge = new SecondChallenge();
        try{
            challenge.probablyIWillThrowException(2,2);
        }catch (Exception e){
            System.out.println("Niestety błąd: " + e);
        }finally{
            System.out.println("System sprawdza obsługę wyjątku.git add");
        }
    }
}
