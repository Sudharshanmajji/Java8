import java.util.*;

//class LambdaEinCollections implements Comparator<Integer> {
//    public int compare(Integer ob,Integer ob2) {
//        return ob2-ob;
////        if(ob<ob2)
//            return -1;
//        else if(ob2<ob)
//            return 1;
//        else
//            return 0;
//}
//}
 class Test{
    public static void main(String[] args) {
        List<Integer> ob=new ArrayList<Integer>();
        ob.add(10);
        ob.add(30);
        ob.add(40);
        ob.add(50);
//        System.out.println("Before sorting in desc : " + ob);
//        Collections.sort(ob,new LambdaEinCollections());
        System.out.println("Before sorting in desc : " + ob);
        Comparator<Integer> obj=(a,b)->b-a;
        ob.sort(obj);
        //Collections.sort(ob,obj);
        System.out.println("After sorting in desc : " +ob);
    }
}
