package sda.com;

public class Calculator {
    public int add(int firstNumber, int secondNumber) {
        if (firstNumber == Integer.MAX_VALUE || secondNumber==Integer.MAX_VALUE){
            throw new ArithmeticException("suma e prea mare");
        }
        return firstNumber + secondNumber;
    }
    public int sub(int firstNumber, int secondNumber) {
        return Math.abs(firstNumber - secondNumber);
    }
    public long multiply(int firstNumber, int secondNumber) {
        return (long) firstNumber * secondNumber;
    }
    public double divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("cannot divide by zero");
        }
        return (double) firstNumber / secondNumber;
    }
}
