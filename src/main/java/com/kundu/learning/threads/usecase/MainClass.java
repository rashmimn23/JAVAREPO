package com.kundu.learning.threads.usecase;

import java.io.File;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainClass {
    public static void main(String[] args) throws Exception {
        String fileFolder = "C:\\Users\\rashmi.n\\Documents\\JavaProjects\\git\\files\\Files";
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        List<Callable<Integer>> callableList = new ArrayList<Callable<Integer>>() ;
        File folder = new File(fileFolder);
        File[] files = folder.listFiles();
        for (File file : files) {
            callableList.add(new ReadFile(file.getAbsolutePath()));
        }

    List<Future<Integer>> futures = executorService.invokeAll(callableList);
    Integer sum=0;
        for (Future<Integer> future:futures) {
            sum=sum+future.get();

        }
        executorService.shutdown();
       // List<Integer> sum = (List<Integer>) futures.get();
        System.out.println("Sum of Output from all threads is " + sum);
}
}
