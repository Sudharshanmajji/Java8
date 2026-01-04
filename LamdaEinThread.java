//class MyRunnable implements Runnable {
//    public void run() {
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("Child Thread");
//        }
//    }
//}
    public class LamdaEinThread {
        public static void main(String[] args) {
           // MyRunnable ob = new MyRunnable();
            Runnable ob=()->{
            for(int i=0;i<=5;i++)
               System.out.println("Child Thread");
        };
            Thread ob1 = new Thread(ob);
            ob1.start();
            for (int i = 0; i <= 5; i++) {
                System.out.println("Main Thread");
            }
        }
}
