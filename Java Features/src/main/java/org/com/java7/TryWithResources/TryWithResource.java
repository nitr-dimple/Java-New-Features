package org.com.java7.TryWithResources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class TryWithResource {

    public static void main(String[] args) throws Exception {
        beforeJava7();
        withJava7();
        withCustomResInJava7();
    }

    /***
     * Implementation from Java 7
     * @throws Exception
     */
    private static void withCustomResInJava7() throws Exception{
        try(CustomResource cr = new CustomResource();){
            cr.readFromResource();
        }
    }


    /***
     * Implementation from java 7
     * @throws  IOException
     * @throws java.io.FileNotFoundException
     */
    private static void withJava7() throws FileNotFoundException, IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("C:/Users/antiy/Documents/example.txt"));){
            String sCurrentLine;
            while((sCurrentLine = br.readLine()) != null){
                System.out.println(sCurrentLine);
            }
        }
    }


    /**
     * Implementation before java7
     * @throws IOException
     */
    private static void beforeJava7() throws IOException {
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("C:/Users/antiy/Documents/example.txt"));
            String sCurrentLine;
            while((sCurrentLine = br.readLine()) != null){
                System.out.println(sCurrentLine);
            }
        }finally {
            br.close();
        }
    }
}
