package BuiltinFunctionalInterfaceOnJavaExample;

import java.util.function.BinaryOperator;

public class CalculatorWithBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Double> adder = (x,y) -> x+y;
        BinaryOperator<Double> subtracter = (x ,y) -> Math.abs(x-y);
        BinaryOperator<Double> multiplier = (x,y) -> x*y;
        BinaryOperator<Double> divider = (x,y) -> x/y;
        double value=0;
        value= adder.apply(3.2,8.6);
        System.out.println("value of adder: " + value);
        value = subtracter.apply(5.1,4.3);
        System.out.println("value of subtracter: " + value);
        value=multiplier.apply(24.0,3.5);
        System.out.println("value of multiplier: " + value);
        value=divider.apply(98.2,4.8);
        System.out.println("value of divider: " + value);
    }
}
