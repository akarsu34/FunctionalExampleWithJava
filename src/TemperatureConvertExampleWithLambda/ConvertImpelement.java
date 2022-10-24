package TemperatureConvertExampleWithLambda;

import java.util.function.UnaryOperator;

public class ConvertImpelement {
    public static double fahrenayt;
    public static double kelvin;
    public static double celcius;

    public static void main(String[] args) {

        TypeConvert celciusToFahrenat=(double a) -> (((a/100) *180) +32);
        doConvert(20,celciusToFahrenat);


        TypeConvert fahrenaytToCelcius= (double a)-> ((a-32) *100) / 180;
        doConvert(28,fahrenaytToCelcius);

        TypeConvert celciusToKelvi = (double a) -> a + 273;
        doConvert(30,celciusToKelvi);

        TypeConvert kelvinToCelcius= (double a) -> a - 273;
        doConvert(65,kelvinToCelcius);



    }
    public static void doConvert(double a, TypeConvert t){
        System.out.println(t.convert(a));
    }
}
