package thread;

public class SyncDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(Boo::dosome);
        Thread t2 = new Thread(Boo::dosome);
        t1.start();
        t2.start();
    }
}
class Boo{
    public synchronized static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + "start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("done");
    }
}
