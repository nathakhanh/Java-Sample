package main.practice.java8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool {
  public static void main (String[] args) throws ExecutionException, InterruptedException {
//    testNewSingleThreadExecutor();

//    testExecutorService();

//    testNewFixedThreadPool();

    testNewCacheThreadPool();

  }



  public static void testNewSingleThreadExecutor() {
    Executor executor = Executors.newSingleThreadExecutor();
    executor.execute(() -> System.out.println("Hello World"));
  }

  public static void testExecutorService() throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(10);
    Future<String> future = executorService.submit(() -> "Hello World");
    String result = future.get();

    System.out.println(result);
  }


  public static void testNewFixedThreadPool() {
    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
    threadPoolExecutor.submit(() -> {
      Thread.sleep(3000);
      System.out.println("hello1");
      return null;
    });
    threadPoolExecutor.submit(() -> {
      Thread.sleep(3000);
      System.out.println("hello2");
      return null;
    });
    threadPoolExecutor.submit(() -> {
      Thread.sleep(3000);
      System.out.println("hello3");
      return null;
    });
  }

  public static void testNewCacheThreadPool() {
    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
    threadPoolExecutor.submit(() -> {
      Thread.sleep(3000);
      System.out.println("hello1");
      return null;
    });
    threadPoolExecutor.submit(() -> {
      Thread.sleep(3000);
      System.out.println("hello2");
      return null;
    });
    threadPoolExecutor.submit(() -> {
      Thread.sleep(3000);
      System.out.println("hello3");
      return null;
    });

  }

}
