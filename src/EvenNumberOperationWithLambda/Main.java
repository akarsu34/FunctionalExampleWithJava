package EvenNumberOperationWithLambda;

public class Main {
    public static int total = 0;
    public static int product = 1;
    public static int[] squares = new int[5];

    public static void main(String[] args) {


//        doEven(10, (i) -> total += i);
//        System.out.println("total : " + total);
//        doEven(10, (i) -> product *= i);
//        System.out.println("product : " + product);
        doEven(10, (i) -> {
            squares[i / 2 - 1] = i * i;
        });
        for (int i :
                squares) {
            System.out.println("list : " + i);
        }
    }

    public static void doEven(int n, EvenNumberOperation e) {
        for (int i = 2; i <= n; i += 2) { // 2-4-6-8-10
            e.operate(i);
        }

    }


}
