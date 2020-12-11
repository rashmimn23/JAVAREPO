package com.kundu.learning.programscollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int array[]={1,3,4,2,4,3,5,4};
        Map<Integer, Integer> map = new HashMap<>();
        for (int no:array) {
            Integer i=map.get(no);
            if(i==null){
                map.put(no,1);
            }
            else{
                i=i+1;
                map.put(no,i);
            }
        }
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        System.out.println("Duplicate elements are ");
        for(Map.Entry<Integer,Integer> e: set)
        {
            if(e.getValue()>1){
                System.out.println(e.getKey());
            }
        }
    }
}
