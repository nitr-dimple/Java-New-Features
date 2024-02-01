package org.com.java7.StringSwitchStatement;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class StringSwitchStatement {

    public static void main(String[] args) {
        displayTodayDetails();
    }

    private static void displayTodayDetails() {

        String input = "Wednesday";
        switch (input){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            default:
                System.out.println("Today is day");
        }
    }
    
}
