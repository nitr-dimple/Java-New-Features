package org.com.java7.ReflectiveOperationException;

import org.com.java7.SuppressedExceptions.SuppressedExceptions;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class ExceptionHandlingForReflectiveMethods {

    private final static Logger LOGGER = Logger.getLogger(SuppressedExceptions.class.getName());

    public static void main(String[] args) {
        beforeJava7();
        withJava7();
    }

    /***
     * Implementation before Java 7
     */
    public static void beforeJava7(){
        try{
            Class.forName("org.com.java7.CatchMultipleExceptions.CatchMultipleException").getMethod("withJava7").invoke(null, new Object[]{});
        }catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException ex){
            LOGGER.log(Level.SEVERE, ex.toString());
        }
    }

    /***
     * Implementation from Java 7
     */
    public static void withJava7(){
        try{
            Class.forName("org.com.java7.CatchMultipleExceptions.CatchMultipleException").getMethod("withJava7").invoke(null, new Object[]{});
        }catch (ReflectiveOperationException ex){
            LOGGER.log(Level.SEVERE, ex.toString());
        }
    }

}
