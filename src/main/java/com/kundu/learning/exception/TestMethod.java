package com.kundu.learning.exception;

import java.io.IOException;

public class TestMethod {

    public Integer convertToNumber(String s) throws IOException{
        Integer i = null;
        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException e){
            throw new IOException(e);
        }

        System.out.println(i);
        return i;

    }
}
