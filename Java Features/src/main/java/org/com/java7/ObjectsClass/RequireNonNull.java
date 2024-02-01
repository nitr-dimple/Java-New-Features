package org.com.java7.ObjectsClass;

import java.util.Objects;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class RequireNonNull {

    public static void main(String[] args) {
        Person person = null;
        processPersonDetails(person);

    }

    private static void processPersonDetails(Person person) {
        Objects.requireNonNull(person, "Person object can't be null");
        System.out.println(person.getFirstName());
        System.out.printf(person.getLastName());
    }

    public class Person{
        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
}
