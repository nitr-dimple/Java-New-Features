package org.com.java7.BinaryLiterals;

import org.w3c.dom.ls.LSOutput;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class BinaryLiterals {

    public static void main(String[] args) {
        byte byteBinary = 0b111;
        short shortBinary = 0B001;
        int intBinary = 0B101;

        System.out.println("byteBinary " + byteBinary);
        System.out.println("shortBinary " + shortBinary);
        System.out.println("intBinary " + intBinary);

        int num = 5;
        System.out.println("Is decimal and binary same ? " + (intBinary == num));

    }

}
