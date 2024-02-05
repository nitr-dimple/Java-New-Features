package org.com.java8.DefaultMethodsInInterfaces;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class Honda implements Vehicle{


    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public void applyBreak() {
        System.out.println("Breaks applied");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.applyBreak();
        honda.sayHello();
        honda.autoPilot();
    }

    private static void sayHello(){
        System.out.println("Hi, This is your faviourite honda care");
    }
}
