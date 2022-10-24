package EvenNumberWithBuiltinFunctionInJava;



//import ComparatorImpExampleWithLambda.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    static int total=0;
    static Integer p=1;
    static List<Integer> integerList = new ArrayList<>();

    public static void main(String[] args) {


        UnaryOperator<Integer> sum =(d)->total+=d;
        calculate(sum);
        System.out.println("total : " +total);

        UnaryOperator<Integer> product =(d)->p*=d;
        calculate(product);
        System.out.println("product : " +p);

        Function<Integer,Boolean> squares= (i)-> integerList.add((i*i));
        calculate(squares);

        for (Integer i :
                integerList) {
            System.out.print(i+" ");
        }


    }
    public static void calculate(Function f ){
        for (int i = 2; i <= 10; i+=2) { // 2 4 6 8 10
            f.apply(i);
        }

    }

}
