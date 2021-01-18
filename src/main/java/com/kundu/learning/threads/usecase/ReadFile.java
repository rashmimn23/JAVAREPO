package com.kundu.learning.threads.usecase;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class ReadFile implements Callable<Integer> {
    private String fileName;
    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Integer call() throws Exception {
        Integer output=0;
        try{
            File file = new File(fileName);
            System.out.println(Thread.currentThread().getName()+Thread.currentThread().getState());
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()) {
               Thread.sleep(600);
                output =output+Integer.parseInt(scan.nextLine());

            }

        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(output);
        return output;
    }

}
