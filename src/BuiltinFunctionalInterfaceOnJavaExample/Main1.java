package BuiltinFunctionalInterfaceOnJavaExample;

import java.util.function.*;

public class Main1 {
    public static void main(String[] args) {
        // accepts one argument and produces a result
        Function<Integer, Integer> newValue = (num) ->  num *2 ;
        System.out.println("New Value: " + newValue.apply(235582));

        // accepts two argument and produces a result
        BiFunction<String, String, Integer> lengthofString =(str1,str2) ->(str1+" "+str2).length();
        System.out.println("length of String : " + lengthofString.apply("merhaba","java"));

        // accept one argument and return boolean
        Predicate<Integer> isTrue = (i)-> i>0;
        System.out.println("is number great then zero : " + isTrue.test(5));

        // accepts two argument and return boolean
        BiPredicate<Integer,Integer> anotherPre =(a,b) -> (a+b)>0;
        System.out.println(anotherPre.test(4,-9));

        // accepts one argument and not return. like a setter method
        Consumer<String> printString =(s)-> System.out.println(s);
        printString.accept("Java :) ");

        // accepts two arguments and not return. like a setter method that accepts two argument
        BiConsumer<String,String> printTwoString= (s1,s2)-> System.out.println(s1+s2);
        printTwoString.accept("I love ","java");

        // no arguments and produces a result. like a getter method
        Supplier<Double> getPI = () -> Math.PI;
        System.out.println(getPI.get());

        // accepts one arguments and same type return
        UnaryOperator<Integer> sameReturn = (i) -> i*i;
        System.out.println("same return type : "+sameReturn.apply(5));

        // accepts two arguments and produces same type result
        BinaryOperator<Integer> sum = (a,b) -> a + b;
        System.out.println(sum.apply(5,23));

    }

}
