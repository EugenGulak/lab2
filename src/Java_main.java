public class Java_main extends Thread {

    public static void main(String[] args) {
        Class1 lab2Run1 = new Class1();
        Class2 lab2Run2 = new Class2();

        Thread thread = new Thread(lab2Run1);

        thread.start();
        thread = new Thread(lab2Run2);
        thread.start();
    }
}
