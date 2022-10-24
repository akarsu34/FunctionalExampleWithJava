package MathExampleWithLambda;

public class LambdaMathExam {
    public static void main(String[] args) {
        Math adder = (double d1 ,double d2) -> {return d1 + d2;};
        add(adder,3,6);


        add((double d1,double d2) -> {return d1 + d2;}, 5,4);
        add((d1 ,d2) -> java.lang.Math.abs(d1 -d2),8,13);

        Math mod =  (d1,d2) -> d1 % d2;
//        add(mod,7,3);
        add((d1,d2) -> d1 % d2 ,7,3);
    }

    public static void add(Math m ,double d1, double d2){
        System.out.println(m.doMath(d1,d2));

    }

}
