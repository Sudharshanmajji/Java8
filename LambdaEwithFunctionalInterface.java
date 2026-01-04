@FunctionalInterface
interface A {
    public void m1();

}
//class B implements A {
//    public void m1() {
//        System.out.println("Hello");
//    }
//
//}
class LambdaEwithFunctionalInterface {
    public static void main(String[] args) {
        A ob=()-> System.out.println("hello By Lambda Expression");
        ob.m1();
        ob.m1();
    }

    }
