package org.com.java7.SafeVarArgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class SafeVarExample {

    public static void main(String[] args) {
        sum(1);
        sum(1,2);
        sum(1,2,3);

        SafeVarExample obj = new SafeVarExample();
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        List<String> l3 = new ArrayList<>();
        l1.add("Eazy");
        l2.add("Medium");
        l3.add("Hard");
        obj.print(l1, l2, l3);
    }


    @SafeVarargs
    private final void print(List<String>...messages){
        Object[] arr = messages;
//        List<Integer> intList = new ArrayList<Integer>();
//        intList.add(1606);
//        arr[0] = intList;
        String firstElement = messages[0].get(0);
        System.out.println(firstElement);
    }

    private static void sum(int...nums){
        System.out.println(Arrays.toString(nums));
        int sum = 0;
        for(int num: nums){
            sum = sum + num;
        }
        System.out.println("The total sum for the given input is: " + sum);
    }
}
