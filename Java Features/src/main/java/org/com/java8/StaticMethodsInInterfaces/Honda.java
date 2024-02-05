package org.com.java8.StaticMethodsInInterfaces;

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

    @Override
    public void autoPilot(){
        System.out.println("Honda Auto Pilot Applied");
    }

    public static void main(String[] args) {
        org.com.java8.DefaultMethodsInInterfaces.Honda honda = new org.com.java8.DefaultMethodsInInterfaces.Honda();
        honda.applyBreak();
        honda.autoPilot();
        Vehicle.sayHello();
        Honda.sayHello();
    }

    private static void sayHello(){
        System.out.println("Hi, This is your faviourite honda care");
    }
}
