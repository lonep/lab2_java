package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;

public class Timer {


    public  static <T, S> Future<T> setTimerForFunc(long second, S data , Function<S, T> func) throws InterruptedException {

        Thread.sleep(second * 1000);

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<T> future = executor.submit(() -> {
            return func.apply(data);
        });

        return future;

    }

}
