package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println("nullpointer");
        }


    }
}
