import java.util.function.*;
public class Squareofnums {
    //    public static int squareofNums(int n)
//    {
//        return n*n;
//    }
    public static void main(String[] args) {
//        System.out.println("the square of number 5 is " + squareofNums(5));
//        System.out.println("the square of number 6 is " +squareofNums(6));
        Function<Integer, Integer> square = (a -> a * a);
        for (int i = 0; i <= 5; i++) {
            System.out.println(square.apply(i));
        }
        Predicate<Integer> p=i->i%2==0;
        System.out.println(p.test(4));
    }
}
