package org.com.Java8.DefaultMethodsInInterfaces;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public interface Vehicle {

    public int getSpeed();

    public void applyBreak();

    public default void autoPilot(){
        System.out.println("I will help in driving with out manual support");
    }
}
