import java.util.*;
import java.util.Comparator;

class Sorting implements Comparator<Integer>{
    public int compare(Integer ob,Integer ob1){
        return ob<ob1?-1:ob1<ob?+1:0;
    }
}
public class ComparatorSorting {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(13);
        list.add(14);
        list.add(9);
        list.add(8);
        list.add(7);
        System.out.println("Before sorting " + list);
        Collections.sort(list,new Sorting());
        System.out.println("After sorting " + list);
    }
}
