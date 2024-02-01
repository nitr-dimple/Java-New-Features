package org.com.java7.SuppressedExceptions;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class CustomDirtyResource implements  AutoCloseable{

    @Override
    public void close() throws Exception {
        throw new NullPointerException("OOPs. It is very bad to have a NullPointerException !!");
    }

    public void readFromResource(){
        throw new RuntimeException("I am sorry. I don't have data available right now due to network issue!!!");
    }

}
