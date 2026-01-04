import java.util.*;

public class SortingWithLambdaE {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(13);
        list.add(9);
        list.add(8);
        list.add(7);
        System.out.println("Before sorting " + list);
        Comparator<Integer> ob=(a,b)->a-b;
        Collections.sort(list,ob);
        //list.sort((a,b)->a-b);
        System.out.println("After sorting " + list);
    }
}
