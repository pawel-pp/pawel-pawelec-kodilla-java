package com.kodilla.kodillacourse;

class Calculator {
    long FirstNumber;
    long SecondNumber;

    public Calculator(long firstNumber, long secondNumber) {
        FirstNumber = firstNumber;
        SecondNumber = secondNumber;
    }

    public Long Calculate( String Operation){
        if (Operation == "addition"){
            return FirstNumber + SecondNumber;
        }
        else if (Operation =="subtraction"){
            return FirstNumber - SecondNumber;
        }
        return null;
    }
}
public class zadanie46 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator((long) 3, (long) 4);
        System.out.println(calculator.Calculate("addition"));
        System.out.println(calculator.Calculate("subtraction"));
    }
}