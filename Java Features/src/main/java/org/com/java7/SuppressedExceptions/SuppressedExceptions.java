package org.com.java7.SuppressedExceptions;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author Dimpleben Kanjibhai Patel
 */
public class SuppressedExceptions {

    private final static Logger LOGGER = Logger.getLogger(SuppressedExceptions.class.getName());

    public static void main(String[] args) {
        try{
            beforeJava7();
        }catch (Exception ex){
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }

        LOGGER.log(Level.INFO, "============================================================================");

        try{
            withJava7();
        }catch (Exception ex){
            LOGGER.log(Level.SEVERE, ex.getMessage());
            final Throwable[] suppressedExceptions = ex.getSuppressed();
            final int numSuppressed = suppressedExceptions.length;
            if(numSuppressed > 0){
                for(final Throwable exception: suppressedExceptions){
                    LOGGER.log(Level.SEVERE, exception.getMessage());
                }
            }
        }
    }

    /***
     * Implementation befor Java 7
     * @throws Exception
     */
    public static void beforeJava7() throws Exception{
        CustomDirtyResource cr = null;
        try{
            cr = new CustomDirtyResource();
            cr.readFromResource();
        }finally {
            cr.close();
        }
    }

    /***
     * Implementation from Java 7
     * @throws Exception
     */
    public static void withJava7() throws Exception{
        try( CustomDirtyResource cr = new CustomDirtyResource();){
            cr.readFromResource();
        }
    }
}
