package org.com.java8.StaticMethodsInInterfaces;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public interface Vehicle {

    public int getSpeed();

    public void applyBreak();

    public default void autoPilot(){
        System.out.println("I will help in driving with out manual support");
    }

    public static void sayHello(){
        System.out.println("Hi, This is your favourite car");
    }
}
