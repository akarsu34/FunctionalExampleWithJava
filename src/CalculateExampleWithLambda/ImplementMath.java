package CalculateExampleWithLambda;

public class ImplementMath {
    public int i=0;
    public static void main(String[] args) {
        double value=0;
//        MathInterface adder = (d1,d2)-> d1 + d2;
//        value = doMath(adder,5,6);
//                 or
//        value = doMath((d1,d2) -> d1+d2,8,9);
        System.out.println("\n---------------------");

        value = doMath((d1,d2) -> d1+d2,8,9);
        System.out.println("d1 + d2 : " + value);

        value = doMath((d1,d2) -> Math.abs(d1-d2),8,9);
        System.out.println("d1 - d2 : " + value);

        value = doMath((d1,d2) -> d1*d2,8,9);
        System.out.println("d1 * d2 : " + value);

        value = doMath((d1,d2) -> d1/d2,8,9);
        System.out.println("d1 / d2 : " + value);
        System.out.println("*****************");



    }


    public static double doMath(MathInterface mI ,double a, double b){
        return mI.calculate(a,b);
    }
}
