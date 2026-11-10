public class OddEvenPrinter {
    private int count = 1;
    private final int limit = 10;
    private final Object lock = new Object();

    public void printOdd() {
        synchronized (lock) {
            while (count <= limit) {
                
                if (count % 2 == 0) {
                    try { lock.wait(); } 
                    catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                } else {
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                    lock.notifyAll();
                }
            }
        }
    }

    public void printEven() {
        synchronized (lock) {
            while (count <= limit) {
                if (count % 2 != 0) {
                    try { lock.wait(); } 
                    catch (InterruptedException e) { Thread.currentThread().interrupt(); }
                } else {
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                    lock.notifyAll();
                }

            }
        }
    }

    public static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter();
        Thread t1 = new Thread(printer::printOdd, "OddThread");
        Thread t2 = new Thread(printer::printEven, "EvenThread");
        t1.start();
        t2.start();
    }
}
