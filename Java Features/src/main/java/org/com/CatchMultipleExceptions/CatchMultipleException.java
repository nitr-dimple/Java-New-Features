package org.com.CatchMultipleExceptions;


import org.com.SuppressedExceptions.SuppressedExceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class CatchMultipleException {

    private final static Logger LOGGER = Logger.getLogger(SuppressedExceptions.class.getName());


    public static void main(String[] args) {
        beforeJava7();
        withJava7();
    }

    /***
     * Implementation before Java7
     */
    public static void beforeJava7(){
        int arr[] = {1,2,3,4};
        try{
            for(int i=0; i<=arr.length; i++){
                System.out.println(arr[i]);
            }
        }catch (NullPointerException nex){
            LOGGER.log(Level.SEVERE, nex.toString());
        }catch (ArrayIndexOutOfBoundsException aioex){
            LOGGER.log(Level.SEVERE, aioex.toString());
        }
    }

    public static void withJava7(){
        int arr[] = {1,2,3};
        try{
            for(int i=0; i<= arr.length; i++){
                System.out.println(arr[i]);
            }
        }catch(NullPointerException | ArrayIndexOutOfBoundsException ex){
            LOGGER.log(Level.SEVERE, ex.toString());
        }
    }
}
