/*
Rule: THI00-J
*/

public class R10_THI00_J {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        });

        thread.start();

    }
}