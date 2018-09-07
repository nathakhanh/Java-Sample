package main.practice.concurrent;

public class BasicThread {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Thread information : " + mainThread);
        System.out.println("Name of main thread - " + mainThread.getName());

        mainThread.setName("Arty");	//Setting a new name of the main thread.

        System.out.println("Thread's new information "  + mainThread);
        System.out.println("New name of main thread - " + mainThread.getName());

        try {
            System.out.println("main thread is going to sleep for 5 seconds");
            mainThread.sleep(5000);
            System.out.println("main thread awaken");
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        Thread thread = new Thread();

    }
}
