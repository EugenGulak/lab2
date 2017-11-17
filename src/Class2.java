public class Class2 implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Работаю");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}