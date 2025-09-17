package org.design.coding;

public class OddEvenUsingThread {
    private int number = 1;          // start from 1
    private final int limit = 10;    // print till 20
    private boolean isOddTurn = true;

    public static void main(String[] args) {
        OddEvenUsingThread printer = new OddEvenUsingThread();

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();

    }

    public synchronized void printOdd() {
        while (true) {
            while (!isOddTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (number > limit) { // ✅ check before printing
                notify(); // wake up other thread to let it exit
                break;
            }
            System.out.println("Odd: " + number);
            number++;
            isOddTurn = false;
            notify();
        }
    }

    public synchronized void printEven() {
        while (true) {
            while (isOddTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (number > limit) { // ✅ check before printing
                notify();
                break;
            }
            System.out.println("Even: " + number);
            number++;
            isOddTurn = true;
            notify();
        }
    }
}
