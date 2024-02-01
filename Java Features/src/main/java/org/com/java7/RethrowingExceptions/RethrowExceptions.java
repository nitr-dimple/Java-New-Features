package org.com.java7.RethrowingExceptions;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class RethrowExceptions {

    public static void main(String[] args) throws Exception {
        beforeJava7("First");
        withJava7("First");
    }

    /***
     * Implementation before Java 7
     * @param exceptionName
     * @throws Exception
     */
    public static void beforeJava7(String exceptionName) throws Exception{
        try{
            if(exceptionName.equals("First")){
                throw new FirstException();
            }else{
                throw new SecondException();
            }
        }catch (Exception ex){
            throw ex;
        }
    }

    /***
     * Implementation from Java 7
     * @param exceptionName
     * @throws Exception
     */
    public static void withJava7(String exceptionName) throws FirstException, SecondException{
        try{
            if(exceptionName.equals("First")){
                throw new FirstException();
            }else{
                throw new SecondException();
            }
        }catch (Exception ex){
            throw ex;
        }
    }


    static class FirstException extends Exception{

    }

    static class SecondException extends Exception{

    }
}
